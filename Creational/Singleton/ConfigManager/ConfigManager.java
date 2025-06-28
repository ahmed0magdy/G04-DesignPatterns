package Creational.Singleton.ConfigManager;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static ConfigManager instance = new ConfigManager();

    private Map<String, Object> settings = new HashMap<>();

    private ConfigManager() {
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

    public static ConfigManager getInstance() {
        return instance;
    }

}
