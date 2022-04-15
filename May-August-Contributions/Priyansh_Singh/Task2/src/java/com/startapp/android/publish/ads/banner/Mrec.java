package com.startapp.android.publish.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.common.model.AdPreferences;

public class Mrec
extends Banner {
    public Mrec(Activity activity) {
        super(activity);
    }

    public Mrec(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Mrec(Activity activity, AttributeSet attributeSet, int n2) {
        super(activity, attributeSet, n2);
    }

    public Mrec(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Mrec(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Mrec(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    @Deprecated
    public Mrec(Context context) {
        super(context);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Deprecated
    public Mrec(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Override
    public String getBannerName() {
        return "StartApp Mrec";
    }

    @Override
    public int getBannerType() {
        return 1;
    }

    @Override
    public int getHeightInDp() {
        return 250;
    }

    @Override
    public int getWidthInDp() {
        return 300;
    }
}

