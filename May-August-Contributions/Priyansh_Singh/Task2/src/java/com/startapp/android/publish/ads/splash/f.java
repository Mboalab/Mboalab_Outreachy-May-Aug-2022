package com.startapp.android.publish.ads.splash;

import android.content.Context;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import java.io.Serializable;

public class f
implements Serializable {
    private static transient f a = new f();
    private static Object b = new Object();
    private static final long serialVersionUID = 1L;
    @com.startapp.common.b.f(a=true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = AdsConstants.h;

    private f() {
    }

    public static void a(Context context) {
        f f2 = (f)com.startapp.common.a.f.a((Context)context, (String)"StartappSplashMetadata", f.class);
        f f3 = new f();
        if (f2 != null) {
            if (f2.c()) {
                i.a(f2, f3);
            }
            a = f2;
            return;
        }
        a = f3;
    }
    public static void a(Context context, f f2) {
        Object object;
        Object object2 = object = b;
        synchronized (object2) {
            f2.splashMetadataUpdateVersion = AdsConstants.h;
            a = f2;
            com.startapp.common.a.f.a((Context)context, (String)"StartappSplashMetadata", (Serializable)f2);
            return;
        }
    }

    public static f b() {
        return a;
    }

    private boolean c() {
        return !AdsConstants.h.equals((Object)this.splashMetadataUpdateVersion);
    }

    public SplashConfig a() {
        return this.SplashConfig;
    }
}

