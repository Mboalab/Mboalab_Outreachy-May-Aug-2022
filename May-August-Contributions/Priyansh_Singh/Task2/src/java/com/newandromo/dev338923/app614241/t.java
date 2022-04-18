/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.newandromo.dev338923.app614241.t$1
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import com.flurry.android.a;
import com.flurry.android.b;
import com.flurry.android.c;
import com.flurry.android.e;
import com.newandromo.dev338923.app614241.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class t {
    private static boolean a = true;

    public static void a(Context context) {
        if (a) {
            b.a("5.2.1");
            b.a a2 = new b.a();
            a2.b = false;
            a2.c = 2;
            b.a.a = new 1();
            if (b.f()) {
                b.a(b.a.a, a2.b, a2.c, a2.d, a2.e, a2.f, a2.g, a2.h, a2.i, context, "47NFTHDCCGNZ6F9DPX2N");
            }
        }
    }

    public static void a(String string) {
        if (a && b.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"package_name", (Object)"com.newandromo.dev338923.app614241");
            if (string != null && !string.equals((Object)"")) {
                hashMap.put((Object)"activity_type", (Object)string);
            }
            b.a("page_view", (Map<String, String>)hashMap);
        }
    }

    public static boolean a() {
        return a;
    }

    public static void b() {
        a = false;
    }

    public static boolean c() {
        return b.c();
    }

    public static void d() {
        if (a) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"package_name", (Object)"com.newandromo.dev338923.app614241");
            b.a("app_launch", (Map<String, String>)hashMap);
        }
    }

    public static void e() {
        if (a && b.c()) {
            b.d();
        }
    }

    public static void f() {
        if (a && b.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"package_name", (Object)"com.newandromo.dev338923.app614241");
            b.a("banner_ad", (Map<String, String>)hashMap);
        }
    }

    public static void g() {
        if (a && b.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"package_name", (Object)"com.newandromo.dev338923.app614241");
            b.a("interstitial_ad", (Map<String, String>)hashMap);
        }
    }
}

