
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import com.newandromo.dev338923.app614241.af;
import com.newandromo.dev338923.app614241.d;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public final class co
extends af
implements BannerListener {
    private static boolean d;
    private String e = "";
    private Banner f = null;
    private Activity g = null;
    private View h = null;

    public co(String string) {
        this.e = string;
    }

    static void a(Context context, String string) {
        if (!d) {
            StartAppSDK.init(context, string, false);
            StartAppAd.disableSplash();
            d = true;
        }
    }

    static void a(Context context, boolean bl2) {
        if (d) {
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
    protected final void a(Activity activity) {
        if (activity != null && this.g != null && activity == this.g) {
            this.g = null;
        }
    }

    @Override
    protected final boolean a() {
        return true;
    }

    @Override
    protected final boolean a(Activity activity, View view) {
        this.g = activity;
        this.h = view;
        if (view != null) {
            this.f = (Banner)view.findViewById(2131296505);
            if (this.f != null) {
                this.f.setBannerListener((BannerListener)this);
                return true;
            }
        }
        return false;
    }

    @Override
    protected final int b() {
        return 2131427423;
    }

    @Override
    public final void onClick(View view) {
    }

    @Override
    public final void onFailedToReceiveAd(View view) {
        if (this.f != null) {
            this.f.hideBanner();
        }
        if (this.h != null) {
            Activity activity = this.g;
            View view2 = this.h;
            if (this.a != null) {
                this.a.a(activity, view2);
            }
        }
    }

    @Override
    public final void onReceiveAd(View view) {
        if (this.f != null) {
            this.f.showBanner();
            if (this.a != null) {
                this.a.a();
            }
        }
    }
}

