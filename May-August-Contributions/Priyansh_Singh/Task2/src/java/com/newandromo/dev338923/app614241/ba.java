/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.graphics.BitmapFactory;

public final class ba {
    static int a;
    static int b;

    static int a(BitmapFactory.Options options, int n2, int n3) {
        int n4 = options.outHeight;
        int n5 = options.outWidth;
        int n6 = a;
        int n7 = 2048;
        int n8 = n6 > 0 ? a : 2048;
        if (b > 0) {
            n7 = b;
        }
        if (1024 > n8) {
            n2 = n8;
        }
        int n9 = 1;
        if (1024 > n7) {
            n3 = n7;
        }
        while (n4 / n9 > n3 || n5 / n9 > n2) {
            n9 *= 2;
        }
        return n9;
    }
}

