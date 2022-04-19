package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.a;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;

public class c
extends com.startapp.android.publish.a.a {
    private int g = 0;

    public c(Context context, com.startapp.android.publish.ads.banner.banner3d.a a2, int n2, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, a2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.g = n2;
    }

    @Override
    public GetAdRequest a() {
        com.startapp.android.publish.ads.banner.banner3d.a a2 = (com.startapp.android.publish.ads.banner.banner3d.a)this.b;
        a a3 = new a();
        this.b(a3);
        a3.setAdsNumber(com.startapp.android.publish.ads.banner.c.a().b().f());
        a3.setOffset(this.g);
        a3.a(a2.b());
        return a3;
    }

    @Override
    public void a(Ad ad2) {
    }
}

