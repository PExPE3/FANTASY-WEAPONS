package net.kenddie.fantasyweapons.config;

import de.exlll.configlib.Configuration;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import static net.kenddie.fantasyweapons.item.ItemManager.itemManager;

/**
 * Configuration class for fantasy weapons.
 */
@Configuration
public class FantasyWeaponsConfig {

    public static final FantasyWeaponsConfig fantasyWeaponsConfig = ConfigManager.updateAndLoadConfig(Path.of("config/fantasy_weapons.yml"), FantasyWeaponsConfig.class);

    public FantasyWeaponsConfig() {
        this.weapons = new HashMap<>();
        itemManager.getDeclaredSwords().forEach(id -> weapons.put(id.getPath(), SwordConfig.DEFAULT));
    }

    public Map<String, SwordConfig> weapons;

    public SwordConfig getSwordConfigOrDefault(String id) {
        return weapons.computeIfAbsent(id, k -> SwordConfig.DEFAULT);
    }

    @Configuration
    public static class SwordConfig {
        public static final SwordConfig DEFAULT = new SwordConfig();
        public int damage = 3;
        public float speed = -2.4f;
    }
}
