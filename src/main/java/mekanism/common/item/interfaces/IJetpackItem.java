package mekanism.common.item.interfaces;

import mekanism.api.EnumColor;
import mekanism.common.CommonPlayerTickHandler;
import mekanism.common.util.ItemDataUtils;
import mekanism.common.util.LangUtils;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public interface IJetpackItem {

    @NotNull
    static ItemStack getActiveJetpack(EntityLivingBase entity) {
        return getJetpack(entity, stack -> {
            if (stack.getItem() instanceof IJetpackItem jetpackItem && jetpackItem.canUseJetpack(stack)) {
                return !(entity instanceof EntityPlayer player) || !player.getCooldownTracker().hasCooldown(stack.getItem());
            }
            return false;
        });
    }

    @NotNull
    static ItemStack getPrimaryJetpack(EntityLivingBase entity) {
        return getJetpack(entity, stack -> stack.getItem() instanceof IJetpackItem);
    }

    static ItemStack getJetpack(EntityLivingBase entity, Predicate<ItemStack> matcher) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        if (matcher.test(chest)) {
            return chest;
        }
        return ItemStack.EMPTY;
    }

    static boolean handleJetpackMotion(EntityPlayer player, JetpackMode mode, BooleanSupplier ascendingSupplier) {
        if (mode == JetpackMode.NORMAL) {
            player.motionY = Math.min(player.motionY + 0.15D, 0.5D);
        } else if (mode == JetpackMode.HOVER) {
            boolean ascending = ascendingSupplier.getAsBoolean();
            boolean descending = player.isSneaking();
            if (ascending == descending) {
                if (player.motionY > 0) {
                    player.motionY = Math.max(player.motionY - 0.15D, 0);
                } else if (player.motionY < 0) {
                    if (!isOnGround(player)) {
                        player.motionY = Math.min(player.motionY + 0.15D, 0);
                    }
                }
            } else if (ascending) {
                player.motionY = Math.min(player.motionY + 0.15D, 0.2D);
            } else if (!isOnGround(player)) {
                player.motionY = Math.max(player.motionY - 0.15D, -0.2D);
            }
        }
        return true;
    }

    static boolean isOnGround(EntityPlayer player) {
        int x = MathHelper.floor(player.posX);
        int y = MathHelper.floor(player.posY - 0.01);
        int z = MathHelper.floor(player.posZ);
        BlockPos pos = new BlockPos(x, y, z);
        IBlockState s = player.world.getBlockState(pos);
        AxisAlignedBB box = s.getBoundingBox(player.world, pos).offset(pos);
        AxisAlignedBB playerBox = player.getEntityBoundingBox();
        return !s.getBlock().isAir(s, player.world, pos) && playerBox.offset(0, -0.01, 0).intersects(box);

    }

    static JetpackMode getPlayerJetpackMode(EntityPlayer player, JetpackMode mode, BooleanSupplier ascendingSupplier) {
        if (!player.isSpectator()) {
            if (mode != JetpackMode.DISABLED) {
                boolean ascending = ascendingSupplier.getAsBoolean();
                if (mode == JetpackMode.HOVER) {
                    if (ascending && !player.isSneaking() || !CommonPlayerTickHandler.isOnGround(player)) {
                        return mode;
                    }
                } else if (mode == JetpackMode.NORMAL && ascending) {
                    return mode;
                }
            }
        }
        return JetpackMode.DISABLED;
    }

    boolean canUseJetpack(ItemStack stack);

    default boolean canRendered(ItemStack stack){
        return true;
    }

    default JetpackMode getJetpackMode(ItemStack stack) {
        return getMode(stack);
    }

    void useJetpackFuel(ItemStack stack);

    default JetpackMode getMode(ItemStack stack) {
        return JetpackMode.values()[ItemDataUtils.getInt(stack, "mode")];
    }

    default void setMode(ItemStack stack, JetpackMode mode) {
        ItemDataUtils.setInt(stack, "mode", mode.ordinal());
    }

    default void incrementMode(ItemStack stack) {
        setMode(stack, getMode(stack).increment());
    }

    int getStored(ItemStack itemstack);

    enum JetpackMode {
        NORMAL("tooltip.jetpack.regular", EnumColor.DARK_GREEN),
        HOVER("tooltip.jetpack.hover", EnumColor.DARK_AQUA),
        DISABLED("tooltip.jetpack.disabled", EnumColor.DARK_RED);

        private String unlocalized;
        private EnumColor color;

        JetpackMode(String s, EnumColor c) {
            unlocalized = s;
            color = c;
        }

        public JetpackMode increment() {
            return ordinal() < values().length - 1 ? values()[ordinal() + 1] : values()[0];
        }

        public String getName() {
            return color + LangUtils.localize(unlocalized);
        }
    }
}
