package rtg.config;

import java.io.File;

import rtg.config.abyssalcraft.ConfigAC;
import rtg.config.biomesoplenty.ConfigBOP;
import rtg.config.rtg.ConfigRTG;
import rtg.config.vanilla.ConfigVanilla;

public class ConfigManager {

    public static File rtgConfigFile;
    public static File vanillaConfigFile;
    public static File acConfigFile;
    public static File bopConfigFile;

    private ConfigRTG configRTG = new ConfigRTG();

    public static void init(String configpath) {

        rtgConfigFile = new File(configpath + "rtg.cfg");
        vanillaConfigFile = new File(configpath + "biomes/vanilla.cfg");
        acConfigFile = new File(configpath + "biomes/abyssalcraft.cfg");
        bopConfigFile = new File(configpath + "biomes/biomesoplenty.cfg");

        ConfigRTG.init(rtgConfigFile);

        ConfigVanilla.init(vanillaConfigFile);

        ConfigAC.init(acConfigFile);
        ConfigBOP.init(bopConfigFile);
    }

    public ConfigRTG rtg() {

        return configRTG;
    }
}
