package astral_mekanism.block.gui.appliedmachine;

import astral_mekanism.block.blockentity.appliedmachine.BEAppliedCrusher;
import astral_mekanism.block.gui.appliedmachine.prefab.GuiAppliedSingleToSingleEnergizedMachine;
import mekanism.client.jei.MekanismJEIRecipeType;
import mekanism.common.inventory.container.tile.MekanismTileContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GuiAppliedCrusher extends GuiAppliedSingleToSingleEnergizedMachine<BEAppliedCrusher> {

    public GuiAppliedCrusher(MekanismTileContainer<BEAppliedCrusher> container, Inventory inv, Component title) {
        super(container, inv, title);
    }

    @Override
    protected MekanismJEIRecipeType<?>[] getJEIJeiRecipeTypes() {
        return new MekanismJEIRecipeType[] { MekanismJEIRecipeType.CRUSHING };
    }

}
