package com.startapp.android.publish.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.banner.BannerBase;
import com.startapp.android.publish.ads.banner.BannerInterface;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.bannerstandard.BannerStandard;
import com.startapp.android.publish.ads.banner.bannerstandard.a;
import com.startapp.android.publish.ads.banner.c;
import com.startapp.android.publish.ads.banner.d;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.html.JsInterface;
import java.util.concurrent.TimeUnit;

public class BannerStandard
extends BannerBase
implements BannerInterface,
AdEventListener {
    private static final int ID_WEBVIEW = 159868225;
    private static final String TAG = "BannerHtml";
    private static final int TIMEOUT_SMART_REDIRECT = 5000;
    protected a adHtml;
    private RelativeLayout adInformationContatiner;
    private com.startapp.android.publish.adsCommon.adinformation.b adInformationLayout;
    protected AdPreferences adPreferences;
    private boolean callbackSent;
    private boolean defaultLoad;
    private boolean initBannerCalled;
    private boolean jsTag;
    protected BannerListener listener;
    private boolean loaded;
    private BannerOptions options;
    private i scheduledImpression;
    private d size;
    private boolean visible;
    protected WebView webView;
    private boolean webViewTouched;

    public BannerStandard(Activity activity) {
        super((Context)activity);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet) {
        super((Context)activity, attributeSet);
    }

    public BannerStandard(Activity activity, AttributeSet attributeSet, int n2) {
        super((Context)activity, attributeSet, n2);
    }

    public BannerStandard(Activity activity, BannerListener bannerListener) {
        super((Context)activity, bannerListener);
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences) {
        super((Context)activity, adPreferences);
    }

    public BannerStandard(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super((Context)activity, adPreferences, bannerListener);
    }

    public BannerStandard(Activity activity, boolean bl2) {
        super((Context)activity, bl2);
    }

    public BannerStandard(Activity activity, boolean bl2, AdPreferences adPreferences) {
        super((Context)activity, bl2, adPreferences);
    }

    @Deprecated
    public BannerStandard(Context context) {
        super(context, true, null);
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Deprecated
    public BannerStandard(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.loaded = false;
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.initBannerCalled = false;
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        try {
            this.init();
            return;
        }
        catch (Exception exception) {
            f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "BannerStandard.constructor - unexpected error occurd", exception.getMessage(), "");
            return;
        }
    }

    @Deprecated
    public BannerStandard(Context context, BannerListener bannerListener) {
        super(context, true, null);
        this.setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences) {
        super(context, true, adPreferences);
    }

    @Deprecated
    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, true, adPreferences);
        this.setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean bl2) {
        super(context, bl2, null);
    }

    @Deprecated
    public BannerStandard(Context context, boolean bl2, AdPreferences adPreferences) {
        super(context);
        this.loaded = false;
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.initBannerCalled = false;
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        try {
            this.defaultLoad = bl2;
            this.adPreferences = adPreferences;
            this.init();
            return;
        }
        catch (Exception exception) {
            f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "BannerStandard.constructor - unexpected error occurd", exception.getMessage(), "");
            return;
        }
    }

    static /* synthetic */ boolean access$002(BannerStandard bannerStandard, boolean bl2) {
        bannerStandard.webViewTouched = bl2;
        return bl2;
    }

    static /* synthetic */ void access$100(BannerStandard bannerStandard, AdPreferences adPreferences) {
        bannerStandard.setHardwareAcceleration(adPreferences);
    }

    /*
     * Exception decompiling
     */
    private void addAdInformationLayout() {
        throw new IllegalStateException("Error");
    }

    private void determineSizeByScreen(Point point, View view) {
        BannerStandard.super.setPointWidthIfNotSet(point, h.b(this.getContext(), view.getMeasuredWidth()));
        BannerStandard.super.setPointHeightIfNotSet(point, h.b(this.getContext(), view.getMeasuredHeight()));
    }
    private Point getAvailableSize() {
        throw new IllegalStateException("Decompilation failed");
    }

    private long getImpressionDelayMillis() {
        if (this.adHtml.o() != null) {
            return TimeUnit.SECONDS.toMillis(this.adHtml.o().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }

    private void loadHtml() {
        com.startapp.android.publish.adsCommon.Utils.i.a(this.getContext(), this.webView, this.adHtml.e());
    }

    private void onFailedToReceiveBanner(String string) {
        this.setErrorMessage(string);
        if (this.listener != null && !this.callbackSent) {
            this.callbackSent = true;
            this.listener.onFailedToReceiveAd((View)this);
        }
    }

    private void onPause() {
        if (this.webView != null) {
            com.startapp.common.a.c.b(this.webView);
        }
    }

    private void onResume() {
        if (this.webView != null) {
            com.startapp.common.a.c.c(this.webView);
        }
    }

    private void setPointHeightIfNotSet(Point point, int n2) {
        if (point.y <= 0) {
            point.y = n2;
        }
    }

    private void setPointWidthIfNotSet(Point point, int n2) {
        if (point.x <= 0) {
            point.x = n2;
        }
    }

    private boolean setSize(int n2, int n3) {
        Point point = BannerStandard.super.getAvailableSize();
        if (point.x >= n2 && point.y >= n3) {
            this.size.a(n2, n3);
            int n4 = h.a(this.getContext(), this.size.a());
            int n5 = h.a(this.getContext(), this.size.b());
            this.setMinimumWidth(n4);
            this.setMinimumHeight(n5);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(n4, n5);
            } else {
                layoutParams.width = n4;
                layoutParams.height = n5;
            }
            this.webView.setLayoutParams(layoutParams);
            return true;
        }
        Point point2 = new Point(0, 0);
        ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(point2.x, point2.y);
        } else {
            layoutParams.width = point2.x;
            layoutParams.height = point2.y;
        }
        this.webView.setLayoutParams(layoutParams);
        return false;
    }

    protected void cancelScheduledImpression(boolean bl2) {
        if (this.scheduledImpression != null) {
            this.scheduledImpression.a(bl2);
        }
    }

    @Override
    public int getBannerId() {
        return this.innerBannerStandardId;
    }

    @Override
    public String getBannerName() {
        return "StartApp Banner";
    }

    protected int getBannerType() {
        return 0;
    }

    @Override
    public int getHeightInDp() {
        return 50;
    }

    @Override
    public int getOffset() {
        if (this.adHtml == null) {
            return 0;
        }
        return this.adHtml.a();
    }

    @Override
    public int getRefreshRate() {
        return this.options.i();
    }

    @Override
    public int getWidthInDp() {
        return 300;
    }

    @Override
    public void hideBanner() {
        this.visible = false;
        this.setVisibility(8);
    }

    protected void initBanner() {
        if (!this.initBannerCalled) {
            if (this.webView == null) {
                return;
            }
            com.startapp.common.a.h.a(TAG, 3, "Initializing BannerHtml");
            this.initBannerCalled = true;
            int n2 = h.a(this.getContext(), this.size.a());
            int n3 = h.a(this.getContext(), this.size.b());
            this.setMinimumWidth(n2);
            this.setMinimumHeight(n3);
            this.webView.addJavascriptInterface((Object)new JsInterface(this.getContext(), new Runnable(this){
                final /* synthetic */ BannerStandard this$0;
                {
                    this.this$0 = bannerStandard;
                }

                public void run() {
                }
            }, new b(this.getAdTag()), this.adHtml.e(0)), "startappwall");
            this.webView.setWebViewClient(new WebViewClient(){
                private boolean callbackSent = false;

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                    if (BannerStandard.this.jsTag && !BannerStandard.this.webViewTouched) {
                        return false;
                    }
                    if (!this.callbackSent) {
                        this.callbackSent = true;
                        if (BannerStandard.this.listener != null) {
                            BannerStandard.this.listener.onClick((View)BannerStandard.this);
                        }
                    }
                    BannerStandard.this.cancelScheduledImpression(true);
                    boolean bl2 = com.startapp.android.publish.adsCommon.c.a(BannerStandard.this.getContext(), AdPreferences.Placement.INAPP_BANNER);
                    if (!BannerStandard.this.jsTag && string.contains((CharSequence)"index=")) {
                        try {
                            int n2 = com.startapp.android.publish.adsCommon.c.a(string);
                            if (BannerStandard.this.adHtml.d(n2) && !bl2) {
                                Context context = BannerStandard.this.getContext();
                                String string2 = n2 < BannerStandard.this.adHtml.l().length ? BannerStandard.this.adHtml.l()[n2] : null;
                                int n3 = BannerStandard.this.adHtml.n().length;
                                String string3 = null;
                                if (n2 < n3) {
                                    string3 = BannerStandard.this.adHtml.n()[n2];
                                }
                                b b2 = new b(BannerStandard.this.getAdTag());
                                boolean bl3 = BannerStandard.this.adHtml.e(n2);
                                Boolean bl4 = BannerStandard.this.adHtml.f(n2);
                                com.startapp.android.publish.adsCommon.c.a(context, string, string2, string3, b2, 5000L, bl3, bl4);
                            }
                            Context context = BannerStandard.this.getContext();
                            int n4 = BannerStandard.this.adHtml.l().length;
                            String string4 = null;
                            if (n2 < n4) {
                                string4 = BannerStandard.this.adHtml.l()[n2];
                            }
                            b b3 = new b(BannerStandard.this.getAdTag());
                            boolean bl5 = BannerStandard.this.adHtml.e(n2) && !bl2;
                            com.startapp.android.publish.adsCommon.c.a(context, string, string4, b3, bl5);
                        }
                        catch (Exception exception) {
                            com.startapp.common.a.h.a(BannerStandard.TAG, 6, "Error while trying parsing index from url");
                            return false;
                        }
                    } else if (BannerStandard.this.adHtml.d(0) && !bl2) {
                        com.startapp.android.publish.adsCommon.c.a(BannerStandard.this.getContext(), string, BannerStandard.this.adHtml.l()[0], BannerStandard.this.adHtml.n()[0], new b(BannerStandard.this.getAdTag()), 5000L, BannerStandard.this.adHtml.e(0), BannerStandard.this.adHtml.f(0));
                    } else {
                        Context context = BannerStandard.this.getContext();
                        String string5 = BannerStandard.this.adHtml.l()[0];
                        b b4 = new b(BannerStandard.this.getAdTag());
                        boolean bl6 = BannerStandard.this.adHtml.e(0);
                        boolean bl7 = false;
                        if (bl6) {
                            bl7 = false;
                            if (!bl2) {
                                bl7 = true;
                            }
                        }
                        com.startapp.android.publish.adsCommon.c.a(context, string, string5, b4, bl7);
                    }
                    BannerStandard.this.webView.stopLoading();
                    BannerStandard.this.setClicked(true);
                    return true;
                }
            });
            if (!this.loaded) {
                if (this.defaultLoad) {
                    this.loadBanner();
                }
            } else {
                com.startapp.common.a.h.a(TAG, 3, "BannerHTML already Loaded");
                this.onReceiveAd(this.adHtml);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n2, n3);
            layoutParams.addRule(13);
            RelativeLayout relativeLayout = new RelativeLayout(this.getContext());
            relativeLayout.addView((View)this.webView, (ViewGroup.LayoutParams)layoutParams);
            if (this.getLayoutParams() != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.getLayoutParams().width, this.getLayoutParams().height);
                layoutParams2.addRule(13);
                this.addView((View)relativeLayout, (ViewGroup.LayoutParams)layoutParams2);
                return;
            }
            this.addView((View)relativeLayout);
            return;
        }
    }

    @Override
    public void initRuntime() {
        try {
            this.options = new BannerOptions();
            this.adHtml = new a(this.getContext(), this.getOffset());
            if (this.adPreferences == null) {
                this.adPreferences = new AdPreferences();
            }
            this.size = new d(this.getWidthInDp(), this.getHeightInDp());
            this.webView = new WebView(this.getContext());
            if (this.getId() == -1) {
                this.setId(this.getBannerId());
            }
            this.webView.setId(159868225);
            this.setVisibility(8);
            this.webView.setBackgroundColor(0);
            this.webView.setHorizontalScrollBarEnabled(false);
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.setVerticalScrollBarEnabled(false);
            this.webView.setOnTouchListener(new View.OnTouchListener(this){
                final /* synthetic */ BannerStandard this$0;
                {
                    this.this$0 = bannerStandard;
                }

                public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                    BannerStandard.access$002(this.this$0, true);
                    return motionEvent.getAction() == 2;
                }
            });
            this.webView.setOnLongClickListener(new View.OnLongClickListener(this){
                final /* synthetic */ BannerStandard this$0;
                {
                    this.this$0 = bannerStandard;
                }

                public boolean onLongClick(View view) {
                    return true;
                }
            });
            this.webView.setLongClickable(false);
            this.options = c.a().c();
            this.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this){
                final /* synthetic */ BannerStandard this$0;
                {
                    this.this$0 = bannerStandard;
                }

                public void onGlobalLayout() {
                    com.startapp.common.a.c.a(this.this$0.getViewTreeObserver(), this);
                    BannerStandard.access$100(this.this$0, this.this$0.adPreferences);
                    this.this$0.initBanner();
                }
            });
            return;
        }
        catch (Exception exception) {
            f.a(this.getContext(), com.startapp.android.publish.adsCommon.e.d.b, "BannerStandard.init - webview failed", exception.getMessage(), "");
            com.startapp.common.a.h.a(TAG, 6, "webVIew exception");
            this.hideBanner();
            this.onFailedToReceiveBanner("BannerStandard.init - webview failed");
            return;
        }
    }

    protected void makeImpression() {
        i i2;
        com.startapp.common.a.h.a(TAG, 3, "BannerStandard Scheduling visibility check");
        this.scheduledImpression = i2 = new i(this.getContext(), this.adHtml.k(), new b(this.getAdTag()), this.getImpressionDelayMillis());
        this.startVisibilityRunnable(this.scheduledImpression);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onResume();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onPause();
        this.cancelScheduledImpression(false);
    }

    @Override
    public void onFailedToReceiveAd(Ad ad2) {
        BannerStandard.super.onFailedToReceiveBanner(ad2.getErrorMessage());
    }

    @Override
    public void onReceiveAd(Ad ad2) {
        com.startapp.common.a.h.a(TAG, 3, " Html Ad Recievied OK");
        this.webViewTouched = false;
        this.removeView((View)this.adInformationContatiner);
        if (this.adHtml != null && this.adHtml.e() != null && this.adHtml.e().compareTo("") != 0) {
            this.jsTag = "true".equals((Object)com.startapp.android.publish.adsCommon.Utils.i.a(this.adHtml.e(), "@jsTag@", "@jsTag@"));
            BannerStandard.super.loadHtml();
            String string = com.startapp.android.publish.adsCommon.Utils.i.a(this.adHtml.e(), "@width@", "@width@");
            String string2 = com.startapp.android.publish.adsCommon.Utils.i.a(this.adHtml.e(), "@height@", "@height@");
            try {
                if (BannerStandard.super.setSize(Integer.parseInt((String)string), Integer.parseInt((String)string2))) {
                    this.loaded = true;
                    BannerStandard.super.addAdInformationLayout();
                    this.makeImpression();
                    this.addDisplayEventOnLoad();
                    if (this.listener != null && !this.callbackSent) {
                        this.callbackSent = true;
                        this.listener.onReceiveAd((View)this);
                    }
                    if (this.visible) {
                        this.setVisibility(0);
                    }
                    com.startapp.common.a.h.a(TAG, 3, "Done Loading HTML Banner");
                    return;
                }
                BannerStandard.super.onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("Unknown error occurred ");
                stringBuilder.append(exception.getMessage());
                com.startapp.common.a.h.a(TAG, 6, stringBuilder.toString());
                BannerStandard.super.onFailedToReceiveBanner(exception.getMessage());
                return;
            }
            catch (NumberFormatException numberFormatException) {
                com.startapp.common.a.h.a(TAG, 6, "Error Casting width & height from HTML");
                BannerStandard.super.onFailedToReceiveBanner("Error Casting width & height from HTML");
                return;
            }
        }
        com.startapp.common.a.h.a(TAG, 6, "No Banner recieved");
        BannerStandard.super.onFailedToReceiveBanner("No Banner received");
    }

    @Override
    public void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        if (bl2) {
            BannerStandard.super.onResume();
            return;
        }
        BannerStandard.super.onPause();
    }

    @Override
    public void reload() {
        com.startapp.common.a.h.a(TAG, 3, "Loading from network");
        if (this.adPreferences == null) {
            this.adPreferences = new AdPreferences();
        }
        Point point = this.getAvailableSize();
        this.adHtml.setState(Ad.AdState.UN_INITIALIZED);
        this.adHtml.a(point.x, point.y);
        this.adHtml.a(this.getBannerType());
        this.adHtml.load(this.adPreferences, this);
    }

    @Override
    public void setAdTag(String string) {
        this.adTag = string;
    }

    @Override
    public void setBannerId(int n2) {
        this.innerBannerStandardId = n2;
    }

    @Override
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams.width > 0 && layoutParams.height > 0) {
            new Handler().post(new Runnable((BannerStandard)this){
                final /* synthetic */ BannerStandard this$0;
                {
                    this.this$0 = bannerStandard;
                }

                public void run() {
                    this.this$0.initBanner();
                }
            });
        }
    }

    @Override
    public void showBanner() {
        this.visible = true;
        this.setVisibility(0);
    }

}

