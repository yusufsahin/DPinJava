package com.example.conc;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
public class FontFactory {

    private static final Map<String, Font> fontPool = new HashMap<>();

    public static Font getFont(String name, int style, int size) {
        String key = name + style + size;
        Font font = fontPool.get(key);

        if (font == null) {
            font = new Font(name, style, size);
            fontPool.put(key, font);
        }

        return font;
    }
}
