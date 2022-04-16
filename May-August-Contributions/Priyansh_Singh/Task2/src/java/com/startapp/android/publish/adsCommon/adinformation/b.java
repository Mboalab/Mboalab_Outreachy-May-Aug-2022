package com.startapp.android.publish.adsCommon.adinformation;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationConfig;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationJsInterface;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.adsCommon.adinformation.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.h;
import com.startapp.android.publish.common.model.AdPreferences;

public class b
implements View.OnClickListener {
    Context a;
    RelativeLayout b;
    RelativeLayout c;
    AdInformationConfig d;
    h e;
    private d f;
    private WebView g;
    private Dialog h = null;
    private AdPreferences.Placement i;
    private Handler j = new Handler();
    private a k = a.a;
    private boolean l = false;
    private c m;
    private Runnable n;
    private Runnable o;
    private Runnable p;

    public b(Context context, b b2, AdPreferences.Placement placement, c c2) {
        d d2;
        this.n = new Runnable(){

            public void run() {
                try {
                    b.this.d();
                    b.this.e.a(b.this.a, true);
                    b.this.d.a(b.this.a, true);
                    b.this.a(false);
                    return;
                }
                catch (Exception exception) {
                    f.a(b.this.a, new e(com.startapp.android.publish.adsCommon.e.d.b, "AdInformationObject.acceptRunnable failed", exception.getMessage()), "");
                    return;
                }
            }
        };
        this.o = new Runnable(){

            public void run() {
                try {
                    b.this.d();
                    l.b();
                    b.this.e.a(b.this.a, false);
                    b.this.d.a(b.this.a, true);
                    b.this.a(false);
                    return;
                }
                catch (Exception exception) {
                    f.a(b.this.a, new e(com.startapp.android.publish.adsCommon.e.d.b, "AdInformationObject.declineRunnable failed", exception.getMessage()), "");
                    return;
                }
            }
        };
        this.p = new Runnable(){

            public void run() {
                try {
                    b.this.d();
                    b.this.c();
                    b.this.a(false);
                    return;
                }
                catch (Exception exception) {
                    f.a(b.this.a, new e(com.startapp.android.publish.adsCommon.e.d.b, "AdInformationObject.fullPrivacyPolicy failed", exception.getMessage()), "");
                    return;
                }
            }
        };
        this.a = context;
        this.i = placement;
        this.m = c2;
        this.d = b.super.e();
        this.e = MetaData.getInstance().getSimpleTokenConfig();
        this.f = d2 = new d(context, b2, placement, c2, (View.OnClickListener)this);
    }

    public static AdInformationConfig a(Context context) {
        return com.startapp.android.publish.adsCommon.adinformation.a.b().a();
    }

    private String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        if (b.b(this.a)) {
            stringBuilder.append("?le=true");
        }
        return stringBuilder.toString();
    }

    private void a(ViewGroup viewGroup, Point point) {
        this.l = true;
        this.h = new Dialog(this.a);
        this.h.requestWindowFeature(1);
        this.h.setContentView((View)viewGroup);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.h.getWindow().getAttributes());
        layoutParams.width = (int)(0.9f * (float)point.x);
        layoutParams.height = (int)(0.85f * (float)point.y);
        this.h.show();
        this.h.getWindow().setAttributes(layoutParams);
    }

    private void b(final ViewGroup viewGroup, Point point) {
        this.l = true;
        final RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int)(0.9f * (float)point.x), (int)(0.85f * (float)point.y));
        layoutParams.addRule(13);
        this.j.post(new Runnable(){

            public void run() {
                b.this.c.addView((View)viewGroup, (ViewGroup.LayoutParams)layoutParams);
            }
        });
    }

    public static boolean b(Context context) {
        return k.a(context, "shared_prefs_using_location", Boolean.FALSE);
    }

    private AdInformationConfig e() {
        return com.startapp.android.publish.adsCommon.adinformation.a.b().a();
    }

    private c f() {
        return this.m;
    }

    private void g() {
        String string = com.startapp.android.publish.adsCommon.c.a(this.a, null);
        if (string != null) {
            WebView webView = this.g;
            StringBuilder stringBuilder = new StringBuilder("javascript:window.onload=function(){document.getElementById('titlePlacement').innerText='");
            stringBuilder.append(string);
            stringBuilder.append("';}");
            webView.loadUrl(stringBuilder.toString());
        }
    }

    public View a() {
        return this.f;
    }

    public void a(RelativeLayout relativeLayout) {
        boolean bl = b.super.f() != null && b.super.f().e() ? b.super.f().b() : b.super.e().a(this.a);
        if (bl) {
            this.c = relativeLayout;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (b.super.f() != null && b.super.f().d()) {
                b.super.f().c().addRules(layoutParams);
            } else {
                b.super.e().a(this.i).addRules(layoutParams);
            }
            this.c.addView((View)this.f, (ViewGroup.LayoutParams)layoutParams);
        }
    }

    void a(boolean bl) {
        if (!this.i.isInterstitial() && this.a instanceof Activity) {
            i.a((Activity)this.a, bl);
        }
    }

    public boolean b() {
        return this.l;
    }

    protected void c() {
        if (i.a(256L) && MetaData.getInstance().isInAppBrowser()) {
            com.startapp.android.publish.adsCommon.c.b(this.a, this.d.b(), "");
            return;
        }
        com.startapp.android.publish.adsCommon.c.c(this.a, this.d.b());
    }

    public void d() {
        this.l = false;
        switch (6.a[this.k.ordinal()]) {
            default: {
                return;
            }
            case 2: {
                this.h.dismiss();
                return;
            }
            case 1: 
        }
        this.j.post(new Runnable(){

            public void run() {
                b.this.c.removeView((View)b.this.b);
            }
        });
    }

    public void onClick(View view) {
        if (this.e.b(this.a) && this.a instanceof Activity) {
            this.a(true);
            this.b = new RelativeLayout(this.a);
            try {
                this.g = new WebView(this.a);
            }
            catch (Exception exception) {
                f.a(this.a, com.startapp.android.publish.adsCommon.e.d.b, "AdInformationObject.onClick - webview instantiation failed", exception.getMessage(), "");
                this.a(false);
                return;
            }
            this.g.setWebViewClient(new WebViewClient());
            this.g.setWebChromeClient(new WebChromeClient());
            this.g.getSettings().setJavaScriptEnabled(true);
            this.g.setHorizontalScrollBarEnabled(false);
            this.g.setVerticalScrollBarEnabled(false);
            this.g.loadUrl(b.super.a(this.d.f()));
            this.g.addJavascriptInterface((Object)new AdInformationJsInterface(this.a, this.n, this.o, this.p), "startappwall");
            Point point = new Point(1, 1);
            try {
                com.startapp.android.publish.adsCommon.Utils.h.a((WindowManager)this.a.getSystemService("window"), point);
            }
            catch (Exception exception) {
                f.a(this.a, com.startapp.android.publish.adsCommon.e.d.b, "AdInformationObject.onClick - system service failed", exception.getMessage(), "");
                this.a(false);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.g.setPadding(0, 0, 0, 0);
            layoutParams.setMargins(0, 0, 0, 0);
            this.b.addView((View)this.g, (ViewGroup.LayoutParams)layoutParams);
            b.super.g();
            switch (6.a[this.k.ordinal()]) {
                default: {
                    return;
                }
                case 2: {
                    b.super.a((ViewGroup)this.b, point);
                    return;
                }
                case 1: 
            }
            b.super.b((ViewGroup)this.b, point);
            return;
        }
        this.c();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        static {
            a[] arra = new a[]{a, b};
            c = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S);
        public static final /* enum */ b b = new b(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        private static final /* synthetic */ b[] c;
        private AdInformationConfig.ImageResourceType infoExtendedType;
        private AdInformationConfig.ImageResourceType infoType;

        static {
            b[] arrb = new b[]{a, b};
            c = arrb;
        }

        private b(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])c.clone();
        }

        public final AdInformationConfig.ImageResourceType a() {
            return this.infoType;
        }
    }

}

