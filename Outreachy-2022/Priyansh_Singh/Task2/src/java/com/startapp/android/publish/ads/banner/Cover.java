package com.startapp.android.publish.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.common.model.AdPreferences;

public class Cover
extends Banner {
    public Cover(Activity activity) {
        super(activity);
    }

    public Cover(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Cover(Activity activity, AttributeSet attributeSet, int n2) {
        super(activity, attributeSet, n2);
    }

    public Cover(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Cover(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Cover(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    @Deprecated
    public Cover(Context context) {
        super(context);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Deprecated
    public Cover(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Override
    public String getBannerName() {
        return "StartApp Cover";
    }

    @Override
    public int getBannerType() {
        return 2;
    }

    @Override
    public int getHeightInDp() {
        return 157;
    }

    @Override
    public int getWidthInDp() {
        return 300;
    }
}

