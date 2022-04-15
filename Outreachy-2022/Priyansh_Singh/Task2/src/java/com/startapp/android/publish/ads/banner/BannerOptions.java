package com.startapp.android.publish.ads.banner;

import com.startapp.common.b.f;
import java.io.Serializable;

public class BannerOptions
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int adsNumber;
    private int delayFaceTime;
    @f(b="Lcom/startapp/android/publish/ads/banner/BannerOptions$Effect;")
    private Effect effect;
    private int height;
    private float heightRatio;
    private int htmlAdsNumber;
    private float minScale;
    private int minViewabilityPercentage;
    private int refreshRate;
    private int refreshRate3D;
    private boolean rotateThroughOnStart;
    private int rotateThroughSpeedMult;
    private int scalePower;
    private int stepSize;
    private int timeBetweenFrames;
    private int width;
    private float widthRatio;

    public BannerOptions() {
        this.width = 300;
        this.height = 50;
        this.minViewabilityPercentage = 50;
        this.timeBetweenFrames = 25;
        this.stepSize = 5;
        this.delayFaceTime = 5000;
        this.adsNumber = 4;
        this.htmlAdsNumber = 10;
        this.refreshRate3D = 60000;
        this.widthRatio = 1.0f;
        this.heightRatio = 1.0f;
        this.minScale = 0.88f;
        this.scalePower = 4;
        this.effect = Effect.ROTATE_3D;
        this.rotateThroughOnStart = true;
        this.rotateThroughSpeedMult = 2;
        this.refreshRate = 60000;
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = 300;
        this.height = 50;
        this.minViewabilityPercentage = 50;
        this.timeBetweenFrames = 25;
        this.stepSize = 5;
        this.delayFaceTime = 5000;
        this.adsNumber = 4;
        this.htmlAdsNumber = 10;
        this.refreshRate3D = 60000;
        this.widthRatio = 1.0f;
        this.heightRatio = 1.0f;
        this.minScale = 0.88f;
        this.scalePower = 4;
        this.effect = Effect.ROTATE_3D;
        this.rotateThroughOnStart = true;
        this.rotateThroughSpeedMult = 2;
        this.refreshRate = 60000;
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
    }

    public int a() {
        return this.timeBetweenFrames;
    }

    public void a(int n2, int n3) {
        this.width = n2;
        this.height = n3;
    }

    public int b() {
        return this.stepSize;
    }

    public int c() {
        return this.delayFaceTime;
    }

    public int d() {
        return this.width;
    }

    public int e() {
        return this.height;
    }

    public boolean equals(Object object) {
        BannerOptions bannerOptions = (BannerOptions)object;
        return bannerOptions.f() == this.f() && bannerOptions.g() == this.g() && bannerOptions.h() == this.h() && bannerOptions.c() == this.c() && bannerOptions.e() == this.e() && bannerOptions.b() == this.b() && bannerOptions.a() == this.a() && bannerOptions.d() == this.d() && bannerOptions.i() == this.i();
    }

    public int f() {
        return this.adsNumber;
    }

    public int g() {
        return this.htmlAdsNumber;
    }

    public int h() {
        return this.refreshRate3D;
    }

    public int i() {
        return this.refreshRate;
    }

    public float j() {
        return this.widthRatio;
    }

    public float k() {
        return this.heightRatio;
    }

    public float l() {
        return this.minScale;
    }

    public int m() {
        return this.scalePower;
    }

    public Effect n() {
        return this.effect;
    }

    public boolean o() {
        return this.rotateThroughOnStart;
    }

    public int p() {
        return this.rotateThroughSpeedMult;
    }

    public int q() {
        return this.minViewabilityPercentage;
    }

    public static final class Effect
    extends Enum<Effect> {
        private static final /* synthetic */ Effect[] $VALUES;
        public static final /* enum */ Effect EXCHANGE;
        public static final /* enum */ Effect FLY_IN;
        public static final /* enum */ Effect ROTATE_3D;
        private int index;

        static {
            ROTATE_3D = new Effect(1);
            EXCHANGE = new Effect(2);
            FLY_IN = new Effect(3);
            Effect[] arreffect = new Effect[]{ROTATE_3D, EXCHANGE, FLY_IN};
            $VALUES = arreffect;
        }

        private Effect(int n3) {
            this.index = n3;
        }

        public static Effect getByIndex(int n2) {
            Effect effect = ROTATE_3D;
            Effect[] arreffect = Effect.values();
            for (int i2 = 0; i2 < arreffect.length; ++i2) {
                if (arreffect[i2].getIndex() != n2) continue;
                effect = arreffect[i2];
            }
            return effect;
        }

        public static Effect getByName(String string) {
            Effect effect = ROTATE_3D;
            Effect[] arreffect = Effect.values();
            for (int i2 = 0; i2 < arreffect.length; ++i2) {
                if (arreffect[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                effect = arreffect[i2];
            }
            return effect;
        }

        public static Effect valueOf(String string) {
            return (Effect)Enum.valueOf(Effect.class, (String)string);
        }

        public static Effect[] values() {
            return (Effect[])$VALUES.clone();
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getRotationMultiplier() {
            return (int)Math.pow((double)2.0, (double)(-1 + this.index));
        }
    }

}

