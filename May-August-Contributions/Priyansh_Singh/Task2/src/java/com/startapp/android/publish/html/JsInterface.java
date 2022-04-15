
package com.startapp.android.publish.html;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.h;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class JsInterface {
    private Runnable clickCallback;
    private Runnable closeCallback;
    private Runnable enableScrollCallback;
    protected boolean inAppBrowserEnabled;
    protected Context mContext;
    private b params;
    private boolean processed;

    public JsInterface(Context context, Runnable runnable, b b2) {
        this.processed = false;
        this.inAppBrowserEnabled = true;
        this.closeCallback = null;
        this.clickCallback = null;
        this.enableScrollCallback = null;
        this.closeCallback = runnable;
        this.mContext = context;
        this.params = b2;
    }

    public JsInterface(Context context, Runnable runnable, b b2, boolean bl2) {
        super(context, runnable, b2);
        this.inAppBrowserEnabled = bl2;
    }

    public JsInterface(Context context, Runnable runnable, Runnable runnable2, b b2) {
        super(context, runnable, b2);
        this.clickCallback = runnable2;
    }

    public JsInterface(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, b b2, boolean bl2) {
        this(context, runnable, b2, bl2);
        this.clickCallback = runnable2;
        this.enableScrollCallback = runnable3;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.processed) {
            return;
        }
        this.processed = true;
        this.closeCallback.run();
    }

    @JavascriptInterface
    public void enableScroll(String string) {
        if (this.enableScrollCallback != null) {
            this.enableScrollCallback.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String string) {
        if (this.inAppBrowserEnabled && i.a(256L)) {
            c.b(this.mContext, string, null);
            return;
        }
        c.c(this.mContext, string);
    }

    @JavascriptInterface
    public void openApp(String string, String string2, String string3) {
        if (string != null && !TextUtils.isEmpty((CharSequence)string)) {
            c.b(this.mContext, string, this.params);
        }
        Intent intent = this.mContext.getPackageManager().getLaunchIntentForPackage(string2);
        if (string3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(string3);
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                    String string4 = String.valueOf((Object)iterator.next());
                    intent.putExtra(string4, String.valueOf((Object)jSONObject.get(string4)));
                }
            }
            catch (JSONException jSONException) {
                h.a(6, "Couldn't parse intent details json!", jSONException);
            }
        }
        try {
            this.mContext.startActivity(intent);
        }
        catch (Exception exception) {
            String string5 = c.a(string, null);
            f.a(this.mContext, d.b, "JsInterface.openApp - Couldn't start activity", exception.getMessage(), string5);
            StringBuilder stringBuilder = new StringBuilder("Cannot find activity to handle url: [");
            stringBuilder.append(string);
            stringBuilder.append("]");
            h.a(6, stringBuilder.toString());
        }
        if (this.clickCallback != null) {
            this.clickCallback.run();
        }
    }
}

