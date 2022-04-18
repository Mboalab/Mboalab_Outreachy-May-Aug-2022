/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 */
package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.ads.video.VideoAdDetails;
import com.startapp.android.publish.ads.video.b;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;

public class e
extends c {
    private static final long serialVersionUID = 1L;
    private VideoAdDetails videoAdDetails = null;

    public e(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    private void e(String string) {
        if (string != null) {
            this.videoAdDetails = com.startapp.common.b.b.a(string, VideoAdDetails.class);
        }
    }

    @Override
    public boolean a() {
        return this.videoAdDetails != null;
    }

    @Override
    public void b(String string) {
        super.b(string);
        e.super.e(this.a(string, "@videoJson@"));
    }

    public VideoAdDetails d() {
        return this.videoAdDetails;
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new b(this.context, (Ad)this, adPreferences, adEventListener).c();
    }
}

