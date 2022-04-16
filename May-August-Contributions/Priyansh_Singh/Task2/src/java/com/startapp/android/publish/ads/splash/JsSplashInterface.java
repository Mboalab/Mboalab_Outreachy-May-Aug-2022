package com.startapp.android.publish.ads.splash;

import android.content.Context;
import android.webkit.JavascriptInterface;

public class JsSplashInterface {
    private Runnable closeCallback = null;
    protected Context mContext;
    private boolean processed = false;

    public JsSplashInterface(Context context, Runnable runnable) {
        this.closeCallback = runnable;
        this.mContext = context;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (this.processed) {
            return;
        }
        this.processed = true;
        this.closeCallback.run();
    }
}

