/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.d.b
 *  android.support.v7.d.c
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.d.b;
import android.support.v7.d.c;
import com.newandromo.dev338923.app614241.cd;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

final class cb
implements Serializable {
    private static final Map<String, c> b;
    b a;

    static {
        HashMap hashMap;
        b = hashMap = new HashMap();
        hashMap.put((Object)cb.a(c.b), (Object)c.b);
        b.put((Object)cb.a(c.a), (Object)c.a);
        b.put((Object)cb.a(c.c), (Object)c.c);
        b.put((Object)cb.a(c.e), (Object)c.e);
        b.put((Object)cb.a(c.f), (Object)c.f);
        b.put((Object)cb.a(c.d), (Object)c.d);
        b.put((Object)cb.a(cd.a), (Object)cd.a);
        b.put((Object)cb.a(cd.b), (Object)cd.b);
        b.put((Object)cb.a(cd.c), (Object)cd.c);
        b.put((Object)cb.a(cd.d), (Object)cd.d);
        b.put((Object)cb.a(cd.e), (Object)cd.e);
        b.put((Object)cb.a(cd.f), (Object)cd.f);
        b.put((Object)cb.a(cd.g), (Object)cd.g);
        b.put((Object)cb.a(cd.h), (Object)cd.h);
    }

    public cb(b b2) {
        this.a = b2;
    }

    private static String a(c c2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2.j);
        stringBuilder.append("_");
        stringBuilder.append(c2.i[2]);
        stringBuilder.append("_");
        stringBuilder.append(c2.i[1]);
        stringBuilder.append("_");
        stringBuilder.append(c2.h[0]);
        stringBuilder.append("_");
        stringBuilder.append(c2.h[1]);
        stringBuilder.append("_");
        stringBuilder.append(c2.h[2]);
        stringBuilder.append("_");
        stringBuilder.append(c2.i[0]);
        stringBuilder.append("_");
        stringBuilder.append(c2.g[0]);
        stringBuilder.append("_");
        stringBuilder.append(c2.g[1]);
        stringBuilder.append("_");
        stringBuilder.append(c2.g[2]);
        return stringBuilder.toString();
    }
}

