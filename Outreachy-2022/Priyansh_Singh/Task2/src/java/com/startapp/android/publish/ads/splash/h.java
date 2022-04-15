package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.ads.splash.c;
import com.startapp.android.publish.ads.splash.d;
import com.startapp.android.publish.ads.splash.e;
import com.startapp.android.publish.ads.splash.h;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.model.AdPreferences;

public class h {
    Activity a;
    c b;
    com.startapp.android.publish.cache.c c;
    d d;
    boolean e;
    a f;
    Runnable g;
    private SplashConfig h;
    private Handler i;
    private AdPreferences j;
    private Runnable k;
    private AdEventListener l;

    public h(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.d = null;
        this.i = new Handler();
        this.e = false;
        this.k = new Runnable(){

            public void run() {
                if (h.this.c()) {
                    h.this.d();
                    h.this.e();
                    return;
                }
                h.this.a.finish();
            }
        };
        this.g = new Runnable(){

            public void run() {
                h.this.b.a(h.this.d, (e)new 1(this));
            }
        };
        this.l = new 3((h)this);
        this.a = activity;
        this.h = splashConfig;
        this.j = adPreferences;
        try {
            h.super.h();
            this.b = new c(activity, this.d);
            return;
        }
        catch (Exception exception) {
            this.b = new c(activity);
            this.b.a();
            this.b.b();
            f.a((Context)activity, com.startapp.android.publish.adsCommon.e.d.b, "SplashScreen.constructor - WebView failed", exception.getMessage(), "");
            return;
        }
    }

    private void h() {
        this.h.initSplashLogo(this.a);
        if (!this.k()) {
            this.d = this.h.initSplashHtml(this.a);
        }
    }

    private boolean i() {
        boolean bl;
        int n2 = this.a.getResources().getConfiguration().orientation;
        if (this.h.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (n2 == 2) {
                this.h.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.h.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        switch (7.a[this.h.getOrientation().ordinal()]) {
            default: {
                bl = false;
                break;
            }
            case 2: {
                bl = false;
                if (n2 == 1) {
                    bl = true;
                }
                com.startapp.common.a.c.b((Activity)this.a);
                break;
            }
            case 1: {
                bl = false;
                if (n2 == 2) {
                    bl = true;
                }
                com.startapp.common.a.c.a((Activity)this.a);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Set Orientation: [");
        stringBuilder.append(this.h.getOrientation().toString());
        stringBuilder.append("]");
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)stringBuilder.toString());
        return bl;
    }

    private View j() {
        if (this.k()) {
            return this.h.getLayout((Context)this.a);
        }
        if (this.d != null) {
            return this.d.c();
        }
        return null;
    }

    private boolean k() {
        return !this.h.isHtmlSplash() || this.h.isUserDefinedSplash();
        {
        }
    }

    public void a() {
    }

    public void a(Bundle bundle) {
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"========= Splash Screen Feature =========");
        this.b.j();
        if (!h.super.i()) {
            this.i.post(this.k);
            return;
        }
        this.i.postDelayed(this.k, 100L);
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"Splash screen orientation is being modified");
    }

    public void b() {
        this.i.removeCallbacks(this.k);
        this.b.e();
    }

    boolean c() {
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"Displaying Splash screen");
        if (this.h.validate((Context)this.a)) {
            View view = this.j();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                this.a.setContentView(view, layoutParams);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(this.h.getErrorMessage());
    }

    void d() {
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"Loading Splash Ad");
        this.f = new /* Unavailable Anonymous Inner Class!! */;
        this.c = this.f.loadSplash(this.j, this.l);
    }

    void e() {
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"Started Splash Loading Timer");
        this.i.postDelayed(new Runnable(){

            public void run() {
                if (h.this.b.b(h.this.g, h.this.c)) {
                    h.this.f = null;
                    h.this.c = null;
                }
            }
        }, this.h.getMaxLoadAdTimeout().longValue());
        this.i.postDelayed(new Runnable(){

            public void run() {
                h.this.b.a(h.this.g, h.this.c);
            }
        }, this.h.getMinSplashTime().getIndex());
    }

    void f() {
        com.startapp.common.a.h.a((String)"Splash", (int)4, (String)"Started Splash Display Timer");
        if (this.h.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
            this.i.postDelayed(new Runnable(){

                public void run() {
                    h.this.b.a((StartAppAd)h.this.f);
                }
            }, this.h.getMaxAdDisplayTime().getIndex());
        }
    }

    public void g() {
        this.e = true;
        this.b.h();
    }

}

