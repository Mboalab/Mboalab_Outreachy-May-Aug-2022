package com.startapp.android.publish.ads.b;

import android.content.Context;
import com.startapp.android.publish.ads.b.a;
import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.common.model.AdPreferences;

public class d
extends c {
    private static final long serialVersionUID = 1L;

    public d(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new a(this.context, (e)this, adPreferences, adEventListener).c();
    }
}

