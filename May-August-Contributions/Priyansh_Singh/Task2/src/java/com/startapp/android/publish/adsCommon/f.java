/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  com.startapp.android.publish.adsCommon.StartAppAd
 *  com.startapp.android.publish.adsCommon.f$1
 *  com.startapp.android.publish.common.model.AdPreferences
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.startapp.android.publish.adsCommon.AutoInterstitialPreferences;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.f;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.model.AdPreferences;

public class f {
    protected StartAppAd a;
    private boolean b;
    private AutoInterstitialPreferences c;
    private long d;
    private int e;

    private f() {
        this.b = false;
        this.c = null;
        this.d = -1L;
        this.e = -1;
        this.a = null;
    }

    /* synthetic */ f(1 var1) {
    }

    public static f a() {
        return a.a;
    }

    private boolean a(Activity activity) {
        String string = activity.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.startapp.android.publish.");
        stringBuilder.append("adsCommon.activities.OverlayActivity");
        if (!string.startsWith(stringBuilder.toString())) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("com.startapp.android.publish.");
            stringBuilder2.append("adsCommon.activities.FullScreenActivity");
            if (!string.startsWith(stringBuilder2.toString())) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("com.startapp.android.publish.");
                stringBuilder3.append("ads.list3d.List3DActivity");
                if (!string.startsWith(stringBuilder3.toString())) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean b(Activity activity) {
        return activity.getClass().getName().equals((Object)m.a().g());
    }

    private boolean e() {
        return this.b && b.a().H();
    }

    private boolean f() {
        if (this.c == null) {
            this.c = new AutoInterstitialPreferences();
        }
        boolean bl = this.d <= 0L || System.currentTimeMillis() >= this.d + (long)(1000 * this.c.getSecondsBetweenAds());
        boolean bl2 = this.e <= 0 || this.e >= this.c.getActivitiesBetweenAds();
        return bl && bl2;
    }

    public void a(Activity activity, Bundle bundle) {
        if (bundle == null && !f.super.a(activity) && !f.super.b(activity)) {
            this.e = 1 + this.e;
            this.a((Context)activity);
        }
    }

    public void a(Context context) {
        if (f.super.e() && f.super.f()) {
            if (this.a == null) {
                this.a = new StartAppAd(context);
            }
            this.a.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), (AdEventListener)new 1((f)this));
        }
    }

    public void a(AutoInterstitialPreferences autoInterstitialPreferences) {
        this.c = autoInterstitialPreferences;
        this.d = -1L;
        this.e = -1;
    }

    public void b() {
        this.b = true;
    }

    public void c() {
        this.b = false;
    }

    protected void d() {
        this.d = System.currentTimeMillis();
        this.e = 0;
    }

    static class a {
        private static final f a = new f(null);
    }

}

