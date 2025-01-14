package net.kenddie.fantasyweapons.config;

import de.exlll.configlib.NameFormatters;
import de.exlll.configlib.YamlConfigurationProperties;
import de.exlll.configlib.YamlConfigurations;

import java.nio.file.Path;

/**
 * Utility class for managing configuration files.
 */
public class ConfigManager {

    /**
     * Updates the configuration file at the given path and loads it into an instance of the given class.
     * @param configPath path to the configuration file
     * @param configClass class of the configuration
     * @return the loaded configuration
     * @param <T> type of the configuration
     */
    public static <T> T updateAndLoadConfig(Path configPath, Class<T> configClass) {
        YamlConfigurationProperties properties = YamlConfigurationProperties.newBuilder()
                .setNameFormatter(NameFormatters.IDENTITY)
                .build();
        return YamlConfigurations.update(configPath, configClass, properties);
    }
}
