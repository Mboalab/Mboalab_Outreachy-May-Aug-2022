/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 */
package com.newandromo.dev338923.app614241;

import java.lang.reflect.Array;

public final class az {
    public static int a(int n2, int n3) {
        return n3 + n2 * 37;
    }

    public static int a(int n2, Object object) {
        if (object == null) {
            return az.a(n2, 0);
        }
        if (!object.getClass().isArray()) {
            return az.a(n2, object.hashCode());
        }
        int n3 = Array.getLength((Object)object);
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = az.a(n2, Array.get((Object)object, (int)i2));
        }
        return n2;
    }
}

