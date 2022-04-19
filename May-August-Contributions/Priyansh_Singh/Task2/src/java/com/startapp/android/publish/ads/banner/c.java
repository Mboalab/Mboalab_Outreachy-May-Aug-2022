package com.startapp.android.publish.ads.banner;

import android.content.Context;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.common.b.f;
import java.io.Serializable;

public class c
implements Serializable {
    private static transient Object a = new Object();
    private static transient c b = new c();
    private static final long serialVersionUID = 1L;
    @f(a=true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = AdsConstants.h;

    public static c a() {
        return b;
    }

    public static void a(Context context) {
        c c2 = (c)com.startapp.common.a.f.a((Context)context, (String)"StartappBannerMetadata", c.class);
        c c3 = new c();
        if (c2 != null) {
            if (c2.d()) {
                i.a(c2, c3);
            }
            b = c2;
            return;
        }
        b = c3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, c c2) {
        Object object;
        Object object2 = object = a;
        synchronized (object2) {
            c2.bannerMetadataUpdateVersion = AdsConstants.h;
            b = c2;
            com.startapp.common.a.f.a((Context)context, (String)"StartappBannerMetadata", (Serializable)c2);
            return;
        }
    }

    private boolean d() {
        return !AdsConstants.h.equals((Object)this.bannerMetadataUpdateVersion);
    }

    public BannerOptions b() {
        return this.BannerOptions;
    }

    public BannerOptions c() {
        return new BannerOptions(this.BannerOptions);
    }
}

