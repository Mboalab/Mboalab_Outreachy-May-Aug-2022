package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.startapp.android.publish.adsCommon.k;

public class AdInformationJsInterface {
    private Runnable acceptCallback = null;
    private Context context = null;
    private Runnable declineCallback = null;
    private Runnable privacyPolicyCallback = null;
    private boolean processed = false;

    public AdInformationJsInterface(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.context = context;
        this.acceptCallback = runnable;
        this.declineCallback = runnable2;
        this.privacyPolicyCallback = runnable3;
    }

    @JavascriptInterface
    public void accept() {
        if (this.processed) {
            return;
        }
        this.processed = true;
        this.acceptCallback.run();
    }

    @JavascriptInterface
    public void decline() {
        if (this.processed) {
            return;
        }
        this.processed = true;
        this.declineCallback.run();
    }

    @JavascriptInterface
    public void fullPrivacyPolicy() {
        if (this.processed) {
            return;
        }
        this.processed = true;
        this.privacyPolicyCallback.run();
    }

    @JavascriptInterface
    public String getAppId() {
        if (this.context != null) {
            try {
                String string = String.valueOf((long)(121212121L ^ Long.valueOf((long)Long.parseLong((String)k.a(this.context, "shared_prefs_appId", null)))));
                return string;
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }
}

