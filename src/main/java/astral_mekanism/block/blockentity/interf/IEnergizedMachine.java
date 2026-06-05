package astral_mekanism.block.blockentity.interf;

import mekanism.api.math.FloatingLong;
import mekanism.common.capabilities.energy.MachineEnergyContainer;

public interface IEnergizedMachine {

    public MachineEnergyContainer<?> getEnergyContainer();

    public double getProgressScaled();

    public FloatingLong getEnergyUsage();
}
