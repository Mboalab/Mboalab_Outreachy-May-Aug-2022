package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import com.startapp.android.publish.ads.nativead.NativeAdPreferences;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;

public class a
extends com.startapp.android.publish.a.a {
    private NativeAdPreferences g;

    public a(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.g = nativeAdPreferences;
    }

    @Override
    public GetAdRequest a() {
        GetAdRequest getAdRequest = super.a();
        if (getAdRequest == null) {
            return null;
        }
        getAdRequest.setAdsNumber(this.g.getAdsNumber());
        if (this.g.getImageSize() != null) {
            getAdRequest.setWidth(this.g.getImageSize().getWidth());
            getAdRequest.setHeight(this.g.getImageSize().getHeight());
        } else {
            int n2 = this.g.getPrimaryImageSize();
            if (n2 == -1) {
                n2 = 2;
            }
            getAdRequest.setPrimaryImg(Integer.toString((int)n2));
            int n3 = this.g.getSecondaryImageSize();
            if (n3 == -1) {
                n3 = 2;
            }
            getAdRequest.setMoreImg(Integer.toString((int)n3));
        }
        if (this.g.isContentAd()) {
            getAdRequest.setContentAd(this.g.isContentAd());
        }
        return getAdRequest;
    }

    @Override
    public void a(Ad ad2) {
    }
}

