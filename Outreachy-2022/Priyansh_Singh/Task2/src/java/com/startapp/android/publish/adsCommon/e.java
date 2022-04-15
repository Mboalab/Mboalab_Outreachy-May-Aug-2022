/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.adsCommon.b.a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import java.util.Arrays;
import java.util.List;

public abstract class e
extends Ad {
    protected static String a;
    private static final long serialVersionUID = 1L;
    private String adId = null;
    private List<a> apps;
    private String[] closingUrl = new String[]{""};
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = "";
    public boolean[] inAppBrowserEnabled = new boolean[]{true};
    private int orientation = 0;
    private String[] packageNames = new String[]{""};
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = new boolean[]{false};
    private String[] trackingClickUrls = new String[]{""};
    public String[] trackingUrls = new String[]{""};
    private int width;

    public e(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        if (a == null) {
            e.super.a();
        }
    }

    private void a() {
        a = i.c(this.getContext());
    }

    private void a(SplashConfig.Orientation orientation) {
        this.orientation = 0;
        boolean bl2 = i.a(8L);
        if (orientation != null) {
            if (bl2 && orientation.equals((Object)SplashConfig.Orientation.PORTRAIT)) {
                this.orientation = 1;
                return;
            }
            if (bl2 && orientation.equals((Object)SplashConfig.Orientation.LANDSCAPE)) {
                this.orientation = 2;
            }
        }
    }

    private void e(String string) {
        if (Arrays.asList((Object[])string.split(",")).contains((Object)"false")) {
            this.belowMinCPM = false;
            return;
        }
        this.belowMinCPM = true;
    }

    private void f(String string) {
        String[] arrstring = string.split(",");
        this.inAppBrowserEnabled = new boolean[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            this.inAppBrowserEnabled[i2] = arrstring[i2].compareTo("false") != 0;
        }
    }

    private void g(String string) {
        String[] arrstring = string.split(",");
        this.smartRedirect = new boolean[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            this.smartRedirect[i2] = arrstring[i2].compareTo("true") == 0;
        }
    }

    private void h(String string) {
        this.trackingUrls = string.split(",");
    }

    private void i(String string) {
        this.trackingClickUrls = string.split(",");
    }

    private void j(String string) {
        this.packageNames = string.split(",");
    }

    private void k(String string) {
        boolean bl2 = Boolean.parseBoolean((String)string);
        this.getAdInfoOverride().a(bl2);
    }

    private void l(String string) {
        this.getAdInfoOverride().a(AdInformationPositions.Position.getByName(string));
    }

    /*
     * Exception decompiling
     */
    private void m(String var1) {
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

    /*
     * Exception decompiling
     */
    private void n(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl13.1 : RETURN : trying to set 0 previously set to 1
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

    protected String a(String string, String string2) {
        return i.a(string, string2, string2);
    }

    public void a(int n2, int n3) {
        this.b(n2);
        this.c(n3);
    }

    public void a(List<a> list) {
        this.apps = list;
    }

    protected String a_() {
        return a;
    }

    public void b(int n2) {
        this.width = n2;
    }

    public void b(String string) {
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        if (i.a(512L)) {
            this.htmlUuid = com.startapp.android.publish.cache.a.a().a(string);
        }
        if ((string4 = this.a(string, "@smartRedirect@")) != null) {
            e.super.g(string4);
        }
        if ((string13 = this.a(string, "@trackingClickUrl@")) != null) {
            e.super.i(string13);
        }
        if ((string2 = this.a(string, "@closeUrl@")) != null) {
            this.c(string2);
        }
        if ((string12 = this.a(string, "@tracking@")) != null) {
            e.super.h(string12);
        }
        if ((string6 = this.a(string, "@packageName@")) != null) {
            e.super.j(string6);
        }
        if ((string14 = this.a(string, "@startappBrowserEnabled@")) != null) {
            e.super.f(string14);
        }
        if ((string10 = this.a(string, "@orientation@")) != null && i.a(8L)) {
            e.super.a(SplashConfig.Orientation.getByName(string10));
        }
        if ((string8 = this.a(string, "@adInfoEnable@")) != null) {
            e.super.k(string8);
        }
        if ((string7 = this.a(string, "@adInfoPosition@")) != null) {
            e.super.l(string7);
        }
        if ((string3 = this.a(string, "@ttl@")) != null) {
            e.super.m(string3);
        }
        if ((string5 = this.a(string, "@belowMinCPM@")) != null) {
            e.super.e(string5);
        }
        if ((string9 = this.a(string, "@delayImpressionInSeconds@")) != null) {
            e.super.n(string9);
        }
        if ((string11 = this.a(string, "@sendRedirectHops@")) != null) {
            this.d(string11);
        }
        if (this.smartRedirect.length < this.trackingUrls.length) {
            int n2;
            h.a(6, "Error in smartRedirect array in HTML");
            boolean[] arrbl = new boolean[this.trackingUrls.length];
            for (n2 = 0; n2 < this.smartRedirect.length; ++n2) {
                arrbl[n2] = this.smartRedirect[n2];
            }
            while (n2 < this.trackingUrls.length) {
                arrbl[n2] = false;
                ++n2;
            }
            this.smartRedirect = arrbl;
        }
    }

    public void c(int n2) {
        this.height = n2;
    }

    public void c(String string) {
        this.closingUrl = string.split(",");
    }

    public void d(String string) {
        if (string != null && !string.equals((Object)"")) {
            String[] arrstring = string.split(",");
            this.sendRedirectHops = new Boolean[arrstring.length];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.sendRedirectHops[i2] = arrstring[i2].compareTo("true") == 0 ? Boolean.TRUE : (arrstring[i2].compareTo("false") == 0 ? Boolean.FALSE : null);
            }
        }
    }

    public boolean d(int n2) {
        if (n2 >= 0 && n2 < this.smartRedirect.length) {
            return this.smartRedirect[n2];
        }
        return false;
    }

    public String e() {
        return com.startapp.android.publish.cache.a.a().b(this.htmlUuid);
    }

    public boolean e(int n2) {
        if (this.inAppBrowserEnabled != null && n2 >= 0 && n2 < this.inAppBrowserEnabled.length) {
            return this.inAppBrowserEnabled[n2];
        }
        return true;
    }

    public Boolean f(int n2) {
        if (this.sendRedirectHops != null && n2 >= 0 && n2 < this.sendRedirectHops.length) {
            return this.sendRedirectHops[n2];
        }
        return null;
    }

    public String f() {
        return this.htmlUuid;
    }

    public int g() {
        return this.width;
    }

    public String[] h() {
        return this.closingUrl;
    }

    public int i() {
        return this.height;
    }

    public boolean[] j() {
        return this.inAppBrowserEnabled;
    }

    public String[] k() {
        return this.trackingUrls;
    }

    public String[] l() {
        return this.trackingClickUrls;
    }

    public int m() {
        return this.orientation;
    }

    public String[] n() {
        return this.packageNames;
    }

    public Long o() {
        return this.delayImpressionInSeconds;
    }

    public Boolean[] p() {
        return this.sendRedirectHops;
    }
}

