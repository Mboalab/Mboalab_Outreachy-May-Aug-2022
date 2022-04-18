package com.startapp.android.publish.ads.a;

import android.os.Handler;
import android.webkit.WebView;
import com.startapp.android.publish.ads.a.c;
import com.startapp.android.publish.ads.a.e;

public class e
extends c {
    @Override
    public void a(WebView webView) {
        super.a(webView);
        if (this.g().equals((Object)"interstitial")) {
            webView.setBackgroundColor(0);
        }
    }

    @Override
    protected void c(WebView webView) {
        new Handler().postDelayed(new Runnable((e)this, webView){
            final /* synthetic */ WebView a;
            final /* synthetic */ e b;
            {
                this.b = e2;
                this.a = webView;
            }

            public void run() {
                try {
                    this.a.setBackgroundColor(0);
                    return;
                }
                catch (java.lang.Exception exception) {
                    return;
                }
            }
        }, 1000L);
    }
}

