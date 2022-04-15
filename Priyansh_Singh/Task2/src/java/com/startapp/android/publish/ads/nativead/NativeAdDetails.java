package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.startapp.android.publish.ads.nativead.NativeAdDetails;
import com.startapp.android.publish.ads.nativead.NativeAdInterface;
import com.startapp.android.publish.ads.nativead.NativeAdPreferences;
import com.startapp.android.publish.ads.nativead.StartAppNativeAd;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a;
import com.startapp.common.a.h;

public class NativeAdDetails
implements NativeAdInterface {
    int a;
    a b;
    private AdDetails c;
    private Bitmap d;
    private Bitmap e;
    private boolean f = false;
    private String g;

    public NativeAdDetails(AdDetails adDetails, NativeAdPreferences nativeAdPreferences, int n2, a a2) {
        StringBuilder stringBuilder = new StringBuilder("Initializiang SingleAd [");
        stringBuilder.append(n2);
        stringBuilder.append("]");
        h.a("StartAppNativeAd", 3, stringBuilder.toString());
        this.c = adDetails;
        this.a = n2;
        this.b = a2;
        if (nativeAdPreferences.isAutoBitmapDownload()) {
            new com.startapp.common.a(this.getImageUrl(), new a.a(){

                @Override
                public void a(Bitmap bitmap, int n2) {
                    NativeAdDetails.this.a(bitmap);
                    new com.startapp.common.a(NativeAdDetails.this.getSecondaryImageUrl(), new a.a(){

                        @Override
                        public void a(Bitmap bitmap, int n2) {
                            NativeAdDetails.this.b(bitmap);
                            NativeAdDetails.this.a();
                        }
                    }, n2).a();
                }

            }, n2).a();
            return;
        }
        this.a();
    }

    void a() {
        new Handler().post(new Runnable(this){
            final /* synthetic */ NativeAdDetails a;
            {
                this.a = nativeAdDetails;
            }

            public void run() {
                StringBuilder stringBuilder = new StringBuilder("SingleAd [");
                stringBuilder.append(this.a.a);
                stringBuilder.append("] Loaded");
                h.a("StartAppNativeAd", 3, stringBuilder.toString());
                if (this.a.b != null) {
                    this.a.b.onNativeAdDetailsLoaded(this.a.a);
                }
            }
        });
    }

    void a(Bitmap bitmap) {
        this.d = bitmap;
    }

    protected void a(String string) {
        this.g = string;
    }

    protected AdDetails b() {
        return this.c;
    }

    void b(Bitmap bitmap) {
        this.e = bitmap;
    }

    @Override
    public StartAppNativeAd.b getCampaignAction() {
        StartAppNativeAd.b b2 = StartAppNativeAd.b.b;
        if (this.c != null && this.c.isCPE()) {
            b2 = StartAppNativeAd.b.a;
        }
        return b2;
    }

    @Override
    public String getCategory() {
        String string = "";
        if (this.c != null) {
            string = this.c.getCategory();
        }
        return string;
    }

    @Override
    public String getDescription() {
        String string = "";
        if (this.c != null) {
            string = this.c.getDescription();
        }
        return string;
    }

    @Override
    public Bitmap getImageBitmap() {
        return this.d;
    }

    @Override
    public String getImageUrl() {
        String string = "";
        if (this.c != null) {
            string = this.c.getImageUrl();
        }
        return string;
    }

    @Override
    public String getInstalls() {
        String string = "";
        if (this.c != null) {
            string = this.c.getInstalls();
        }
        return string;
    }

    @Override
    public String getPackacgeName() {
        String string = "";
        if (this.c != null) {
            string = this.c.getPackageName();
        }
        return string;
    }

    @Override
    public float getRating() {
        if (this.c != null) {
            return this.c.getRating();
        }
        return 5.0f;
    }

    @Override
    public Bitmap getSecondaryImageBitmap() {
        return this.e;
    }

    @Override
    public String getSecondaryImageUrl() {
        String string = "";
        if (this.c != null) {
            string = this.c.getSecondaryImageUrl();
        }
        return string;
    }

    @Override
    public String getTitle() {
        String string = "";
        if (this.c != null) {
            string = this.c.getTitle();
        }
        return string;
    }

    @Override
    public Boolean isApp() {
        Boolean bl2 = Boolean.TRUE;
        if (this.c != null) {
            bl2 = this.c.isApp();
        }
        return bl2;
    }

    @Override
    public void sendClick(Context context) {
        if (this.c != null) {
            switch (3.a[this.getCampaignAction().ordinal()]) {
                default: {
                    return;
                }
                case 2: {
                    c.a(this.getPackacgeName(), this.c.getIntentDetails(), this.c.getClickUrl(), context, new com.startapp.android.publish.adsCommon.d.b(this.g));
                    return;
                }
                case 1: 
            }
            boolean bl2 = c.a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (this.c.isSmartRedirect() && !bl2) {
                c.a(context, this.c.getClickUrl(), this.c.getTrackingClickUrl(), this.c.getPackageName(), new com.startapp.android.publish.adsCommon.d.b(this.g), b.a().A(), this.c.isStartappBrowserEnabled(), this.c.shouldSendRedirectHops());
                return;
            }
            String string = this.c.getClickUrl();
            String string2 = this.c.getTrackingClickUrl();
            com.startapp.android.publish.adsCommon.d.b b2 = new com.startapp.android.publish.adsCommon.d.b(this.g);
            boolean bl3 = this.c.isStartappBrowserEnabled() && !bl2;
            c.a(context, string, string2, b2, bl3);
            return;
        }
    }

    @Override
    public void sendImpression(Context context) {
        if (!this.f) {
            this.f = true;
            if (this.c == null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Sending Impression for [");
            stringBuilder.append(this.a);
            stringBuilder.append("]");
            h.a("StartAppNativeAd", 3, stringBuilder.toString());
            c.a(context, this.c.getTrackingUrl(), new com.startapp.android.publish.adsCommon.d.b(this.g));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Already sent impression for [");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        h.a("StartAppNativeAd", 3, stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("         Title: [");
        stringBuilder.append(this.getTitle());
        stringBuilder.append("]\n         Description: [");
        stringBuilder.append(this.getDescription().substring(0, 30));
        stringBuilder.append("]...\n         Rating: [");
        stringBuilder.append(this.getRating());
        stringBuilder.append("]\n         Installs: [");
        stringBuilder.append(this.getInstalls());
        stringBuilder.append("]\n         Category: [");
        stringBuilder.append(this.getCategory());
        stringBuilder.append("]\n         PackageName: [");
        stringBuilder.append(this.getPackacgeName());
        stringBuilder.append("]\n         CampaginAction: [");
        stringBuilder.append((Object)this.getCampaignAction());
        stringBuilder.append("]\n");
        return stringBuilder.toString();
    }

}

