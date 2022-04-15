/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.io.Serializable
 *  java.lang.Object
 */
package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import com.startapp.android.publish.adsCommon.c;
import java.io.Serializable;

public class a
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean isActivityFullScreen;

    public a(Activity activity) {
        a.super.a(c.a(activity));
    }

    private void a(boolean bl) {
        this.isActivityFullScreen = bl;
    }

    public boolean a() {
        return this.isActivityFullScreen;
    }
}

