/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Map
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.newandromo.dev338923.app614241.InterstitialHelperBase;
import com.newandromo.dev338923.app614241.ck;
import com.newandromo.dev338923.app614241.i;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.util.Map;

public final class cp
extends InterstitialHelperBase
implements AdDisplayListener,
AdEventListener {
    private static boolean i;
    private String g = "";
    private StartAppAd h = null;

    public cp(String string) {
        this.g = string;
    }

    static void a(Context context, String string) {
        if (!i) {
            StartAppSDK.init(context, string, false);
            StartAppAd.disableSplash();
            i = true;
        }
    }

    static void a(Context context, boolean bl2) {
        if (i) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context);
            boolean bl3 = sharedPreferences.contains("startapp_consent");
            boolean bl4 = true;
            if (bl3 && sharedPreferences.getBoolean("startapp_consent", bl4) == bl2) {
                bl4 = false;
            }
            if (bl4) {
                StartAppSDK.setUserConsent(context, "EULA", System.currentTimeMillis(), bl2);
                PreferenceManager.getDefaultSharedPreferences((Context)context).edit().putBoolean("startapp_consent", bl2).apply();
            }
        }
    }

    @Override
    protected final boolean a() {
        Boolean bl2 = (Boolean)i.a().d.get((Object)"startapp");
        if (bl2 == null) {
            return true;
        }
        return bl2;
    }

    @Override
    protected final boolean a(Activity activity) {
        if (activity != null && this.a()) {
            new StringBuilder("initializeInterstitial - StartApp appID").append(this.g);
            this.h = new StartAppAd((Context)activity);
            if (this.h != null) {
                this.h.loadAd((AdEventListener)this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void adClicked(Ad ad2) {
        new StringBuilder("adClicked: ").append((Object)ad2);
    }

    @Override
    public final void adDisplayed(Ad ad2) {
        new StringBuilder("adDisplayed: ").append((Object)ad2);
    }

    @Override
    public final void adHidden(Ad ad2) {
        new StringBuilder("adHidden: ").append((Object)ad2);
        this.h = null;
        InterstitialHelperBase.d = null;
        this.g();
    }

    @Override
    public final void adNotDisplayed(Ad ad2) {
        new StringBuilder("adNotDisplayed: ").append((Object)ad2);
    }

    @Override
    protected final int b() {
        return ck.c;
    }

    @Override
    protected final void b(Activity activity) {
        super.b(activity);
        new StringBuilder("onActivityPaused: ").append((Object)activity);
        if (this.a() && this.h != null) {
            this.h.onPause();
        }
    }

    @Override
    protected final void c(Activity activity) {
        super.c(activity);
        if (this.a() && this.h != null) {
            this.h.onResume();
        }
    }

    @Override
    protected final boolean c() {
        return this.h != null && this.h.isReady();
    }

    @Override
    protected final boolean d() {
        if (this.a() && this.h != null) {
            this.h.showAd(this);
        }
        return true;
    }

    @Override
    protected final void e() {
        if (this.h != null) {
            this.h = null;
        }
    }

    @Override
    public final String f() {
        return "startapp";
    }

    @Override
    protected final void i() {
        if (this.h != null) {
            this.h = null;
        }
    }

    @Override
    public final void onFailedToReceiveAd(Ad ad2) {
        new StringBuilder("onFailedToReceiveAd: ").append(ad2.getErrorMessage());
        this.h = null;
        this.h();
    }

    @Override
    public final void onReceiveAd(Ad ad2) {
        new StringBuilder("onReceiveAd: ").append((Object)ad2);
    }
}

