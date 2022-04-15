package com.startapp.android.publish.ads.nativead;

import com.startapp.android.publish.common.model.AdPreferences;

public class NativeAdPreferences
extends AdPreferences {
    private static final int DEFAULT_ADS_NUMBER = 1;
    private static final boolean DEFAULT_AUTO_DOWNLOAD_BITMAP = false;
    private static final boolean DEFAULT_IS_CONTENT_AD = false;
    private static final boolean DEFAULT_USE_SIMPLE_TOKEN = true;
    private static String EXCEPTION_LOW_ADS_NUMBER = "Ads Number must be >= 1";
    private static final long serialVersionUID = 1L;
    private int adsNumber = 1;
    private boolean autoBitmapDownload = false;
    private NativeAdBitmapSize bitmapSize;
    private boolean isContentAd = false;
    private int moreImage = -1;
    private int primaryImage = -1;
    private boolean useSimpleToken = true;

    public int getAdsNumber() {
        return this.adsNumber;
    }

    public NativeAdBitmapSize getImageSize() {
        return this.bitmapSize;
    }

    public int getPrimaryImageSize() {
        return this.primaryImage;
    }

    public int getSecondaryImageSize() {
        return this.moreImage;
    }

    public boolean isAutoBitmapDownload() {
        return this.autoBitmapDownload;
    }

    public boolean isContentAd() {
        return this.isContentAd;
    }

    @Override
    public boolean isSimpleToken() {
        return this.useSimpleToken;
    }

    public NativeAdPreferences setAdsNumber(int n2) {
        if (n2 > 0) {
            this.adsNumber = n2;
            return this;
        }
        throw new IllegalArgumentException(EXCEPTION_LOW_ADS_NUMBER);
    }

    public NativeAdPreferences setAutoBitmapDownload(boolean bl2) {
        this.autoBitmapDownload = bl2;
        return this;
    }

    public NativeAdPreferences setContentAd(boolean bl2) {
        this.isContentAd = bl2;
        return this;
    }

    public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeAdBitmapSize) {
        this.bitmapSize = nativeAdBitmapSize;
        return this;
    }

    public NativeAdPreferences setPrimaryImageSize(int n2) {
        this.primaryImage = n2;
        return this;
    }

    public NativeAdPreferences setSecondaryImageSize(int n2) {
        this.moreImage = n2;
        return this;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===== NativeAdConfig =====\n");
        StringBuilder stringBuilder = new StringBuilder("    adsNumber: [");
        stringBuilder.append(this.getAdsNumber());
        stringBuilder.append("]\n");
        stringBuffer.append(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder("    autoBitmapDownload: [");
        stringBuilder2.append(this.isAutoBitmapDownload());
        stringBuilder2.append("]\n");
        stringBuffer.append(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder("    useSimpleToken: [");
        stringBuilder3.append(this.isSimpleToken());
        stringBuilder3.append("]\n");
        stringBuffer.append(stringBuilder3.toString());
        stringBuffer.append("===== End NativeAdConfig =====");
        return stringBuffer.toString();
    }

    public NativeAdPreferences useSimpleToken(boolean bl2) {
        this.useSimpleToken = bl2;
        return this;
    }

}

