/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.video.VideoAdDetails;
import com.startapp.android.publish.ads.video.a.a;
import com.startapp.android.publish.ads.video.a.b;
import com.startapp.android.publish.ads.video.c;
import com.startapp.android.publish.ads.video.d;
import com.startapp.android.publish.ads.video.e;
import com.startapp.android.publish.ads.video.g;
import com.startapp.android.publish.ads.video.h;
import com.startapp.android.publish.ads.video.tracking.ActionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingDetails;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;

public class b
extends com.startapp.android.publish.html.a {
    public b(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, ad2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, true);
    }

    private boolean b(String string) {
        return i.a(string, "@videoJson@", "@videoJson@") != null;
    }

    private boolean g() {
        return this.b() != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void h() {
        if (this.b.getType() != Ad.AdType.REWARDED_VIDEO) {
            AdPreferences adPreferences = this.c == null ? new AdPreferences() : new AdPreferences(this.c);
            AdPreferences adPreferences2 = adPreferences;
            adPreferences2.setType(Ad.AdType.NON_VIDEO);
            AdPreferences.Placement placement = this.e;
            com.startapp.android.publish.cache.a.a().a(this.a, null, placement, adPreferences2, null);
        }
    }

    @Override
    public GetAdRequest a() {
        return this.b(new com.startapp.android.publish.ads.video.a());
    }

    @Override
    public void a(final Boolean bl2) {
        super.a(bl2);
        if (bl2.booleanValue() && b.super.g()) {
            if (com.startapp.android.publish.adsCommon.b.a().G().i()) {
                b.super.b(bl2);
            }
            this.b().setVideoMuted(this.c.isVideoMuted());
            g.a a2 = new g.a(){

                private void a() {
                    try {
                        a a2 = new com.startapp.android.publish.ads.video.a.b(b.this.b().getVideoTrackingDetails().getInlineErrorTrackingUrls(), new VideoTrackingParams("", 0, 0, "1"), b.this.b().getVideoUrl(), 0).a("error").a(b.a.b).a();
                        h.a(b.this.a, a2);
                        return;
                    }
                    catch (Exception exception) {
                        f.a(b.this.a, com.startapp.android.publish.adsCommon.e.d.b, "GetVideoEnabledService.sendVideoErrorEvent", exception.getMessage(), "");
                        return;
                    }
                }

                @Override
                public void a(String string) {
                    if (string != null) {
                        if (!string.equals((Object)"downloadInterrupted")) {
                            b.super.b(bl2);
                            b.this.b().setLocalVideoPath(string);
                        }
                        b.this.a((boolean)bl2);
                        return;
                    }
                    b.this.a(false);
                    b.this.d.onFailedToReceiveAd(b.this.b);
                    1.super.a();
                }
            };
            c.a a3 = new c.a(){

                @Override
                public void a(String string) {
                    b.this.b().setLocalVideoPath(string);
                }
            };
            d.a().a(this.a.getApplicationContext(), this.b().getVideoUrl(), a2, a3);
            return;
        }
        this.a((boolean)bl2);
    }

    @Override
    public boolean a(GetAdRequest getAdRequest) {
        if (super.a(getAdRequest)) {
            h.a a2;
            if (getAdRequest.isAdTypeVideo() && (a2 = h.a(this.a)) != h.a.a) {
                this.f = a2.a();
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(Object object) {
        String string = (String)object;
        if (com.startapp.android.publish.adsCommon.b.a().G().h() && b.super.b(string)) {
            b.super.h();
        }
        return super.a(object);
    }

    VideoAdDetails b() {
        return ((e)this.b).d();
    }

    @Override
    public void b(Boolean bl2) {
        if (!b.super.g()) {
            super.b(bl2);
        }
    }

}

