/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.ads.splash.SplashHideListener;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AutoInterstitialPreferences;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.a.a;
import com.startapp.android.publish.adsCommon.activities.AppWallActivity;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.g;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import com.startapp.common.a.j;
import java.io.Serializable;

public class StartAppAd
extends Ad {
    private static final String TAG = "StartAppAd";
    private static final long serialVersionUID = 1L;
    private static boolean testMode;
    g ad = null;
    private com.startapp.android.publish.cache.c adKey = null;
    private AdMode adMode = AdMode.AUTOMATIC;
    private AdPreferences adPreferences = null;
    AdDisplayListener callback = null;
    private BroadcastReceiver callbackBroadcastReceiver;
    VideoListener videoListener = null;

    public StartAppAd(Context context) {
        super(context, null);
        this.callbackBroadcastReceiver = new BroadcastReceiver((StartAppAd)this){
            final /* synthetic */ StartAppAd a;
            {
                this.a = startAppAd;
            }

            private void a(Context context) {
                com.startapp.common.b.a(context).a((BroadcastReceiver)this);
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals((Object)"com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                    if (intent.getExtras().containsKey("showFailedReason")) {
                        this.a.setNotDisplayedReason((AdDisplayListener.NotDisplayedReason)intent.getExtras().getSerializable("showFailedReason"));
                    }
                    if (this.a.callback != null) {
                        this.a.callback.adNotDisplayed(this.a);
                    }
                    1.super.a(context);
                } else if (intent.getAction().equals((Object)"com.startapp.android.ShowDisplayBroadcastListener")) {
                    if (this.a.callback != null) {
                        this.a.callback.adDisplayed(this.a);
                    }
                } else if (intent.getAction().equals((Object)"com.startapp.android.OnClickCallback")) {
                    if (this.a.callback != null) {
                        this.a.callback.adClicked(this.a);
                    }
                } else if (intent.getAction().equals((Object)"com.startapp.android.OnVideoCompleted")) {
                    if (this.a.videoListener != null) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable(this){
                            final /* synthetic */ 1 a;
                            {
                                this.a = var1;
                            }

                            public void run() {
                                this.a.a.videoListener.onVideoCompleted();
                            }
                        });
                    }
                } else {
                    if (this.a.callback != null) {
                        this.a.callback.adHidden(this.a);
                    }
                    1.super.a(context);
                }
                this.a.ad = null;
            }
        };
    }

    public static void disableAutoInterstitial() {
        com.startapp.android.publish.adsCommon.f.a().c();
    }

    public static void disableSplash() {
        m.a().j();
    }

    public static void enableAutoInterstitial() {
        com.startapp.android.publish.adsCommon.f.a().b();
    }

    public static void init(Context context, String string, String string2) {
        StartAppSDK.init(context, string, string2);
    }

    private boolean isAppOnForeground() {
        boolean bl2 = true;
        try {
            if (b.a().M()) {
                boolean bl3 = i.e(this.context);
                if (bl3) {
                    return bl2;
                }
                bl2 = false;
            }
            return bl2;
        }
        catch (Exception exception) {
            return bl2;
        }
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    private void registerBroadcastReceiver(String string) {
        com.startapp.common.b.a(this.context).a(this.callbackBroadcastReceiver, new IntentFilter(string));
    }

    private void setAdMode(AdMode adMode) {
        this.adMode = adMode;
    }

    private void setAdPrefs(AdPreferences adPreferences) {
        this.adPreferences = adPreferences;
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        com.startapp.android.publish.adsCommon.f.a().a(autoInterstitialPreferences);
    }

    public static boolean showAd(Context context) {
        try {
            boolean bl2 = new StartAppAd(context).showAd();
            return bl2;
        }
        catch (Exception exception) {
            f.a(context, d.b, "StartAppAd.showAd(one line integration) - unexpected Error occurd", exception.getMessage(), "");
            return false;
        }
    }

    private boolean showPreparedVideoFallbackAd(String string) {
        if (this.canShowAd()) {
            if (!b.a().G().h()) {
                return false;
            }
            AdPreferences adPreferences = this.adPreferences == null ? new AdPreferences() : this.adPreferences;
            adPreferences.setType(Ad.AdType.NON_VIDEO);
            AdPreferences.Placement placement = this.getPlacement();
            g g2 = com.startapp.android.publish.cache.a.a().b(new com.startapp.android.publish.cache.c(placement, adPreferences));
            if (g2 != null && g2.isReady() && this.shouldDisplayAd(string, placement).a()) {
                g2.setVideoCancelCallBack(true);
                if (Constants.a().booleanValue()) {
                    j.a().a(this.context, "display Video fallback");
                }
                return g2.a(string);
            }
            return false;
        }
        return false;
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        StartAppAd.showSplash(activity, bundle, new SplashConfig());
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        StartAppAd.showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
        StartAppAd.showSplash(activity, bundle, splashConfig, adPreferences, null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
        StartAppAd.showSplash(activity, bundle, splashConfig, adPreferences, splashHideListener, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener, boolean bl2) {
        block5 : {
            if (bundle == null && MetaData.getInstance().canShowAd()) {
                try {
                    m.a().c(bl2);
                    if (!bl2) {
                        if (adPreferences == null) {
                            adPreferences = new AdPreferences();
                        }
                        adPreferences.setAs(Boolean.TRUE);
                    }
                    splashConfig.setDefaults((Context)activity);
                    i.a(activity, true);
                    Intent intent = new Intent((Context)activity, i.a((Context)activity, OverlayActivity.class, AppWallActivity.class));
                    intent.putExtra("SplashConfig", (Serializable)splashConfig);
                    intent.putExtra("AdPreference", (Serializable)adPreferences);
                    intent.putExtra("testMode", testMode);
                    intent.putExtra("fullscreen", c.a(activity));
                    intent.putExtra("placement", AdPreferences.Placement.INAPP_SPLASH.getIndex());
                    intent.addFlags(1140883456);
                    activity.startActivity(intent);
                    BroadcastReceiver broadcastReceiver = new BroadcastReceiver(activity, splashHideListener){
                        final /* synthetic */ Activity a;
                        final /* synthetic */ SplashHideListener b;
                        {
                            this.a = activity;
                            this.b = splashHideListener;
                        }

                        public final void onReceive(Context context, Intent intent) {
                            i.a(this.a, false);
                            if (this.b != null) {
                                this.b.splashHidden();
                            }
                            com.startapp.common.b.a((Context)this.a).a((BroadcastReceiver)this);
                        }
                    };
                    com.startapp.common.b.a((Context)activity).a(broadcastReceiver, new IntentFilter("com.startapp.android.splashHidden"));
                    return;
                }
                catch (Exception exception) {
                    if (splashHideListener == null) break block5;
                    splashHideListener.splashHidden();
                    f.a((Context)activity, d.b, "StartAppAd.showSplash - unexpected Error occurd", exception.getMessage(), "");
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
        StartAppAd.showSplash(activity, bundle, new SplashConfig(), adPreferences);
    }

    public void close() {
        if (this.callbackBroadcastReceiver != null) {
            com.startapp.common.b.a(this.context).a(this.callbackBroadcastReceiver);
        }
        Intent intent = new Intent("com.startapp.android.CloseAdActivity");
        com.startapp.common.b.a(this.context).a(intent);
    }

    protected String getAdHtml() {
        g g2 = com.startapp.android.publish.cache.a.a().b(this.adKey);
        if (g2 != null && g2 instanceof e) {
            return ((e)((Object)g2)).e();
        }
        return null;
    }

    protected String getLauncherName() {
        g g2 = com.startapp.android.publish.cache.a.a().b(this.adKey);
        if (g2 != null) {
            return g2.a_();
        }
        return i.c(this.getContext());
    }

    @Override
    protected AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        if (placement == null && this.adKey != null && com.startapp.android.publish.cache.a.a().b(this.adKey) != null) {
            placement = ((Ad)((Object)com.startapp.android.publish.cache.a.a().b(this.adKey))).getPlacement();
        }
        return placement;
    }

    @Override
    public Ad.AdState getState() {
        g g2 = com.startapp.android.publish.cache.a.a().b(this.adKey);
        if (g2 != null) {
            return g2.getState();
        }
        return Ad.AdState.UN_INITIALIZED;
    }

    @Override
    public boolean isBelowMinCPM() {
        g g2 = com.startapp.android.publish.cache.a.a().b(this.adKey);
        if (g2 != null) {
            return g2.isBelowMinCPM();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        return i.a(this.context);
    }

    @Override
    public boolean isReady() {
        g g2 = com.startapp.android.publish.cache.a.a().b(this.adKey);
        if (g2 != null) {
            return g2.isReady();
        }
        return false;
    }

    @Deprecated
    @Override
    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener) {
        if (!this.canShowAd()) {
            if (adEventListener != null) {
                this.setErrorMessage("serving ads disabled");
                adEventListener.onFailedToReceiveAd((Ad)this);
            }
            return false;
        }
        this.adKey = com.startapp.android.publish.cache.a.a().a(this.context, (StartAppAd)this, this.adMode, adPreferences, adEventListener);
        return this.adKey != null;
    }

    public void loadAd() {
        this.loadAd(AdMode.AUTOMATIC, new AdPreferences(), null);
    }

    public void loadAd(AdMode adMode) {
        this.loadAd(adMode, new AdPreferences(), null);
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener) {
        this.loadAd(adMode, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        this.loadAd(adMode, adPreferences, null);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        StartAppAd.super.setAdMode(adMode);
        StartAppAd.super.setAdPrefs(adPreferences);
        try {
            this.load(adPreferences, adEventListener);
            return;
        }
        catch (Exception exception) {
            f.a(this.context, d.b, "StartAppAd.loadAd - unexpected Error occurd", exception.getMessage(), "");
            if (adEventListener != null) {
                adEventListener.onFailedToReceiveAd((Ad)this);
            }
            return;
        }
    }

    public void loadAd(AdEventListener adEventListener) {
        this.loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdPreferences adPreferences) {
        this.loadAd(AdMode.AUTOMATIC, adPreferences, null);
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        this.loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    @Override
    protected void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public com.startapp.android.publish.cache.c loadSplash(AdPreferences adPreferences, AdEventListener adEventListener) {
        this.adKey = com.startapp.android.publish.cache.a.a().a(this.context, (StartAppAd)this, adPreferences, adEventListener);
        return this.adKey;
    }

    public void onBackPressed() {
        if (!this.showAd("exit_ad")) {
            h.a(TAG, 3, "Could not display StartAppAd onBackPressed");
        }
        m.a().l();
    }

    public void onPause() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int n2 = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (n2 == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (n2 == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (n2 == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (n2 == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (n2 == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences)serializable;
        }
    }

    public void onResume() {
        if (!this.isReady()) {
            this.loadAd();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int n2;
        switch (3.a[this.adMode.ordinal()]) {
            default: {
                n2 = 0;
                break;
            }
            case 4: {
                n2 = 4;
                break;
            }
            case 3: {
                n2 = 3;
                break;
            }
            case 2: {
                n2 = 2;
                break;
            }
            case 1: {
                n2 = 1;
            }
        }
        if (this.adPreferences != null) {
            bundle.putSerializable("AdPrefs", (Serializable)this.adPreferences);
        }
        bundle.putInt("AdMode", n2);
    }

    public void setVideoListener(VideoListener videoListener) {
        this.videoListener = videoListener;
    }

    protected com.startapp.android.publish.adsCommon.a.f shouldDisplayAd(String string, AdPreferences.Placement placement) {
        return b.a().E().a(placement, string);
    }

    @Deprecated
    @Override
    public boolean show() {
        return this.show(null, null);
    }

    @Deprecated
    public boolean show(String string, AdDisplayListener adDisplayListener) {
        boolean bl2;
        com.startapp.android.publish.adsCommon.a.f f2;
        boolean bl3;
        block24 : {
            block21 : {
                block23 : {
                    block17 : {
                        block18 : {
                            block19 : {
                                block20 : {
                                    AdPreferences.Placement placement;
                                    block22 : {
                                        this.setNotDisplayedReason(null);
                                        this.callback = new com.startapp.android.publish.adsCommon.adListeners.a(adDisplayListener);
                                        boolean bl4 = this.canShowAd();
                                        bl2 = false;
                                        if (!bl4) {
                                            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.SERVING_ADS_DISABLED);
                                            this.callback.adNotDisplayed((Ad)this);
                                            return false;
                                        }
                                        if (this.adKey == null) {
                                            this.loadAd();
                                        }
                                        if (!StartAppAd.super.isAppOnForeground()) break block17;
                                        if (!this.isNetworkAvailable()) break block18;
                                        if (!this.isReady()) break block19;
                                        placement = this.getPlacement();
                                        f2 = this.shouldDisplayAd(string, placement);
                                        if (!f2.a()) break block20;
                                        g g2 = this.ad = com.startapp.android.publish.cache.a.a().a(this.adKey);
                                        bl2 = false;
                                        if (g2 == null) break block21;
                                        if (this.placement != AdPreferences.Placement.INAPP_SPLASH || !m.a().m()) break block22;
                                        h.a(TAG, 3, "App in background, can't display splash");
                                        break block23;
                                    }
                                    boolean bl5 = this.ad.a(string);
                                    if (bl5) {
                                        com.startapp.android.publish.adsCommon.a.b.a().a(new a(placement, string));
                                    } else if (this.ad instanceof Ad) {
                                        this.setNotDisplayedReason(((Ad)((Object)this.ad)).getNotDisplayedReason());
                                    }
                                    this.loadAd(this.adMode, this.adPreferences, null);
                                    bl2 = bl5;
                                    break block21;
                                }
                                this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.AD_RULES);
                                boolean bl6 = Constants.a();
                                bl2 = false;
                                if (bl6) {
                                    j.a().a(this.context, f2.b());
                                    bl2 = false;
                                }
                                break block21;
                            }
                            bl3 = this.adMode != AdMode.REWARDED_VIDEO && this.adMode != AdMode.VIDEO && StartAppAd.super.showPreparedVideoFallbackAd(string);
                            if (!bl3) {
                                this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.AD_NOT_READY);
                            }
                            bl2 = false;
                            f2 = null;
                            break block24;
                        }
                        this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM);
                        bl2 = false;
                        f2 = null;
                        break block21;
                    }
                    f2 = null;
                }
                this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.APP_IN_BACKGROUND);
            }
            bl3 = false;
        }
        if (bl2 || bl3) {
            StartAppAd.super.registerBroadcastReceiver("com.startapp.android.HideDisplayBroadcastListener");
            StartAppAd.super.registerBroadcastReceiver("com.startapp.android.ShowDisplayBroadcastListener");
            StartAppAd.super.registerBroadcastReceiver("com.startapp.android.ShowFailedDisplayBroadcastListener");
            StartAppAd.super.registerBroadcastReceiver("com.startapp.android.OnClickCallback");
            StartAppAd.super.registerBroadcastReceiver("com.startapp.android.OnVideoCompleted");
        }
        if (!bl2) {
            if (this.getNotDisplayedReason() == null) {
                this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR);
            }
            if (this.getNotDisplayedReason() != AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM) {
                if (this.getNotDisplayedReason() != null && this.getNotDisplayedReason() != AdDisplayListener.NotDisplayedReason.AD_RULES) {
                    if (bl3) {
                        Context context = this.context;
                        g g3 = this.ad != null ? this.ad : com.startapp.android.publish.cache.a.a().b(this.adKey);
                        c.a(context, c.a(g3), string, AdDisplayListener.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK.toString());
                    } else {
                        Context context = this.context;
                        g g4 = this.ad != null ? this.ad : com.startapp.android.publish.cache.a.a().b(this.adKey);
                        c.a(context, c.a(g4), string, this.getNotDisplayedReason().toString());
                    }
                } else if (f2 != null) {
                    c.a(this.context, c.a(com.startapp.android.publish.cache.a.a().b(this.adKey)), string, f2.c());
                }
            }
            this.ad = null;
            if (!bl3 && this.callback != null) {
                this.callback.adNotDisplayed((Ad)this);
            }
        }
        return bl2;
    }

    public boolean showAd() {
        return this.showAd(null, null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return this.showAd(null, adDisplayListener);
    }

    public boolean showAd(String string) {
        return this.showAd(string, null);
    }

    public boolean showAd(String string, AdDisplayListener adDisplayListener) {
        try {
            boolean bl2 = this.show(string, adDisplayListener);
            return bl2;
        }
        catch (Exception exception) {
            f.a(this.context, d.b, "StartAppAd.showAd - unexpected Error occurd", exception.getMessage(), "");
            this.setNotDisplayedReason(AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR);
            if (adDisplayListener != null) {
                adDisplayListener.adNotDisplayed(null);
            }
            return false;
        }
    }

}

