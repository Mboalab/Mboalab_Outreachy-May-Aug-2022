package com.startapp.android.publish.ads.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a;
import com.startapp.android.publish.adsCommon.activities.AppWallActivity;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.g;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;

public abstract class c
extends e
implements g {
    private static final long serialVersionUID = 1L;

    public c(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    private boolean d() {
        return this.m() != 0 && this.m() != this.context.getResources().getConfiguration().orientation;
    }

    private Class<?> e(String string) {
        if (c.super.f(string)) {
            return FullScreenActivity.class;
        }
        return i.a(this.getContext(), OverlayActivity.class, AppWallActivity.class);
    }

    private boolean f(String string) {
        return (c.super.d() || this.a() || string.equals((Object)"back")) && i.a(this.getContext(), FullScreenActivity.class);
    }

    protected boolean a() {
        return false;
    }

    @Override
    public boolean a(String string) {
        String string2 = com.startapp.android.publish.adsCommon.c.b();
        boolean bl2 = this.a();
        int n2 = 0;
        if (bl2 && b.a().G().a().equals((Object)n.a.a) && string2.equals((Object)"back")) {
            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            this.setState(Ad.AdState.UN_INITIALIZED);
        }
        if (this.e() == null) {
            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR);
            return false;
        }
        if (this.hasAdCacheTtlPassed()) {
            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        boolean bl3 = this.activityExtra != null ? this.activityExtra.a() : false;
        Intent intent = new Intent(this.context, c.super.e(string2));
        intent.putExtra("fileUrl", "exit.html");
        String[] arrstring = this.k();
        String string3 = com.startapp.android.publish.adsCommon.c.a();
        while (n2 < arrstring.length) {
            if (arrstring[n2] != null && !"".equals((Object)arrstring[n2])) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(arrstring[n2]);
                stringBuilder.append(string3);
                arrstring[n2] = stringBuilder.toString();
            }
            ++n2;
        }
        intent.putExtra("tracking", arrstring);
        intent.putExtra("trackingClickUrl", this.l());
        intent.putExtra("packageNames", this.n());
        intent.putExtra("htmlUuid", this.f());
        intent.putExtra("smartRedirect", this.smartRedirect);
        intent.putExtra("browserEnabled", this.j());
        intent.putExtra("placement", this.placement.getIndex());
        intent.putExtra("adInfoOverride", (Serializable)this.getAdInfoOverride());
        intent.putExtra("ad", (Serializable)this);
        intent.putExtra("videoAd", this.a());
        intent.putExtra("fullscreen", bl3);
        intent.putExtra("orientation", this.b());
        intent.putExtra("adTag", string);
        intent.putExtra("lastLoadTime", (Serializable)this.getLastLoadTime());
        intent.putExtra("adCacheTtl", (Serializable)this.getAdCacheTtl());
        intent.putExtra("closingUrl", this.h());
        if (this.o() != null) {
            intent.putExtra("delayImpressionSeconds", (Serializable)this.o());
        }
        intent.putExtra("sendRedirectHops", (Serializable)this.p());
        if (i.a(8L) && this instanceof com.startapp.android.publish.ads.splash.b) {
            intent.putExtra("isSplash", true);
        }
        intent.putExtra("position", string2);
        intent.addFlags(343932928);
        this.context.startActivity(intent);
        return true;
    }

    @Override
    public String a_() {
        return super.a_();
    }

    protected int b() {
        if (this.m() == 0) {
            return this.context.getResources().getConfiguration().orientation;
        }
        return this.m();
    }

    @Override
    public Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    @Override
    public Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    @Override
    public boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    @Override
    public boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    @Override
    public void setVideoCancelCallBack(boolean bl2) {
        super.setVideoCancelCallBack(bl2);
    }
}

