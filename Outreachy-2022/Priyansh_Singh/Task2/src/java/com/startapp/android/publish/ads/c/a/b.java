package com.startapp.android.publish.ads.c.a;

import android.content.Context;
import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.ads.c.a.a;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;

public class b
extends c {
    private static final long serialVersionUID = 1L;

    public b(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new a(this.context, (b)this, adPreferences, adEventListener).c();
    }
}

