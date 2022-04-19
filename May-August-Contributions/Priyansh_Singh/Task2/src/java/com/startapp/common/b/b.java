package com.startapp.common.b;

import com.startapp.common.b.c;
import org.json.JSONObject;

public class b {
    public static <T> T a(String var0, Class<T> var1) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static String a(Object object) {
        return b.c(object).toString();
    }

    public static Object b(Object object) {
        if (c.a(object)) {
            return object;
        }
        return b.c(object);
    }
    private static JSONObject c(Object var0) {
        throw new IllegalStateException("Decompilation failed");
    }
}

