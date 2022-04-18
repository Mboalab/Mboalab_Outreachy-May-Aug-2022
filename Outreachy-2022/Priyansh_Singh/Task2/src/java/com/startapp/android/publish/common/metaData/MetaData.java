package com.startapp.android.publish.common.metaData;
import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.metaData.LocationConfig;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.metaData.c;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.metaData.g;
import com.startapp.android.publish.common.metaData.h;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a;
import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MetaData
implements Serializable {
    public static final String DEFAULT_AD_PLATFORM_HOST;
    public static final boolean DEFAULT_ALWAYS_SEND_TOKEN = true;
    public static final String DEFAULT_ASSETS_BASE_URL_SECURED = "";
    public static final boolean DEFAULT_BT_ENABLED = false;
    public static final boolean DEFAULT_COMPRESSION_ENABLED = false;
    public static final boolean DEFAULT_INAPPBROWSER = true;
    public static final Set<String> DEFAULT_INSTALLERS_LIST;
    public static final Set<Integer> DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
    public static final long DEFAULT_LAST_KNOWN_LOCATION_THRESHOLD = 30L;
    public static final String DEFAULT_LOCATION_SOURCE = "API";
    public static final String DEFAULT_METADATA_HOST;
    public static final boolean DEFAULT_PERIODIC_INFOEVENT_ENABLED = false;
    public static final int DEFAULT_PERIODIC_INFOEVENT_INTERVAL = 360;
    public static final int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
    public static final boolean DEFAULT_PERIODIC_INFOEVENT_ON_RUN_TIME = false;
    public static final boolean DEFAULT_PERIODIC_METADATA_ENABLED = false;
    public static final int DEFAULT_PERIODIC_METADATA_INTERVAL = 360;
    public static final Set<String> DEFAULT_PRE_INSTALLED_PACKAGES;
    public static final String DEFAULT_PROFILE_ID;
    public static final int DEFAULT_SESSION_MAX_BACKGROUND_TIME = 1800;
    public static final boolean DEFAULT_SIMPLE_TOKEN_ENABLED = true;
    public static final boolean DEFAULT_WF_SCAN_ENABLED = false;
    public static final String KEY_METADATA = "metaData";
    private static transient MetaData instance;
    private static transient Object lock;
    private static final long serialVersionUID = 1L;
    private static transient c task;
    private long IABDisplayImpressionDelayInSeconds = 1L;
    private long IABVideoImpressionDelayInSeconds = 2L;
    @f(a=true)
    private h SimpleToken = new h();
    private boolean SupportIABViewability = true;
    private String adPlatformHostSecured = DEFAULT_AD_PLATFORM_HOST;
    private boolean alwaysSendToken = true;
    @f(a=true)
    private com.startapp.android.publish.adsCommon.e.a analytics = new com.startapp.android.publish.adsCommon.e.a();
    private String assetsBaseUrlSecured = "";
    @f(a=true)
    private com.startapp.android.publish.common.metaData.b btConfig = new com.startapp.android.publish.common.metaData.b();
    private boolean btEnabled = false;
    private boolean compressionEnabled = false;
    private boolean dns = false;
    private boolean inAppBrowser = true;
    @f(b="Lcom/startapp/android/publish/common/metaData/MetaData$b;")
    private b inAppBrowserPreLoad;
    @f(b="Ljava/util/HashSet;")
    private Set<String> installersList = DEFAULT_INSTALLERS_LIST;
    @f(b="Ljava/util/HashSet;")
    private Set<Integer> invalidForRetry = new HashSet();
    @f(b="Ljava/util/HashSet;")
    private Set<Integer> invalidNetworkCodesInfoEvents = DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
    private transient boolean loading = false;
    @f(a=true)
    private LocationConfig location = new LocationConfig();
    private String metaDataHostSecured = DEFAULT_METADATA_HOST;
    private transient List<d> metaDataListeners = new ArrayList();
    private String metadataUpdateVersion = AdsConstants.h;
    private int[] periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
    private boolean periodicInfoEventEnabled = false;
    private int periodicInfoEventIntervalInMinutes = 360;
    private boolean periodicInfoEventOnRunTimeEnabled = false;
    private boolean periodicMetaDataEnabled = false;
    private int periodicMetaDataIntervalInMinutes = 360;
    @f(b="Ljava/util/HashSet;")
    private Set<String> preInstalledPackages = DEFAULT_PRE_INSTALLED_PACKAGES;
    private String profileId = DEFAULT_PROFILE_ID;
    private transient boolean ready = false;
    @f(a=true)
    private g sensorsConfig = new g();
    private int sessionMaxBackgroundTime = 1800;
    private boolean simpleToken2 = true;
    private long userAgentDelayInSeconds = 5L;
    private boolean userAgentEnabled = true;
    private boolean wfScanEnabled = false;

    static {
        lock = new Object();
        Object[] arrobject = new String[]{Constants.a};
        DEFAULT_INSTALLERS_LIST = new HashSet((Collection)Arrays.asList((Object[])arrobject));
        DEFAULT_METADATA_HOST = new String(new byte[]{104, 116, 116, 112, 115, 58, 47, 47, 105, 110, 105, 116, 46, 115, 116, 97, 114, 116, 97, 112, 112, 115, 101, 114, 118, 105, 99, 101, 46, 99, 111, 109, 47, 49, 46, 52, 47});
        DEFAULT_AD_PLATFORM_HOST = new String(new byte[]{104, 116, 116, 112, 115, 58, 47, 47, 114, 101, 113, 46, 115, 116, 97, 114, 116, 97, 112, 112, 115, 101, 114, 118, 105, 99, 101, 46, 99, 111, 109, 47, 49, 46, 52, 47});
        DEFAULT_PROFILE_ID = null;
        DEFAULT_PERIODIC_INFOEVENT_INTERVALS = new int[]{60, 60, 240};
        Object[] arrobject2 = new String[]{new String(new byte[]{99, 111, 109, 46, 102, 97, 99, 101, 98, 111, 111, 107, 46, 107, 97, 116, 97, 110, 97}), new String(new byte[]{99, 111, 109, 46, 121, 97, 110, 100, 101, 120, 46, 98, 114, 111, 119, 115, 101, 114})};
        DEFAULT_PRE_INSTALLED_PACKAGES = new HashSet((Collection)Arrays.asList((Object[])arrobject2));
        Object[] arrobject3 = new Integer[]{204};
        DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS = new HashSet((Collection)Arrays.asList((Object[])arrobject3));
        instance = new MetaData();
    }

    private MetaData() {
    }
    public static void failedLoading() {
        Object object;
        ArrayList arrayList;
        Object object2 = object = lock;
        if (MetaData.getInstance().metaDataListeners != null) {
            arrayList = new ArrayList(MetaData.getInstance().metaDataListeners);
            MetaData.getInstance().metaDataListeners.clear();
        } else {
            arrayList = null;
        }
        MetaData.getInstance().loading = false;
        if (arrayList == null) return;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).b();
        }
    }

    public static MetaData getInstance() {
        return instance;
    }

    public static Object getLock() {
        return lock;
    }

    public static void init(Context context) {
        MetaData metaData = com.startapp.common.a.f.a(context, "StartappMetadata", MetaData.class);
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            if (metaData.isMetaDataVersionChanged()) {
                i.a(metaData, metaData2);
            }
            metaData.initTransientFields();
            instance = metaData;
        } else {
            instance = metaData2;
        }
        MetaData.getInstance().applyAdPlatformProtocolToHosts();
    }

    private void initTransientFields() {
        this.loading = false;
        this.ready = false;
        this.metaDataListeners = new ArrayList();
    }

    private boolean isMetaDataVersionChanged() {
        return !AdsConstants.h.equals((Object)this.metadataUpdateVersion);
    }

    public static void preCacheResources(Context context, String string) {
        if (string != null && !string.equals((Object)DEFAULT_ASSETS_BASE_URL_SECURED)) {
            if (!com.startapp.android.publish.adsCommon.Utils.a.a(context, "close_button.png", ".png") && !i.a()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("close_button.png");
                new com.startapp.common.a(stringBuilder.toString(), new a(context, "close_button"), 0).a();
            }
            if (i.a(256L)) {
                for (String string2 : AdsConstants.k) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(".png");
                    if (com.startapp.android.publish.adsCommon.Utils.a.a(context, stringBuilder.toString(), ".png")) continue;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string);
                    stringBuilder2.append(string2);
                    stringBuilder2.append(".png");
                    new com.startapp.common.a(stringBuilder2.toString(), new a(context, string2), 0).a();
                }
            }
            if (i.a(64L)) {
                for (String string3 : AdsConstants.l) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append(".png");
                    if (com.startapp.android.publish.adsCommon.Utils.a.a(context, stringBuilder.toString(), ".png")) continue;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string);
                    stringBuilder3.append(string3);
                    stringBuilder3.append(".png");
                    new com.startapp.common.a(stringBuilder3.toString(), new a(context, string3), 0).a();
                }
                if (!com.startapp.android.publish.adsCommon.Utils.a.a(context, "logo.png", ".png")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("logo.png");
                    new com.startapp.common.a(stringBuilder.toString(), new a(context, "logo"), 0).a();
                    return;
                }
            } else if (i.a(32L)) {
                for (String string4 : AdsConstants.l) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string4);
                    stringBuilder.append(".png");
                    if (com.startapp.android.publish.adsCommon.Utils.a.a(context, stringBuilder.toString(), ".png")) continue;
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(string);
                    stringBuilder4.append(string4);
                    stringBuilder4.append(".png");
                    new com.startapp.common.a(stringBuilder4.toString(), new a(context, string4), 0).a();
                }
            }
        }
    }

    private String replaceAdProtocol(String string, String string2) {
        if (string != null) {
            return string.replace((CharSequence)"%AdPlatformProtocol%", (CharSequence)"1.4");
        }
        return string2;
    }
    public static void update(Context context, MetaData metaData) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            metaData.metaDataListeners = MetaData.getInstance().metaDataListeners;
            instance = metaData;
            if (Constants.a().booleanValue()) {
                com.startapp.common.a.h.a(3, "MetaData received:");
                com.startapp.common.a.h.a(3, com.startapp.common.b.b.a(metaData));
            }
            MetaData.getInstance().applyAdPlatformProtocolToHosts();
            metaData.metadataUpdateVersion = AdsConstants.h;
            com.startapp.common.a.f.b(context, "StartappMetadata", metaData);
            com.startapp.common.a.h.a(3, "MetaData saved:");
            MetaData.getInstance().loading = false;
            MetaData.getInstance().ready = true;
            if (MetaData.getInstance().metaDataListeners != null) {
                ArrayList arrayList = new ArrayList(MetaData.getInstance().metaDataListeners);
                MetaData.getInstance().metaDataListeners.clear();
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    ((d)iterator.next()).a();
                }
            }
            k.b(context, "totalSessions", 1 + k.a(context, "totalSessions", 0));
            task = null;
            return;
        }
    }
    public void addMetaDataListener(d d2) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            this.metaDataListeners.add((Object)d2);
            return;
        }
    }

    public void applyAdPlatformProtocolToHosts() {
        this.adPlatformHostSecured = this.replaceAdProtocol(this.adPlatformHostSecured, DEFAULT_AD_PLATFORM_HOST);
        this.metaDataHostSecured = this.replaceAdProtocol(this.metaDataHostSecured, DEFAULT_METADATA_HOST);
    }

    public boolean canShowAd() {
        return !this.dns;
    }

    public String getAdPlatformHost() {
        if (AdsConstants.OVERRIDE_HOST != null) {
            return AdsConstants.OVERRIDE_HOST;
        }
        if (this.adPlatformHostSecured != null) {
            return this.adPlatformHostSecured;
        }
        return DEFAULT_AD_PLATFORM_HOST;
    }

    public com.startapp.android.publish.adsCommon.e.a getAnalyticsConfig() {
        return this.analytics;
    }

    public String getAssetsBaseUrl() {
        if (this.assetsBaseUrlSecured != null) {
            return this.assetsBaseUrlSecured;
        }
        return DEFAULT_ASSETS_BASE_URL_SECURED;
    }

    public com.startapp.android.publish.common.metaData.b getBluetoothConfig() {
        return this.btConfig;
    }

    public long getIABDisplayImpressionDelayInSeconds() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public long getIABVideoImpressionDelayInSeconds() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public b getInAppBrowserPreLoad() {
        return this.inAppBrowserPreLoad;
    }

    public Set<String> getInstallersList() {
        return this.installersList;
    }

    public Set<Integer> getInvalidForRetry() {
        if (this.invalidForRetry != null) {
            return this.invalidForRetry;
        }
        return new HashSet();
    }

    public Set<Integer> getInvalidNetworkCodesInfoEvents() {
        if (this.invalidNetworkCodesInfoEvents != null) {
            return this.invalidNetworkCodesInfoEvents;
        }
        return DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
    }

    public LocationConfig getLocationConfig() {
        return this.location;
    }

    public String getMetaDataHost() {
        if (AdsConstants.OVERRIDE_HOST != null) {
            return AdsConstants.OVERRIDE_HOST;
        }
        return this.metaDataHostSecured;
    }

    public int getPeriodicInfoEventIntervalInMinutes(Context context) {
        int n2;
        if (this.periodicEventIntMin == null || this.periodicEventIntMin.length < 3) {
            this.periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
        }
        if (com.startapp.common.a.c.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            n2 = this.periodicEventIntMin[0];
            if (n2 <= 0) {
                return DEFAULT_PERIODIC_INFOEVENT_INTERVALS[0];
            }
        } else if (com.startapp.common.a.c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            n2 = this.periodicEventIntMin[1];
            if (n2 <= 0) {
                return DEFAULT_PERIODIC_INFOEVENT_INTERVALS[1];
            }
        } else {
            n2 = this.periodicEventIntMin[2];
        }
        return n2;
    }

    public int getPeriodicMetaDataInterval() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public Set<String> getPreInstalledPackages() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = DEFAULT_PRE_INSTALLED_PACKAGES;
        }
        return Collections.unmodifiableSet(set);
    }

    public String getProfileId() {
        return this.profileId;
    }

    public g getSensorsConfig() {
        return this.sensorsConfig;
    }

    public long getSessionMaxBackgroundTime() {
        return TimeUnit.SECONDS.toMillis((long)this.sessionMaxBackgroundTime);
    }

    public h getSimpleTokenConfig() {
        return this.SimpleToken;
    }

    public long getUserAgentDelayInSeconds() {
        return this.userAgentDelayInSeconds;
    }

    public boolean isAlwaysSendToken() {
        return this.alwaysSendToken;
    }

    public boolean isCompressionEnabled() {
        return this.compressionEnabled;
    }

    public boolean isInAppBrowser() {
        return i.a(256L) && this.inAppBrowser;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public boolean isPeriodicInfoEventEnabled() {
        return this.periodicInfoEventEnabled;
    }

    public boolean isPeriodicInfoEventOnRunTimeEnabled() {
        return this.periodicInfoEventOnRunTimeEnabled;
    }

    public boolean isPeriodicMetaDataEnabled() {
        return this.periodicMetaDataEnabled;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean isSimpleToken2() {
        return this.simpleToken2;
    }

    public boolean isSupportIABViewability() {
        return this.SupportIABViewability;
    }

    public boolean isUserAgentEnabled() {
        return this.userAgentEnabled;
    }

    public boolean isWfScanEnabled() {
        return this.wfScanEnabled;
    }

    public void loadFromServer(Context context, AdPreferences adPreferences, MetaDataRequest.a a2, boolean bl2, d d2) {
        this.loadFromServer(context, adPreferences, a2, bl2, d2, false);
    }
    public void loadFromServer(Context context, AdPreferences adPreferences, MetaDataRequest.a a2, boolean bl2, d d2, boolean bl3) {
        Object object;
        if (!bl2 && d2 != null) {
            d2.a();
        }
        Object object2 = object = lock;
        synchronized (object2) {
            if (MetaData.getInstance().isReady() && !bl3) {
                if (bl2 && d2 != null) {
                    d2.a();
                }
                return;
            }
            if (!MetaData.getInstance().isLoading() || bl3) {
                c c2;
                this.loading = true;
                this.ready = false;
                if (task != null) {
                    task.b();
                }
                task = c2 = new c(context, adPreferences, a2);
                c2.a();
            }
            if (bl2 && d2 != null) {
                MetaData.getInstance().addMetaDataListener(d2);
            }
            return;
        }
    }
    public void removeMetaDataListener(d d2) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            this.metaDataListeners.remove((Object)d2);
            return;
        }
    }

    public void setAlwaysSendToken(boolean bl2) {
        this.alwaysSendToken = bl2;
    }

    public void setCompressionEnabled(boolean bl2) {
        this.compressionEnabled = bl2;
    }

    public void setInAppBrowser(boolean bl2) {
        this.inAppBrowser = bl2;
    }

    public void setInAppBrowserPreLoad(b b2) {
        this.inAppBrowserPreLoad = b2;
    }

    public void setInstallersList(Set<String> set) {
        this.installersList = set;
    }

    public void setPeriodicInfoEventEnabled(boolean bl2) {
        this.periodicInfoEventEnabled = bl2;
    }

    public void setPeriodicInfoEventIntervalInMinutes(int n2) {
        this.periodicInfoEventIntervalInMinutes = n2;
    }

    public void setPeriodicMetaDataEnabled(boolean bl2) {
        this.periodicMetaDataEnabled = bl2;
    }

    public void setPeriodicMetaDataInterval(int n2) {
        this.periodicMetaDataIntervalInMinutes = n2;
    }

    public void setPreInstalledPackages(Set<String> set) {
        this.preInstalledPackages = set;
    }

    public void setReady(boolean bl2) {
        this.ready = bl2;
    }

    public void setSimpleToken2(boolean bl2) {
        this.simpleToken2 = bl2;
    }

    protected void setSimpleTokenConfig(h h2) {
        this.SimpleToken = h2;
    }

    public static class a
    implements a.a {
        Context a;
        String b;

        public a(Context context, String string) {
            this.a = context;
            this.b = string;
        }

        @Override
        public void a(Bitmap bitmap, int n2) {
            if (bitmap != null) {
                com.startapp.android.publish.adsCommon.Utils.a.a(this.a, bitmap, this.b, ".png");
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final b a = new b();
        public static final b b = new b();
        public static final b c = new b();
        private static final b[] d;

        static {
            b[] arrb = new b[]{a, b, c};
            d = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])d.clone();
        }
    }

}

