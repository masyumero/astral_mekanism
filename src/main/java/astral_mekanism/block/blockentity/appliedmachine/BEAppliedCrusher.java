package astral_mekanism.block.blockentity.appliedmachine;

import astral_mekanism.block.blockentity.appliedmachine.prefab.BEAppliedItemStackToItemStackMachine;
import mekanism.api.providers.IBlockProvider;
import mekanism.api.recipes.ItemStackToItemStackRecipe;
import mekanism.common.config.MekanismConfig;
import mekanism.common.recipe.IMekanismRecipeTypeProvider;
import mekanism.common.recipe.MekanismRecipeType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BEAppliedCrusher extends BEAppliedItemStackToItemStackMachine {

    public BEAppliedCrusher(IBlockProvider blockProvider, BlockPos pos, BlockState state) {
        super(blockProvider, pos, state, MekanismConfig.usage.crusher.get().multiply(200)
                .divideToLong(MekanismConfig.general.forgeConversionRate.get()));
    }

    @Override
    protected IMekanismRecipeTypeProvider<ItemStackToItemStackRecipe, ?> getRecipeType() {
        return MekanismRecipeType.CRUSHING;
    }

}
