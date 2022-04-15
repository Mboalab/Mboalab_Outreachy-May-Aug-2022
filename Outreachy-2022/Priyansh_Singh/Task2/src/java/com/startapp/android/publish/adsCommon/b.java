/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.common.metaData.MetaDataStyle
 *  com.startapp.common.a.f
 *  com.startapp.common.b.f
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.common.metaData.MetaDataStyle;
import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class b
implements Serializable {
    public static final Integer a;
    public static final Integer b;
    public static final Set<String> c;
    public static final Integer d;
    public static final Integer e;
    public static final Integer f;
    private static transient Object g;
    private static transient b h;
    private static final long serialVersionUID = 1L;
    private String acMetadataUpdateVersion = AdsConstants.h;
    @f(a=true)
    private e adRules = new e();
    private boolean appPresence = true;
    private boolean autoInterstitialEnabled = true;
    private Integer backgroundGradientBottom = -14606047;
    private Integer backgroundGradientTop = -14606047;
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableInAppStore = false;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private boolean disableTwoClicks = false;
    private boolean enableForceExternalBrowser = true;
    private boolean enableSmartRedirect = true;
    private boolean enforceForeground = false;
    private int forceExternalBrowserDaysInterval = 7;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer homeProbability3D = 80;
    private Integer itemDescriptionTextColor = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_COLOR;
    @f(b="Ljava/util/HashSet;")
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_DECORATION;
    private Integer itemDescriptionTextSize = MetaDataStyle.DEFAULT_ITEM_DESC_TEXT_SIZE;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_COLOR;
    @f(b="Ljava/util/HashSet;")
    private Set<String> itemTitleTextDecoration = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_DECORATION;
    private Integer itemTitleTextSize = MetaDataStyle.DEFAULT_ITEM_TITLE_TEXT_SIZE;
    private Integer maxAds = 10;
    private Integer poweredByBackgroundColor = e;
    private Integer poweredByTextColor = f;
    private Integer probability3D = 0;
    private long returnAdMinBackgroundTime = 300L;
    private int smartRedirectTimeout = 5;
    @f(b="Ljava/util/HashMap;", c="Lcom/startapp/android/publish/common/metaData/MetaDataStyle;")
    private HashMap<String, MetaDataStyle> templates = new HashMap();
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleLineColor = d;
    private Integer titleTextColor = b;
    @f(b="Ljava/util/HashSet;")
    private Set<String> titleTextDecoration = c;
    private Integer titleTextSize = a;
    @f(a=true)
    private n video = new n();

    static {
        g = new Object();
        a = 18;
        b = -1;
        c = new HashSet((Collection)Arrays.asList((Object[])new String[]{"BOLD"}));
        d = -16777216;
        e = -14803426;
        f = -1;
        h = new b();
    }

    private boolean N() {
        return !AdsConstants.h.equals((Object)this.acMetadataUpdateVersion);
    }

    private void O() {
        this.adRules.b();
    }

    public static b a() {
        return h;
    }

    public static void a(Context context) {
        b b2 = (b)com.startapp.common.a.f.a((Context)context, (String)"StartappAdsMetadata", b.class);
        b b3 = new b();
        if (b2 != null) {
            if (b2.N()) {
                i.a(b2, b3);
            }
            b2.O();
            h = b2;
            return;
        }
        h = b3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, b b2) {
        Object object;
        Object object2 = object = g;
        synchronized (object2) {
            b2.acMetadataUpdateVersion = AdsConstants.h;
            h = b2;
            com.startapp.common.a.f.a((Context)context, (String)"StartappAdsMetadata", (Serializable)b2);
            return;
        }
    }

    public long A() {
        return TimeUnit.SECONDS.toMillis((long)this.smartRedirectTimeout);
    }

    public boolean B() {
        return this.enableSmartRedirect;
    }

    public boolean C() {
        return this.disableTwoClicks;
    }

    public boolean D() {
        return this.appPresence;
    }

    public e E() {
        return this.adRules;
    }

    public boolean F() {
        return this.disableInAppStore;
    }

    public n G() {
        return this.video;
    }

    public boolean H() {
        return this.autoInterstitialEnabled;
    }

    public int I() {
        return this.defaultActivitiesBetweenAds;
    }

    public int J() {
        return this.defaultSecondsBetweenAds;
    }

    public int K() {
        return this.forceExternalBrowserDaysInterval;
    }

    public boolean L() {
        return this.enableForceExternalBrowser;
    }

    public boolean M() {
        return this.enforceForeground;
    }

    public MetaDataStyle a(String string) {
        return (MetaDataStyle)this.templates.get((Object)string);
    }

    public int b() {
        return this.fullpageOfferWallProbability;
    }

    public int c() {
        return this.fullpageOverlayProbability;
    }

    public int d() {
        return this.probability3D;
    }

    public int e() {
        return this.backgroundGradientTop;
    }

    public int f() {
        return this.backgroundGradientBottom;
    }

    public int g() {
        return this.maxAds;
    }

    public Integer h() {
        return this.titleBackgroundColor;
    }

    public String i() {
        return this.titleContent;
    }

    public Integer j() {
        return this.titleTextSize;
    }

    public Integer k() {
        return this.titleTextColor;
    }

    public Set<String> l() {
        return this.titleTextDecoration;
    }

    public Integer m() {
        return this.titleLineColor;
    }

    public int n() {
        return this.itemGradientTop;
    }

    public int o() {
        return this.itemGradientBottom;
    }

    public Integer p() {
        return this.itemTitleTextSize;
    }

    public Integer q() {
        return this.itemTitleTextColor;
    }

    public Set<String> r() {
        return this.itemTitleTextDecoration;
    }

    public Integer s() {
        return this.itemDescriptionTextSize;
    }

    public Integer t() {
        return this.itemDescriptionTextColor;
    }

    public Set<String> u() {
        return this.itemDescriptionTextDecoration;
    }

    public Integer v() {
        return this.poweredByBackgroundColor;
    }

    public Integer w() {
        return this.poweredByTextColor;
    }

    public long x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    public boolean y() {
        return this.disableReturnAd;
    }

    public boolean z() {
        return this.disableSplashAd;
    }
}

