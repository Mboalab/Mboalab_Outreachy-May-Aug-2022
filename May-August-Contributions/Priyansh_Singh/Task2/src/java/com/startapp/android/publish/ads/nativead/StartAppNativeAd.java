/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import com.startapp.android.publish.ads.nativead.NativeAdDetails;
import com.startapp.android.publish.ads.nativead.NativeAdPreferences;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.a.g;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import com.startapp.common.a.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StartAppNativeAd
extends Ad
implements NativeAdDetails.a {
    private static final String TAG = "StartAppNativeAd";
    private static final long serialVersionUID = 1L;
    private a adEventDelegate;
    boolean isLoading = false;
    private List<NativeAdDetails> listNativeAds = new ArrayList();
    private com.startapp.android.publish.ads.nativead.b nativeAd;
    private NativeAdPreferences preferences;
    private int totalObjectsLoaded = 0;

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        if (this.listNativeAds != null) {
            Iterator iterator = this.listNativeAds.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((NativeAdDetails)iterator.next()).b());
            }
        }
        return arrayList;
    }

    private NativeAdPreferences getPreferences() {
        return this.preferences;
    }

    public static String getPrivacyImageUrl() {
        return com.startapp.android.publish.adsCommon.adinformation.a.b().d();
    }

    public static String getPrivacyURL() {
        if (com.startapp.android.publish.adsCommon.adinformation.a.b().c() == null) {
            return "";
        }
        String string = com.startapp.android.publish.adsCommon.adinformation.a.b().c();
        if (!string.contains((CharSequence)"http://") && !string.contains((CharSequence)"https://")) {
            StringBuilder stringBuilder = new StringBuilder("https://");
            stringBuilder.append(com.startapp.android.publish.adsCommon.adinformation.a.b().c());
            return stringBuilder.toString();
        }
        return com.startapp.android.publish.adsCommon.adinformation.a.b().c();
    }

    private void onNativeAdLoaded() {
        h.a(TAG, 3, "Ad Loaded successfully");
        this.isLoading = false;
        this.setErrorMessage(null);
        if (this.adEventDelegate != null) {
            h.a(TAG, 3, "Calling original RecienedAd callback");
            AdEventListener adEventListener = this.adEventDelegate.a();
            if (adEventListener != null) {
                adEventListener.onReceiveAd(this);
            }
        }
    }

    private void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return this.getNativeAds(null);
    }

    public ArrayList<NativeAdDetails> getNativeAds(String string) {
        ArrayList arrayList = new ArrayList();
        f f2 = g.a().b().a(AdPreferences.Placement.INAPP_NATIVE, string);
        if (f2.a()) {
            if (this.listNativeAds != null) {
                for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                    nativeAdDetails.a(string);
                    arrayList.add((Object)nativeAdDetails);
                }
                com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(AdPreferences.Placement.INAPP_NATIVE, string));
                return arrayList;
            }
        } else {
            c.a(this.context, c.a(StartAppNativeAd.super.getAdDetailsList()), string, f2.c());
            if (Constants.a().booleanValue()) {
                j.a().a(this.context, f2.b());
            }
        }
        return arrayList;
    }

    public int getNumberOfAds() {
        if (this.listNativeAds != null) {
            return this.listNativeAds.size();
        }
        return 0;
    }

    void initNativeAdList() {
        this.totalObjectsLoaded = 0;
        if (this.listNativeAds == null) {
            this.listNativeAds = new ArrayList();
        }
        this.listNativeAds.clear();
        if (this.nativeAd != null) {
            List<AdDetails> list = this.nativeAd.d();
            if (list != null) {
                for (int i2 = 0; i2 < this.nativeAd.d().size(); ++i2) {
                    NativeAdDetails nativeAdDetails = new NativeAdDetails((AdDetails)this.nativeAd.d().get(i2), this.getPreferences(), i2, this);
                    this.listNativeAds.add((Object)nativeAdDetails);
                }
            }
        }
    }

    @Override
    public boolean isBelowMinCPM() {
        return this.nativeAd.isBelowMinCPM();
    }

    public boolean loadAd() {
        return this.loadAd(new NativeAdPreferences(), null);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        return this.loadAd(nativeAdPreferences, null);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        h.a(TAG, 3, "Start loading StartAppNativeAd");
        this.adEventDelegate = (StartAppNativeAd)this.new a(adEventListener);
        StartAppNativeAd.super.setPreferences(nativeAdPreferences);
        if (this.isLoading) {
            this.setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.isLoading = true;
        this.nativeAd = new com.startapp.android.publish.ads.nativead.b(this.context, StartAppNativeAd.super.getPreferences());
        return this.nativeAd.load(nativeAdPreferences, this.adEventDelegate);
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return this.loadAd(new NativeAdPreferences(), adEventListener);
    }

    @Override
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    @Override
    public void onNativeAdDetailsLoaded(int n2) {
        this.totalObjectsLoaded = 1 + this.totalObjectsLoaded;
        if (this.nativeAd.d() != null && this.totalObjectsLoaded == this.nativeAd.d().size()) {
            StartAppNativeAd.super.onNativeAdLoaded();
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===== StartAppNativeAd =====\n");
        for (int i2 = 0; i2 < this.getNumberOfAds(); ++i2) {
            stringBuffer.append(this.listNativeAds.get(i2));
        }
        stringBuffer.append("===== End StartAppNativeAd =====");
        return stringBuffer.toString();
    }

    class a
    implements AdEventListener {
        private AdEventListener b = null;

        public a(AdEventListener adEventListener) {
            this.b = new com.startapp.android.publish.adsCommon.adListeners.b(adEventListener);
        }

        public AdEventListener a() {
            return this.b;
        }

        @Override
        public void onFailedToReceiveAd(Ad ad2) {
            h.a(StartAppNativeAd.TAG, 3, "NativeAd Failed to load");
            StartAppNativeAd.this.setErrorMessage(ad2.getErrorMessage());
            if (this.b != null) {
                this.b.onFailedToReceiveAd(StartAppNativeAd.this);
                this.b = null;
            }
            StartAppNativeAd.this.isLoading = false;
            StartAppNativeAd.this.initNativeAdList();
        }

        @Override
        public void onReceiveAd(Ad ad2) {
            h.a(StartAppNativeAd.TAG, 3, "NativeAd Received");
            StartAppNativeAd.this.initNativeAdList();
        }
    }

}

