package com.startapp.android.publish.ads.nativead;
import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.ads.nativead.StartAppNativeAd;

public interface NativeAdInterface {
    public StartAppNativeAd.b getCampaignAction();

    public String getCategory();

    public String getDescription();

    public Bitmap getImageBitmap();

    public String getImageUrl();

    public String getInstalls();

    public String getPackacgeName();

    public float getRating();

    public Bitmap getSecondaryImageBitmap();

    public String getSecondaryImageUrl();

    public String getTitle();

    public Boolean isApp();

    public void sendClick(Context var1);

    public void sendImpression(Context var1);
}

