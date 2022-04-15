package com.startapp.android.publish.ads.b;

import android.content.Context;
import com.startapp.android.publish.ads.b.b;
import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.cache.d;
import com.startapp.android.publish.common.model.AdPreferences;

public class e
extends c {
    private static final long serialVersionUID = 1L;

    public e(Context context) {
        super(context, AdPreferences.Placement.INAPP_RETURN);
    }

    @Override
    public long getFallbackAdCacheTtl() {
        return d.a().b().getReturnAdCacheTTL();
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new b(this.context, (com.startapp.android.publish.adsCommon.e)this, adPreferences, adEventListener).c();
    }
}

