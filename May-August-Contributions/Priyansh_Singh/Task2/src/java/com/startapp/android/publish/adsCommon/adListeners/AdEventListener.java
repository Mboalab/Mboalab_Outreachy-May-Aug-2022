package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.Ad;

public interface AdEventListener {
    public void onFailedToReceiveAd(Ad var1);

    public void onReceiveAd(Ad var1);
}

