package astral_mekanism.upgrade;

import astral_mekanism.registries.AMEMachines;
import com.fxd927.mekanismelements.common.registries.MSBlockTypes;
import fr.iglee42.evolvedmekanism.registries.EMBlockTypes;
import mekanism.common.registries.MekanismBlockTypes;

import static astral_mekanism.util.AMEUpgradeableUtils.addDeferredAttributeUpgradeable;

public class AstralUpgradeableMachines {

    public static void init() {
        addDeferredAttributeUpgradeable(AMEMachines.MEKANICAL_CHARGER::getBlockType, AMEMachines.ASTRAL_MEKANICAL_CHARGER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CRUSHER, AMEMachines.ASTRAL_CRUSHER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.ANTIPROTONIC_NUCLEOSYNTHESIZER, AMEMachines.ASTRAL_ANTIPROTONIC_NUCLEOSYNTHESIZER.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.MEKANICAL_INSCRIBER::getBlockType, AMEMachines.ASTRAL_MEKANICAL_INSCRIBER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> EMBlockTypes.MELTER, AMEMachines.ASTRAL_THERMALIZER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.ENRICHMENT_CHAMBER, AMEMachines.ASTRAL_ENRICHMENT_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_DISSOLUTION_CHAMBER, AMEMachines.ASTRAL_DISSOLUTION_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.TRANSFORMER::getBlockType, AMEMachines.ASTRAL_TRANSFORMER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_WASHER, AMEMachines.ASTRAL_CHEMICAL_WASHER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_INFUSER, AMEMachines.ASTRAL_CHEMICAL_INFUSER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.PRECISION_SAWMILL, AMEMachines.ASTRAL_PRECISION_SAWMILL.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.COMPACT_APT::getBlockType, AMEMachines.ASTRAL_APT.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.FLUID_INFUSER::getBlockType, AMEMachines.FLUID_INFUSER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_CRYSTALLIZER, AMEMachines.ASTRAL_CRYSTALLIZER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.PRESSURIZED_REACTION_CHAMBER, AMEMachines.ASTRAL_PRC.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.GLOWSTONE_NEUTRON_ACTIVATOR::getBlockType, AMEMachines.ASTRAL_GNA.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.INFUSING_CONDENSENTRATOR::getBlockType, AMEMachines.ASTRAL_INFUSING_CONDENSENTRATOR.getBlockObject());
        addDeferredAttributeUpgradeable(() -> EMBlockTypes.ALLOYER, AMEMachines.ASTRAL_ALLOYER.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.GREEN_HOUSE::getBlockType, AMEMachines.ASTRAL_GREEN_HOUSE.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.OSMIUM_COMPRESSOR, AMEMachines.ASTRAL_OSMIUM_COMPRESSOR.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.COMPACT_SPS::getBlockType, AMEMachines.ASTRAL_SPS.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_INJECTION_CHAMBER, AMEMachines.ASTRAL_CHEMICAL_INJECTION_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.ESSENTIAL_ENERGIZED_SMELTER::getBlockType, AMEMachines.ASTRAL_ENERGIZED_SMELTER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.CHEMICAL_OXIDIZER, AMEMachines.ASTRAL_CHEMICAL_OXIDIZER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.COMBINER, AMEMachines.ASTRAL_COMBINER.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.ESSENTIAL_REACTION_CHAMBER::getBlockType, AMEMachines.ASTRAL_REACTION_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.ELECTROLYTIC_SEPARATOR, AMEMachines.ASTRAL_ELECTROLYTIC_SEPARATOR.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.PURIFICATION_CHAMBER, AMEMachines.ASTRAL_PURIFICATION_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.ISOTOPIC_CENTRIFUGE, AMEMachines.ASTRAL_ISOTOPIC_CENTRIFUGE.getBlockObject());
        addDeferredAttributeUpgradeable(AMEMachines.ESSENTIAL_METALLURGIC_INFUSER::getBlockType, AMEMachines.ASTRAL_METALLURGIC_INFUSER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> EMBlockTypes.SOLIDIFIER, AMEMachines.ASTRAL_SOLIDIFICATION_CHAMBER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> EMBlockTypes.CHEMIXER, AMEMachines.ASTRAL_CHEMIXER.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MSBlockTypes.RADIATION_IRRADIATOR, AMEMachines.ASTRAL_RADIATION_IRRADIATOR.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.FORMULAIC_ASSEMBLICATOR, AMEMachines.ASTRAL_FORMULAIC_ASSEMBLICATOR.getBlockObject());
        addDeferredAttributeUpgradeable(() -> MekanismBlockTypes.ROTARY_CONDENSENTRATOR, AMEMachines.ASTRAL_ROTARY_CONDENSENTRATOR.getBlockObject());
    }
}
