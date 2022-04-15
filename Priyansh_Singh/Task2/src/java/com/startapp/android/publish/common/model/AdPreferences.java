package com.startapp.android.publish.common.model;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.SDKAdPreferences;
import com.startapp.android.publish.adsCommon.m;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AdPreferences
implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 1L;
    protected String advertiserId;
    private String age;
    private Boolean ai;
    private Boolean as;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    protected String country;
    protected boolean forceFullpage;
    protected boolean forceOfferWall2D;
    protected boolean forceOfferWall3D;
    protected boolean forceOverlay;
    private SDKAdPreferences.Gender gender;
    private boolean hardwareAccelerated;
    private String keywords;
    private Double latitude;
    private Double longitude;
    protected Double minCpm;
    protected Set<String> packageInclude;
    private String productId;
    private String publisherId;
    protected String template;
    private boolean testMode;
    protected Ad.AdType type;
    private boolean videoMuted;

    public AdPreferences() {
        this.country = null;
        this.advertiserId = null;
        this.template = null;
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.publisherId = null;
        this.productId = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.hardwareAccelerated = m.a().d();
        this.categories = null;
        this.categoriesExclude = null;
    }

    public AdPreferences(AdPreferences adPreferences) {
        this.country = null;
        this.advertiserId = null;
        this.template = null;
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.publisherId = null;
        this.productId = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.hardwareAccelerated = m.a().d();
        this.categories = null;
        this.categoriesExclude = null;
        this.country = adPreferences.country;
        this.advertiserId = adPreferences.advertiserId;
        this.template = adPreferences.template;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.publisherId = adPreferences.publisherId;
        this.productId = adPreferences.productId;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.ai = adPreferences.ai;
        this.as = adPreferences.as;
        this.videoMuted = adPreferences.videoMuted;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
    }

    @Deprecated
    public AdPreferences(String string, String string2) {
        this.country = null;
        this.advertiserId = null;
        this.template = null;
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.publisherId = null;
        this.productId = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.hardwareAccelerated = m.a().d();
        this.categories = null;
        this.categoriesExclude = null;
        this.publisherId = string;
        this.productId = string2;
    }

    @Deprecated
    public AdPreferences(String string, String string2, String string3) {
        this.country = null;
        this.advertiserId = null;
        this.template = null;
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.publisherId = null;
        this.productId = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.ai = null;
        this.as = null;
        this.videoMuted = false;
        this.hardwareAccelerated = m.a().d();
        this.categories = null;
        this.categoriesExclude = null;
        this.publisherId = string;
        this.productId = string2;
    }

    public AdPreferences addCategory(String string) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add((Object)string);
        return this;
    }

    public AdPreferences addCategoryExclude(String string) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add((Object)string);
        return this;
    }

    public String getAge(Context context) {
        if (this.age == null) {
            return m.a().g(context).getAge();
        }
        return this.age;
    }

    public Boolean getAi() {
        return this.ai;
    }

    public Boolean getAs() {
        return this.as;
    }

    public Set<String> getCategories() {
        return this.categories;
    }

    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    public SDKAdPreferences.Gender getGender(Context context) {
        if (this.gender == null) {
            return m.a().g(context).getGender();
        }
        return this.gender;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getMinCpm() {
        return this.minCpm;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public Ad.AdType getType() {
        return this.type;
    }

    protected boolean isHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public boolean isSimpleToken() {
        return true;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    public AdPreferences setAge(Integer n2) {
        this.age = Integer.toString((int)n2);
        return this;
    }

    public AdPreferences setAge(String string) {
        this.age = string;
        return this;
    }

    public AdPreferences setAi(Boolean bl2) {
        this.ai = bl2;
        return this;
    }

    public AdPreferences setAs(Boolean bl2) {
        this.as = bl2;
        return this;
    }

    public AdPreferences setGender(SDKAdPreferences.Gender gender) {
        this.gender = gender;
        return this;
    }

    public AdPreferences setKeywords(String string) {
        this.keywords = string;
        return this;
    }

    public AdPreferences setLatitude(double d2) {
        this.latitude = d2;
        return this;
    }

    public AdPreferences setLongitude(double d2) {
        this.longitude = d2;
        return this;
    }

    public void setMinCpm(Double d2) {
        this.minCpm = d2;
    }

    @Deprecated
    public AdPreferences setProductId(String string) {
        this.productId = string;
        return this;
    }

    @Deprecated
    public AdPreferences setPublisherId(String string) {
        this.publisherId = string;
        return this;
    }

    public AdPreferences setTestMode(boolean bl2) {
        this.testMode = bl2;
        return this;
    }

    public void setType(Ad.AdType adType) {
        this.type = adType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdPreferences [publisherId=");
        stringBuilder.append(this.publisherId);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", testMode=");
        stringBuilder.append(this.testMode);
        stringBuilder.append(", longitude=");
        stringBuilder.append((Object)this.longitude);
        stringBuilder.append(", latitude=");
        stringBuilder.append((Object)this.latitude);
        stringBuilder.append(", keywords=");
        stringBuilder.append(this.keywords);
        stringBuilder.append(", minCPM=");
        stringBuilder.append((Object)this.minCpm);
        stringBuilder.append(", categories=");
        stringBuilder.append(this.categories);
        stringBuilder.append(", categoriesExclude=");
        stringBuilder.append(this.categoriesExclude);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class Placement
    extends Enum<Placement> {
        private static final /* synthetic */ Placement[] $VALUES;
        public static final /* enum */ Placement DEVICE_SIDEBAR;
        public static final /* enum */ Placement INAPP_BANNER;
        public static final /* enum */ Placement INAPP_BROWSER;
        public static final /* enum */ Placement INAPP_FULL_SCREEN;
        public static final /* enum */ Placement INAPP_NATIVE;
        public static final /* enum */ Placement INAPP_OFFER_WALL;
        public static final /* enum */ Placement INAPP_OVERLAY;
        public static final /* enum */ Placement INAPP_RETURN;
        public static final /* enum */ Placement INAPP_SPLASH;
        private int index;

        static {
            INAPP_FULL_SCREEN = new Placement(1);
            INAPP_BANNER = new Placement(2);
            INAPP_OFFER_WALL = new Placement(3);
            INAPP_SPLASH = new Placement(4);
            INAPP_OVERLAY = new Placement(5);
            INAPP_NATIVE = new Placement(6);
            DEVICE_SIDEBAR = new Placement(7);
            INAPP_RETURN = new Placement(8);
            INAPP_BROWSER = new Placement(9);
            Placement[] arrplacement = new Placement[]{INAPP_FULL_SCREEN, INAPP_BANNER, INAPP_OFFER_WALL, INAPP_SPLASH, INAPP_OVERLAY, INAPP_NATIVE, DEVICE_SIDEBAR, INAPP_RETURN, INAPP_BROWSER};
            $VALUES = arrplacement;
        }

        private Placement(int n3) {
            this.index = n3;
        }

        public static Placement getByIndex(int n2) {
            Placement placement = INAPP_FULL_SCREEN;
            Placement[] arrplacement = Placement.values();
            for (int i2 = 0; i2 < arrplacement.length; ++i2) {
                if (arrplacement[i2].getIndex() != n2) continue;
                placement = arrplacement[i2];
            }
            return placement;
        }

        public static Placement valueOf(String string) {
            return (Placement)Enum.valueOf(Placement.class, (String)string);
        }

        public static Placement[] values() {
            return (Placement[])$VALUES.clone();
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean isInterstitial() {
            return this == INAPP_FULL_SCREEN || this == INAPP_OFFER_WALL || this == INAPP_SPLASH || this == INAPP_OVERLAY;
            {
            }
        }
    }

}

