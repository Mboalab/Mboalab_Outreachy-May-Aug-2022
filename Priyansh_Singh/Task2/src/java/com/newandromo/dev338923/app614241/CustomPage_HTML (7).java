/*
 *  
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.support.v4.app.ActivityCompat
 *  android.support.v4.content.a
 *  android.support.v4.view.g
 *  android.support.v7.app.AppCompatActivity
 *  android.support.v7.app.c
 *  android.support.v7.app.c$a
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.DownloadListener
 *  android.webkit.GeolocationPermissions
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.WebBackForwardList
 *  android.webkit.WebChromeClient
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebSettings
 *  android.webkit.WebSettings$PluginState
 *  android.webkit.WebStorage
 *  android.webkit.WebStorage$QuotaUpdater
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.LinearLayout
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.g;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.c;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.newandromo.dev338923.app614241.AndromoActivity;
import com.newandromo.dev338923.app614241.Custompage_1583051146_6d70d8e039;
import com.newandromo.dev338923.app614241.bb;
import com.newandromo.dev338923.app614241.e;
import com.newandromo.dev338923.app614241.f;

public class Custompage_1583051146_6d70d8e039
extends AndromoActivity {
    private static String[] r = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static AndromoActivity.b s = new Object(){
        private boolean a;
        private boolean b;

        public final boolean a(AppCompatActivity appCompatActivity, String string) {
            block2 : {
                boolean bl2;
                block4 : {
                    block3 : {
                        if (this.b) break block2;
                        if (!"none".equals((Object)string)) break block3;
                        boolean bl3 = com.newandromo.dev338923.app614241.v.a((Activity)appCompatActivity) != null;
                        bl2 = false;
                        if (!bl3) break block4;
                    }
                    bl2 = true;
                }
                this.a = bl2;
                this.b = true;
            }
            return this.a;
        }
    };
    int g = -1;
    WebView h;
    MenuItem i;
    private String j;
    private int k = -1;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private GeolocationPermissions.Callback p = null;
    private String q = null;
    private boolean t;

    /*
     * Exception decompiling
     */
    private void a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl18.1 : RETURN : trying to set 0 previously set to 1
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

    static /* synthetic */ boolean f(Custompage_1583051146_6d70d8e039 custompage_1583051146_6d70d8e039) {
        return custompage_1583051146_6d70d8e039.l;
    }

    protected final void a() {
        if (this.i != null) {
            g.b((MenuItem)this.i);
        }
    }

    @Override
    protected String getActivityTitleForAnalytics() {
        return this.getString(2131558412);
    }

    @Override
    protected String getActivityTypeForAnalytics() {
        return "Custom Page";
    }

    @Override
    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    @Override
    public String[] getParentClassNamesArray() {
        return this.getResources().getStringArray(2130903040);
    }

    @Override
    protected boolean isDetailActivity() {
        return false;
    }

    @Override
    protected boolean isParentReachable() {
        return s.a(this, "material");
    }

    @Override
    protected boolean isToolbarEnabled() {
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.g == -1) {
            this.g = com.newandromo.dev338923.app614241.b.a((Context)this);
        }
        this.setToolbarTitle(2131558412);
        CookieSyncManager.createInstance((Context)this);
        this.h = (WebView)this.findViewById(2131296541);
        this.h.setWebChromeClient(new WebChromeClient((Custompage_1583051146_6d70d8e039)this, 0){
            final /* synthetic */ Custompage_1583051146_6d70d8e039 a;
            {
                this.a = custompage_1583051146_6d70d8e039;
            }

            public final void onExceededDatabaseQuota(String string, String string2, long l2, long l3, long l4, WebStorage.QuotaUpdater quotaUpdater) {
                quotaUpdater.updateQuota(l3 * 2L);
            }

            public final void onGeolocationPermissionsShowPrompt(String string, GeolocationPermissions.Callback callback) {
                if (this.a.n) {
                    if (android.support.v4.content.a.checkSelfPermission((Context)this.a, (String)"android.permission.ACCESS_FINE_LOCATION") == 0 && android.support.v4.content.a.checkSelfPermission((Context)this.a, (String)"android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        callback.invoke(string, true, false);
                        return;
                    }
                    this.a.p = callback;
                    this.a.q = string;
                    if (!ActivityCompat.shouldShowRequestPermissionRationale((Activity)this.a, (String)"android.permission.ACCESS_FINE_LOCATION") && !ActivityCompat.shouldShowRequestPermissionRationale((Activity)this.a, (String)"android.permission.ACCESS_COARSE_LOCATION")) {
                        ActivityCompat.requestPermissions((Activity)this.a, (String[])r, (int)1);
                        return;
                    }
                    String string2 = this.a.getString(2131558676);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(){

                        public final void onClick(DialogInterface dialogInterface, int n2) {
                            switch (n2) {
                                default: {
                                    return;
                                }
                                case -1: {
                                    ActivityCompat.requestPermissions((Activity)b.this.a, (String[])r, (int)1);
                                    return;
                                }
                                case -2: 
                            }
                            b.this.a.p.invoke(b.this.a.q, false, false);
                        }
                    };
                    DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener(){

                        public final void onCancel(DialogInterface dialogInterface) {
                            b.this.a.p.invoke(b.this.a.q, false, false);
                        }
                    };
                    new c.a((Context)this.a).b((CharSequence)string2).a(17039370, onClickListener).b(17039360, onClickListener).a(onCancelListener).c().show();
                    return;
                }
                callback.invoke(string, false, false);
            }

        });
        if (this.n) {
            this.h.getSettings().setGeolocationEnabled(true);
        }
        this.h.setWebViewClient(new WebViewClient((Custompage_1583051146_6d70d8e039)this, 0){
            String a;
            final /* synthetic */ Custompage_1583051146_6d70d8e039 b;
            {
                this.b = custompage_1583051146_6d70d8e039;
                this.a = "";
            }

            private void a(final WebView webView, String string) {
                if (this.b.j != null && this.b.j.equals((Object)string)) {
                    webView.loadUrl("about:blank");
                    if (this.b.t && !this.b.isFinishing()) {
                        c.a a2 = new c.a((Context)this.b);
                        a2.a((CharSequence)"No Internet connection");
                        a2.b((CharSequence)"Please check your connection and try again.");
                        a2.a((CharSequence)"Retry", new DialogInterface.OnClickListener(){

                            public final void onClick(DialogInterface dialogInterface, int n2) {
                                if (a.this.b.j != null) {
                                    webView.loadUrl(a.this.b.j);
                                }
                            }
                        });
                        a2.b((CharSequence)"Cancel", new DialogInterface.OnClickListener(){

                            public final void onClick(DialogInterface dialogInterface, int n2) {
                                dialogInterface.dismiss();
                            }
                        });
                        a2.c().show();
                    }
                }
            }

            private boolean a(Uri uri, String string) {
                this.a = uri.toString();
                try {
                    Intent intent = bb.a(uri, string);
                    this.b.startActivity(intent);
                    return true;
                }
                catch (Exception exception) {
                    Toast.makeText((Context)this.b.getApplicationContext(), (int)2131558690, (int)0).show();
                    return false;
                }
            }

            /*
             * Exception decompiling
             */
            private boolean a(WebView var1, Uri var2) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl163 : ALOAD_0 : trying to set 1 previously set to 0
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

            private boolean a(String string, Uri uri, int n2) {
                this.a = uri.toString();
                try {
                    Intent intent = new Intent(string, uri);
                    this.b.startActivity(intent);
                    return true;
                }
                catch (Exception exception) {
                    if (n2 != 0) {
                        Toast.makeText((Context)this.b.getApplicationContext(), (int)n2, (int)0).show();
                    }
                    return false;
                }
            }

            public final void onLoadResource(WebView webView, String string) {
            }

            public final void onPageFinished(WebView webView, String string) {
                this.b.m = false;
                Custompage_1583051146_6d70d8e039 custompage_1583051146_6d70d8e039 = this.b;
                if (custompage_1583051146_6d70d8e039.i != null) {
                    g.a((MenuItem)custompage_1583051146_6d70d8e039.i);
                }
                CookieSyncManager.getInstance().sync();
                if (string.equals((Object)"about:blank")) {
                    webView.clearHistory();
                }
            }

            public final void onPageStarted(WebView webView, String string, Bitmap bitmap) {
                if (!string.equals((Object)"about:blank")) {
                    this.b.j = string;
                }
                this.b.m = true;
                this.b.a();
            }

            public final void onReceivedError(WebView webView, int n2, String string, String string2) {
                a.super.a(webView, string2);
            }

            @TargetApi(value=24)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                webResourceError.getErrorCode();
                a.super.a(webView, webResourceRequest.getUrl().toString());
            }

            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (this.b.h != null) {
                    this.b.h.destroy();
                    this.b.h = null;
                }
                return true;
            }

            public final WebResourceResponse shouldInterceptRequest(WebView webView, String string) {
                return super.shouldInterceptRequest(webView, string);
            }

            @TargetApi(value=24)
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return a.super.a(webView, webResourceRequest.getUrl());
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
                if (string != null && !string.equals((Object)"")) {
                    return a.super.a(webView, Uri.parse((String)string));
                }
                this.a = string;
                return true;
            }

        });
        this.h.getSettings().setJavaScriptEnabled(true);
        this.h.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.h.getSettings().setLightTouchEnabled(true);
        this.h.getSettings().setDatabaseEnabled(true);
        WebSettings webSettings = this.h.getSettings();
        StringBuilder stringBuilder = new StringBuilder("/data/data/");
        stringBuilder.append(this.getPackageName());
        stringBuilder.append("/databases/");
        webSettings.setDatabasePath(stringBuilder.toString());
        this.h.getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            this.h.getSettings().setMixedContentMode(2);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.h, true);
        }
        if (Build.VERSION.SDK_INT > 7) {
            this.h.getSettings().setPluginState(WebSettings.PluginState.ON);
        }
        this.h.getSettings().setBuiltInZoomControls(this.o);
        this.h.getSettings().setDisplayZoomControls(false);
        this.h.getSettings().setSupportZoom(this.o);
        this.h.getSettings().setLoadWithOverviewMode(this.o);
        this.h.getSettings().setUseWideViewPort(this.o);
        this.h.setDownloadListener(new DownloadListener((Custompage_1583051146_6d70d8e039)this){
            final /* synthetic */ Custompage_1583051146_6d70d8e039 a;
            {
                this.a = custompage_1583051146_6d70d8e039;
            }

            public final void onDownloadStart(String string, String string2, String string3, String string4, long l2) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse((String)string), string4);
                try {
                    this.a.startActivity(intent);
                    return;
                }
                catch (android.content.ActivityNotFoundException activityNotFoundException) {
                    bb.a(this.a.h.getContext(), string);
                    return;
                }
            }
        });
        String string = "";
        Intent intent = this.getIntent();
        if (intent != null) {
            string = intent.getStringExtra("com.newandromo.dev338923.app614241.NAVIGATION_PAGE");
        }
        if (string != null && !string.equals((Object)"")) {
            String string2 = "file:///android_asset/Custompage_1583051146_6d70d8e039".concat(String.valueOf((Object)string));
            this.h.loadUrl(string2);
        } else if (bundle != null) {
            this.h.restoreState(bundle);
        } else {
            this.h.loadUrl(this.getString(2131558413));
        }
        f.a((Activity)this, (ViewGroup)((LinearLayout)this.findViewById(2131296332)), e.b.a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131492869, menu);
        this.i = menu.findItem(2131296457);
        if (this.m) {
            this.a();
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onDelayedAdLoad() {
        super.onDelayedAdLoad();
        f.a((Activity)this, (ViewGroup)((LinearLayout)this.findViewById(2131296332)), e.b.a);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (n2 == 4 && this.h.canGoBack()) {
            this.h.goBack();
            return true;
        }
        return super.onKeyDown(n2, keyEvent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131296457) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.h != null) {
            if (this.j != null) {
                this.h.loadUrl(this.j);
            } else {
                this.h.reload();
            }
        }
        return true;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.a("onPause");
        CookieSyncManager.getInstance().stopSync();
        this.t = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onRequestPermissionsResult(int var1, String[] var2_3, int[] var3_2) {
        block2 : {
            block5 : {
                block4 : {
                    block3 : {
                        var4_4 = 1;
                        if (var1 != var4_4 || this.p == null || this.q == null) break block3;
                        if (var3_2.length <= 0) break block4;
                        var5_5 = var3_2.length;
                        break block5;
                    }
                    super.onRequestPermissionsResult(var1, var2_3, var3_2);
                    return;
                }
                do {
                    var4_4 = 0;
                    break block2;
                    break;
                } while (true);
            }
            for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                if (var3_2[var6_6] != 0) ** continue;
            }
        }
        this.p.invoke(this.q, (boolean)var4_4, false);
        this.p = null;
        this.q = null;
    }

    @Override
    public void onResume() {
        super.onResume();
        this.a("onResume");
        CookieSyncManager.getInstance().startSync();
        this.t = true;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        if (this.h != null) {
            this.h.saveState(bundle);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    protected void setContentView() {
        this.setContentView(2131427428);
    }

}

