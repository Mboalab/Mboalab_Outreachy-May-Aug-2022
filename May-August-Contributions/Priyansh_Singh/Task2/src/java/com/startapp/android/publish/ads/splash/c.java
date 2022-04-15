package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.startapp.android.publish.ads.splash.c;
import com.startapp.android.publish.ads.splash.d;
import com.startapp.android.publish.ads.splash.e;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.a.g;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import com.startapp.common.a.j;
import com.startapp.common.b;

public class c {
    Activity a;
    boolean b;
    a c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private d i;
    private BroadcastReceiver j;

    public c(Activity activity) {
        this.d = false;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.b = false;
        this.c = a.a;
        this.i = null;
        this.j = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                c.this.i();
            }
        };
        this.a = activity;
    }

    public c(Activity activity, d d2) {
        super(activity);
        this.i = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(com.startapp.android.publish.common.metaData.d d2) {
        Object object;
        Object object2 = object = MetaData.getLock();
        synchronized (object2) {
            if (MetaData.getInstance().isReady()) {
                d2.a();
            } else {
                MetaData.getInstance().addMetaDataListener(d2);
            }
            return;
        }
    }

    private void b(Runnable runnable) {
        if (this.d && (this.b || runnable == null)) {
            if (this.c == a.b && runnable != null) {
                this.e = false;
                runnable.run();
                return;
            }
            if (this.c != a.a) {
                c.super.k();
            }
        }
    }

    private void k() {
        this.a(this.i, (e)new 2(this));
    }

    public void a() {
        this.d = true;
    }

    protected void a(d d2, e e2) {
        if (d2 == null) {
            e2.a();
            return;
        }
        d2.a(e2);
        d2.b();
    }

    public void a(StartAppAd startAppAd) {
        if (this.c == a.c) {
            h.a((String)"Splash", (int)4, (String)"Splash Ad Display Timeout");
            if (!this.g) {
                h.a((String)"Splash", (int)4, (String)"Closing Splash Ad");
                startAppAd.close();
                this.c();
            }
        }
    }

    public void a(Runnable runnable) {
        h.a((String)"Splash", (int)4, (String)"Splash ad received");
        if (this.c == a.a) {
            this.c = a.b;
        }
        c.super.b(runnable);
    }

    public void a(Runnable runnable, com.startapp.android.publish.cache.c c2) {
        h.a((String)"Splash", (int)4, (String)"Minimum splash screen time has passed");
        this.d = true;
        1 var3_3 = new 1((c)this, runnable, c2);
        if (this.c != a.e) {
            c.super.a((com.startapp.android.publish.common.metaData.d)var3_3);
            return;
        }
        c.super.k();
    }

    public void b() {
        h.a((String)"Splash", (int)4, (String)"Error receiving Ad");
        this.c = a.e;
        this.b(null);
    }

    public boolean b(Runnable runnable, com.startapp.android.publish.cache.c c2) {
        if (!this.h) {
            if (this.c == a.a) {
                h.a((String)"Splash", (int)4, (String)"Splash Loading Timer Expired");
                this.e = false;
                this.c = a.e;
                c.super.k();
                return true;
            }
            if (this.c == a.b) {
                h.a((String)"Splash", (int)4, (String)"MetaData Loading Timer Expired - proceeding with old MetaData");
                this.b = true;
                this.c(runnable, c2);
            }
        }
        return false;
    }

    public void c() {
        h.a((String)"Splash", (int)4, (String)"Splash Screen has been hidden");
        this.c = a.d;
        this.g();
        if (!this.a.isFinishing()) {
            this.a.finish();
        }
    }

    void c(Runnable runnable, com.startapp.android.publish.cache.c c2) {
        f f2 = g.a().b().a(AdPreferences.Placement.INAPP_SPLASH, null);
        StringBuilder stringBuilder = new StringBuilder("checkAdRulesAndShowAd: shouldDisplayAd ");
        stringBuilder.append(f2.a());
        h.a((String)"Splash", (int)4, (String)stringBuilder.toString());
        if (f2.a()) {
            h.a((String)"Splash", (int)4, (String)"checkAdRulesAndShowAd: showAd");
            c.super.b(runnable);
            return;
        }
        h.a((String)"Splash", (int)4, (String)"Should not display splash ad");
        this.c = a.e;
        if (c2 != null) {
            com.startapp.android.publish.adsCommon.c.a((Context)this.a, com.startapp.android.publish.adsCommon.c.a(com.startapp.android.publish.cache.a.a().b(c2)), null, f2.c());
        }
        if (Constants.a().booleanValue()) {
            j.a().a((Context)this.a, f2.b());
        }
        c.super.k();
    }

    public void d() {
        this.c = a.c;
    }

    public void e() {
        if (this.c != a.c && this.c != a.e) {
            this.c = a.e;
            if (this.e) {
                this.f();
            }
        }
    }

    public void f() {
        h.a((String)"Splash", (int)4, (String)"User Canceled Splash Screen");
        this.g();
    }

    /*
     * Exception decompiling
     */
    void g() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl28.1 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    public void h() {
        this.h = true;
    }

    public void i() {
        this.g = true;
    }

    public void j() {
        b.a((Context)this.a).a(this.j, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        static {
            a[] arra = new a[]{a, b, c, d, e};
            f = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

