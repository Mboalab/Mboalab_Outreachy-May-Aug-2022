package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.a.c;

public class MetaDataRequest
extends BaseRequest {
    private String apkHash;
    private int daysSinceFirstSession;
    private long firstInstalledAppTS;
    private Integer ian;
    private float paidAmount;
    private boolean payingUser;
    private String profileId;
    private a reason;
    private Pair<String, String> simpleToken;
    private int totalSessions;

    public MetaDataRequest(Context context, a a2) {
        this.totalSessions = k.a(context, "totalSessions", 0);
        this.daysSinceFirstSession = MetaDataRequest.super.calcDaysSinceFirstSession(context);
        this.paidAmount = k.a(context, "inAppPurchaseAmount", Float.valueOf((float)0.0f)).floatValue();
        this.payingUser = k.a(context, "payingUser", Boolean.FALSE);
        this.profileId = MetaData.getInstance().getProfileId();
        this.reason = a2;
        this.apkHash = MetaDataRequest.calcApkHash(context, k.a(context), m.a().e(), new i());
        this.setIan(context);
        this.simpleToken = l.c();
        this.firstInstalledAppTS = l.a();
    }

    private void addParams(e e2) {
        e2.a(com.startapp.common.a.a.a(), com.startapp.common.a.a.d(), true);
        e2.a("totalSessions", this.totalSessions, true);
        e2.a("daysSinceFirstSession", this.daysSinceFirstSession, true);
        e2.a("payingUser", this.payingUser, true);
        e2.a("profileId", this.profileId, false);
        e2.a("paidAmount", (Object)Float.valueOf((float)this.paidAmount), true);
        e2.a("reason", (Object)this.reason, true);
        if (this.apkHash != null) {
            e2.a("apkHash", this.apkHash, false);
        }
        e2.a("ian", (Object)this.ian, false);
        e2.a((String)this.simpleToken.first, this.simpleToken.second, false);
        if (this.firstInstalledAppTS > 0L && this.firstInstalledAppTS < Long.MAX_VALUE) {
            e2.a("firstInstalledAppTS", this.firstInstalledAppTS, false);
        }
    }

    public static String calcApkHash(Context context, SharedPreferences sharedPreferences, boolean bl2, i i2) {
        String string = sharedPreferences.getString("shared_prefs_app_apk_hash", null);
        if (TextUtils.isEmpty((CharSequence)string) || bl2) {
            string = i2.a("SHA-256", context);
            sharedPreferences.edit().putString("shared_prefs_app_apk_hash", string).commit();
        }
        return string;
    }

    private int calcDaysSinceFirstSession(Context context) {
        return MetaDataRequest.super.millisToDays(System.currentTimeMillis() - k.a(context, "firstSessionTime", System.currentTimeMillis()));
    }

    private int millisToDays(long l2) {
        return (int)(l2 / 86400000L);
    }

    public String getApkHash() {
        return this.apkHash;
    }

    public int getDaysSinceFirstSession() {
        return this.daysSinceFirstSession;
    }

    public int getIan() {
        return this.ian;
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

    public float getPaidAmount() {
        return this.paidAmount;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public a getReason() {
        return this.reason;
    }

    public int getTotalSessions() {
        return this.totalSessions;
    }

    public boolean isPayingUser() {
        return this.payingUser;
    }

    public void setApkHash(String string) {
        this.apkHash = string;
    }

    public void setDaysSinceFirstSession(int n2) {
        this.daysSinceFirstSession = n2;
    }

    public void setIan(Context context) {
        int n2 = c.f(context);
        if (n2 > 0) {
            this.ian = n2;
        }
    }

    public void setPaidAmount(float f2) {
        this.paidAmount = f2;
    }

    public void setPayingUser(boolean bl2) {
        this.payingUser = bl2;
    }

    public void setProfileId(String string) {
        this.profileId = string;
    }

    public void setReason(a a2) {
        this.reason = a2;
    }

    public void setTotalSessions(int n2) {
        this.totalSessions = n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MetaDataRequest [totalSessions=");
        stringBuilder.append(this.totalSessions);
        stringBuilder.append(", daysSinceFirstSession=");
        stringBuilder.append(this.daysSinceFirstSession);
        stringBuilder.append(", payingUser=");
        stringBuilder.append(this.payingUser);
        stringBuilder.append(", paidAmount=");
        stringBuilder.append(this.paidAmount);
        stringBuilder.append(", reason=");
        stringBuilder.append((Object)this.reason);
        stringBuilder.append(", profileId=");
        stringBuilder.append(this.profileId);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(1);
        public static final /* enum */ a b = new a(2);
        public static final /* enum */ a c = new a(3);
        public static final /* enum */ a d = new a(4);
        public static final /* enum */ a e = new a(5);
        private static final /* synthetic */ a[] f;
        private int index;

        static {
            a[] arra = new a[]{a, b, c, d, e};
            f = arra;
        }

        private a(int n3) {
            this.index = n3;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

