/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.net.wifi.ScanResult
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.SystemClock
 *  android.telephony.CellLocation
 *  android.telephony.TelephonyManager
 *  android.telephony.cdma.CdmaCellLocation
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.NameValueSerializer;
import com.startapp.android.publish.adsCommon.Utils.c;
import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.LocationConfig;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.b;
import com.startapp.common.a.g;
import com.startapp.common.a.i;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class BaseRequest
implements NameValueSerializer {
    private static final String OS = "android";
    private String androidId;
    private int appCode;
    private Boolean appOnForeground;
    private String appVersion;
    private String blat;
    private String blon;
    private String bssid;
    private String cellSignalLevel;
    private String cellTimingAdv;
    private String cid;
    private String clientSessionId;
    private float density;
    private String deviceIP;
    private String deviceVersion;
    private Map<String, String> frameworksMap = new TreeMap();
    private int height;
    private Set<String> inputLangs;
    private String installerPkg;
    private String isp;
    private String ispName;
    private String lac;
    private String locale;
    private List<Location> locations = null;
    private String manufacturer;
    private String model;
    private String netOper;
    private String networkOperName;
    private String networkType;
    private String os = "android";
    private String packageId;
    private Map<String, String> parameters = new HashMap();
    private String productId;
    private String publisherId;
    protected Integer retry;
    private Boolean roaming;
    private long sdkFlavor = new BigInteger(AdsConstants.i, 2).longValue();
    private int sdkId = 3;
    private String sdkVersion = AdsConstants.h;
    private String signalLevel;
    private String ssid;
    private String subProductId;
    private String subPublisherId;
    private Boolean unknownSourcesAllowed;
    private boolean usbDebug;
    private b.c userAdvertisingId;
    private String wfScanRes;
    private int width;
    private String wifiRSSILevel;
    private String wifiSignalLevel;

    private void addParams(e e2) {
        String string;
        e2.a("publisherId", this.publisherId, false);
        e2.a("productId", this.productId, true);
        e2.a("os", this.os, true);
        e2.a("sdkVersion", this.sdkVersion, false);
        e2.a("flavor", this.sdkFlavor, false);
        if (this.frameworksMap != null && !this.frameworksMap.isEmpty()) {
            String string2 = "";
            for (String string3 : this.frameworksMap.keySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(string3);
                stringBuilder.append(":");
                stringBuilder.append((String)this.frameworksMap.get((Object)string3));
                stringBuilder.append(";");
                string2 = stringBuilder.toString();
            }
            e2.a("frameworksData", string2.substring(0, string2.length() - 1), false, false);
        }
        e2.a("packageId", this.packageId, false);
        e2.a("installerPkg", this.installerPkg, false);
        if (this.userAdvertisingId != null) {
            e2.a("userAdvertisingId", this.userAdvertisingId.a(), false);
            if (this.userAdvertisingId.b()) {
                e2.a("limat", this.userAdvertisingId.b(), false);
            }
            e2.a("advertisingIdSource", this.userAdvertisingId.c(), false);
        } else if (this.androidId != null) {
            e2.a("userId", this.androidId, false);
        }
        e2.a("model", this.model, false);
        e2.a("manufacturer", this.manufacturer, false);
        e2.a("deviceVersion", this.deviceVersion, false);
        e2.a("locale", this.locale, false);
        e2.a("inputLangs", this.inputLangs, false);
        e2.a("isp", this.isp, false);
        e2.a("ispName", this.ispName, false);
        e2.a("netOper", this.getNetOper(), false);
        e2.a("networkOperName", this.getNetworkOperName(), false);
        e2.a("cid", this.getCid(), false);
        e2.a("lac", this.getLac(), false);
        e2.a("blat", this.getBlat(), false);
        e2.a("blon", this.getBlon(), false);
        e2.a("ssid", this.getSsid(), false);
        e2.a("bssid", this.getBssid(), false);
        e2.a("wfScanRes", this.getWfScanRes(), false);
        e2.a("subPublisherId", this.subPublisherId, false);
        e2.a("subProductId", this.subProductId, false);
        e2.a("retryCount", (Object)this.retry, false);
        e2.a("roaming", (Object)this.isRoaming(), false);
        e2.a("deviceIP", this.getDeviceIP(), false);
        e2.a("grid", this.getNetworkType(), false);
        e2.a("silev", this.getSignalLevel(), false);
        e2.a("cellSignalLevel", this.getCellSignalLevel(), false);
        if (this.getWifiSignalLevel() != null) {
            e2.a("wifiSignalLevel", this.getWifiSignalLevel(), false);
        }
        if (this.getWifiRssiLevel() != null) {
            e2.a("wifiRssiLevel", this.getWifiRssiLevel(), false);
        }
        if (BaseRequest.super.getCellTimingAdv() != null) {
            e2.a("cellTimingAdv", BaseRequest.super.getCellTimingAdv(), false);
        }
        e2.a("outsource", (Object)this.isUnknownSourcesAllowed(), false);
        e2.a("width", String.valueOf((int)this.width), false);
        e2.a("height", String.valueOf((int)this.height), false);
        e2.a("density", String.valueOf((float)this.density), false);
        e2.a("fgApp", (Object)this.isAppOnForeground(), false);
        e2.a("sdkId", String.valueOf((int)this.sdkId), true);
        e2.a("clientSessionId", this.clientSessionId, false);
        e2.a("appVersion", this.appVersion, false);
        e2.a("appCode", this.appCode, false);
        e2.a("timeSinceBoot", BaseRequest.getTimeSinceBoot(), false);
        if (this.getLocations() != null && this.getLocations().size() > 0 && (string = g.a(this.getLocations())) != null && !string.equals((Object)"")) {
            e2.a("locations", com.startapp.common.a.a.c(string), false);
        }
        e2.a("udbg", this.usbDebug, false);
    }

    private void fillCellLocationDetails(Context context, TelephonyManager telephonyManager) {
        CellLocation cellLocation;
        if ((com.startapp.common.a.c.a(context, "android.permission.ACCESS_FINE_LOCATION") || com.startapp.common.a.c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) && (cellLocation = telephonyManager.getCellLocation()) != null) {
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation)cellLocation;
                this.setCid(com.startapp.common.a.a.c(String.valueOf((int)gsmCellLocation.getCid())));
                this.setLac(com.startapp.common.a.a.c(String.valueOf((int)gsmCellLocation.getLac())));
                return;
            }
            if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation)cellLocation;
                this.setBlat(com.startapp.common.a.a.c(String.valueOf((int)cdmaCellLocation.getBaseStationLatitude())));
                this.setBlon(com.startapp.common.a.a.c(String.valueOf((int)cdmaCellLocation.getBaseStationLongitude())));
            }
        }
    }

    private void fillNetworkOperatorDetails(Context context, TelephonyManager telephonyManager) {
        int n2 = telephonyManager.getPhoneType();
        if (n2 != 0 && n2 != 2) {
            String string;
            String string2 = telephonyManager.getNetworkOperator();
            if (string2 != null) {
                this.setNetOper(com.startapp.common.a.a.c(string2));
            }
            if ((string = telephonyManager.getNetworkOperatorName()) != null) {
                this.setNetworkOperName(com.startapp.common.a.a.c(string));
            }
        }
    }

    private void fillSimDetails(TelephonyManager telephonyManager) {
        if (telephonyManager.getSimState() == 5) {
            this.setIsp(telephonyManager.getSimOperator());
            this.setIspName(telephonyManager.getSimOperatorName());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void fillWifiDetails(Context context, boolean bl2) {
        WifiManager wifiManager;
        block12 : {
            String string;
            block13 : {
                WifiInfo wifiInfo;
                if (!MetaData.getInstance().isWfScanEnabled() || (wifiManager = (WifiManager)context.getSystemService("wifi")) == null) return;
                if (!com.startapp.common.a.c.a(context, "android.permission.ACCESS_WIFI_STATE")) return;
                if (!this.getNetworkType().equals((Object)"WIFI") || (wifiInfo = wifiManager.getConnectionInfo()) == null) break block12;
                this.setDeviceIP(wifiInfo);
                String string2 = wifiInfo.getSSID();
                string = wifiInfo.getBSSID();
                if (string2 == null) break block13;
                this.setSsid(com.startapp.common.a.a.c(string2));
            }
            if (string != null) {
                this.setBssid(com.startapp.common.a.a.c(string));
            }
        }
        if (!bl2) return;
        List<ScanResult> list = com.startapp.common.a.c.a(context, wifiManager);
        if (list == null) return;
        if (list.equals((Object)Collections.EMPTY_LIST)) return;
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        do {
            if (n2 >= Math.min((int)5, (int)list.size())) break;
            arrayList.add(new Object((ScanResult)list.get(n2)){
                private ScanResult a;
                {
                    this.a = scanResult;
                }

                public String toString() {
                    StringBuilder stringBuilder = new StringBuilder();
                    if (this.a != null) {
                        stringBuilder.append(this.a.SSID);
                        stringBuilder.append(',');
                        stringBuilder.append(this.a.BSSID);
                        stringBuilder.append(',');
                        stringBuilder.append(WifiManager.calculateSignalLevel((int)this.a.level, (int)5));
                        stringBuilder.append(',');
                        stringBuilder.append(this.a.level);
                        stringBuilder.append(',');
                        long l2 = com.startapp.common.a.c.a(this.a);
                        if (l2 != 0L) {
                            stringBuilder.append(l2);
                        }
                        stringBuilder.append(',');
                        CharSequence charSequence = com.startapp.common.a.c.b(this.a);
                        if (charSequence != null) {
                            stringBuilder.append(charSequence);
                        }
                    }
                    return stringBuilder.toString();
                }
            });
            ++n2;
        } while (true);
        try {
            this.setWfScanRes(com.startapp.common.a.a.c(TextUtils.join((CharSequence)";", (Iterable)arrayList)));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private String getCellTimingAdv() {
        return this.cellTimingAdv;
    }

    private static long getTimeSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    /*
     * Exception decompiling
     */
    private void setAndroidId(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    private void setCellTimingAdv(Context context, TelephonyManager telephonyManager) {
        this.cellTimingAdv = com.startapp.common.a.c.b(context, telephonyManager);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setNetworkLevels(Context context) {
        try {
            com.startapp.common.c c2 = com.startapp.common.c.a();
            if (c2 == null) {
                this.signalLevel = "e106";
                this.cellSignalLevel = "e106";
                this.wifiSignalLevel = "e106";
                this.wifiRSSILevel = "e106";
                return;
            }
            this.cellSignalLevel = c2.b();
            boolean bl2 = MetaData.getInstance().isWfScanEnabled();
            i.a a2 = null;
            if (bl2) {
                a2 = com.startapp.common.a.i.a(context, this.networkType);
            }
            if (a2 == null) {
                this.signalLevel = this.cellSignalLevel;
                return;
            }
            if (a2.a() == null) {
                this.signalLevel = a2.c();
                this.wifiRSSILevel = a2.b();
                this.wifiSignalLevel = a2.c();
                return;
            }
            this.signalLevel = a2.a();
            this.wifiRSSILevel = a2.a();
            this.wifiSignalLevel = a2.a();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void setNetworkType(Context context) {
        this.networkType = com.startapp.common.a.i.a(context);
    }

    public static void setUsingLocation(Context context, boolean bl2) {
        k.b(context, "shared_prefs_using_location", bl2);
    }

    public void fillApplicationDetails(Context context, AdPreferences adPreferences) {
        this.fillApplicationDetails(context, adPreferences, true);
    }

    /*
     * Exception decompiling
     */
    public void fillApplicationDetails(Context var1, AdPreferences var2, boolean var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    public void fillLocationDetails(AdPreferences adPreferences, Context context) {
        boolean bl2;
        this.locations = new ArrayList();
        if (adPreferences != null && adPreferences.getLatitude() != null && adPreferences.getLongitude() != null) {
            Location location = new Location("loc");
            location.setLongitude(adPreferences.getLongitude().doubleValue());
            location.setLongitude(adPreferences.getLongitude().doubleValue());
            location.setProvider("API");
            this.locations.add((Object)location);
            bl2 = true;
        } else {
            bl2 = false;
        }
        m.a().h(context);
        List<Location> list = g.a(context, MetaData.getInstance().getLocationConfig().isFiEnabled(), MetaData.getInstance().getLocationConfig().isCoEnabled());
        if (list != null && list.size() > 0) {
            this.locations.addAll(list);
            bl2 = true;
        }
        BaseRequest.setUsingLocation(context, bl2);
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public int getAppCode() {
        return this.appCode;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBlat() {
        return this.blat;
    }

    public String getBlon() {
        return this.blon;
    }

    public String getBssid() {
        return this.bssid;
    }

    public String getCellSignalLevel() {
        return this.cellSignalLevel;
    }

    public String getCid() {
        return this.cid;
    }

    public float getDensity() {
        return this.density;
    }

    public String getDeviceIP() {
        return this.deviceIP;
    }

    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    public int getHeight() {
        return this.height;
    }

    public Set<String> getInputLangs() {
        return this.inputLangs;
    }

    public String getInstallerPkg() {
        return this.installerPkg;
    }

    public String getIsp() {
        return this.isp;
    }

    public String getIspName() {
        return this.ispName;
    }

    public String getLac() {
        return this.lac;
    }

    public String getLocale() {
        return this.locale;
    }

    public List<Location> getLocations() {
        return this.locations;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public e getNameValueJson() {
        c c2 = new c();
        this.addParams(c2);
        return c2;
    }

    @Override
    public e getNameValueMap() {
        d d2 = new d();
        this.addParams(d2);
        return d2;
    }

    public String getNetOper() {
        return this.netOper;
    }

    public String getNetworkOperName() {
        return this.networkOperName;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getOs() {
        return this.os;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getRequestString() {
        return this.getNameValueMap().toString();
    }

    public long getSdkFlavor() {
        return this.sdkFlavor;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSessionId() {
        if (this.clientSessionId == null) {
            return "";
        }
        return this.clientSessionId;
    }

    public String getSignalLevel() {
        return this.signalLevel;
    }

    public String getSsid() {
        return this.ssid;
    }

    public String getSubProductId() {
        return this.subProductId;
    }

    public String getSubPublisherId() {
        return this.subPublisherId;
    }

    public b.c getUserAdvertisingId() {
        return this.userAdvertisingId;
    }

    public String getWfScanRes() {
        return this.wfScanRes;
    }

    public int getWidth() {
        return this.width;
    }

    public String getWifiRssiLevel() {
        return this.wifiRSSILevel;
    }

    public String getWifiSignalLevel() {
        return this.wifiSignalLevel;
    }

    public Boolean isAppOnForeground() {
        return this.appOnForeground;
    }

    public Boolean isRoaming() {
        return this.roaming;
    }

    public Boolean isUnknownSourcesAllowed() {
        return this.unknownSourcesAllowed;
    }

    public void setAppCode(int n2) {
        this.appCode = n2;
    }

    public void setAppOnForeground(Context context) {
        try {
            this.appOnForeground = i.e(context);
            return;
        }
        catch (Exception exception) {
            this.appOnForeground = null;
            return;
        }
    }

    public void setAppVersion(String string) {
        this.appVersion = string;
    }

    public void setBlat(String string) {
        this.blat = string;
    }

    public void setBlon(String string) {
        this.blon = string;
    }

    public void setBssid(String string) {
        this.bssid = string;
    }

    public void setCid(String string) {
        this.cid = string;
    }

    public void setDensity(float f2) {
        this.density = f2;
    }

    public void setDeviceIP(WifiInfo wifiInfo) {
        this.deviceIP = com.startapp.common.a.i.a(wifiInfo);
    }

    public void setDeviceVersion(String string) {
        this.deviceVersion = string;
    }

    public void setHeight(int n2) {
        this.height = n2;
    }

    public void setInputLangs(Set<String> set) {
        this.inputLangs = set;
    }

    public void setInstallerPkg(String string) {
        this.installerPkg = string;
    }

    public void setIsp(String string) {
        this.isp = string;
    }

    public void setIspName(String string) {
        this.ispName = string;
    }

    public void setLac(String string) {
        this.lac = string;
    }

    public void setLocale(String string) {
        this.locale = string;
    }

    public void setLocations(List<Location> list) {
        this.locations = list;
    }

    public void setManufacturer(String string) {
        this.manufacturer = string;
    }

    public void setModel(String string) {
        this.model = string;
    }

    public void setNetOper(String string) {
        this.netOper = string;
    }

    public void setNetworkOperName(String string) {
        this.networkOperName = string;
    }

    public void setPackageId(String string) {
        this.packageId = string;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setProductId(String string) {
        this.productId = string;
    }

    public void setPublisherId(String string) {
        this.publisherId = string;
    }

    public void setRetry(int n2) {
        this.retry = null;
    }

    public void setRoaming(Context context) {
        this.roaming = com.startapp.common.a.i.c(context);
    }

    public void setSdkFlavor(long l2) {
        this.sdkFlavor = l2;
    }

    public void setSdkVersion(String string) {
        this.sdkVersion = string;
    }

    public void setSessionId(String string) {
        this.clientSessionId = string;
    }

    public void setSsid(String string) {
        this.ssid = string;
    }

    public void setSubProductId(String string) {
        this.subProductId = string;
    }

    public void setSubPublisherId(String string) {
        this.subPublisherId = string;
    }

    public void setUnknownSourcesAllowed(Boolean bl2) {
        this.unknownSourcesAllowed = bl2;
    }

    public void setUserAdvertisingId(b.c c2) {
        this.userAdvertisingId = c2;
    }

    public void setWfScanRes(String string) {
        this.wfScanRes = string;
    }

    public void setWidth(int n2) {
        this.width = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseRequest [parameters=");
        stringBuilder.append(this.parameters);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

