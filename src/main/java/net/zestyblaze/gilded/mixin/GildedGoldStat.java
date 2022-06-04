package net.zestyblaze.gilded.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.zestyblaze.gilded.init.ArmourInit;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;

@Mixin(PiglinBrain.class)
public class GildedGoldStat {
    @Inject(method = "wearsGoldArmor", at = @At("RETURN"), cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    private static void wearsGoldArmor(@NotNull LivingEntity entity, @NotNull CallbackInfoReturnable<Boolean> cir){
        Iterable<ItemStack> iterable = entity.getArmorItems();
        Iterator<ItemStack> var2 = iterable.iterator();

        if(!cir.getReturnValue()) {
            Item item;
            do {
                if (!var2.hasNext()) {
                    cir.setReturnValue(false);
                    return;
                }

                ItemStack itemStack = var2.next();
                item = itemStack.getItem();
            } while (!(item instanceof ArmorItem) || ((ArmorItem) item).getMaterial() != ArmourInit.GILDED_NETHERITE);

            cir.setReturnValue(true);
        }
    }
}
