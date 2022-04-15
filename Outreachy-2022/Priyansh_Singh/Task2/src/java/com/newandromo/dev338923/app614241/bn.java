/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.support.v4.a.a.a
 *  android.view.MenuItem
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.view.MenuItem;

public final class bn {
    public static void a(MenuItem menuItem, int n2) {
        Drawable drawable;
        if (menuItem != null && (drawable = menuItem.getIcon()) != null) {
            Drawable drawable2 = a.e((Drawable)drawable);
            a.a((Drawable)drawable2.mutate(), (int)n2);
            menuItem.setIcon(drawable2);
        }
    }
}

