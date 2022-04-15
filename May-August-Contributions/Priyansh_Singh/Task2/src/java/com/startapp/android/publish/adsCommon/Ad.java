/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.adsCommon.Ad$1
 *  com.startapp.android.publish.adsCommon.Ad$2
 *  com.startapp.android.publish.adsCommon.adListeners.b
 *  com.startapp.android.publish.cache.d
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.MetaDataRequest
 *  com.startapp.android.publish.common.metaData.MetaDataRequest$a
 *  com.startapp.android.publish.common.metaData.d
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.android.publish.common.model.AdPreferences$Placement
 *  com.startapp.common.c
 *  java.io.Serializable
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.b;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;

public abstract class Ad
implements Serializable {
    private static boolean init = false;
    private static final long serialVersionUID = 1L;
    protected a activityExtra;
    protected Long adCacheTtl = null;
    private c adInfoOverride;
    protected boolean belowMinCPM = false;
    protected transient Context context;
    protected String errorMessage = null;
    protected Serializable extraData = null;
    private Long lastLoadTime = null;
    private AdDisplayListener.NotDisplayedReason notDisplayedReason;
    protected AdPreferences.Placement placement;
    private AdState state = AdState.UN_INITIALIZED;
    private AdType type;
    private boolean videoCancelCallBack;

    public Ad(Context context, AdPreferences.Placement placement) {
        this.context = context;
        this.placement = placement;
        if (i.e()) {
            this.adInfoOverride = c.a();
        }
    }

    static /* synthetic */ void access$000(Ad ad2, Long l2) {
        ad2.setLastLoadTime(l2);
    }

    private void setLastLoadTime(Long l2) {
        this.lastLoadTime = l2;
    }

    private void setType(AdType adType) {
        this.type = adType;
    }

    protected boolean canShowAd() {
        return MetaData.getInstance().canShowAd();
    }

    protected Long getAdCacheTtl() {
        long l2 = this.getFallbackAdCacheTtl();
        if (this.adCacheTtl != null) {
            l2 = Math.min((long)this.adCacheTtl, (long)l2);
        }
        return l2;
    }

    public c getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public Context getContext() {
        return this.context;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    protected long getFallbackAdCacheTtl() {
        return com.startapp.android.publish.cache.d.a().b().getAdCacheTtl();
    }

    protected Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    public AdDisplayListener.NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    protected AdPreferences.Placement getPlacement() {
        return this.placement;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    protected boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

    protected boolean hasAdCacheTtlPassed() {
        if (this.lastLoadTime == null) {
            return false;
        }
        return System.currentTimeMillis() - this.lastLoadTime > this.getAdCacheTtl();
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !this.hasAdCacheTtlPassed();
    }

    @Deprecated
    public boolean load() {
        return this.load(new AdPreferences(), null);
    }

    @Deprecated
    public boolean load(AdEventListener adEventListener) {
        return this.load(new AdPreferences(), adEventListener);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences) {
        return this.load(adPreferences, null);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener) {
        return this.load(adPreferences, adEventListener, true);
    }

    protected boolean load(AdPreferences adPreferences, AdEventListener adEventListener, boolean bl) {
        String string;
        boolean bl2;
        1 var4_4 = new 1((Ad)this, (AdEventListener)new b(adEventListener));
        if (!init) {
            l.c(this.context);
            com.startapp.common.c.c((Context)this.context);
            init = true;
        }
        i.a(this.context, adPreferences);
        if (adPreferences.getProductId() != null && !"".equals((Object)adPreferences.getProductId())) {
            string = "";
            bl2 = false;
        } else {
            string = "app ID was not set.";
            bl2 = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            string = "load() was already called.";
            bl2 = true;
        }
        if (!i.a(this.context)) {
            string = "network not available.";
            bl2 = true;
        }
        if (!this.canShowAd()) {
            string = "serving ads disabled";
            bl2 = true;
        }
        if (bl2) {
            this.setErrorMessage("Ad wasn't loaded: ".concat(String.valueOf((Object)string)));
            var4_4.onFailedToReceiveAd((Ad)this);
            return false;
        }
        this.setState(AdState.PROCESSING);
        2 var7_7 = new 2((Ad)this, adPreferences, (AdEventListener)var4_4);
        if (adPreferences.getType() != null) {
            Ad.super.setType(adPreferences.getType());
        }
        MetaData.getInstance().loadFromServer(this.context, adPreferences, g.d().c(), bl, (d)var7_7);
        return true;
    }

    protected abstract void loadAds(AdPreferences var1, AdEventListener var2);

    public void setActivityExtra(a a2) {
        this.activityExtra = a2;
    }

    public void setAdInfoOverride(c c2) {
        this.adInfoOverride = c2;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setErrorMessage(String string) {
        this.errorMessage = string;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    protected void setNotDisplayedReason(AdDisplayListener.NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    protected void setPlacement(AdPreferences.Placement placement) {
        this.placement = placement;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    protected void setVideoCancelCallBack(boolean bl) {
        this.videoCancelCallBack = bl;
    }

    @Deprecated
    public boolean show() {
        return false;
    }

    public static final class AdState
    extends Enum<AdState> {
        private static final /* synthetic */ AdState[] $VALUES;
        public static final /* enum */ AdState PROCESSING;
        public static final /* enum */ AdState READY;
        public static final /* enum */ AdState UN_INITIALIZED;

        static {
            UN_INITIALIZED = new AdState();
            PROCESSING = new AdState();
            READY = new AdState();
            AdState[] arradState = new AdState[]{UN_INITIALIZED, PROCESSING, READY};
            $VALUES = arradState;
        }

        public static AdState valueOf(String string) {
            return (AdState)Enum.valueOf(AdState.class, (String)string);
        }

        public static AdState[] values() {
            return (AdState[])$VALUES.clone();
        }
    }

    public static final class AdType
    extends Enum<AdType> {
        private static final /* synthetic */ AdType[] $VALUES;
        public static final /* enum */ AdType INTERSTITIAL = new AdType();
        public static final /* enum */ AdType NON_VIDEO;
        public static final /* enum */ AdType REWARDED_VIDEO;
        public static final /* enum */ AdType RICH_TEXT;
        public static final /* enum */ AdType VIDEO;

        static {
            RICH_TEXT = new AdType();
            VIDEO = new AdType();
            REWARDED_VIDEO = new AdType();
            NON_VIDEO = new AdType();
            AdType[] arradType = new AdType[]{INTERSTITIAL, RICH_TEXT, VIDEO, REWARDED_VIDEO, NON_VIDEO};
            $VALUES = arradType;
        }

        public static AdType valueOf(String string) {
            return (AdType)Enum.valueOf(AdType.class, (String)string);
        }

        public static AdType[] values() {
            return (AdType[])$VALUES.clone();
        }
    }

}

