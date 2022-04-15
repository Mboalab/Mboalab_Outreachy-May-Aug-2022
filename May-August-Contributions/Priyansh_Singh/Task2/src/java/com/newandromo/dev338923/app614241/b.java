/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.support.v7.app.AppCompatActivity
 *  android.view.MenuItem
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.newandromo.dev338923.app614241.v;

final class b {
    static int a(Context context) {
        String[] arrstring = context.getResources().getStringArray(2130903040);
        String string = context.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(".");
        String string2 = stringBuilder.toString();
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append(arrstring[i2]);
            if (!string.equals((Object)stringBuilder2.toString())) continue;
            return i2;
        }
        return -1;
    }

    static String a(Context context, String string) {
        int[] arrn = new int[]{2130903040};
        for (int i2 = 0; i2 <= 0; ++i2) {
            int n2 = arrn[i2];
            for (String string2 : context.getResources().getStringArray(n2)) {
                if (!string2.equalsIgnoreCase(string)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(context.getPackageName());
                stringBuilder.append(".");
                stringBuilder.append(string2);
                return stringBuilder.toString();
            }
        }
        return "";
    }

    static boolean a(AppCompatActivity appCompatActivity, MenuItem menuItem) {
        int n2 = menuItem.getItemId();
        if (n2 != 16908332) {
            if (n2 != 2131296264) {
                return false;
            }
            return v.b(appCompatActivity);
        }
        return v.a(appCompatActivity);
    }
}

