package com.startapp.android.publish.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.android.publish.ads.banner.bannerstandard.b;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.common.model.AdPreferences;

public class a
extends e {
    private static final long serialVersionUID = 1L;
    private int bannerType;
    private boolean fixedSize;
    private int offset = 0;

    public a(Context context, int n2) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = n2;
    }

    public int a() {
        return this.offset;
    }

    public void a(int n2) {
        this.bannerType = n2;
    }

    public void a(boolean bl2) {
        this.fixedSize = bl2;
    }

    public boolean b() {
        return this.fixedSize;
    }

    public int c() {
        return this.bannerType;
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        b b2 = new b(this.context, (e)this, this.offset, adPreferences, adEventListener);
        b2.c();
        this.offset = 1 + this.offset;
    }
}

