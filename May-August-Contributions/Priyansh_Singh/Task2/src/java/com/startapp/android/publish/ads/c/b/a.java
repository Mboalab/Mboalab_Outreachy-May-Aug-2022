package com.startapp.android.publish.ads.c.b;
import android.content.Context;
import com.startapp.android.publish.ads.c.b.b;
import com.startapp.android.publish.ads.list3d.e;
import com.startapp.android.publish.ads.list3d.f;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;
import java.util.Iterator;
import java.util.List;

public class a
extends com.startapp.android.publish.a.a {
    public a(Context context, b b2, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, b2, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    @Override
    public GetAdRequest a() {
        GetAdRequest getAdRequest = super.a();
        if (getAdRequest == null) {
            return null;
        }
        getAdRequest.setAdsNumber(com.startapp.android.publish.adsCommon.b.a().g());
        return getAdRequest;
    }

    @Override
    public void a(Ad ad2) {
        b b2 = (b)ad2;
        List<AdDetails> list = b2.d();
        e e2 = f.a().a(b2.a());
        e2.a();
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                e2.a((AdDetails)iterator.next());
            }
        }
    }
}

