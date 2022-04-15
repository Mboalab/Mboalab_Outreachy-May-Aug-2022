/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.Intent;

public final class c
implements Runnable {
    private final Context a;
    private final Intent b;

    public c(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final void run() {
        this.a.startActivity(this.b);
    }
}

