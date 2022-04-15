/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.concurrent.atomic.AtomicInteger;

public final class ci {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static int b = 0;

    public static void a(Context context) {
        SharedPreferences sharedPreferences;
        if (a.get() == 0 && (sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context)) != null) {
            int n2 = sharedPreferences.getInt("last_request_code", 0);
            if (n2 != 0) {
                a.set(n2);
                return;
            }
            int n3 = (int)(0xFFFFFFFFL & System.currentTimeMillis());
            a.set(n3);
        }
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences;
        if (a.get() != b && (sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context)) != null) {
            if (a.get() == 0) {
                a.incrementAndGet();
            }
            sharedPreferences.edit().putInt("last_request_code", a.get()).apply();
            b = a.get();
        }
    }
}

