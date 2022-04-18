/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.startapp.android.publish.common.metaData.MetaDataRequest
 *  com.startapp.android.publish.common.metaData.MetaDataRequest$a
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.Context;
import com.startapp.android.publish.adsCommon.SDKAdPreferences;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.MetaDataRequest;

public class StartAppSDK {
    public static void addWrapper(Context context, String string, String string2) {
        m.a().a(context, string, string2);
    }

    public static void enableReturnAds(boolean bl) {
        m.a().d(bl);
    }

    public static void inAppPurchaseMade(Context context) {
        StartAppSDK.inAppPurchaseMade(context, 0.0);
    }

    public static void inAppPurchaseMade(Context context, double d2) {
        k.b(context, "payingUser", Boolean.TRUE);
        double d3 = k.a(context, "inAppPurchaseAmount", Float.valueOf((float)0.0f)).floatValue();
        Double.isNaN((double)d3);
        k.b(context, "inAppPurchaseAmount", Float.valueOf((float)((float)(d3 + d2))));
        m.a().a(context, MetaDataRequest.a.c);
    }

    public static void init(Activity activity, String string) {
        StartAppSDK.init(activity, string, new SDKAdPreferences());
    }

    public static void init(Activity activity, String string, SDKAdPreferences sDKAdPreferences) {
        m.a().a((Context)activity, null, string, sDKAdPreferences, true);
    }

    public static void init(Activity activity, String string, SDKAdPreferences sDKAdPreferences, boolean bl) {
        m.a().a((Context)activity, null, string, sDKAdPreferences, bl);
    }

    public static void init(Activity activity, String string, String string2) {
        StartAppSDK.init(activity, string, string2, new SDKAdPreferences());
    }

    public static void init(Activity activity, String string, String string2, SDKAdPreferences sDKAdPreferences) {
        m.a().a((Context)activity, string, string2, sDKAdPreferences, true);
    }

    public static void init(Activity activity, String string, String string2, SDKAdPreferences sDKAdPreferences, boolean bl) {
        m.a().a((Context)activity, string, string2, sDKAdPreferences, bl);
    }

    public static void init(Activity activity, String string, String string2, boolean bl) {
        StartAppSDK.init(activity, string, string2, new SDKAdPreferences(), bl);
    }

    public static void init(Activity activity, String string, boolean bl) {
        StartAppSDK.init(activity, string, new SDKAdPreferences(), bl);
    }

    @Deprecated
    public static void init(Context context, String string, String string2) {
        StartAppSDK.init(context, string, string2, new SDKAdPreferences());
    }

    @Deprecated
    public static void init(Context context, String string, String string2, SDKAdPreferences sDKAdPreferences) {
        m.a().a(context, string, string2, sDKAdPreferences, true);
    }

    @Deprecated
    public static void init(Context context, String string, String string2, SDKAdPreferences sDKAdPreferences, boolean bl) {
        m.a().a(context, string, string2, sDKAdPreferences, bl);
    }

    @Deprecated
    public static void init(Context context, String string, String string2, boolean bl) {
        StartAppSDK.init(context, string, string2, new SDKAdPreferences(), bl);
    }

    @Deprecated
    public static void init(Context context, String string, boolean bl) {
        StartAppSDK.init(context, null, string, bl);
    }

    private static void pauseServices(Context context) {
        m.a().a(context);
        m.a().b(context);
    }

    private static void resumeServices(Context context) {
        m.a().c(context);
        m.a().d(context);
    }

    public static void setUserConsent(Context context, String string, long l2, boolean bl) {
        m.a().a(context, string, l2, bl, true);
    }

    public static void startNewSession(Context context) {
        m.a().a(context, MetaDataRequest.a.d);
    }
}

