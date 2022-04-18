/*
 *  
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  com.startapp.android.publish.ads.b.e
 *  com.startapp.android.publish.adsCommon.BaseRequest
 *  com.startapp.android.publish.adsCommon.StartAppAd
 *  com.startapp.android.publish.adsCommon.activities.FullScreenActivity
 *  com.startapp.android.publish.adsCommon.e.b
 *  com.startapp.android.publish.adsCommon.j
 *  com.startapp.android.publish.adsCommon.m$1
 *  com.startapp.android.publish.cache.a
 *  com.startapp.android.publish.cache.c
 *  com.startapp.android.publish.cache.d
 *  com.startapp.android.publish.common.metaData.InfoEventService
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.MetaDataRequest
 *  com.startapp.android.publish.common.metaData.MetaDataRequest$a
 *  com.startapp.android.publish.common.metaData.PeriodicMetaDataService
 *  com.startapp.android.publish.common.metaData.d
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.android.publish.common.model.AdPreferences$Placement
 *  com.startapp.common.Constants
 *  com.startapp.common.a.c
 *  com.startapp.common.a.f
 *  com.startapp.common.a.h
 *  com.startapp.common.a.j
 *  com.startapp.common.c
 *  com.startapp.common.c.a
 *  com.startapp.common.g
 *  com.startapp.common.g$a
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.TreeMap
 */
package com.startapp.android.publish.adsCommon;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.SDKAdPreferences;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.g;
import com.startapp.android.publish.adsCommon.j;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.common.metaData.InfoEventService;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.metaData.PeriodicMetaDataService;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import com.startapp.common.g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class m {
    private SDKAdPreferences a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private Application h;
    private HashMap<Integer, Integer> i;
    private Object j;
    private Activity k;
    private boolean l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Map<String, String> r;
    private Bundle s;
    private com.startapp.android.publish.cache.c t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private g y;

    private m() {
        this.b = i.a(512L);
        this.d = false;
        this.e = false;
        this.f = false;
        this.h = null;
        this.i = new HashMap();
        this.l = false;
        this.n = false;
        this.o = true;
        this.p = false;
        this.q = false;
        this.s = null;
        this.t = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = null;
    }

    /* synthetic */ m(1 var1) {
    }

    public static m a() {
        return a.a;
    }

    @TargetApi(value=14)
    public static Object a(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(){

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                StringBuilder stringBuilder = new StringBuilder("onActivityCreated [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append(", ");
                stringBuilder.append((Object)bundle);
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().a(activity, bundle);
                if (i.a(2L)) {
                    com.startapp.android.publish.adsCommon.f.a().a(activity, bundle);
                }
            }

            public final void onActivityDestroyed(Activity activity) {
                StringBuilder stringBuilder = new StringBuilder("onActivityDestroyed [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().e(activity);
            }

            public final void onActivityPaused(Activity activity) {
                StringBuilder stringBuilder = new StringBuilder("onActivityPaused [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().c(activity);
            }

            public final void onActivityResumed(Activity activity) {
                StringBuilder stringBuilder = new StringBuilder("onActivityResumed [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().b(activity);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                StringBuilder stringBuilder = new StringBuilder("onActivitySaveInstanceState [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().b(activity, bundle);
            }

            public final void onActivityStarted(Activity activity) {
                StringBuilder stringBuilder = new StringBuilder("onActivityStarted [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().a(activity);
            }

            public final void onActivityStopped(Activity activity) {
                StringBuilder stringBuilder = new StringBuilder("onActivityStopped [");
                stringBuilder.append(activity.getClass().getName());
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                m.a().d(activity);
            }
        };
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        return activityLifecycleCallbacks;
    }

    @TargetApi(value=14)
    public static void a(Application application, Object object) {
        application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
    }

    private void a(final Context context, long l2) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(){

            public void run() {
                try {
                    WebView webView = new WebView(context);
                    k.b(context, "User-Agent", webView.getSettings().getUserAgentString());
                    return;
                }
                catch (Exception exception) {
                    f.a(context, d.b, "NetworkUtils.saveUserAgent - Webview failed", exception.getMessage(), "");
                    return;
                }
            }
        }, l2);
    }

    private void a(Context context, AdPreferences adPreferences) {
        if (this.h() && !b.a().y()) {
            this.t = com.startapp.android.publish.cache.a.a().a(context, adPreferences);
        }
    }

    private void a(Context context, boolean bl) {
        m.super.f(false);
        m.super.e(false);
        if (com.startapp.common.a.c.b() && i.a(2L)) {
            m.super.f(bl);
            m.super.e(true);
            StringBuilder stringBuilder = new StringBuilder("Return Ads: [");
            stringBuilder.append(bl);
            stringBuilder.append("]");
            h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
            return;
        }
        h.a((String)"StartAppSDKInternal", (int)6, (String)"Cannot activate return interstitials, cache to disk, ttl reload - api lower than 14");
    }

    static /* synthetic */ void a(m m2, Context context, long l2) {
        m2.a(context, l2);
    }

    private void b(Context context, String string, String string2) {
        boolean bl;
        boolean bl2 = k.a(context, string2, Boolean.FALSE);
        if (bl2 != (bl = com.startapp.common.a.c.a((Context)context, (String)string))) {
            this.a(context, string, System.currentTimeMillis(), bl, false);
            k.b(context, string2, bl);
        }
    }

    private static boolean c(String string) {
        try {
            Class.forName((String)string);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private static String d(String string) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(".StartAppConstants");
            String string2 = (String)Class.forName((String)stringBuilder.toString()).getField("WRAPPER_VERSION").get(null);
            return string2;
        }
        catch (Exception exception) {
            return "0";
        }
    }

    private void e(boolean bl) {
        this.c = bl;
    }

    private void f(Activity activity) {
        this.d = true;
        m.super.o((Context)activity);
        if (com.startapp.common.c.a() != null) {
            com.startapp.common.c.a().b((Context)activity);
        }
    }

    private void f(boolean bl) {
        this.u = bl;
    }

    private void g(Activity activity) {
        if (MetaData.getInstance().canShowAd() && this.h() && !b.a().y() && !i.a() && !this.c() && m.super.p()) {
            this.y = com.startapp.android.publish.cache.a.a().a(this.t);
            if (this.y != null && this.y.isReady()) {
                com.startapp.android.publish.adsCommon.a.f f2 = b.a().E().a(AdPreferences.Placement.INAPP_RETURN, null);
                if (f2.a()) {
                    if (this.y.a(null)) {
                        com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(AdPreferences.Placement.INAPP_RETURN, null));
                    }
                } else {
                    c.a((Context)activity, ((com.startapp.android.publish.ads.b.e)this.y).k(), null, f2.c());
                    if (Constants.a().booleanValue()) {
                        com.startapp.common.a.j.a().a((Context)activity, f2.b());
                    }
                }
            }
        }
        if (com.startapp.common.c.a() != null) {
            com.startapp.common.c.a().a((Context)activity);
        }
        if (m.super.q()) {
            this.a((Context)activity, MetaDataRequest.a.b);
        }
    }

    private void i(Context context) {
        k.b(context, "periodicInfoEventPaused", Boolean.FALSE);
        k.b(context, "periodicMetadataPaused", Boolean.FALSE);
        1 var2_2 = new 1((m)this, context);
        if (MetaData.getInstance().isReady()) {
            var2_2.a();
            return;
        }
        MetaData.getInstance().addMetaDataListener((com.startapp.android.publish.common.metaData.d)var2_2);
    }

    private void j(Context context) {
        MetaData.init((Context)context);
        if (!i.a()) {
            b.a(context);
            if (i.a(16L) || i.a(32L)) {
                com.startapp.android.publish.ads.banner.c.a(context);
            }
            if (i.a(8L)) {
                com.startapp.android.publish.ads.splash.f.a(context);
            }
            if (this.b) {
                com.startapp.android.publish.cache.d.a((Context)context);
            }
            if (i.e()) {
                com.startapp.android.publish.adsCommon.adinformation.a.a(context);
            }
        }
    }

    private void k(Context context) {
        Integer n2 = k.a(context, "shared_prefs_app_version_id", -1);
        int n3 = com.startapp.common.a.c.d((Context)context);
        if (n2 > 0 && n3 > n2) {
            this.q = true;
        }
        k.b(context, "shared_prefs_app_version_id", n3);
    }

    private void l(Context context) {
        if (!this.q && com.startapp.android.publish.cache.d.a().b().isLocalCache()) {
            if (this.c) {
                com.startapp.android.publish.cache.a.a().a(context);
            }
        } else {
            h.a((String)"StartAppSDKInternal", (int)3, (String)"App version changed or disabled in meta - deleting existing cache");
            com.startapp.android.publish.cache.a.a().b(context);
        }
        m.super.o(context);
        com.startapp.android.publish.cache.a.a().c(context);
    }

    private void m(final Context context) {
        h.a((String)"StartAppSDKInternal", (int)3, (String)"Sending Download Event");
        com.startapp.common.g.a((g.a)g.a.a, (Runnable)new Runnable(){

            public void run() {
                try {
                    j j2 = new j();
                    AdPreferences adPreferences = new AdPreferences();
                    i.a(context, adPreferences);
                    j2.fillApplicationDetails(context, adPreferences);
                    com.startapp.android.publish.adsCommon.h.a.a(context, AdsConstants.a(AdsConstants.ApiType.DOWNLOAD), (BaseRequest)j2, null);
                    return;
                }
                catch (Exception exception) {
                    h.a((int)6, (String)"Error occured while sending download event", (Throwable)exception);
                    f.a(context, d.b, "StartAppSDKInternal.sendDownloadEvent", exception.getMessage(), "");
                    return;
                }
            }
        });
    }

    private void n(Context context) {
        k.a(context, "sharedPrefsWrappers", this.r);
    }

    private void o(Context context) {
        m.super.a(context, new AdPreferences());
    }

    public static boolean o() {
        return m.a().a("Unity") != null;
    }

    private static void p(Context context) {
        TreeMap treeMap = new TreeMap();
        if (m.t()) {
            treeMap.put((Object)"Cordova", (Object)i.b());
        }
        if (m.r()) {
            treeMap.put((Object)"AdMob", (Object)m.d("com.startapp.android.mediation.admob"));
        }
        if (m.s()) {
            treeMap.put((Object)"MoPub", (Object)m.d("com.mopub.mobileads"));
        }
        if (m.u() && !m.a().n().containsKey((Object)"B4A")) {
            treeMap.put((Object)"MoPub", (Object)"0");
        }
        if (!treeMap.isEmpty()) {
            k.a(context, "sharedPrefsWrappers", (Map<String, String>)treeMap);
        }
    }

    private boolean p() {
        return System.currentTimeMillis() - this.g > b.a().x();
    }

    private boolean q() {
        return System.currentTimeMillis() - this.g > MetaData.getInstance().getSessionMaxBackgroundTime();
    }

    private static boolean r() {
        return m.c("com.startapp.android.mediation.admob.StartAppCustomEvent");
    }

    private static boolean s() {
        return m.c("com.mopub.mobileads.StartAppCustomEventInterstitial");
    }

    private static boolean t() {
        return m.c("org.apache.cordova.CordovaPlugin");
    }

    private static boolean u() {
        return m.c("anywheresoftware.b4a.BA");
    }

    public String a(String string) {
        if (this.r == null) {
            return null;
        }
        return (String)this.r.get((Object)string);
    }

    public void a(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder("onActivityStarted [");
        stringBuilder.append(activity.getClass().getName());
        stringBuilder.append("]");
        h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
        if (!(!i.a(8L) || b.a().z() || this.w || this.b("MoPub") || this.b("AdMob") || this.x || !activity.getClass().getName().equals((Object)this.m) || this.i() || this.i.size() != 0)) {
            StartAppAd.showSplash((Activity)activity, (Bundle)this.s, (SplashConfig)new SplashConfig(), (AdPreferences)new AdPreferences(), null, (boolean)false);
        }
        this.x = true;
        if (this.d) {
            m.super.g(activity);
        }
        this.f = false;
        this.d = false;
        if ((Integer)this.i.get((Object)activity.hashCode()) == null) {
            Integer n2 = 1;
            this.i.put((Object)activity.hashCode(), (Object)n2);
            StringBuilder stringBuilder2 = new StringBuilder("Activity Added:[");
            stringBuilder2.append(activity.getClass().getName());
            stringBuilder2.append("]");
            h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder2.toString());
            return;
        }
        StringBuilder stringBuilder3 = new StringBuilder("Activity [");
        stringBuilder3.append(activity.getClass().getName());
        stringBuilder3.append("] already exists");
        h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder3.toString());
    }

    public void a(Activity activity, Bundle bundle) {
        if (bundle == null && this.m != null && activity.getClass().getName().equals((Object)this.m)) {
            this.l = false;
        }
        this.s = bundle;
    }

    void a(Context context) {
        k.b(context, "periodicInfoEventPaused", Boolean.TRUE);
        com.startapp.android.publish.adsCommon.Utils.b.a(context, InfoEventService.class);
    }

    protected void a(Context context, MetaDataRequest.a a2) {
        com.startapp.android.publish.adsCommon.Utils.g.d().a(context, a2);
    }

    protected void a(Context context, String string, long l2, boolean bl, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = bl ? "1" : "0";
        stringBuilder.append(string2);
        String string3 = bl2 ? "M" : "A";
        stringBuilder.append(string3);
        String string4 = stringBuilder.toString();
        f.a(context, d.j, string, string4, "");
    }

    public void a(Context context, String string, String string2) {
        if (this.r == null) {
            this.r = new TreeMap();
        }
        this.r.put((Object)string, (Object)string2);
        m.super.n(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void a(Context context, String string, String string2, SDKAdPreferences sDKAdPreferences, boolean bl) {
        try {
            if (i.a(2L) && !i.a(context, FullScreenActivity.class)) {
                Log.w((String)"StartAppSDKInternal", (String)"FullScreenActivity is missing from AndroidManifest.xml");
            }
            this.b(true ^ i.f(context));
            m.p(context);
            l.a(context);
            if (!this.l) {
                this.j(context);
                this.l = true;
                if (context instanceof Activity) {
                    this.m = context.getClass().getName();
                }
                StringBuilder stringBuilder = new StringBuilder("Initialize StartAppSDK with DevID:[");
                stringBuilder.append(string);
                stringBuilder.append("], AppID:[");
                stringBuilder.append(string2);
                stringBuilder.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
                i.a(context, string, string2);
                this.a = sDKAdPreferences;
                com.startapp.common.a.f.b((Context)context, (String)"shared_prefs_sdk_ad_prefs", (Serializable)sDKAdPreferences);
                com.startapp.common.c.a.b((Context)context);
                boolean bl2 = k.a(context, "shared_prefs_first_init", Boolean.TRUE);
                StringBuilder stringBuilder2 = new StringBuilder("First Initialization: [");
                stringBuilder2.append(bl2);
                stringBuilder2.append("]");
                h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder2.toString());
                if (bl2) {
                    this.m(context);
                    k.b(context, "totalSessions", 0);
                    k.b(context, "firstSessionTime", System.currentTimeMillis());
                    k.b(context, "shared_prefs_first_init", Boolean.FALSE);
                }
                this.a(context, MetaDataRequest.a.a);
                this.k(context);
                this.a(context, bl);
                if (this.b) {
                    this.l(context);
                }
            }
            this.i(context);
            this.f(context);
            return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "StartAppSDKInternal.intialize - unexpected error occurd", exception.getMessage(), "");
            return;
        }
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public boolean a(AdPreferences.Placement placement) {
        if (this.c) {
            if (this.f) {
                return false;
            }
            if (this.d) {
                return placement == AdPreferences.Placement.INAPP_RETURN && com.startapp.android.publish.cache.d.a().b().shouldReturnAdLoadInBg();
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.n = true;
        this.e = true;
    }

    public void b(Activity activity) {
        if (this.b && this.e) {
            this.e = false;
            com.startapp.android.publish.cache.a.a().b();
        }
        if (this.n) {
            this.n = false;
            l.c(activity.getApplicationContext());
        }
        this.k = activity;
    }

    public void b(Activity activity, Bundle bundle) {
    }

    void b(Context context) {
        k.b(context, "periodicMetadataPaused", Boolean.TRUE);
        com.startapp.android.publish.adsCommon.Utils.b.a(context, PeriodicMetaDataService.class);
    }

    public void b(boolean bl) {
        this.o = bl;
    }

    public boolean b(String string) {
        return this.a(string) != null;
    }

    public void c(Activity activity) {
        this.g = System.currentTimeMillis();
        this.k = null;
    }

    void c(Context context) {
        k.b(context, "periodicInfoEventPaused", Boolean.FALSE);
        com.startapp.android.publish.adsCommon.Utils.b.a(context, (long)k.a(context, "periodicInfoEventTriggerTime", com.startapp.android.publish.adsCommon.Utils.b.a(context)));
    }

    public void c(boolean bl) {
        this.v = bl;
    }

    public boolean c() {
        return this.p;
    }

    public void d(Activity activity) {
        StringBuilder stringBuilder = new StringBuilder("onActivityStopped [");
        stringBuilder.append(activity.getClass().getName());
        stringBuilder.append("]");
        h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder.toString());
        Integer n2 = (Integer)this.i.get((Object)activity.hashCode());
        if (n2 != null) {
            Integer n3 = n2 - 1;
            if (n3 == 0) {
                this.i.remove((Object)activity.hashCode());
            } else {
                this.i.put((Object)activity.hashCode(), (Object)n3);
            }
            StringBuilder stringBuilder2 = new StringBuilder("Activity removed:[");
            stringBuilder2.append(activity.getClass().getName());
            stringBuilder2.append("]");
            h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder2.toString());
            if (this.i.size() == 0) {
                if (!this.f) {
                    m.super.f(activity);
                }
                if (this.b) {
                    com.startapp.android.publish.cache.a.a().a(activity.getApplicationContext(), this.f);
                    this.e = true;
                    return;
                }
            }
        } else {
            StringBuilder stringBuilder3 = new StringBuilder("Activity hadn't been found:[");
            stringBuilder3.append(activity.getClass().getName());
            stringBuilder3.append("]");
            h.a((String)"StartAppSDKInternal", (int)3, (String)stringBuilder3.toString());
        }
    }

    void d(Context context) {
        k.b(context, "periodicMetadataPaused", Boolean.FALSE);
        com.startapp.android.publish.adsCommon.Utils.b.a(context, k.a(context, "periodicMetadataTriggerTime", com.startapp.android.publish.adsCommon.Utils.b.a()));
    }

    protected void d(boolean bl) {
        boolean bl2 = bl && com.startapp.common.a.c.b();
        m.super.f(bl2);
    }

    public boolean d() {
        return this.o;
    }

    public void e(Activity activity) {
        if (activity.getClass().getName().equals((Object)this.m)) {
            this.x = false;
        }
        if (this.i.size() == 0) {
            this.d = false;
        }
    }

    void e(Context context) {
        com.startapp.android.publish.adsCommon.e.c c2 = new com.startapp.android.publish.adsCommon.e.c(context, false);
        c2.c().c(AdsConstants.j);
        c2.a();
        if (this.e()) {
            f.a(context, d.d, "packagingType", AdsConstants.j, "");
        }
    }

    public boolean e() {
        return this.q;
    }

    /*
     * Exception decompiling
     */
    public void f(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean f() {
        if (this.k != null) {
            return this.k.isTaskRoot();
        }
        return true;
    }

    public SDKAdPreferences g(Context context) {
        if (this.a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences)com.startapp.common.a.f.a((Context)context, (String)"shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            this.a = sDKAdPreferences == null ? new SDKAdPreferences() : sDKAdPreferences;
        }
        return this.a;
    }

    public String g() {
        return this.m;
    }

    public void h(Context context) {
        m.super.b(context, "android.permission.ACCESS_FINE_LOCATION", "USER_CONSENT_FINE_LOCATION");
        m.super.b(context, "android.permission.ACCESS_COARSE_LOCATION", "USER_CONSENT_COARSE_LOCATION");
    }

    public boolean h() {
        return this.u;
    }

    public boolean i() {
        return this.v;
    }

    public void j() {
        this.w = true;
    }

    public boolean k() {
        return this.c && !this.d && !this.f;
    }

    public void l() {
        this.d = false;
        this.f = true;
    }

    public boolean m() {
        return this.c && this.d;
    }

    public Map<String, String> n() {
        return this.r;
    }

    static class a {
        private static final m a = new m(null);
    }

}

