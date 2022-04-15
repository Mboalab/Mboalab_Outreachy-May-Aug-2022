package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.b;
import com.startapp.android.publish.ads.banner.c;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.a.g;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.android.publish.adsCommon.o;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.j;
import java.io.Serializable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public abstract class BannerBase
extends RelativeLayout {
    private static final String TAG = "BannerLayout";
    protected AdPreferences adPreferences;
    protected f adRulesResult;
    protected String adTag;
    private boolean attachedToWindow;
    private boolean clicked;
    public boolean drawn;
    private String error;
    private boolean firstLoad;
    protected int innerBanner3dId;
    protected int innerBannerStandardId;
    protected int offset;
    private boolean shouldReloadBanner;
    private a task;
    private Timer timer;
    private o viewabilityChecker;
    private Handler visibilityHandler;

    public BannerBase(Context context) {
        super(context);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.innerBanner3dId = 159868227 + new Random().nextInt(100000);
        this.innerBannerStandardId = 1 + this.innerBanner3dId;
        this.adTag = null;
        this.visibilityHandler = new Handler();
        this.viewabilityChecker = new o();
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.timer = new Timer();
        this.task = (BannerBase)this.new a();
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.innerBanner3dId = 159868227 + new Random().nextInt(100000);
        this.innerBannerStandardId = 1 + this.innerBanner3dId;
        this.adTag = null;
        this.visibilityHandler = new Handler();
        this.viewabilityChecker = new o();
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.timer = new Timer();
        this.task = (BannerBase)this.new a();
        BannerBase.super.setBannerAttrs(context, attributeSet);
    }

    private void cancelReloadTask() {
        if (!this.isInEditMode()) {
            if (this.task != null) {
                this.task.cancel();
            }
            if (this.timer != null) {
                this.timer.cancel();
            }
            this.task = null;
            this.timer = null;
        }
    }

    private void clearVisibilityHandler() {
        try {
            this.visibilityHandler.removeCallbacksAndMessages(null);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("BannerBase.reload - removeCallbacksAndMessages failed ");
            stringBuilder.append(exception.getMessage());
            com.startapp.common.a.h.a((String)TAG, (int)6, (String)stringBuilder.toString());
            return;
        }
    }

    private void initDebug() {
        this.setMinimumWidth(h.a(this.getContext(), this.getWidthInDp()));
        this.setMinimumHeight(h.a(this.getContext(), this.getHeightInDp()));
        this.setBackgroundColor(Color.rgb((int)169, (int)169, (int)169));
        TextView textView = new TextView(this.getContext());
        textView.setText((CharSequence)this.getBannerName());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
    }

    private void scheduleReloadTask() {
        if (this.attachedToWindow) {
            if (this.isInEditMode()) {
                return;
            }
            if (this.task != null) {
                this.task.cancel();
            }
            if (this.timer != null) {
                this.timer.cancel();
            }
            this.task = new a();
            this.timer = new Timer();
            this.timer.scheduleAtFixedRate((TimerTask)this.task, (long)this.getRefreshRate(), (long)this.getRefreshRate());
            return;
        }
    }

    private void setBannerAttrs(Context context, AttributeSet attributeSet) {
        this.setAdTag(new b(context, attributeSet).a());
    }

    public void addDisplayEventOnLoad() {
        if (this.isFirstLoad() || g.a().b().a()) {
            this.setFirstLoad(false);
            com.startapp.android.publish.adsCommon.a.b.a().a(new com.startapp.android.publish.adsCommon.a.a(AdPreferences.Placement.INAPP_BANNER, this.getAdTag()));
        }
    }

    public String getAdTag() {
        return this.adTag;
    }

    protected abstract int getBannerId();

    protected abstract String getBannerName();

    public String getErrorMessage() {
        return this.error;
    }

    protected abstract int getHeightInDp();

    protected int getMinViewabilityPercentage() {
        return c.a().b().q();
    }

    protected abstract int getOffset();

    protected abstract int getRefreshRate();

    protected abstract int getWidthInDp();

    protected void init() {
        if (!this.isInEditMode()) {
            this.initRuntime();
            return;
        }
        this.initDebug();
    }

    protected abstract void initRuntime();

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    protected boolean isVisible() {
        return this.viewabilityChecker.a((View)this, this.getMinViewabilityPercentage());
    }

    protected void load() {
        this.clearVisibilityHandler();
        if (this.adRulesResult != null && !g.a().b().a()) {
            if (this.adRulesResult.a()) {
                this.reload();
                return;
            }
        } else {
            this.adRulesResult = g.a().b().a(AdPreferences.Placement.INAPP_BANNER, this.getAdTag());
            if (this.adRulesResult.a()) {
                this.reload();
                return;
            }
            this.setVisibility(4);
            if (Constants.a().booleanValue()) {
                j.a().a(this.getContext(), this.adRulesResult.b());
                return;
            }
        }
    }

    public void loadBanner() {
        this.scheduleReloadTask();
        this.load();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.startapp.common.a.h.a((String)"BannerLayout", (int)3, (String)"onAttachedToWindow");
        this.attachedToWindow = true;
        this.scheduleReloadTask();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.startapp.common.a.h.a((String)"BannerLayout", (int)3, (String)"onDetachedFromWindow");
        this.attachedToWindow = false;
        this.cancelReloadTask();
        this.clearVisibilityHandler();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle)parcelable;
        this.setBannerId(bundle.getInt("bannerId"));
        this.adRulesResult = (f)bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences)bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    protected Parcelable onSaveInstanceState() {
        if (this.isClicked()) {
            this.setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable parcelable = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", this.getBannerId());
        bundle.putParcelable("upperState", parcelable);
        bundle.putSerializable("adRulesResult", (Serializable)this.adRulesResult);
        bundle.putSerializable("adPreferences", (Serializable)this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        com.startapp.common.a.h.a((String)"BannerLayout", (int)3, (String)"onWindowFocusChanged");
        if (bl) {
            if (this.shouldReloadBanner) {
                this.shouldReloadBanner = false;
                this.load();
            }
            this.attachedToWindow = true;
            BannerBase.super.scheduleReloadTask();
            return;
        }
        this.attachedToWindow = false;
        BannerBase.super.cancelReloadTask();
    }

    protected abstract void reload();

    public abstract void setAdTag(String var1);

    protected abstract void setBannerId(int var1);

    public void setClicked(boolean bl) {
        this.clicked = bl;
    }

    public void setErrorMessage(String string) {
        this.error = string;
    }

    public void setFirstLoad(boolean bl) {
        this.firstLoad = bl;
    }

    public void setHardwareAcceleration(AdPreferences adPreferences) {
        com.startapp.android.publish.adsCommon.Utils.i.a(adPreferences, "hardwareAccelerated", com.startapp.common.a.c.a((View)this, (boolean)this.attachedToWindow));
    }

    protected boolean shouldSendImpression(i i2) {
        return i2 != null && !i2.c();
    }

    protected void startVisibilityRunnable(final i i2) {
        if (!this.shouldSendImpression(i2)) {
            return;
        }
        com.startapp.common.a.h.a((String)"BannerLayout", (int)3, (String)"BannerBase.startVisibilityRunnable - run visibility check");
        new Runnable(){
            private boolean c = true;

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                try {
                    if (!BannerBase.this.shouldSendImpression(i2)) {
                        BannerBase.this.clearVisibilityHandler();
                        return;
                    }
                    boolean bl = BannerBase.this.isVisible();
                    if (bl && this.c) {
                        this.c = false;
                        i2.a();
                    } else if (!bl && !this.c) {
                        this.c = true;
                        i2.b();
                    }
                    BannerBase.this.visibilityHandler.postDelayed((Runnable)this, 100L);
                    return;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder("BannerBase.startVisibilityRunnable.run - runnable error ");
                    stringBuilder.append(exception.getMessage());
                    com.startapp.common.a.h.a((String)BannerBase.TAG, (int)6, (String)stringBuilder.toString());
                    BannerBase.this.clearVisibilityHandler();
                    return;
                }
            }
        }.run();
    }

    class a
    extends TimerTask {
        a() {
        }

        public void run() {
            BannerBase.this.post(new Runnable(){

                public void run() {
                    if (BannerBase.this.isShown() || BannerBase.this.adRulesResult != null && !BannerBase.this.adRulesResult.a()) {
                        com.startapp.common.a.h.a((String)BannerBase.TAG, (int)3, (String)"REFRESH");
                        BannerBase.this.load();
                    }
                }
            });
        }

    }

}

