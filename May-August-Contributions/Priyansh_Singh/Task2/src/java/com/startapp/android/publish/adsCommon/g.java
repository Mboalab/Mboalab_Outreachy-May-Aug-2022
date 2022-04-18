/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.common.model.AdPreferences
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.a;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;

public interface g {
    public boolean a(String var1);

    public String a_();

    public Long getAdCacheTtl();

    public Long getLastLoadTime();

    public Ad.AdState getState();

    public boolean getVideoCancelCallBack();

    public boolean hasAdCacheTtlPassed();

    public boolean isBelowMinCPM();

    public boolean isReady();

    public boolean load(AdPreferences var1, AdEventListener var2);

    public void setActivityExtra(a var1);

    public void setContext(Context var1);

    public void setVideoCancelCallBack(boolean var1);
}

