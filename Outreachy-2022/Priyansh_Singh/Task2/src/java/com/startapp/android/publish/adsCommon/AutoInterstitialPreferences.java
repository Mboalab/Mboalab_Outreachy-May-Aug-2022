/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.b;
import java.io.Serializable;

public class AutoInterstitialPreferences
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        this.setActivitiesBetweenAds(b.a().I());
        this.setSecondsBetweenAds(b.a().J());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int n2) {
        if (n2 <= 0) {
            n2 = 1;
        }
        this.activitiesBetweenAds = n2;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int n2) {
        if (n2 < 0) {
            n2 = 0;
        }
        this.secondsBetweenAds = n2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AutoInterstitialPreferences [activitiesBetweenAds=");
        stringBuilder.append(this.activitiesBetweenAds);
        stringBuilder.append(", secondsBetweenAds=");
        stringBuilder.append(this.secondsBetweenAds);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

