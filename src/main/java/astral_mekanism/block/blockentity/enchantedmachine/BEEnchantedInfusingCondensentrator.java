package astral_mekanism.block.blockentity.enchantedmachine;

import astral_mekanism.block.blockentity.basemachine.BEAbstractInfusingCondensentrator;
import astral_mekanism.integration.AMEEmpowered;
import mekanism.api.Upgrade;
import mekanism.api.providers.IBlockProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BEEnchantedInfusingCondensentrator extends BEAbstractInfusingCondensentrator {

    private int baselineMaxOperations;
    public BEEnchantedInfusingCondensentrator(IBlockProvider blockProvider, BlockPos pos, BlockState state) {
        super(blockProvider, pos, state);
        baselineMaxOperations = 20000;
    }

    @Override
    public void recalculateUpgrades(Upgrade upgrade) {
        super.recalculateUpgrades(upgrade);
        if (AMEEmpowered.empoweredIsLoaded()) {
            baselineMaxOperations = 20000 << AMEEmpowered.getAllSpeeds(this);
        } else if (upgrade == Upgrade.SPEED) {
            baselineMaxOperations = 20000 << upgradeComponent.getUpgrades(Upgrade.SPEED);
        }
    }

    @Override
    protected int getBaselineMaxOperations() {
        return baselineMaxOperations;
    }

    @Override
    protected int initFluidTankCapacity() {
        return 200000000;
    }

    @Override
    protected long getChemicalTankCapacity() {
        return 200000000000l;
    }
    
}
