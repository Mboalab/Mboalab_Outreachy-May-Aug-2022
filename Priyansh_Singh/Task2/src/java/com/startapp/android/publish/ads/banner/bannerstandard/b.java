package com.startapp.android.publish.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.bannerstandard.a;
import com.startapp.android.publish.ads.banner.c;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.common.a.h;

public class b
extends com.startapp.android.publish.html.a {
    private int h = 0;

    public b(Context context, e e2, int n2, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, e2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.h = n2;
    }

    @Override
    public GetAdRequest a() {
        a a2 = (a)this.b;
        com.startapp.android.publish.ads.banner.a a3 = new com.startapp.android.publish.ads.banner.a();
        this.b(a3);
        a3.setWidth(a2.g());
        a3.setHeight(a2.i());
        a3.setOffset(this.h);
        a3.setAdsNumber(c.a().b().g());
        a3.a(a2.b());
        a3.a(a2.c());
        return a3;
    }

    @Override
    public void a(Boolean bl2) {
        super.a(bl2);
        this.a((boolean)bl2);
        StringBuilder stringBuilder = new StringBuilder("Html onPostExecute, result=[");
        stringBuilder.append((Object)bl2);
        stringBuilder.append("]");
        h.a(4, stringBuilder.toString());
    }

    @Override
    public boolean a(String string) {
        ((e)this.b).b(string);
        return true;
    }
}

