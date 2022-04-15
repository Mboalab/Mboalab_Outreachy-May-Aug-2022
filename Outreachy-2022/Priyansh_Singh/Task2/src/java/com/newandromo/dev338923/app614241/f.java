/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.support.v4.content.c
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  com.newandromo.dev338923.app614241.AndromoApplication
 *  com.newandromo.dev338923.app614241.co
 *  com.newandromo.dev338923.app614241.cp
 *  com.newandromo.dev338923.app614241.dd
 *  com.newandromo.dev338923.app614241.i
 *  com.newandromo.dev338923.app614241.s
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Random
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.c;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.newandromo.dev338923.app614241.AndromoApplication;
import com.newandromo.dev338923.app614241.InterstitialHelperBase;
import com.newandromo.dev338923.app614241.af;
import com.newandromo.dev338923.app614241.cl;
import com.newandromo.dev338923.app614241.co;
import com.newandromo.dev338923.app614241.cp;
import com.newandromo.dev338923.app614241.cv;
import com.newandromo.dev338923.app614241.d;
import com.newandromo.dev338923.app614241.dd;
import com.newandromo.dev338923.app614241.de;
import com.newandromo.dev338923.app614241.e;
import com.newandromo.dev338923.app614241.i;
import com.newandromo.dev338923.app614241.j;
import com.newandromo.dev338923.app614241.s;
import com.newandromo.dev338923.app614241.t;
import com.newandromo.dev338923.app614241.u;
import java.util.Random;

public final class f {
    private static dd a = new dd();
    private static s b = new s();
    private static boolean c = true;
    private static boolean d = false;
    private static de e = new de();
    private static u f = new u();
    private static InterstitialHelperBase g;
    private static int h;
    private static Activity i;
    private static boolean j;
    private static boolean k;
    private static j l;

    static {
        k = false;
        l = new j();
    }

    static void a() {
        if (g != null) {
            g.e();
            g = null;
        }
        h = 0;
        j = false;
        g = de.a();
        StringBuilder stringBuilder = new StringBuilder("SELECTED: ");
        String string = g != null ? g.getClass().getSimpleName() : "(null)";
        stringBuilder.append(string);
        if (g != null && !g.a()) {
            Log.e((String)"AdManager", (String)"Um, interstitial helper's shouldShowAds() returned false. WTF?");
            j = false;
            g = null;
        }
    }

    static void a(Activity activity) {
        new StringBuilder("onActivityCreated: ").append((Object)activity);
        if (!d) {
            StringBuilder stringBuilder = new StringBuilder("Setting mActivity: ");
            stringBuilder.append((Object)activity);
            stringBuilder.append(", was: ");
            stringBuilder.append((Object)i);
            i = activity;
            f.i(activity);
        }
    }

    static void a(Context context) {
        de.a(context);
        u.a(context);
        dd.a((Context)context);
        s.a((Context)context);
    }

    static void a(boolean bl) {
        c = bl;
        Context context = AndromoApplication.a();
        if (de.b()) {
            cp.a((Context)context, (boolean)bl);
            return;
        }
        if (dd.t()) {
            co.a((Context)context, (boolean)bl);
        }
    }

    public static boolean a(Activity activity, ViewGroup viewGroup) {
        dd.b();
        int n2 = e.b.a;
        if (!d) {
            dd.b();
            af af2 = f.f();
            if (af2 != null) {
                f.h(activity);
                return af2.a(activity, viewGroup, n2);
            }
        } else {
            f.h(activity);
        }
        return false;
    }

    public static boolean a(Activity activity, ViewGroup viewGroup, int n2) {
        if (!d) {
            dd.b();
            af af2 = f.f();
            if (af2 != null) {
                f.h(activity);
                return af2.a(activity, viewGroup, n2);
            }
        } else {
            f.h(activity);
        }
        return false;
    }

    public static boolean a(Activity activity, Runnable runnable) {
        String string;
        boolean bl;
        block8 : {
            block6 : {
                block5 : {
                    int n2;
                    block7 : {
                        if (g == null || !j) {
                            Log.w((String)"AdManager", (String)"showInterstitialAd called without any ad network selected, calling initializeInterstitial() to select one and initialize it...");
                            f.i(activity);
                        }
                        InterstitialHelperBase interstitialHelperBase = g;
                        bl = false;
                        if (interstitialHelperBase == null || !j) break block5;
                        long l2 = activity.getSharedPreferences("com.newandromo.dev338923.app614241.interstitial", 0).getLong("interstitialAdExpiration", -1L);
                        boolean bl2 = System.currentTimeMillis() > l2;
                        if (!bl2) break block6;
                        t.g();
                        if (!i.a().a) break block6;
                        if (!g.c()) break block7;
                        StringBuilder stringBuilder = new StringBuilder("Ready to show, calling ");
                        stringBuilder.append(g.getClass().getSimpleName());
                        stringBuilder.append(".showInterstitial()");
                        SharedPreferences.Editor editor = activity.getSharedPreferences("com.newandromo.dev338923.app614241.interstitial", 0).edit();
                        long l3 = i.a().b;
                        if (l3 == 0L) {
                            l3 = 600000L;
                        }
                        editor.putLong("interstitialAdExpiration", l3 + System.currentTimeMillis());
                        editor.apply();
                        int n3 = 2 + new Random().nextInt(3);
                        SharedPreferences.Editor editor2 = activity.getSharedPreferences("com.newandromo.dev338923.app614241.interstitial", 0).edit();
                        editor2.putInt("interstitialAdEventCount", n3);
                        editor2.apply();
                        string = g.f();
                        bl = g.a(runnable);
                        runnable = null;
                        break block8;
                    }
                    new StringBuilder("Not ready to show an ad yet. mNotReadyCounter = ").append(h);
                    h = n2 = 1 + h;
                    if (n2 > 3) {
                        Log.w((String)"AdManager", (String)"Too many not readies in a row, switching to another ad network.");
                        f.a();
                    }
                    break block6;
                }
                Log.e((String)"AdManager", (String)"Can't show interstitial ad, mInterstitialHelper is null!");
            }
            string = null;
        }
        if (!bl && runnable != null) {
            runnable.run();
        }
        if (bl) {
            i i2 = i.a();
            i2.c.post(new Runnable(i2, string){
                final /* synthetic */ String a;
                final /* synthetic */ i b;
                {
                    this.b = i2;
                    this.a = string;
                }

                public final void run() {
                    try {
                        long l2 = System.currentTimeMillis();
                        String string = this.a;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("34e1fa93-58e2-45e5-b336-9074539bb899");
                        stringBuilder.append(":");
                        stringBuilder.append(l2);
                        stringBuilder.append(":");
                        stringBuilder.append(string);
                        stringBuilder.append(":");
                        stringBuilder.append("i");
                        String string2 = java.net.URLEncoder.encode((String)i.a((String)stringBuilder.toString(), (String)"38274449"), (String)"UTF-8");
                        StringBuilder stringBuilder2 = new StringBuilder();
                        java.util.Formatter formatter = new java.util.Formatter((java.lang.Appendable)stringBuilder2);
                        Object[] arrobject = new Object[]{"https://sqz.andromo.com", "/v3/event/", "34e1fa93-58e2-45e5-b336-9074539bb899", this.a, "i", l2, string2};
                        formatter.format("%s%s?_v=3&a=%s&n=%s&e=%s&t=%s&_s=%s", arrobject);
                        i.a((String)stringBuilder2.toString());
                        return;
                    }
                    catch (java.lang.Exception exception) {
                        return;
                    }
                }
            });
        }
        return bl;
    }

    public static void b() {
        if (g != null) {
            StringBuilder stringBuilder = new StringBuilder("Calling ");
            stringBuilder.append(g.getClass().getSimpleName());
            stringBuilder.append(".hideInterstitial()");
        }
    }

    static void b(Activity activity) {
        new StringBuilder("onActivityStarted: ").append((Object)activity);
        if (!d) {
            s.b();
            dd.e();
            StringBuilder stringBuilder = new StringBuilder("activity ");
            String string = activity == i ? "matches mActivity" : "does not match mActivity";
            stringBuilder.append(string);
            new StringBuilder("mInterstitialInitialized: ").append(j);
            if (activity != i || !j) {
                StringBuilder stringBuilder2 = new StringBuilder("Setting mActivity: ");
                stringBuilder2.append((Object)activity);
                stringBuilder2.append(", was: ");
                stringBuilder2.append((Object)i);
                i = activity;
                f.i(activity);
            }
            if (i == activity && g != null && InterstitialHelperBase.c && InterstitialHelperBase.f == null) {
                IntentFilter intentFilter = new IntentFilter("");
                intentFilter.addCategory("android.intent.category.DEFAULT");
                InterstitialHelperBase.f = new InterstitialHelperBase.AudioServiceReceiver();
                InterstitialHelperBase.e.a((BroadcastReceiver)InterstitialHelperBase.f, intentFilter);
            }
        }
    }

    static void b(boolean bl) {
        if (bl) {
            dd.u();
            de.c();
        }
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences("com.newandromo.dev338923.app614241.interstitial", 0).getLong("interstitialAdExpiration", -1L) - System.currentTimeMillis() < 300000L;
    }

    static void c(Activity activity) {
        new StringBuilder("onActivityStopped: ").append((Object)activity);
        s.c();
        dd.f();
        if (i == activity && g != null && InterstitialHelperBase.f != null) {
            try {
                InterstitialHelperBase.e.a((BroadcastReceiver)InterstitialHelperBase.f);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                StringBuilder stringBuilder = new StringBuilder("IllegalArgumentException calling unRegisterReceiver: ");
                stringBuilder.append(illegalArgumentException.getMessage());
                Log.e((String)"InterstitialHelperBase", (String)stringBuilder.toString());
                illegalArgumentException.printStackTrace();
            }
            InterstitialHelperBase.f = null;
        }
    }

    public static void c(boolean bl) {
        d = bl;
    }

    static boolean c() {
        return true;
    }

    static void d(Activity activity) {
        new StringBuilder("onActivityPaused: ").append((Object)activity);
        if (k && t.a()) {
            if (t.c()) {
                t.f();
            }
            k = false;
        }
        s.d();
        dd.g();
        if (i == activity && g != null) {
            g.b(activity);
        }
    }

    public static boolean d() {
        new StringBuilder("isDelayedAdLoadingEnabled is: ").append(d);
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static af e() {
        af af2;
        block4 : {
            dd dd2;
            block16 : {
                af af3;
                block6 : {
                    int n2;
                    block15 : {
                        block14 : {
                            block13 : {
                                block12 : {
                                    block11 : {
                                        block10 : {
                                            block9 : {
                                                block8 : {
                                                    block7 : {
                                                        block5 : {
                                                            dd2 = a;
                                                            boolean bl = dd.l;
                                                            af2 = null;
                                                            if (!bl) break block4;
                                                            n2 = new Random().nextInt(100);
                                                            dd.d();
                                                            if (!dd.a || dd.m || n2 >= dd.n) break block5;
                                                            af3 = dd.i();
                                                            break block6;
                                                        }
                                                        if (!dd.b || n2 >= dd.o) break block7;
                                                        af3 = dd.j();
                                                        break block6;
                                                    }
                                                    if (!dd.c || n2 >= dd.p) break block8;
                                                    af3 = dd.k();
                                                    break block6;
                                                }
                                                if (!dd.d || n2 >= dd.q) break block9;
                                                af3 = dd.l();
                                                break block6;
                                            }
                                            if (!dd.e || n2 >= dd.r) break block10;
                                            af3 = dd.m();
                                            break block6;
                                        }
                                        if (!dd.g || n2 >= dd.s) break block11;
                                        af3 = dd.n();
                                        break block6;
                                    }
                                    if (!dd.h || n2 >= dd.t) break block12;
                                    af3 = dd.o();
                                    break block6;
                                }
                                if (!dd.i || n2 >= dd.u) break block13;
                                af3 = dd.p();
                                break block6;
                            }
                            if (!dd.j || n2 >= dd.v) break block14;
                            af3 = dd.q();
                            break block6;
                        }
                        if (!dd.k || n2 >= dd.w) break block15;
                        af3 = dd.r();
                        break block6;
                    }
                    boolean bl = dd.f;
                    af2 = null;
                    if (!bl) break block16;
                    int n3 = dd.x;
                    af2 = null;
                    if (n2 >= n3) break block16;
                    af3 = dd.s();
                }
                af2 = af3;
            }
            if (af2 != null) {
                af2.a = dd2;
                af2.b = false;
                dd.y = 0;
            }
        }
        return af2;
    }

    static void e(Activity activity) {
        new StringBuilder("onActivityResumed: ").append((Object)activity);
        s.e();
        dd.h();
        if (i == activity && g != null) {
            g.c(activity);
        }
    }

    private static af f() {
        af af2 = f.e();
        return af2;
    }

    static void f(Activity activity) {
        new StringBuilder("onActivityDestroyed: ").append((Object)activity);
        s.a((Activity)activity);
        dd.a((Activity)activity);
        if (i == activity) {
            if (g != null) {
                g.i();
            }
            new StringBuilder("Setting mActivity: null, was: ").append((Object)i);
            i = null;
        }
    }

    static void g(Activity activity) {
        new StringBuilder("onActivityBackPressed: ").append((Object)activity);
        if (g != null) {
            g.e();
            g = null;
            j = false;
        }
    }

    private static void h(Activity activity) {
        if (activity != null) {
            dd dd2 = a;
            boolean bl = true;
            boolean bl2 = dd2 != null && dd.c() > 0;
            if (bl2) {
                DisplayMetrics displayMetrics;
                View view;
                View view2;
                FrameLayout frameLayout;
                LinearLayout linearLayout;
                if (t.a()) {
                    if (t.c()) {
                        t.f();
                        k = false;
                    } else {
                        k = bl;
                    }
                }
                if ((linearLayout = (LinearLayout)activity.findViewById(2131296332)) != null && (displayMetrics = activity.getResources().getDisplayMetrics()) != null) {
                    int n2 = Math.round((float)((float)displayMetrics.heightPixels / displayMetrics.density));
                    Math.round((float)((float)displayMetrics.widthPixels / displayMetrics.density));
                    if (n2 > 720) {
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        layoutParams.height = Math.round((float)(90.0f * displayMetrics.density));
                        new StringBuilder("AdManager - 90dp height in pixels is ").append(layoutParams.height);
                        linearLayout.setLayoutParams(layoutParams);
                        FrameLayout frameLayout2 = (FrameLayout)activity.findViewById(2131296310);
                        if (frameLayout2 != null) {
                            frameLayout2.setPadding(0, Math.round((float)(16.0f * displayMetrics.density)), 0, 0);
                        }
                    }
                }
                if ((frameLayout = (FrameLayout)activity.findViewById(2131296310)) != null) {
                    frameLayout.setVisibility(0);
                }
                if ((view = activity.findViewById(2131296311)) != null) {
                    view.setVisibility(0);
                }
                String string = cv.g((Context)activity, 2130968613);
                StringBuilder stringBuilder = new StringBuilder("activity_background_image_url: '");
                stringBuilder.append(string);
                stringBuilder.append("'");
                int n3 = cv.e((Context)activity, 2130968610);
                if ((string == null || string.isEmpty()) && n3 == 0) {
                    bl = false;
                }
                if (bl && (view2 = activity.findViewById(2131296312)) != null) {
                    view2.setBackground(cl.a());
                    view2.setVisibility(0);
                }
            }
        }
    }

    private static void i(Activity activity) {
        j = false;
        if (g == null) {
            Log.w((String)"AdManager", (String)"initializeInterstitial called without any ad network selected, calling selectNextInterstitialNetwork()...");
            f.a();
        }
        if (g != null) {
            if (f.b((Context)activity)) {
                StringBuilder stringBuilder = new StringBuilder("Ready to initialize, calling ");
                stringBuilder.append(g.getClass().getSimpleName());
                stringBuilder.append(".initializeInterstitial()");
                boolean bl = g.a(activity);
                if (!bl) {
                    Log.w((String)"AdManager", (String)"Initialize failed, calling selectNextInterstitialNetwork");
                    f.a();
                    if (g != null) {
                        StringBuilder stringBuilder2 = new StringBuilder("Second time's the charm, calling ");
                        stringBuilder2.append(g.getClass().getSimpleName());
                        stringBuilder2.append(".initializeInterstitial()");
                        bl = g.a(activity);
                        if (!bl) {
                            Log.e((String)"AdManager", (String)"Second initialize failed, giving up.");
                        }
                    }
                }
                j = bl;
                return;
            }
            return;
        }
        Log.e((String)"AdManager", (String)"No ad network to initialize");
    }
}

