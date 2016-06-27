package com.github.fabienrenaud.jjb;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Inspired from: http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/
 *  (sources) https://github.com/terencetaih/aws-speed/tree/master/JsonProcess/src
 * @author Fabien Renaud
 */
public final class JsonSource {

    public static final Map<String, String> SMALL_JSON_TEXT = new HashMap<>();
    public static final Map<String, byte[]> SMALL_JSON_BYTES = new HashMap<>();
    public static final int SIZE;

    static {
        try {
            File[] jsonFiles = new File("jsondata").listFiles();
            for (File f : jsonFiles) {
                byte[] buf = Files.readAllBytes(Paths.get(f.getAbsolutePath()));
                SMALL_JSON_BYTES.put(f.getName(), buf);
                SMALL_JSON_TEXT.put(f.getName(), new String(buf));
            }
            SIZE = SMALL_JSON_TEXT.size();
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    private JsonSource() {
    }
}
