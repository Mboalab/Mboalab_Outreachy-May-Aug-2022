
package com.startapp.android.publish.a;

import android.content.Context;
import android.content.Intent;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b.c;
import com.startapp.android.publish.adsCommon.d;
import com.startapp.android.publish.adsCommon.h;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.common.model.GetAdResponse;
import com.startapp.common.b;
import com.startapp.common.e;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class a
extends d {
    private int g = 0;
    private Set<String> h = new HashSet();

    public a(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad2, adPreferences, adEventListener, placement);
    }

    private boolean b() {
        this.g = 1 + this.g;
        return this.d();
    }

    protected abstract void a(Ad var1);

    @Override
    public void a(Boolean bl2) {
        super.a(bl2);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.b.hashCode());
        intent.putExtra("adResult", (Serializable)bl2);
        b.a(this.a).a(intent);
        if (!bl2.booleanValue()) {
            return;
        }
        this.a((h)this.b);
        this.d.onReceiveAd(this.b);
    }

    @Override
    public boolean a(Object object) {
        GetAdResponse getAdResponse = (GetAdResponse)object;
        if (object == null) {
            this.f = "Empty Response";
            com.startapp.common.a.h.a("AppPresence", 6, "Error Empty Response");
            return false;
        }
        if (!getAdResponse.isValidResponse()) {
            this.f = getAdResponse.getErrorMessage();
            StringBuilder stringBuilder = new StringBuilder("Error msg = [");
            stringBuilder.append(this.f);
            stringBuilder.append("]");
            com.startapp.common.a.h.a("AppPresence", 6, stringBuilder.toString());
            return false;
        }
        h h2 = (h)this.b;
        List<AdDetails> list = c.a(this.a, getAdResponse.getAdsDetails(), this.g, this.h);
        h2.a(list);
        h2.setAdInfoOverride(getAdResponse.getAdInfoOverride());
        List<AdDetails> list2 = getAdResponse.getAdsDetails();
        boolean bl2 = false;
        if (list2 != null) {
            int n2 = getAdResponse.getAdsDetails().size();
            bl2 = false;
            if (n2 > 0) {
                bl2 = true;
            }
        }
        if (!bl2) {
            this.f = "Empty Response";
            return bl2;
        }
        if (list.size() == 0 && this.g == 0) {
            com.startapp.common.a.h.a("AppPresence", 3, "Packages exists - another request");
            return a.super.b();
        }
        return bl2;
    }

    @Override
    public Object e() {
        GetAdRequest getAdRequest = this.a();
        if (getAdRequest == null) {
            return null;
        }
        if (this.h.size() == 0) {
            this.h.add((Object)this.a.getPackageName());
        }
        if (this.g > 0) {
            getAdRequest.setEngInclude(false);
        }
        getAdRequest.setPackageExclude(this.h);
        int n2 = this.g;
        boolean bl2 = false;
        if (n2 == 0) {
            bl2 = true;
        }
        getAdRequest.setEngInclude(bl2);
        try {
            GetAdResponse getAdResponse = com.startapp.android.publish.adsCommon.h.a.a(this.a, AdsConstants.a(AdsConstants.ApiType.JSON), getAdRequest, null, GetAdResponse.class);
            return getAdResponse;
        }
        catch (e e2) {
            com.startapp.common.a.h.a("AppPresence", 6, "Unable to handle GetAdsSetService command!!!!", (Throwable)((Object)e2));
            this.f = e2.getMessage();
            return null;
        }
    }
}

