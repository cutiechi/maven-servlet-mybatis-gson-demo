package org.cherubic.demo.util;

import com.google.gson.Gson;

public final class JsonUtils {
    
    private static Gson gson = new Gson();
    
    private JsonUtils () {
    
    }
    
    public static String toJson (Object source) {
        return gson.toJson(source);
    }
}
