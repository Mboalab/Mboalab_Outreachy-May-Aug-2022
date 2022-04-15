package com.startapp.android.publish.common.model;

import android.content.Context;
import android.telephony.NeighboringCellInfo;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.SDKAdPreferences;
import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.a;
import com.startapp.common.a.c;
import java.util.HashSet;
import java.util.Set;

public class GetAdRequest
extends BaseRequest {
    private int adsDisplayed;
    private int adsNumber = 1;
    private String advertiserId = null;
    private String age;
    private Boolean ai;
    private Boolean as;
    private Set<String> categories = null;
    private Set<String> categoriesExclude = null;
    private boolean contentAd;
    private String country = null;
    private boolean engInclude = true;
    private SDKAdPreferences.Gender gender;
    private Boolean isAutoDateTimeEnabled;
    private boolean isDisableTwoClicks = b.a().C();
    private boolean isHardwareAccelerated = true;
    private String keywords;
    private Double minCpm;
    private String moreImg;
    private int offset = 0;
    private Set<String> packageExclude = null;
    private Set<String> packageInclude = null;
    private AdPreferences.Placement placement;
    private String primaryImg;
    private String profileId;
    private Pair<String, String> simpleToken;
    private String template;
    private boolean testMode;
    private long timeSinceSessionStart = System.currentTimeMillis() - g.d().b();
    private Ad.AdType type = null;

    public GetAdRequest() {
        if (!i.a()) {
            this.adsDisplayed = com.startapp.android.publish.adsCommon.a.b.a().d();
        }
        this.profileId = MetaData.getInstance().getProfileId();
    }

    private void addParams(e e2) {
        e2.a("placement", this.placement.name(), true);
        e2.a("testMode", Boolean.toString((boolean)this.testMode), false);
        e2.a("gender", (Object)this.gender, false);
        e2.a("age", this.age, false);
        e2.a("keywords", this.keywords, false);
        e2.a("template", this.template, false);
        e2.a("adsNumber", Integer.toString((int)this.adsNumber), false);
        e2.a("category", this.categories, false);
        e2.a("categoryExclude", this.categoriesExclude, false);
        e2.a("packageExclude", this.packageExclude, false);
        e2.a("offset", Integer.toString((int)this.offset), false);
        e2.a("ai", (Object)this.ai, false);
        e2.a("as", (Object)this.as, false);
        e2.a("minCPM", i.a(this.minCpm), false);
        e2.a("twoClicks", true ^ this.isDisableTwoClicks, false);
        e2.a("engInclude", Boolean.toString((boolean)this.engInclude), false);
        if (this.getType() == Ad.AdType.INTERSTITIAL || this.getType() == Ad.AdType.RICH_TEXT) {
            e2.a("type", (Object)this.type, false);
        }
        e2.a("timeSinceSessionStart", this.timeSinceSessionStart, true);
        e2.a("adsDisplayed", this.adsDisplayed, true);
        e2.a("profileId", this.profileId, false);
        e2.a("hardwareAccelerated", this.isHardwareAccelerated, false);
        e2.a("dts", (Object)this.isAutoDateTimeEnabled, false);
        e2.a("downloadingMode", "CACHE", false);
        e2.a("primaryImg", this.primaryImg, false);
        e2.a("moreImg", this.moreImg, false);
        e2.a("contentAd", Boolean.toString((boolean)this.contentAd), false);
        String string = a.d();
        e2.a(a.a(), string, true);
        String string2 = a.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getProductId());
        stringBuilder.append(this.placement.name());
        stringBuilder.append(this.getSessionId());
        stringBuilder.append(this.getSdkVersion());
        stringBuilder.append(string);
        e2.a(string2, a.b(stringBuilder.toString()), true, false);
        if (this.getCountry() != null) {
            e2.a("country", this.getCountry(), false);
        }
        if (this.getAdvertiserId() != null) {
            e2.a("advertiserId", this.getAdvertiserId(), false);
        }
        if (this.getPackageInclude() != null) {
            e2.a("packageInclude", this.getPackageInclude(), false);
        }
        e2.a((String)this.simpleToken.first, this.simpleToken.second, false);
    }

    public void addCategory(String string) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add((Object)string);
    }

    public void addCategoryExclude(String string) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add((Object)string);
    }

    public void fillAdPreferences(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        this.placement = placement;
        this.simpleToken = pair;
        this.ai = adPreferences.getAi();
        this.as = adPreferences.getAs();
        this.age = adPreferences.getAge(context);
        this.gender = adPreferences.getGender(context);
        this.keywords = adPreferences.getKeywords();
        this.testMode = adPreferences.isTestMode();
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.isHardwareAccelerated = adPreferences.isHardwareAccelerated();
        this.isAutoDateTimeEnabled = c.c(context);
        this.minCpm = adPreferences.getMinCpm();
        this.fillLocationDetails(adPreferences, context);
        this.setCountry(adPreferences.country);
        this.setAdvertiser(adPreferences.advertiserId);
        this.setTemplate(adPreferences.template);
        this.setType(adPreferences.type);
        this.setPackageInclude(adPreferences.packageInclude);
    }

    public int getAdsNumber() {
        return this.adsNumber;
    }

    public String getAdvertiserId() {
        return this.advertiserId;
    }

    public String getAge() {
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

    public String getCountry() {
        return this.country;
    }

    public SDKAdPreferences.Gender getGender() {
        return this.gender;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public double getMinCpm() {
        return this.minCpm;
    }

    public String getMoreImg() {
        return this.moreImg;
    }

    @Override
    public e getNameValueMap() {
        e e2 = super.getNameValueMap();
        if (e2 == null) {
            e2 = new d();
        }
        this.addParams(e2);
        return e2;
    }

    public int getOffset() {
        return this.offset;
    }

    public Set<String> getPackageExclude() {
        return this.packageExclude;
    }

    public Set<String> getPackageInclude() {
        return this.packageInclude;
    }

    public AdPreferences.Placement getPlacement() {
        return this.placement;
    }

    public String getPrimaryImg() {
        return this.primaryImg;
    }

    public Pair<String, String> getSimpleToken() {
        return this.simpleToken;
    }

    public String getTemplate() {
        return this.template;
    }

    public Ad.AdType getType() {
        return this.type;
    }

    public boolean isAdTypeVideo() {
        return this.getType() == Ad.AdType.VIDEO || this.getType() == Ad.AdType.REWARDED_VIDEO;
        {
        }
    }

    public boolean isContentAd() {
        return this.contentAd;
    }

    protected boolean isDisableTwoClicks() {
        return this.isDisableTwoClicks;
    }

    public boolean isEngInclude() {
        return this.engInclude;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public void setAdsNumber(int n2) {
        this.adsNumber = n2;
    }

    public void setAdvertiser(String string) {
        this.advertiserId = string;
    }

    public void setAge(String string) {
        this.age = string;
    }

    public void setAi(Boolean bl2) {
        this.ai = bl2;
    }

    public void setAs(Boolean bl2) {
        this.as = bl2;
    }

    public void setCategories(Set<String> set) {
        this.categories = set;
    }

    public void setCategoriesExclude(Set<String> set) {
        this.categoriesExclude = set;
    }

    public void setContentAd(boolean bl2) {
        this.contentAd = bl2;
    }

    public void setCountry(String string) {
        this.country = string;
    }

    public void setDisableTwoClicks(boolean bl2) {
        this.isDisableTwoClicks = bl2;
    }

    public void setEngInclude(boolean bl2) {
        this.engInclude = bl2;
    }

    public void setGender(SDKAdPreferences.Gender gender) {
        this.gender = gender;
    }

    public void setKeywords(String string) {
        this.keywords = string;
    }

    public void setMinCpm(double d2) {
        this.minCpm = d2;
    }

    public void setMoreImg(String string) {
        this.moreImg = string;
    }

    public void setOffset(int n2) {
        this.offset = n2;
    }

    public void setPackageExclude(Set<String> set) {
        this.packageExclude = set;
    }

    public void setPackageInclude(Set<String> set) {
        this.packageInclude = set;
    }

    public void setPlacement(AdPreferences.Placement placement) {
        this.placement = placement;
    }

    public void setPrimaryImg(String string) {
        this.primaryImg = string;
    }

    @Override
    public void setRetry(int n2) {
        this.retry = n2;
    }

    public void setSimpleToken(Pair<String, String> pair) {
        this.simpleToken = pair;
    }

    public void setTemplate(String string) {
        this.template = string;
    }

    public void setTestMode(boolean bl2) {
        this.testMode = bl2;
    }

    public void setType(Ad.AdType adType) {
        this.type = adType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetAdRequest [");
        StringBuilder stringBuilder2 = new StringBuilder("placement=");
        stringBuilder2.append((Object)this.placement);
        stringBuilder.append(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder(", testMode=");
        stringBuilder3.append(this.testMode);
        stringBuilder.append(stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder(", gender=");
        stringBuilder4.append((Object)this.gender);
        stringBuilder.append(stringBuilder4.toString());
        StringBuilder stringBuilder5 = new StringBuilder(", age=");
        stringBuilder5.append(this.age);
        stringBuilder.append(stringBuilder5.toString());
        StringBuilder stringBuilder6 = new StringBuilder(", ai=");
        stringBuilder6.append((Object)this.ai);
        stringBuilder.append(stringBuilder6.toString());
        StringBuilder stringBuilder7 = new StringBuilder(", as=");
        stringBuilder7.append((Object)this.as);
        stringBuilder.append(stringBuilder7.toString());
        StringBuilder stringBuilder8 = new StringBuilder(", keywords=");
        stringBuilder8.append(this.keywords);
        stringBuilder.append(stringBuilder8.toString());
        StringBuilder stringBuilder9 = new StringBuilder(", template=");
        stringBuilder9.append(this.template);
        stringBuilder.append(stringBuilder9.toString());
        StringBuilder stringBuilder10 = new StringBuilder(", adsNumber=");
        stringBuilder10.append(this.adsNumber);
        stringBuilder.append(stringBuilder10.toString());
        StringBuilder stringBuilder11 = new StringBuilder(", offset=");
        stringBuilder11.append(this.offset);
        stringBuilder.append(stringBuilder11.toString());
        StringBuilder stringBuilder12 = new StringBuilder(", categories=");
        stringBuilder12.append(this.categories);
        stringBuilder.append(stringBuilder12.toString());
        StringBuilder stringBuilder13 = new StringBuilder(", categoriesExclude=");
        stringBuilder13.append(this.categoriesExclude);
        stringBuilder.append(stringBuilder13.toString());
        StringBuilder stringBuilder14 = new StringBuilder(", packageExclude=");
        stringBuilder14.append(this.packageExclude);
        stringBuilder.append(stringBuilder14.toString());
        StringBuilder stringBuilder15 = new StringBuilder(", packageInclude=");
        stringBuilder15.append(this.packageInclude);
        stringBuilder.append(stringBuilder15.toString());
        StringBuilder stringBuilder16 = new StringBuilder(", simpleToken=");
        stringBuilder16.append(this.simpleToken);
        stringBuilder.append(stringBuilder16.toString());
        StringBuilder stringBuilder17 = new StringBuilder(", engInclude=");
        stringBuilder17.append(this.engInclude);
        stringBuilder.append(stringBuilder17.toString());
        StringBuilder stringBuilder18 = new StringBuilder(", country=");
        stringBuilder18.append(this.country);
        stringBuilder.append(stringBuilder18.toString());
        StringBuilder stringBuilder19 = new StringBuilder(", advertiserId=");
        stringBuilder19.append(this.advertiserId);
        stringBuilder.append(stringBuilder19.toString());
        StringBuilder stringBuilder20 = new StringBuilder(", type=");
        stringBuilder20.append((Object)this.type);
        stringBuilder.append(stringBuilder20.toString());
        StringBuilder stringBuilder21 = new StringBuilder(", minCpm=");
        stringBuilder21.append((Object)this.minCpm);
        stringBuilder.append(stringBuilder21.toString());
        StringBuilder stringBuilder22 = new StringBuilder(", sessionStartTime=");
        stringBuilder22.append(this.timeSinceSessionStart);
        stringBuilder.append(stringBuilder22.toString());
        StringBuilder stringBuilder23 = new StringBuilder(", adsDisplayed=");
        stringBuilder23.append(this.adsDisplayed);
        stringBuilder.append(stringBuilder23.toString());
        StringBuilder stringBuilder24 = new StringBuilder(", profileId=");
        stringBuilder24.append(this.profileId);
        stringBuilder.append(stringBuilder24.toString());
        StringBuilder stringBuilder25 = new StringBuilder(", hardwareAccelerated=");
        stringBuilder25.append(this.isHardwareAccelerated);
        stringBuilder.append(stringBuilder25.toString());
        StringBuilder stringBuilder26 = new StringBuilder(", primaryImg=");
        stringBuilder26.append(this.primaryImg);
        stringBuilder.append(stringBuilder26.toString());
        StringBuilder stringBuilder27 = new StringBuilder(", moreImg=");
        stringBuilder27.append(this.moreImg);
        stringBuilder.append(stringBuilder27.toString());
        StringBuilder stringBuilder28 = new StringBuilder(", contentAd=");
        stringBuilder28.append(this.contentAd);
        stringBuilder.append(stringBuilder28.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class CellScanResult {
        private static final char DELIMITER = ',';
        private NeighboringCellInfo cellInfo;

        public CellScanResult(NeighboringCellInfo neighboringCellInfo) {
            this.cellInfo = neighboringCellInfo;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.cellInfo != null) {
                stringBuilder.append(this.cellInfo.getCid());
                stringBuilder.append(',');
                stringBuilder.append(this.cellInfo.getRssi());
                stringBuilder.append(',');
                stringBuilder.append(this.cellInfo.getPsc());
                stringBuilder.append(',');
                stringBuilder.append(this.cellInfo.getNetworkType());
                stringBuilder.append(',');
                stringBuilder.append(this.cellInfo.getLac());
            }
            return stringBuilder.toString();
        }
    }

    public static final class VideoRequestMode
    extends Enum<VideoRequestMode> {
        private static final /* synthetic */ VideoRequestMode[] $VALUES;
        public static final /* enum */ VideoRequestMode INTERSTITIAL = new VideoRequestMode();
        public static final /* enum */ VideoRequestMode REWARDED = new VideoRequestMode();

        static {
            VideoRequestMode[] arrvideoRequestMode = new VideoRequestMode[]{INTERSTITIAL, REWARDED};
            $VALUES = arrvideoRequestMode;
        }

        public static VideoRequestMode valueOf(String string) {
            return (VideoRequestMode)Enum.valueOf(VideoRequestMode.class, (String)string);
        }

        public static VideoRequestMode[] values() {
            return (VideoRequestMode[])$VALUES.clone();
        }
    }

    public static final class VideoRequestType
    extends Enum<VideoRequestType> {
        private static final /* synthetic */ VideoRequestType[] $VALUES;
        public static final /* enum */ VideoRequestType DISABLED;
        public static final /* enum */ VideoRequestType ENABLED;
        public static final /* enum */ VideoRequestType FORCED;

        static {
            ENABLED = new VideoRequestType();
            DISABLED = new VideoRequestType();
            FORCED = new VideoRequestType();
            VideoRequestType[] arrvideoRequestType = new VideoRequestType[]{ENABLED, DISABLED, FORCED};
            $VALUES = arrvideoRequestType;
        }

        public static VideoRequestType valueOf(String string) {
            return (VideoRequestType)Enum.valueOf(VideoRequestType.class, (String)string);
        }

        public static VideoRequestType[] values() {
            return (VideoRequestType[])$VALUES.clone();
        }
    }

}

