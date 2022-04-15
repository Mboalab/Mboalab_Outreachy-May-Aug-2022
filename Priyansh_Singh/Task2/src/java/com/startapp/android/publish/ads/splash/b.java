package com.startapp.android.publish.ads.splash;

import android.content.Context;
import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.ads.splash.a;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;

public class b
extends c {
    private static final long serialVersionUID = 1L;

    public b(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    @Deprecated
    @Override
    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener) {
        return super.load(adPreferences, adEventListener, false);
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new a(this.context, (b)this, adPreferences, adEventListener).c();
    }
}

