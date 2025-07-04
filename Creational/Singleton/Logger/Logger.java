package Creational.Singleton.Logger;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;
    // only a single logger can be instantiated for a given file.
    private static Map<String, Logger> instances = new HashMap<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }

    public static Logger getInstance(String fileName) {
        if (!instances.containsKey(fileName))
            instances.put(fileName, new Logger(fileName));
        return instances.get(fileName);
    }

}
