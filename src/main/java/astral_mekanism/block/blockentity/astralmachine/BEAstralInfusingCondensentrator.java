package astral_mekanism.block.blockentity.astralmachine;

import astral_mekanism.block.blockentity.basemachine.BEAbstractInfusingCondensentrator;
import mekanism.api.providers.IBlockProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BEAstralInfusingCondensentrator extends BEAbstractInfusingCondensentrator {

    public BEAstralInfusingCondensentrator(IBlockProvider blockProvider, BlockPos pos, BlockState state) {
        super(blockProvider, pos, state);
    }

    @Override
    protected int getBaselineMaxOperations() {
        return 0x7fffffff;
    }

    @Override
    protected int initFluidTankCapacity() {
        return 0x7fffffff;
    }

    @Override
    protected long getChemicalTankCapacity() {
        return Long.MAX_VALUE;
    }
    
}
