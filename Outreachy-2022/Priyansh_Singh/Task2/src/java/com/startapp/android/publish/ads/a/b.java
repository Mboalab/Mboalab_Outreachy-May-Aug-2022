package com.startapp.android.publish.ads.a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.a.a;
import com.startapp.android.publish.ads.a.d;
import com.startapp.android.publish.ads.a.e;
import com.startapp.android.publish.ads.splash.g;
import com.startapp.android.publish.ads.video.f;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adinformation.b;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import java.io.Serializable;

public abstract class b {
    protected com.startapp.android.publish.adsCommon.adinformation.b a = null;
    protected AdPreferences.Placement b;
    protected boolean c = false;
    private Intent d;
    private Activity e;
    private BroadcastReceiver f = new BroadcastReceiver(){

        public void onReceive(Context context, Intent intent) {
            b.this.p();
        }
    };
    private String[] g;
    private boolean[] h;
    private boolean[] i = new boolean[]{true};
    private String j;
    private String[] k;
    private String[] l;
    private String[] m;
    private Ad n;
    private String o;
    private boolean p;
    private c q;
    private String r;
    private Long s;
    private Boolean[] t = null;

    public static b a(Activity activity, Intent intent, AdPreferences.Placement placement) {
        Object object;
        block12 : {
            block13 : {
                switch (3.a[placement.ordinal()]) {
                    default: {
                        object = new a();
                        break block12;
                    }
                    case 5: 
                    case 6: {
                        if (!i.a(256L)) break;
                        object = new com.startapp.android.publish.inappbrowser.a(intent.getData().toString());
                        break block12;
                    }
                    case 4: {
                        if (!i.a(8L)) break;
                        object = new g();
                        break block12;
                    }
                    case 2: 
                    case 3: {
                        object = i.a(4L) && intent.getBooleanExtra("videoAd", false) ? new f() : new e();
                        break block12;
                    }
                    case 1: {
                        if (i.a(128L) || i.a(64L)) break block13;
                    }
                }
                object = null;
                break block12;
            }
            object = new d();
        }
        b.super.a(intent);
        b.super.a(activity);
        b.super.c(intent.getStringExtra("position"));
        b.super.b(intent.getStringArrayExtra("tracking"));
        b.super.c(intent.getStringArrayExtra("trackingClickUrl"));
        b.super.d(intent.getStringArrayExtra("packageNames"));
        b.super.a(intent.getStringArrayExtra("closingUrl"));
        object.a(intent.getBooleanArrayExtra("smartRedirect"));
        object.b(intent.getBooleanArrayExtra("browserEnabled"));
        String string = intent.getStringExtra("htmlUuid");
        if (string != null) {
            if (AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                object.a(com.startapp.android.publish.cache.a.a().b(string));
            } else {
                object.a(com.startapp.android.publish.cache.a.a().c(string));
            }
        }
        b.super.a(intent.getBooleanExtra("isSplash", false));
        b.super.a((c)intent.getSerializableExtra("adInfoOverride"));
        b.super.b(intent.getStringExtra("adTag"));
        b.super.a(placement);
        b.super.a(intent.getStringArrayExtra("closingUrl"));
        if (object.d() == null) {
            object.a(new boolean[]{true});
        }
        if (object.e() == null) {
            object.b(new boolean[]{true});
        }
        object.a((Ad)intent.getSerializableExtra("ad"));
        long l2 = intent.getLongExtra("delayImpressionSeconds", -1L);
        if (l2 != -1L) {
            b.super.a(l2);
        }
        object.a((Boolean[])intent.getSerializableExtra("sendRedirectHops"));
        StringBuilder stringBuilder = new StringBuilder("Placement=[");
        stringBuilder.append((Object)object.k());
        stringBuilder.append("]");
        h.a((String)"GenericMode", (int)3, (String)stringBuilder.toString());
        return object;
    }

    private void a(Activity activity) {
        this.e = activity;
    }

    private void a(Intent intent) {
        this.d = intent;
    }

    private void a(c c2) {
        this.q = c2;
    }

    private void a(AdPreferences.Placement placement) {
        this.b = placement;
    }

    private void a(Long l2) {
        this.s = l2;
    }

    private void a(boolean bl) {
        this.p = bl;
    }

    private void a(String[] arrstring) {
        this.g = arrstring;
    }

    private void b(String string) {
        this.r = string;
    }

    private void b(String[] arrstring) {
        this.k = arrstring;
    }

    private void c(String string) {
        this.j = string;
    }

    private void c(String[] arrstring) {
        this.l = arrstring;
    }

    private void d(String[] arrstring) {
        this.m = arrstring;
    }

    public Intent a() {
        return this.d;
    }

    public void a(Bundle bundle) {
        com.startapp.common.b.a((Context)this.b()).a(this.f, new IntentFilter("com.startapp.android.CloseAdActivity"));
    }

    protected void a(RelativeLayout relativeLayout) {
        this.a = new com.startapp.android.publish.adsCommon.adinformation.b((Context)this.b(), b.b.b, this.k(), this.m());
        this.a.a(relativeLayout);
    }

    public void a(Ad ad2) {
        this.n = ad2;
    }

    protected void a(String string) {
        this.o = string;
    }

    public void a(Boolean[] arrboolean) {
        this.t = arrboolean;
    }

    protected void a(boolean[] arrbl) {
        this.h = arrbl;
    }

    protected boolean a(int n2) {
        if (this.i != null && n2 >= 0 && n2 < this.i.length) {
            return this.i[n2];
        }
        return true;
    }

    public boolean a(int n2, KeyEvent keyEvent) {
        return false;
    }

    public Activity b() {
        return this.e;
    }

    public Boolean b(int n2) {
        if (this.t != null && n2 >= 0 && n2 < this.t.length) {
            return this.t[n2];
        }
        return null;
    }

    public void b(Bundle bundle) {
    }

    protected void b(boolean[] arrbl) {
        this.i = arrbl;
    }

    public void c() {
        this.c = true;
    }

    public void c(Bundle bundle) {
    }

    protected boolean[] d() {
        return this.h;
    }

    public boolean[] e() {
        return this.i;
    }

    protected String f() {
        return this.o;
    }

    protected String g() {
        return this.j;
    }

    protected String[] h() {
        return this.k;
    }

    protected String[] i() {
        return this.l;
    }

    protected String[] j() {
        return this.m;
    }

    protected AdPreferences.Placement k() {
        return this.b;
    }

    protected String[] l() {
        return this.g;
    }

    protected c m() {
        return this.q;
    }

    protected String n() {
        return this.r;
    }

    public Long o() {
        return this.s;
    }

    public void p() {
        this.b().runOnUiThread(new Runnable(){

            public void run() {
                b.this.b().finish();
            }
        });
    }

    public void q() {
        Intent intent = new Intent("com.startapp.android.HideDisplayBroadcastListener");
        com.startapp.common.b.a((Context)this.b()).a(intent);
    }

    public boolean r() {
        return false;
    }

    public void s() {
        this.p();
    }

    public void t() {
    }

    public abstract void u();

    public void v() {
        if (this.f != null) {
            com.startapp.common.b.a((Context)this.b()).a(this.f);
        }
        this.f = null;
    }

    public Ad w() {
        return this.n;
    }

}

