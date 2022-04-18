package com.startapp.android.publish.ads.c.b;
import android.content.Context;
import android.content.Intent;
import com.startapp.android.publish.ads.c.b.a;
import com.startapp.android.publish.ads.list3d.List3DActivity;
import com.startapp.android.publish.ads.list3d.e;
import com.startapp.android.publish.ads.list3d.f;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.adsCommon.g;
import com.startapp.android.publish.adsCommon.h;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;
import java.util.UUID;

public class b
extends h
implements g {
    private static String a;
    private static final long serialVersionUID = 1L;
    private final String uuid = UUID.randomUUID().toString();

    public b(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
        if (a == null) {
            a = i.c(context);
        }
    }

    public String a() {
        return this.uuid;
    }

    @Override
    public boolean a(String string) {
        f.a().a(this.uuid).b(com.startapp.android.publish.adsCommon.c.a());
        boolean bl2 = this.activityExtra != null ? this.activityExtra.a() : false;
        if (this.hasAdCacheTtlPassed()) {
            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.context, List3DActivity.class);
        intent.putExtra("adInfoOverride", (Serializable)this.getAdInfoOverride());
        intent.putExtra("fullscreen", bl2);
        intent.putExtra("adTag", string);
        intent.putExtra("lastLoadTime", (Serializable)this.getLastLoadTime());
        intent.putExtra("adCacheTtl", (Serializable)this.getAdCacheTtl());
        intent.putExtra("position", com.startapp.android.publish.adsCommon.c.b());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        this.context.startActivity(intent);
        if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            this.setState(Ad.AdState.UN_INITIALIZED);
        }
        return true;
    }

    @Override
    public String a_() {
        return a;
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
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new a(this.context, (b)this, adPreferences, adEventListener).c();
    }

    @Override
    public void setVideoCancelCallBack(boolean bl2) {
        super.setVideoCancelCallBack(bl2);
    }
}

