package mekanism.common.config;

import mekanism.common.config.options.BooleanOption;
import mekanism.common.config.options.DoubleOption;
import mekanism.common.config.options.FloatOption;
import mekanism.common.config.options.IntOption;

public class MekaConfig extends BaseConfig {

    public final DoubleOption MekaSuitHelmetDamageRatio = new DoubleOption(this, "general", "MekaSuitHelmetDamageRatio", 0.15F, "Damage absorb ratio of the MekaSuit Helmet.");
    public final IntOption MekaSuitHelmetDamageMax = new IntOption(this, "general", "MekaSuitHelmetDamageMax", 115, "Max damage the MekaSuit Helmet can absorb.");
    public final DoubleOption MekaSuitBodyarmorDamageRatio = new DoubleOption(this, "general", "MekaSuitBodyarmorDamageRatio", 0.4F, "Damage absorb ratio of the MekaSuit Bodyarmor.");
    public final IntOption MekaSuitBodyarmorDamageMax = new IntOption(this, "general", "MekaSuitBodyarmorDamageMax", 115, "Max damage the  MekaSuit Bodyarmor can absorb.");
    public final DoubleOption MekaSuitPantsDamageRatio = new DoubleOption(this, "general", "MekaSuitPantsDamageRatio", 0.3F, "Damage absorb ratio of the MekaSuit Pants.");
    public final IntOption MekaSuitPantsDamageMax = new IntOption(this, "general", "MekaSuitPantsDamageMax", 115, "Max damage the  MekaSuit Pants can absorb.");
    public final DoubleOption MekaSuitBootsDamageRatio = new DoubleOption(this, "general", "MekaSuitBootsDamageRatio", 0.15F, "Damage absorb ratio of the MekaSuit Boots.");
    public final IntOption MekaSuitBootsDamageMax = new IntOption(this, "general", "MekaSuitBootsDamageMax", 115, "Max damage the  MekaSuit Boots can absorb.");
    public DoubleOption mekaSuitBaseEnergyCapacity = new DoubleOption(this, "meka", "baseEnergyCapacity", 16000000, "Energy capacity (Joules) of MekaSuit items without any installed upgrades. Quadratically scaled by upgrades.");
    public DoubleOption mekaSuitBaseChargeRate = new DoubleOption(this, "meka", "chargeRate", 100000, "Amount (joules) of energy the MekaSuit can accept per tick. Quadratically scaled by upgrades.");
    public DoubleOption mekaSuitBaseJumpEnergyUsage = new DoubleOption(this, "meka", "baseJumpEnergyUsage", 1000, "Energy usage (Joules) of MekaSuit when adding 0.1 to jump motion.");
    public DoubleOption mekaSuitEnergyUsagePotionTick = new DoubleOption(this, "meka", "energyUsagePotionTick", 40000, "Energy usage (Joules) of MekaSuit when lessening a potion effect.");
    public DoubleOption mekaSuitEnergyUsageMagicReduce = new DoubleOption(this, "meka", "energyUsageMagicReduce", 1000, "Energy cost/multiplier in Joules for reducing magic damage via the inhalation purification unit. Energy cost is: MagicDamage * energyUsageMagicPrevent. (1 MagicDamage is 1 half heart).");
    public FloatOption mekaSuitEnergyUsageFall = new FloatOption(this, "meka", "energyUsageFall", 50, "Energy cost/multiplier in Joules for reducing fall damage with MekaSuit Boots. Energy cost is: FallDamage * freeRunnerFallEnergyCost. (1 FallDamage is 1 half heart)");
    public DoubleOption mekaSuitSolarRechargingRate = new DoubleOption(this, "meka", "solarRechargingRate", 500, "Solar recharging rate (Joules) of helmet per tick, per upgrade installed.");
    public DoubleOption mekaSuitEnergyUsageVisionEnhancement = new DoubleOption(this, "meka", "energyUsageVisionEnhancement", 500, "Energy usage (Joules) of MekaSuit per tick of using vision enhancement.");
    public DoubleOption mekaSuitEnergyUsageHydrostaticRepulsion = new DoubleOption(this, "meka", "energyUsageHydrostaticRepulsion", 500, "Energy usage (Joules) of MekaSuit per tick of using hydrostatic repulsion.");
    public DoubleOption mekaSuitEnergyUsageNutritionalInjection = new DoubleOption(this, "meka", "energyUsageNutritionalInjection", 20000, "Energy usage (Joules) of MekaSuit per half-food of nutritional injection.");
    public DoubleOption mekaSuitEnergyUsageDamage = new DoubleOption(this, "meka", "energyUsageDamage", 100000, "Energy usage (Joules) of MekaSuit per unit of damage applied.");
    public IntOption mekaSuitNutritionalMaxStorage = new IntOption(this, "meka", "nutritionalMaxStorage", 128000, "Maximum amount of Nutritional Paste storable by the nutritional injection unit.", 1, Integer.MAX_VALUE);
    public IntOption mekaSuitNutritionalTransferRate = new IntOption(this, "meka", "nutritionalTransferRate", 256, "Rate at which Nutritional Paste can be transferred into the nutritional injection unit.", 1, Integer.MAX_VALUE);
    public IntOption mekaSuitJetpackMaxStorage = new IntOption(this, "meka", "jetpackMaxStorage", 48000, "Maximum amount of Hydrogen storable in the jetpack unit.", 1, Integer.MAX_VALUE);
    public IntOption mekaSuitJetpackTransferRate = new IntOption(this, "meka", "jetpackTransferRate", 256, "Rate at which Hydrogen can be transferred into the jetpack unit.", 1, Integer.MAX_VALUE);
    public IntOption mekaSuitHelmetArmor = new IntOption(this, "meka", "helmetArmor", 3, "Armor value of MekaSuit Helmets.", 0, Integer.MAX_VALUE);
    public IntOption mekaSuitBodyArmorArmor = new IntOption(this, "meka", "bodyArmorArmor", 8, "Armor value of MekaSuit BodyArmor.", 0, Integer.MAX_VALUE);
    public IntOption mekaSuitPantsArmor = new IntOption(this, "meka", "pantsArmor", 6, "Armor value of MekaSuit Pants.", 0, Integer.MAX_VALUE);
    public IntOption mekaSuitBootsArmor = new IntOption(this, "meka", "bootsArmor", 3, "Armor value of MekaSuit Boots.", 0, Integer.MAX_VALUE);
    public DoubleOption mekaSuitToughness = new DoubleOption(this, "meka", "toughness", 3, "Toughness value of the MekaSuit.", 0, Double.MAX_VALUE);
    public FloatOption mekaSuitFallDamageRatio = new FloatOption(this, "meka", "fallDamageReductionRatio", 1, "Percent of damage taken from falling that can be absorbed by MekaSuit Boots when they have enough power.", 0, 1);
    public FloatOption mekaSuitMagicDamageRatio = new FloatOption(this, "meka", "magicDamageReductionRatio", 1, "Percent of damage taken from magic damage that can be absorbed by MekaSuit Helmet with Purification unit when it has enough power.", 0, 1);
    public FloatOption mekaSuitUnspecifiedDamageRatio = new FloatOption(this, "meka", "unspecifiedDamageReductionRatio", 1, "Percent of damage taken from other non explicitly supported damage types that don't bypass armor when the MekaSuit has enough power and a full suit is equipped.", 0, 1);
    public DoubleOption mekaSuitGeothermalChargingRate = new DoubleOption(this, "meka", "geothermalChargingRate", 10.5, "Geothermal charging rate (Joules) of pants per tick, per degree above ambient, per upgrade installed. This value scales down based on how much of the MekaSuit Pants is submerged. Fire is treated as having a temperature of ~200K above ambient, lava has a temperature of 1,000K above ambient.");
    public FloatOption mekaSuitHeatDamageReductionRatio = new FloatOption(this, "meka", "heatDamageReductionRatio", 0.8F, "Percent of heat damage negated by MekaSuit Pants with maximum geothermal generator units installed. This number scales down linearly based on how many units are actually installed.", 0, 1);
    public BooleanOption mekaSuitShield = new BooleanOption(this, "meka", "mekaSuitShield", true, "Enables the default calculation of the full set of shields");
    public FloatOption mekaSuitShieldCapacity = new FloatOption(this, "meka", "mekaSuitShieldCapacity", 1000, "The default set of base shield values after installation", 1, Float.MAX_VALUE);
    public BooleanOption mekaSuitRecovery = new BooleanOption(this, "meka", "mekaSuitRecovery", true, "Enables the default calculation of the full set of Recovery");
    public FloatOption mekaSuitRecoveryRate = new FloatOption(this, "meka", "mekaSuitRecoveryRate", 10, "The recovery rate of the full set of base shields after the default installation", 0.1F, Float.MAX_VALUE);
    public IntOption mekaSuitShieldRestoresEnergy = new IntOption(this, "meka", "mekaSuitShieldRestoresEnergy", 500, "The amount of energy required whenever the shield recovers a little", 0, Integer.MAX_VALUE);
    //public DoubleOption mekaSuitElytraEnergyUsage = new DoubleOption(this,"meka","elytraEnergyUsage",32000,"Energy usage (Joules) per second of the MekaSuit when flying with the Elytra Unit.");
    //public DoubleOption mekaSuitEnergyUsageSprintBoost = new DoubleOption(this,"meka","energyUsageSprintBoost",100,"Energy usage (Joules) of MekaSuit when adding 0.1 to sprint motion.");
    //public DoubleOption mekaSuitEnergyUsageGravitationalModulation = new DoubleOption(this,"meka","energyUsageGravitationalModulation",1000,"Energy usage (Joules) of MekaSuit per tick when flying via Gravitational Modulation.");
    //public DoubleOption mekaSuitInventoryChargeRate = new DoubleOption(this,"meka","inventoryChargeRate",1000,"Charge rate of inventory items (Joules) per tick.");
    //  public DoubleOption mekaSuitEnergyUsageItemAttraction = new DoubleOption(this,"meka","energyUsageItemAttraction",250,"Energy usage (Joules) of MekaSuit per tick of attracting a single item.");
    public DoubleOption mekaSuitHelmetShielding = new DoubleOption(this, "meka", "mekaSuitHelmetShielding", 25);
    public DoubleOption mekaSuitBodyShielding = new DoubleOption(this, "meka", "mekaSuitBodyShielding", 40);
    public DoubleOption mekaSuitPantsShielding = new DoubleOption(this, "meka", "mekaSuitPantsShielding", 20);
    public DoubleOption mekaSuitBootsShielding = new DoubleOption(this, "meka", "mekaSuitBootsShielding", 15);
}