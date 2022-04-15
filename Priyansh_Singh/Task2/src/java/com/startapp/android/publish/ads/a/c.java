package com.startapp.android.publish.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.a.b;
import com.startapp.android.publish.ads.a.c;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.common.a.h;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class c
extends b {
    protected WebView d;
    protected Runnable e = new Runnable(this){
        final /* synthetic */ c a;
        {
            this.a = c2;
        }

        public void run() {
            this.a.A();
            this.a.p();
        }
    };
    protected Runnable f = new Runnable(this){
        final /* synthetic */ c a;
        {
            this.a = c2;
        }

        public void run() {
            c.a(this.a, true);
            this.a.b(this.a.d);
        }
    };
    private Long g;
    private Long h;
    private long i = 0L;
    private long j = 0L;
    private i k;
    private boolean l = true;
    private boolean m = false;

    private boolean F() {
        if (this.w() instanceof com.startapp.android.publish.ads.b.c) {
            return ((com.startapp.android.publish.ads.b.c)this.w()).hasAdCacheTtlPassed();
        }
        return false;
    }

    private void a(String string, int n2) {
        Activity activity = this.b();
        String string2 = n2 < this.i().length ? this.i()[n2] : null;
        String string3 = n2 < this.j().length ? this.j()[n2] : null;
        com.startapp.android.publish.adsCommon.d.b b2 = this.B();
        long l2 = com.startapp.android.publish.adsCommon.b.a().A();
        boolean bl2 = this.a(n2);
        Boolean bl3 = this.b(n2);
        Runnable runnable = new Runnable((c)this){
            final /* synthetic */ c a;
            {
                this.a = c2;
            }

            public void run() {
                this.a.p();
            }
        };
        com.startapp.android.publish.adsCommon.c.a((Context)activity, string, string2, string3, b2, l2, bl2, bl3, runnable);
    }

    static /* synthetic */ boolean a(c c2, boolean bl2) {
        c2.l = bl2;
        return bl2;
    }

    private void b(String string, int n2) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        com.startapp.common.b.a((Context)this.b()).a(intent);
        boolean bl2 = com.startapp.android.publish.adsCommon.c.a(this.b().getApplicationContext(), this.b);
        Activity activity = this.b();
        String string2 = n2 < this.i().length ? this.i()[n2] : null;
        com.startapp.android.publish.adsCommon.d.b b2 = this.B();
        boolean bl3 = this.a(n2) && !bl2;
        com.startapp.android.publish.adsCommon.c.a((Context)activity, string, string2, b2, bl3);
        this.p();
    }

    private boolean b(Ad ad2) {
        return com.startapp.android.publish.adsCommon.Utils.i.a(8L) && ad2 instanceof com.startapp.android.publish.ads.splash.b;
    }

    protected void A() {
        String[] arrstring = this.l();
        if (arrstring != null && arrstring.length > 0 && this.l()[0] != null) {
            com.startapp.android.publish.adsCommon.c.b((Context)this.b(), this.l()[0], this.B());
        }
    }

    protected com.startapp.android.publish.adsCommon.d.b B() {
        return new com.startapp.android.publish.adsCommon.d.a(this.D(), this.n());
    }

    protected com.startapp.android.publish.adsCommon.d.b C() {
        return new com.startapp.android.publish.adsCommon.d.b(this.n());
    }

    protected String D() {
        this.j = System.currentTimeMillis();
        double d2 = this.j - this.i;
        Double.isNaN((double)d2);
        return String.valueOf((double)(d2 / 1000.0));
    }

    protected long E() {
        if (this.o() != null) {
            return TimeUnit.SECONDS.toMillis(this.o().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }

    @Override
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null) {
            if (this.a().hasExtra("lastLoadTime")) {
                this.g = (Long)this.a().getSerializableExtra("lastLoadTime");
            }
            if (this.a().hasExtra("adCacheTtl")) {
                this.h = (Long)this.a().getSerializableExtra("adCacheTtl");
                return;
            }
        } else {
            if (bundle.containsKey("postrollHtml")) {
                this.a(bundle.getString("postrollHtml"));
            }
            if (bundle.containsKey("lastLoadTime")) {
                this.g = (Long)bundle.getSerializable("lastLoadTime");
            }
            if (bundle.containsKey("adCacheTtl")) {
                this.h = (Long)bundle.getSerializable("adCacheTtl");
            }
        }
    }

    public void a(WebView webView) {
        this.l = false;
        webView.setOnTouchListener(new View.OnTouchListener((c)this){
            final /* synthetic */ c a;
            {
                this.a = c2;
            }

            public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                c.a(this.a, true);
                return motionEvent.getAction() == 2;
            }
        });
    }

    public /* varargs */ void a(String string, Object ... arrobject) {
        com.startapp.android.publish.adsCommon.Utils.i.a(this.d, string, arrobject);
    }

    @Override
    public void b(Bundle bundle) {
        super.b(bundle);
        if (this.f() != null) {
            bundle.putString("postrollHtml", this.f());
        }
        if (this.g != null) {
            bundle.putLong("lastLoadTime", this.g.longValue());
        }
        if (this.h != null) {
            bundle.putLong("adCacheTtl", this.h.longValue());
        }
    }

    public void b(WebView webView) {
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }

    protected boolean b(String string) {
        this.k.a(true);
        Ad ad2 = this.w();
        boolean bl2 = com.startapp.android.publish.adsCommon.c.a(this.b().getApplicationContext(), this.b) && !c.super.b(ad2);
        if (!this.m && string.contains((CharSequence)"index=")) {
            int n2;
            block6 : {
                try {
                    n2 = com.startapp.android.publish.adsCommon.c.a(string);
                    if (!this.d()[n2] || bl2) break block6;
                }
                catch (Exception exception) {
                    h.a(6, "Error while trying parsing index from url");
                    return false;
                }
                h.a(6, "forceExternal -interMode - smartredirect");
                c.super.a(string, n2);
                return true;
            }
            h.a(6, "forceExternal - interMode - redirect");
            c.super.b(string, n2);
            return true;
        }
        if (this.d()[0] && !bl2) {
            h.a(6, "forceExternal - interMode - redirectr");
            c.super.a(string, 0);
            return true;
        }
        h.a(6, "forceExternal - interMode - smartredirect");
        c.super.b(string, 0);
        return true;
    }

    protected void c(WebView webView) {
    }

    @Override
    public void p() {
        super.p();
        m.a().a(false);
        if (this.k != null) {
            this.k.a(false);
        }
        this.b().runOnUiThread(new Runnable(this){
            final /* synthetic */ c a;
            {
                this.a = c2;
            }

            public void run() {
                if (this.a.d != null) {
                    com.startapp.common.a.c.b(this.a.d);
                }
            }
        });
    }

    @Override
    public boolean r() {
        this.A();
        m.a().a(false);
        this.k.a(false);
        return false;
    }

    @Override
    public void s() {
        if (this.k != null) {
            this.k.b();
        }
        if (this.a != null && this.a.b()) {
            this.a.d();
        }
        if (this.d != null) {
            com.startapp.common.a.c.b(this.d);
        }
        if (this.g().equals((Object)"back")) {
            this.p();
        }
    }

    @Override
    public void u() {
        if (this.F()) {
            h.a("InterstitialMode", 3, "Ad Cache TTL passed, finishing");
            this.p();
            return;
        }
        m.a().a(true);
        if (this.k == null) {
            i i2;
            this.k = i2 = new i((Context)this.b(), this.h(), this.C(), this.E());
        }
        if (this.d == null) {
            RelativeLayout relativeLayout = new RelativeLayout((Context)this.b());
            relativeLayout.setContentDescription((CharSequence)"StartApp Ad");
            relativeLayout.setId(1475346432);
            this.b().setContentView((View)relativeLayout);
            try {
                this.d = new WebView(this.b().getApplicationContext());
                this.d.setBackgroundColor(-16777216);
                this.b().getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.d.setVerticalScrollBarEnabled(false);
                this.d.setHorizontalScrollBarEnabled(false);
                this.d.getSettings().setJavaScriptEnabled(true);
                com.startapp.common.a.c.a(this.d);
                this.d.setWebChromeClient(new WebChromeClient());
                if (this.c) {
                    com.startapp.common.a.c.a(this.d, null);
                }
                this.d.setOnLongClickListener(new View.OnLongClickListener(this){
                    final /* synthetic */ c a;
                    {
                        this.a = c2;
                    }

                    public boolean onLongClick(View view) {
                        return true;
                    }
                });
                this.d.setLongClickable(false);
                this.d.addJavascriptInterface((Object)this.x(), "startappwall");
                this.y();
                this.a(this.d);
                com.startapp.android.publish.adsCommon.Utils.i.a((Context)this.b(), this.d, this.f());
                this.m = "true".equals((Object)com.startapp.android.publish.adsCommon.Utils.i.a(this.f(), "@jsTag@", "@jsTag@"));
                this.d.setWebViewClient(new WebViewClient(){

                    public void onPageFinished(WebView webView, String string) {
                        c.this.c(webView);
                        c c2 = c.this;
                        Object[] arrobject = new Object[]{c.this.g()};
                        c2.a("gClientInterface.setMode", arrobject);
                        c.this.a("enableScheme", "externalLinks");
                        c.this.z();
                    }

                    public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                        StringBuilder stringBuilder = new StringBuilder("MyWebViewClient::shouldOverrideUrlLoading - [");
                        stringBuilder.append(string);
                        stringBuilder.append("]");
                        h.a(2, stringBuilder.toString());
                        if (c.this.m && !c.this.l) {
                            return false;
                        }
                        return c.this.b(string);
                    }
                });
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                relativeLayout.addView((View)this.d, (ViewGroup.LayoutParams)layoutParams);
                this.a(relativeLayout);
            }
            catch (Exception exception) {
                f.a((Context)this.b(), d.b, "InterstitialMode.onResume - WebView failed", exception.getMessage(), "");
                this.p();
            }
        } else {
            com.startapp.common.a.c.c(this.d);
            this.k.a();
        }
        this.i = System.currentTimeMillis();
    }

    protected JsInterface x() {
        JsInterface jsInterface = new JsInterface((Context)this.b(), this.e, this.e, this.f, this.B(), this.a(0));
        return jsInterface;
    }

    protected void y() {
        this.k.a();
    }

    protected void z() {
    }

}

