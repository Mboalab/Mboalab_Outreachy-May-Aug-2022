package com.startapp.android.publish.ads.splash;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.android.publish.ads.splash.d;
import com.startapp.android.publish.ads.splash.f;
import com.startapp.android.publish.ads.splash.i;
import com.startapp.android.publish.adsCommon.c;
import java.io.Serializable;

public class SplashConfig
implements Serializable {
    private static long DEFAULT_MAX_LOAD = 7500L;
    private static final int INT_EMPTY_VALUE = -1;
    private static final String STRING_EMPTY_VALUE = "";
    private static final String VALUE_DEFAULT_HTML_BG_COLOR = "#066CAA";
    private static final String VALUE_DEFAULT_HTML_FONT_COLOR = "ffffff";
    private static final String VALUE_DEFAULT_HTML_LOADING_TYPE = "LoadingDots";
    private static final boolean VALUE_DEFAULT_HTML_SPLASH = true;
    private static final MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY;
    private static final long VALUE_DEFAULT_MAXLOAD = 0L;
    private static final MinSplashTime VALUE_DEFAULT_MINSPLASHTIME;
    private static final Orientation VALUE_DEFAULT_ORIENTATION;
    private static final Theme VALUE_DEFAULT_THEME;
    private static final long serialVersionUID = 1L;
    private String appName = "";
    private int customScreen = -1;
    @com.startapp.common.b.f(b="Lcom/startapp/android/publish/ads/splash/SplashConfig$MaxAdDisplayTime;")
    private MaxAdDisplayTime defaultMaxAdDisplayTime = VALUE_DEFAULT_MAXADDISPLAY;
    private Long defaultMaxLoadTime = VALUE_DEFAULT_MAXLOAD;
    @com.startapp.common.b.f(b="Lcom/startapp/android/publish/ads/splash/SplashConfig$MinSplashTime;")
    private MinSplashTime defaultMinSplashTime = VALUE_DEFAULT_MINSPLASHTIME;
    @com.startapp.common.b.f(b="Lcom/startapp/android/publish/ads/splash/SplashConfig$Orientation;")
    private Orientation defaultOrientation = VALUE_DEFAULT_ORIENTATION;
    @com.startapp.common.b.f(b="Lcom/startapp/android/publish/ads/splash/SplashConfig$Theme;")
    private Theme defaultTheme = VALUE_DEFAULT_THEME;
    private transient String errMsg = "";
    private boolean forceNative = false;
    private boolean htmlSplash = true;
    private transient Drawable logo = null;
    private byte[] logoByteArray = null;
    private int logoRes = -1;
    private String splashBgColor = "#066CAA";
    private String splashFontColor = "ffffff";
    private String splashLoadingType = "LoadingDots";

    static {
        VALUE_DEFAULT_THEME = Theme.OCEAN;
        VALUE_DEFAULT_MINSPLASHTIME = MinSplashTime.REGULAR;
        VALUE_DEFAULT_MAXLOAD = DEFAULT_MAX_LOAD;
        VALUE_DEFAULT_MAXADDISPLAY = MaxAdDisplayTime.FOR_EVER;
        VALUE_DEFAULT_ORIENTATION = Orientation.AUTO;
    }

    private static void applyDefaultSplashConfig(SplashConfig splashConfig, Context context) {
        SplashConfig splashConfig2 = SplashConfig.getDefaultSplashConfig();
        if (splashConfig.getTheme() == null) {
            splashConfig.setTheme(splashConfig2.getTheme());
        }
        if (splashConfig.getMinSplashTime() == null) {
            splashConfig.setMinSplashTime(splashConfig2.getMinSplashTime());
        }
        if (splashConfig.getMaxLoadAdTimeout() == null) {
            splashConfig.setMaxLoadAdTimeout(splashConfig2.getMaxLoadAdTimeout());
        }
        if (splashConfig.getMaxAdDisplayTime() == null) {
            splashConfig.setMaxAdDisplayTime(splashConfig2.getMaxAdDisplayTime());
        }
        if (splashConfig.getOrientation() == null) {
            splashConfig.setOrientation(splashConfig2.getOrientation());
        }
        if (splashConfig.getLoadingType() == null) {
            splashConfig.setLoadingType(splashConfig2.getLoadingType());
        }
        if (splashConfig.getAppName().equals((Object)STRING_EMPTY_VALUE)) {
            splashConfig.setAppName(c.a(context, "Welcome!"));
        }
    }

    public static SplashConfig getDefaultSplashConfig() {
        SplashConfig splashConfig = new SplashConfig();
        splashConfig.setTheme(VALUE_DEFAULT_THEME).setMinSplashTime(VALUE_DEFAULT_MINSPLASHTIME).setMaxLoadAdTimeout(VALUE_DEFAULT_MAXLOAD).setMaxAdDisplayTime(VALUE_DEFAULT_MAXADDISPLAY).setOrientation(VALUE_DEFAULT_ORIENTATION).setLoadingType(VALUE_DEFAULT_HTML_LOADING_TYPE).setAppName(STRING_EMPTY_VALUE);
        return splashConfig;
    }

    private void setErrorMsg(String string) {
        this.errMsg = string;
    }

    private SplashConfig setLogo(Drawable drawable) {
        this.logo = drawable;
        return this;
    }

    private void setSplashColorsByTheme(Theme theme) {
        String string = VALUE_DEFAULT_HTML_BG_COLOR;
        String string2 = VALUE_DEFAULT_HTML_FONT_COLOR;
        switch (1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[theme.ordinal()]) {
            default: {
                break;
            }
            case 6: {
                string2 = "#063D51";
                string = "#237C9A";
                break;
            }
            case 5: {
                string2 = "#33B5E5";
                string = "#2F353F";
                break;
            }
            case 4: {
                string2 = "#FFFFFF";
                string = "#FF6600";
                break;
            }
            case 3: {
                string2 = "#333333";
                string = "#E3E3E3";
                break;
            }
            case 2: {
                string2 = "#333333";
                string = "#a3d4e5";
                break;
            }
            case 1: {
                string2 = "#FFFFFF";
                string = VALUE_DEFAULT_HTML_BG_COLOR;
            }
        }
        this.splashBgColor = string;
        this.splashFontColor = string2;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBgColor() {
        return this.splashBgColor;
    }

    public int getCustomScreen() {
        return this.customScreen;
    }

    public String getErrorMessage() {
        return this.errMsg;
    }

    public String getFontColor() {
        return this.splashFontColor;
    }

    protected View getLayout(Context context) {
        if (1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[this.getTheme().ordinal()] != 7) {
            return i.a(context, (SplashConfig)this);
        }
        try {
            View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(this.getCustomScreen(), null);
            return view;
        }
        catch (Exception exception) {
            com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "SplashConfig.getLayout - System service failed", exception.getMessage(), STRING_EMPTY_VALUE);
            return null;
        }
        catch (InflateException inflateException) {
            throw new InflateException("StartApp: Can't inflate layout in Custom mode, Are you sure layout resource is valid?");
        }
        catch (Resources.NotFoundException notFoundException) {
            throw new Resources.NotFoundException("StartApp: Can't find Custom layout resource");
        }
    }

    public String getLoadingType() {
        return this.splashLoadingType;
    }

    public Drawable getLogo() {
        return this.logo;
    }

    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    public int getLogoRes() {
        return this.logoRes;
    }

    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    protected Long getMaxLoadAdTimeout() {
        return this.defaultMaxLoadTime;
    }

    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    protected Theme getTheme() {
        return this.defaultTheme;
    }

    protected d initSplashHtml(Activity activity) {
        SplashConfig.super.setSplashColorsByTheme(this.getTheme());
        d d2 = new d(activity);
        d2.b((SplashConfig)this);
        d2.a((SplashConfig)this);
        return d2;
    }

    protected void initSplashLogo(Activity activity) {
        if (this.getLogo() == null && this.getLogoRes() == -1 && this.getLogoByteArray() != null) {
            byte[] arrby = this.getLogoByteArray();
            Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
            SplashConfig.super.setLogo((Drawable)new BitmapDrawable(activity.getResources(), bitmap));
        }
    }

    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    boolean isUserDefinedSplash() {
        return this.getTheme() == Theme.USER_DEFINED || this.getCustomScreen() != -1;
        {
        }
    }

    public SplashConfig setAppName(String string) {
        this.appName = string;
        return this;
    }

    public SplashConfig setCustomScreen(int n2) {
        this.customScreen = n2;
        return this;
    }

    public void setDefaults(Context context) {
        SplashConfig splashConfig = f.b().a();
        if (splashConfig == null) {
            splashConfig = SplashConfig.getDefaultSplashConfig();
        } else {
            this.setHtmlSplash(splashConfig.isHtmlSplash());
        }
        SplashConfig.applyDefaultSplashConfig(splashConfig, context);
        if (this.getMaxAdDisplayTime() == null) {
            this.setMaxAdDisplayTime(splashConfig.getMaxAdDisplayTime());
        }
        if (this.getMaxLoadAdTimeout() == null) {
            this.setMaxLoadAdTimeout(splashConfig.getMaxLoadAdTimeout());
        }
        if (this.getMinSplashTime() == null) {
            this.setMinSplashTime(splashConfig.getMinSplashTime());
        }
        if (this.getOrientation() == null) {
            this.setOrientation(splashConfig.getOrientation());
        }
        if (this.getTheme() == null) {
            this.setTheme(splashConfig.getTheme());
        }
        if (this.getLogoRes() == -1) {
            this.setLogo(context.getApplicationInfo().icon);
        }
        if (this.getAppName() == STRING_EMPTY_VALUE) {
            this.setAppName(splashConfig.getAppName());
        }
    }

    protected SplashConfig setHtmlSplash(boolean bl) {
        this.htmlSplash = bl;
        return this;
    }

    public SplashConfig setLoadingType(String string) {
        this.splashLoadingType = string;
        return this;
    }

    public SplashConfig setLogo(int n2) {
        this.logoRes = n2;
        return this;
    }

    public SplashConfig setLogo(byte[] arrby) {
        this.logoByteArray = arrby;
        return this;
    }

    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    protected SplashConfig setMaxLoadAdTimeout(long l2) {
        this.defaultMaxLoadTime = l2;
        return this;
    }

    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    protected boolean validate(Context context) {
        if (1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[this.getTheme().ordinal()] != 7) {
            if (this.getAppName().equals((Object)STRING_EMPTY_VALUE)) {
                this.setAppName(c.a(context, "Welcome!"));
            }
            if (this.getLogo() == null && this.getLogoByteArray() == null) {
                if (this.getLogoRes() == -1) {
                    this.setLogo(context.getApplicationInfo().icon);
                    SplashConfig.super.setLogo(context.getResources().getDrawable(context.getApplicationInfo().icon));
                } else {
                    SplashConfig.super.setLogo(context.getResources().getDrawable(this.getLogoRes()));
                }
            }
        } else if (this.getCustomScreen() == -1) {
            SplashConfig.super.setErrorMsg("StartApp: Exception getting custom screen resource id, make sure it is set");
            return false;
        }
        return true;
    }

    public static final class MaxAdDisplayTime
    extends Enum<MaxAdDisplayTime> {
        private static final /* synthetic */ MaxAdDisplayTime[] $VALUES;
        public static final /* enum */ MaxAdDisplayTime FOR_EVER;
        public static final /* enum */ MaxAdDisplayTime LONG;
        public static final /* enum */ MaxAdDisplayTime SHORT;
        private long index;

        static {
            SHORT = new MaxAdDisplayTime(5000L);
            LONG = new MaxAdDisplayTime(10000L);
            FOR_EVER = new MaxAdDisplayTime(86400000L);
            MaxAdDisplayTime[] arrmaxAdDisplayTime = new MaxAdDisplayTime[]{SHORT, LONG, FOR_EVER};
            $VALUES = arrmaxAdDisplayTime;
        }

        private MaxAdDisplayTime(long l2) {
            this.index = l2;
        }

        public static MaxAdDisplayTime getByIndex(long l2) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] arrmaxAdDisplayTime = MaxAdDisplayTime.values();
            for (int i2 = 0; i2 < arrmaxAdDisplayTime.length; ++i2) {
                if (arrmaxAdDisplayTime[i2].getIndex() != l2) continue;
                maxAdDisplayTime = arrmaxAdDisplayTime[i2];
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String string) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] arrmaxAdDisplayTime = MaxAdDisplayTime.values();
            for (int i2 = 0; i2 < arrmaxAdDisplayTime.length; ++i2) {
                if (arrmaxAdDisplayTime[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                maxAdDisplayTime = arrmaxAdDisplayTime[i2];
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime valueOf(String string) {
            return (MaxAdDisplayTime)Enum.valueOf(MaxAdDisplayTime.class, (String)string);
        }

        public static MaxAdDisplayTime[] values() {
            return (MaxAdDisplayTime[])$VALUES.clone();
        }

        public final long getIndex() {
            return this.index;
        }
    }

    public static final class MinSplashTime
    extends Enum<MinSplashTime> {
        private static final /* synthetic */ MinSplashTime[] $VALUES;
        public static final /* enum */ MinSplashTime LONG;
        public static final /* enum */ MinSplashTime REGULAR;
        public static final /* enum */ MinSplashTime SHORT;
        private long index;

        static {
            REGULAR = new MinSplashTime(3000);
            SHORT = new MinSplashTime(2000);
            LONG = new MinSplashTime(5000);
            MinSplashTime[] arrminSplashTime = new MinSplashTime[]{REGULAR, SHORT, LONG};
            $VALUES = arrminSplashTime;
        }

        private MinSplashTime(int n3) {
            this.index = n3;
        }

        public static MinSplashTime getByIndex(long l2) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] arrminSplashTime = MinSplashTime.values();
            for (int i2 = 0; i2 < arrminSplashTime.length; ++i2) {
                if (arrminSplashTime[i2].getIndex() != l2) continue;
                minSplashTime = arrminSplashTime[i2];
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String string) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] arrminSplashTime = MinSplashTime.values();
            for (int i2 = 0; i2 < arrminSplashTime.length; ++i2) {
                if (arrminSplashTime[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                minSplashTime = arrminSplashTime[i2];
            }
            return minSplashTime;
        }

        public static MinSplashTime valueOf(String string) {
            return (MinSplashTime)Enum.valueOf(MinSplashTime.class, (String)string);
        }

        public static MinSplashTime[] values() {
            return (MinSplashTime[])$VALUES.clone();
        }

        public final long getIndex() {
            return this.index;
        }
    }

    public static final class Orientation
    extends Enum<Orientation> {
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final /* enum */ Orientation AUTO;
        public static final /* enum */ Orientation LANDSCAPE;
        public static final /* enum */ Orientation PORTRAIT;
        private int index;

        static {
            PORTRAIT = new Orientation(1);
            LANDSCAPE = new Orientation(2);
            AUTO = new Orientation(3);
            Orientation[] arrorientation = new Orientation[]{PORTRAIT, LANDSCAPE, AUTO};
            $VALUES = arrorientation;
        }

        private Orientation(int n3) {
            this.index = n3;
        }

        public static Orientation getByIndex(int n2) {
            Orientation orientation = PORTRAIT;
            Orientation[] arrorientation = Orientation.values();
            for (int i2 = 0; i2 < arrorientation.length; ++i2) {
                if (arrorientation[i2].getIndex() != n2) continue;
                orientation = arrorientation[i2];
            }
            return orientation;
        }

        public static Orientation getByName(String string) {
            Orientation orientation = AUTO;
            Orientation[] arrorientation = Orientation.values();
            for (int i2 = 0; i2 < arrorientation.length; ++i2) {
                if (arrorientation[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                orientation = arrorientation[i2];
            }
            return orientation;
        }

        public static Orientation valueOf(String string) {
            return (Orientation)Enum.valueOf(Orientation.class, (String)string);
        }

        public static Orientation[] values() {
            return (Orientation[])$VALUES.clone();
        }

        public final int getIndex() {
            return this.index;
        }
    }

    public static final class Theme
    extends Enum<Theme> {
        private static final /* synthetic */ Theme[] $VALUES;
        public static final /* enum */ Theme ASHEN_SKY;
        public static final /* enum */ Theme BLAZE;
        public static final /* enum */ Theme DEEP_BLUE;
        public static final /* enum */ Theme GLOOMY;
        public static final /* enum */ Theme OCEAN;
        public static final /* enum */ Theme SKY;
        public static final /* enum */ Theme USER_DEFINED;
        private int index;

        static {
            DEEP_BLUE = new Theme(1);
            SKY = new Theme(2);
            ASHEN_SKY = new Theme(3);
            BLAZE = new Theme(4);
            GLOOMY = new Theme(5);
            OCEAN = new Theme(6);
            USER_DEFINED = new Theme(0);
            Theme[] arrtheme = new Theme[]{DEEP_BLUE, SKY, ASHEN_SKY, BLAZE, GLOOMY, OCEAN, USER_DEFINED};
            $VALUES = arrtheme;
        }

        private Theme(int n3) {
            this.index = n3;
        }

        public static Theme getByIndex(int n2) {
            Theme theme = DEEP_BLUE;
            Theme[] arrtheme = Theme.values();
            for (int i2 = 0; i2 < arrtheme.length; ++i2) {
                if (arrtheme[i2].getIndex() != n2) continue;
                theme = arrtheme[i2];
            }
            return theme;
        }

        public static Theme getByName(String string) {
            Theme theme = DEEP_BLUE;
            Theme[] arrtheme = Theme.values();
            for (int i2 = 0; i2 < arrtheme.length; ++i2) {
                if (arrtheme[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                theme = arrtheme[i2];
            }
            return theme;
        }

        public static Theme valueOf(String string) {
            return (Theme)Enum.valueOf(Theme.class, (String)string);
        }

        public static Theme[] values() {
            return (Theme[])$VALUES.clone();
        }

        public final int getIndex() {
            return this.index;
        }
    }

}

