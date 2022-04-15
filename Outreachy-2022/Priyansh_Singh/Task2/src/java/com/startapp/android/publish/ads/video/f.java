/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.VideoView
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.ads.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.startapp.android.publish.ads.video.VideoAdDetails;
import com.startapp.android.publish.ads.video.VideoJsInterface;
import com.startapp.android.publish.ads.video.a.b;
import com.startapp.android.publish.ads.video.b.b;
import com.startapp.android.publish.ads.video.b.c;
import com.startapp.android.publish.ads.video.e;
import com.startapp.android.publish.ads.video.f;
import com.startapp.android.publish.ads.video.h;
import com.startapp.android.publish.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.android.publish.ads.video.tracking.ActionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.FractionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingDetails;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.common.a.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class f
extends com.startapp.android.publish.ads.a.c {
    protected Handler A = new Handler();
    protected Handler B = new Handler();
    protected Handler C = new Handler();
    protected Handler D = new Handler();
    private RelativeLayout E;
    private RelativeLayout F;
    private int G = 0;
    private int H = 0;
    private boolean I = false;
    private HashMap<Integer, Boolean> J = new HashMap();
    private HashMap<Integer, Boolean> K = new HashMap();
    private int L = 1;
    private boolean M = false;
    private boolean N = false;
    private Map<Integer, List<FractionTrackingLink>> O = new HashMap();
    private Map<Integer, List<AbsoluteTrackingLink>> P = new HashMap();
    private long Q;
    private VideoClickedTrackingParams.ClickOrigin R;
    private long S;
    private long T;
    protected com.startapp.android.publish.ads.video.b.c g;
    protected VideoView h;
    protected ProgressBar i;
    protected boolean j = false;
    protected int k = 0;
    protected int l = 0;
    protected boolean m;
    protected boolean n = false;
    protected boolean o = false;
    protected boolean p = false;
    protected boolean q = false;
    protected boolean r = false;
    protected int s = 0;
    protected boolean t = false;
    protected boolean u = false;
    protected boolean v = false;
    protected boolean w = false;
    protected int x = 0;
    protected int y;
    protected String z = null;

    private void Z() {
        if (this.h == null) {
            this.a(this.b().getApplicationContext());
        }
        if (this.g == null) {
            this.g = new com.startapp.android.publish.ads.video.b.b(this.h);
        }
        this.o = false;
        this.E.setBackgroundColor(-16777216);
        this.G();
        if (this.R()) {
            this.a.a().setVisibility(0);
            this.h.setVisibility(4);
        } else if (this.l != 0) {
            this.g.a(this.l);
            this.b(VideoPausedTrackingParams.PauseOrigin.EXTERNAL);
        }
        this.g.a(new c.f(){

            @Override
            public void a() {
                f.this.u = true;
                if (f.this.n && f.this.o) {
                    f.this.F();
                }
                if (f.this.X()) {
                    f.this.J();
                }
            }
        });
        this.g.a(new c.d(){

            @Override
            public void a() {
                if (!f.this.R()) {
                    f.this.a(c.a);
                }
                f.this.g.c();
            }
        });
        c.c c2 = new c.c(){

            @Override
            public void a(int n2) {
                if (f.this.t && f.this.u && f.this.g != null && f.this.g.e() != 0) {
                    StringBuilder stringBuilder = new StringBuilder("buffered percent = [");
                    stringBuilder.append(n2);
                    stringBuilder.append("]");
                    com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
                    f.this.s = n2;
                    int n3 = 100 * f.this.g.d() / f.this.g.e();
                    if (f.this.M()) {
                        if (!f.this.v && f.this.X()) {
                            f.this.J();
                            return;
                        }
                        if (f.this.s == 100 || f.this.s - n3 > com.startapp.android.publish.adsCommon.b.a().G().j()) {
                            f.this.H();
                            return;
                        }
                    } else if (f.this.s < 100 && f.this.s - n3 <= com.startapp.android.publish.adsCommon.b.a().G().k()) {
                        f.this.I();
                    }
                }
            }
        };
        this.g.a(new c.e(){

            @Override
            public boolean a(c.g g2) {
                f.this.u = false;
                if (f.this.t && f.this.x <= f.this.y && g2.c() > 0 && g2.b().equals((Object)b.a.a.toString())) {
                    f f2 = f.this;
                    f2.x = 1 + f2.x;
                    f.this.K();
                    f.this.g.a(f.this.T().getLocalVideoPath());
                    f.this.g.a(g2.c());
                    return true;
                }
                f.this.a(g2);
                return true;
            }
        });
        this.g.a(new c.b(){});
        this.g.a(c2);
        this.g.a(new c.a(){});
        com.startapp.common.a.c.a((View)this.h, new c.a(){

            @Override
            public void a(View view, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
                f.this.o = true;
                if (f.this.n && f.this.W()) {
                    f.this.F();
                }
            }
        });
    }

    private RelativeLayout a(Context context) {
        this.S = System.currentTimeMillis();
        this.F = (RelativeLayout)this.b().findViewById(1475346432);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.h = new VideoView(context);
        this.h.setId(100);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        this.i = new ProgressBar(context, null, 16843399);
        this.i.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(15);
        this.E = new RelativeLayout(context);
        this.E.setId(1475346436);
        this.b().setContentView((View)this.E);
        this.E.addView((View)this.h, (ViewGroup.LayoutParams)layoutParams2);
        this.E.addView((View)this.F, (ViewGroup.LayoutParams)layoutParams);
        this.E.addView((View)this.i, (ViewGroup.LayoutParams)layoutParams3);
        if (AdsConstants.a().booleanValue()) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(12);
            layoutParams4.addRule(14);
            this.E.addView(f.super.b(context), (ViewGroup.LayoutParams)layoutParams4);
        }
        this.a.a().setVisibility(4);
        return this.E;
    }

    static /* synthetic */ String a(f f2) {
        return f2.aw();
    }

    private void a(int n2, Handler handler, Runnable runnable) {
        if (this.l < n2) {
            handler.postDelayed(runnable, (long)(n2 - this.l));
        }
    }

    private void a(View view) {
        Object[] arrobject = new Object[]{com.startapp.android.publish.adsCommon.Utils.h.b((Context)this.b(), view.getLeft()), com.startapp.android.publish.adsCommon.Utils.h.b((Context)this.b(), view.getTop()), com.startapp.android.publish.adsCommon.Utils.h.b((Context)this.b(), view.getWidth()), com.startapp.android.publish.adsCommon.Utils.h.b((Context)this.b(), view.getHeight())};
        this.a("videoApi.setVideoFrame", arrobject);
    }

    static /* synthetic */ void a(f f2, String string, Object[] arrobject) {
        f2.a(string, arrobject);
    }

    private void a(VideoClickedTrackingParams.ClickOrigin clickOrigin) {
        StringBuilder stringBuilder = new StringBuilder("Sending video clicked event with origin: ");
        stringBuilder.append(clickOrigin.toString());
        com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
        VideoTrackingLink[] arrvideoTrackingLink = this.T().getVideoTrackingDetails().getVideoClickTrackingUrls();
        VideoClickedTrackingParams videoClickedTrackingParams = new VideoClickedTrackingParams(this.n(), f.super.h(this.G), this.k, clickOrigin, this.z);
        f.super.a(arrvideoTrackingLink, videoClickedTrackingParams, this.G, "clicked");
    }

    private void a(VideoPausedTrackingParams.PauseOrigin pauseOrigin) {
        if (this.g != null) {
            int n2;
            this.l = n2 = this.g.d();
            this.G = n2;
            this.g.b();
        }
        f.super.c(pauseOrigin);
    }

    private void a(VideoTrackingLink[] arrvideoTrackingLink, VideoTrackingParams videoTrackingParams, int n2, String string) {
        com.startapp.android.publish.ads.video.a.a a2 = new com.startapp.android.publish.ads.video.a.b(arrvideoTrackingLink, videoTrackingParams, this.T().getVideoUrl(), n2).a(string).a();
        h.a((Context)this.b(), a2);
    }

    private void aA() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending skip event");
        this.a(this.T().getVideoTrackingDetails().getVideoSkippedUrls(), new VideoTrackingParams(this.n(), this.h(this.G), this.k, this.z), this.G, "skipped");
    }

    private void aB() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending postroll closed event");
        this.a(this.T().getVideoTrackingDetails().getVideoPostRollClosedUrls(), new VideoTrackingParams(this.n(), this.h(this.G), this.k, this.z), this.G, "postrollClosed");
    }

    private void aC() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending video closed event");
        this.a(this.T().getVideoTrackingDetails().getVideoClosedUrls(), new VideoTrackingParams(this.n(), this.h(this.g.d()), this.k, this.z), this.g.d(), "closed");
    }

    private void aD() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending internal video event");
        com.startapp.android.publish.ads.video.a.a a2 = new com.startapp.android.publish.ads.video.a.b(this.T().getVideoTrackingDetails().getInlineErrorTrackingUrls(), new VideoTrackingParams(this.n(), this.h(this.G), this.k, this.z), this.T().getVideoUrl(), this.G).a(b.a.a).a("error").a();
        h.a((Context)this.b(), a2);
    }

    private void aa() {
        boolean bl2 = this.T().isVideoMuted() || com.startapp.android.publish.adsCommon.b.a().G().m().equals((Object)"muted");
        this.j = bl2;
    }

    private void ab() {
        if (this.g().equals((Object)"back")) {
            if (com.startapp.android.publish.adsCommon.b.a().G().a().equals((Object)n.a.d)) {
                this.M = true;
                this.N = true;
                return;
            }
            if (com.startapp.android.publish.adsCommon.b.a().G().a().equals((Object)n.a.b)) {
                this.M = true;
                this.N = false;
                return;
            }
            if (com.startapp.android.publish.adsCommon.b.a().G().a().equals((Object)n.a.c)) {
                this.M = false;
                this.N = true;
                return;
            }
            com.startapp.android.publish.adsCommon.b.a().G().a().equals((Object)n.a.a);
            this.M = false;
            this.N = false;
        }
    }

    private long ac() {
        long l2 = System.currentTimeMillis() - this.Q;
        if (this.l == 0 && this.k == 0 && l2 < 500L) {
            return Math.max((long)200L, (long)(500L - l2));
        }
        return 0L;
    }

    private void ad() {
        Object[] arrobject = new Object[1];
        boolean bl2 = this.g != null;
        arrobject[0] = bl2;
        this.a("videoApi.setReplayEnabled", arrobject);
        Object[] arrobject2 = new Object[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)a.b);
        stringBuilder.append("_");
        stringBuilder.append((Object)this.T().getPostRollType());
        arrobject2[0] = stringBuilder.toString();
        this.a("videoApi.setMode", arrobject2);
        Object[] arrobject3 = new Object[]{Boolean.TRUE};
        this.a("videoApi.setCloseable", arrobject3);
    }

    private void ae() {
        Object[] arrobject = new Object[]{this.T().isClickable()};
        this.a("videoApi.setClickableVideo", arrobject);
        Object[] arrobject2 = new Object[]{a.a.toString()};
        this.a("videoApi.setMode", arrobject2);
        Object[] arrobject3 = new Object[1];
        boolean bl2 = this.T().isCloseable() || this.N;
        arrobject3[0] = bl2;
        this.a("videoApi.setCloseable", arrobject3);
        boolean bl3 = this.av();
        Object[] arrobject4 = new Object[]{bl3};
        this.a("videoApi.setSkippable", arrobject4);
    }

    private void af() {
        Object[] arrobject = new Object[]{this.g.e() / 1000};
        this.a("videoApi.setVideoDuration", arrobject);
        this.O();
        this.ai();
        Object[] arrobject2 = new Object[]{this.l / 1000};
        this.a("videoApi.setVideoCurrentPosition", arrobject2);
    }

    private void ag() {
        this.B.post(new Runnable(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void run() {
                int n2 = this.a.O();
                if (n2 >= 1000) {
                    this.a.B.postDelayed((Runnable)this, this.a.c(n2));
                }
            }
        });
    }

    private void ah() {
        this.ai();
        this.B.post(new Runnable(this){
            final /* synthetic */ f a;
            private boolean b;
            private final int c;
            {
                this.a = f2;
                this.c = this.a.e(com.startapp.android.publish.adsCommon.b.a().G().d());
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                try {
                    int n2 = this.a.d(50 + this.a.g.d());
                    if (n2 >= 0 && !this.b) {
                        if (n2 != 0 && this.a.l < 1000 * this.a.T().getSkippableAfter()) {
                            f f2 = this.a;
                            Object[] arrobject = new Object[]{n2};
                            f.b(f2, "videoApi.setSkipTimer", arrobject);
                        } else {
                            this.b = true;
                            f f3 = this.a;
                            Object[] arrobject = new Object[]{0};
                            f.a(f3, "videoApi.setSkipTimer", arrobject);
                        }
                    }
                    if (this.a.t && this.a.g.d() >= this.c) {
                        this.a.S();
                    }
                    int n3 = (50 + this.a.g.d()) / 1000;
                    f f4 = this.a;
                    Object[] arrobject = new Object[]{n3};
                    f.c(f4, "videoApi.setVideoCurrentPosition", arrobject);
                    if (n3 < this.a.g.e() / 1000) {
                        this.a.B.postDelayed((Runnable)this, this.a.P());
                    }
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
        });
    }

    private void ai() {
        int n2 = this.d(50 + this.l);
        Object[] arrobject = new Object[]{n2};
        this.a("videoApi.setSkipTimer", arrobject);
    }

    private int aj() {
        if (this.g.d() == this.g.e() && !this.R()) {
            return this.g.e();
        }
        return this.g.e() - this.g.d();
    }

    private void ak() {
        this.l = -1;
    }

    private void al() {
        this.H = this.g.e();
        this.am();
        this.an();
    }

    private void am() {
        Iterator iterator = this.O.keySet().iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            this.a(this.e(n2), this.A, new Runnable(this, n2){
                final /* synthetic */ int a;
                final /* synthetic */ f b;
                {
                    this.b = f2;
                    this.a = n2;
                }

                public void run() {
                    try {
                        this.b.f(this.a);
                        return;
                    }
                    catch (Exception exception) {
                        com.startapp.android.publish.adsCommon.e.f.a(this.b.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.scheduleFractionProgressEvents", exception.getMessage()), f.a(this.b));
                        return;
                    }
                }
            });
        }
    }

    private void an() {
        Iterator iterator = this.P.keySet().iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            this.a(n2, this.A, new Runnable(this, n2){
                final /* synthetic */ int a;
                final /* synthetic */ f b;
                {
                    this.b = f2;
                    this.a = n2;
                }

                public void run() {
                    try {
                        this.b.g(this.a);
                        return;
                    }
                    catch (Exception exception) {
                        com.startapp.android.publish.adsCommon.e.f.a(this.b.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.scheduleAbsoluteProgressEvents", exception.getMessage()), f.a(this.b));
                        return;
                    }
                }
            });
        }
    }

    private void ao() {
        if (!this.t) {
            this.a(this.e(com.startapp.android.publish.adsCommon.b.a().G().d()), this.C, new Runnable(this){
                final /* synthetic */ f a;
                {
                    this.a = f2;
                }

                public void run() {
                    try {
                        this.a.S();
                        return;
                    }
                    catch (Exception exception) {
                        com.startapp.android.publish.adsCommon.e.f.a(this.a.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.scheduleVideoListenerEvents", exception.getMessage()), f.a(this.a));
                        return;
                    }
                }
            });
        }
    }

    private boolean ap() {
        return this.w().getType() == Ad.AdType.REWARDED_VIDEO;
    }

    private Runnable aq() {
        return new Runnable(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void run() {
                this.a.j = true ^ this.a.j;
                this.a.V();
                this.a.a(this.a.j);
            }
        };
    }

    private Runnable ar() {
        return new Runnable(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void run() {
                this.a.U();
            }
        };
    }

    private Runnable as() {
        return new Runnable(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void run() {
                f f2 = this.a;
                f2.k = 1 + f2.k;
                this.a.h.setVisibility(0);
                this.a.m = false;
                this.a.Q();
                this.a.N();
                this.a.G();
            }
        };
    }

    private void at() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", (Serializable)AdDisplayListener.NotDisplayedReason.VIDEO_ERROR);
        com.startapp.common.b.a((Context)this.b()).a(intent);
        this.q = true;
    }

    private void au() {
        com.startapp.common.a.h.a("VideoMode", 3, "Releasing video player");
        if (this.g != null) {
            this.g.g();
            this.g = null;
        }
    }

    private boolean av() {
        return this.k > 0 || this.T().isSkippable() || this.M;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String aw() {
        try {
            String[] arrstring = this.h();
            if (arrstring != null && arrstring.length > 0) {
                return com.startapp.android.publish.adsCommon.c.e(arrstring[0]);
            }
            com.startapp.common.a.h.a("VideoMode", 5, "dParam is not available.");
            return "";
        }
        catch (Exception exception) {}
        return "";
    }

    private void ax() {
        AbsoluteTrackingLink[] arrabsoluteTrackingLink;
        FractionTrackingLink[] arrfractionTrackingLink = this.T().getVideoTrackingDetails().getFractionTrackingUrls();
        int n2 = 0;
        if (arrfractionTrackingLink != null) {
            for (FractionTrackingLink fractionTrackingLink : arrfractionTrackingLink) {
                List list = (List)this.O.get((Object)fractionTrackingLink.getFraction());
                if (list == null) {
                    list = new ArrayList();
                    this.O.put((Object)fractionTrackingLink.getFraction(), (Object)list);
                }
                list.add((Object)fractionTrackingLink);
            }
        }
        if ((arrabsoluteTrackingLink = this.T().getVideoTrackingDetails().getAbsoluteTrackingUrls()) != null) {
            int n3 = arrabsoluteTrackingLink.length;
            while (n2 < n3) {
                AbsoluteTrackingLink absoluteTrackingLink = arrabsoluteTrackingLink[n2];
                List list = (List)this.P.get((Object)absoluteTrackingLink.getVideoOffsetMillis());
                if (list == null) {
                    list = new ArrayList();
                    this.P.put((Object)absoluteTrackingLink.getVideoOffsetMillis(), (Object)list);
                }
                list.add((Object)absoluteTrackingLink);
                ++n2;
            }
        }
    }

    private void ay() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending postroll impression event");
        this.a(this.T().getVideoTrackingDetails().getVideoPostRollImpressionUrls(), new VideoTrackingParams(this.n(), this.h(this.G), this.k, this.z), this.G, "postrollImression");
    }

    private void az() {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending rewarded event");
        this.a(this.T().getVideoTrackingDetails().getVideoRewardedUrls(), new VideoTrackingParams(this.n(), com.startapp.android.publish.adsCommon.b.a().G().d(), this.k, this.z), this.e(com.startapp.android.publish.adsCommon.b.a().G().d()), "rewarded");
    }

    private View b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("url=");
        stringBuilder2.append(this.T().getVideoUrl());
        stringBuilder.append(stringBuilder2.toString());
        TextView textView = new TextView(context);
        textView.setBackgroundColor(-16777216);
        com.startapp.common.a.c.a((View)textView, 0.5f);
        textView.setTextColor(-7829368);
        textView.setSingleLine(false);
        textView.setText((CharSequence)stringBuilder.toString());
        return textView;
    }

    static /* synthetic */ void b(f f2, String string, Object[] arrobject) {
        f2.a(string, arrobject);
    }

    private void b(VideoPausedTrackingParams.PauseOrigin pauseOrigin) {
        f.super.d(pauseOrigin);
        this.L = 1 + this.L;
    }

    static /* synthetic */ void c(f f2, String string, Object[] arrobject) {
        f2.a(string, arrobject);
    }

    private void c(VideoPausedTrackingParams.PauseOrigin pauseOrigin) {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending pause event with origin: ".concat(String.valueOf((Object)((Object)pauseOrigin))));
        VideoTrackingLink[] arrvideoTrackingLink = this.T().getVideoTrackingDetails().getVideoPausedUrls();
        VideoPausedTrackingParams videoPausedTrackingParams = new VideoPausedTrackingParams(this.n(), f.super.h(this.G), this.k, this.L, pauseOrigin, this.z);
        f.super.a(arrvideoTrackingLink, videoPausedTrackingParams, this.G, "paused");
    }

    private void d(VideoPausedTrackingParams.PauseOrigin pauseOrigin) {
        com.startapp.common.a.h.a("VideoMode", 3, "Sending resume event with pause origin: ".concat(String.valueOf((Object)((Object)pauseOrigin))));
        VideoTrackingLink[] arrvideoTrackingLink = this.T().getVideoTrackingDetails().getVideoResumedUrls();
        VideoPausedTrackingParams videoPausedTrackingParams = new VideoPausedTrackingParams(this.n(), f.super.h(this.G), this.k, this.L, pauseOrigin, this.z);
        f.super.a(arrvideoTrackingLink, videoPausedTrackingParams, this.G, "resumed");
    }

    private int h(int n2) {
        if (this.H > 0) {
            return n2 * 100 / this.H;
        }
        return 0;
    }

    @Override
    public void A() {
        if (!this.q) {
            if (!this.R() && this.h != null) {
                this.aC();
                return;
            }
            this.aB();
            super.A();
            return;
        }
        com.startapp.common.a.h.a("VideoMode", 3, "Not sending close events due to media player error");
    }

    @Override
    public com.startapp.android.publish.adsCommon.d.b C() {
        return new VideoTrackingParams(this.n(), 0, this.k, this.z);
    }

    @Override
    public String D() {
        this.T = System.currentTimeMillis();
        double d2 = this.T - this.S;
        Double.isNaN((double)d2);
        return String.valueOf((double)(d2 / 1000.0));
    }

    @Override
    public long E() {
        if (this.o() != null) {
            return TimeUnit.SECONDS.toMillis(this.o().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABVideoImpressionDelayInSeconds());
    }

    protected void F() {
        if (this.p) {
            this.a((View)this.h);
            if (!this.R()) {
                this.ae();
            }
        }
    }

    protected void G() {
        boolean bl2 = com.startapp.android.publish.adsCommon.b.a().G().i();
        String string = this.T().getLocalVideoPath();
        if (string != null) {
            this.g.a(string);
            if (bl2 && com.startapp.android.publish.ads.video.c.a().b(string)) {
                com.startapp.common.a.h.a("VideoMode", 3, "progressive video from local file");
                this.t = true;
                this.w = true;
                this.s = com.startapp.android.publish.adsCommon.b.a().G().k();
            }
        } else if (bl2) {
            com.startapp.common.a.h.a("VideoMode", 3, "progressive video from url");
            String string2 = this.T().getVideoUrl();
            com.startapp.android.publish.ads.video.c.a().a(string2);
            this.g.a(string2);
            this.t = true;
            this.K();
        } else {
            this.a(c.c);
        }
        if (this.z == null) {
            String string3 = this.t ? "2" : "1";
            this.z = string3;
        }
    }

    protected void H() {
        StringBuilder stringBuilder = new StringBuilder("progressive video resumed, buffered percent: [");
        stringBuilder.append(Integer.toString((int)this.s));
        stringBuilder.append("]");
        com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
        this.g.a();
        this.L();
    }

    protected void I() {
        StringBuilder stringBuilder = new StringBuilder("progressive video paused, buffered percent: [");
        stringBuilder.append(Integer.toString((int)this.s));
        stringBuilder.append("]");
        com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
        this.g.b();
        this.K();
    }

    protected void J() {
        this.v = true;
        this.af();
        if (this.R()) {
            this.g.b();
            return;
        }
        new Handler().postDelayed(new Runnable(this){
            final /* synthetic */ f a;
            {
                this.a = f2;
            }

            public void run() {
                if (this.a.g != null) {
                    this.a.g.a();
                    this.a.p = true;
                    this.a.L();
                    new Handler().post(new Runnable(this){
                        final /* synthetic */ 18 a;
                        {
                            this.a = var1;
                        }

                        public void run() {
                            this.a.a.F();
                        }
                    });
                }
            }
        }, this.ac());
        if (this.l == 0) {
            this.A.postDelayed(new Runnable(this){
                final /* synthetic */ f a;
                {
                    this.a = f2;
                }

                public void run() {
                    try {
                        if (this.a.g != null) {
                            if (this.a.g.d() > 0) {
                                this.a.f(0);
                                this.a.g(0);
                                if (this.a.k == 0) {
                                    this.a.Y();
                                    com.startapp.common.b.a((Context)this.a.b()).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                                    return;
                                }
                            } else if (!this.a.q) {
                                this.a.A.postDelayed((Runnable)this, 100L);
                            }
                        }
                        return;
                    }
                    catch (Exception exception) {
                        com.startapp.android.publish.adsCommon.e.f.a(this.a.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.startVideoPlayback", exception.getMessage()), f.a(this.a));
                        this.a.p();
                        return;
                    }
                }
            }, 100L);
        }
        this.al();
        this.ao();
        this.ag();
        this.ah();
        this.a.a().setVisibility(4);
        this.V();
    }

    protected void K() {
        if (!this.M()) {
            this.r = false;
            this.D.postDelayed(new Runnable(this){
                final /* synthetic */ f a;
                {
                    this.a = f2;
                }

                public void run() {
                    try {
                        this.a.i.setVisibility(0);
                        this.a.D.postDelayed(new Runnable(this){
                            final /* synthetic */ 2 a;
                            {
                                this.a = var1;
                            }

                            public void run() {
                                com.startapp.common.a.h.a("VideoMode", 5, "Buffering timeout reached");
                                try {
                                    this.a.a.L();
                                    this.a.a.r = true;
                                    this.a.a.a(new c.g(c.h.c, "Buffering timeout reached", this.a.a.l));
                                    return;
                                }
                                catch (Exception exception) {
                                    com.startapp.android.publish.adsCommon.e.f.a(this.a.a.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.startBufferingIndicator", exception.getMessage()), "");
                                    return;
                                }
                            }
                        }, com.startapp.android.publish.adsCommon.b.a().G().g());
                        return;
                    }
                    catch (Exception exception) {
                        this.a.L();
                        com.startapp.android.publish.adsCommon.e.f.a(this.a.b().getApplicationContext(), new com.startapp.android.publish.adsCommon.e.e(d.b, "VideoMode.startBufferingIndicator", exception.getMessage()), f.a(this.a));
                        return;
                    }
                }
            }, com.startapp.android.publish.adsCommon.b.a().G().f());
        }
    }

    protected void L() {
        this.D.removeCallbacksAndMessages(null);
        if (this.M()) {
            this.i.setVisibility(8);
        }
    }

    protected boolean M() {
        return this.i != null && this.i.isShown();
    }

    protected void N() {
        Object[] arrobject = new Object[]{0};
        this.a("videoApi.setVideoCurrentPosition", arrobject);
        Object[] arrobject2 = new Object[]{0};
        this.a("videoApi.setSkipTimer", arrobject2);
    }

    protected int O() {
        int n2 = this.aj();
        int n3 = n2 / 1000;
        if (n3 > 0 && n2 % 1000 < 100) {
            --n3;
        }
        Object[] arrobject = new Object[]{n3};
        this.a("videoApi.setVideoRemainingTimer", arrobject);
        return n2;
    }

    protected long P() {
        return 1000 - this.g.d() % 1000;
    }

    protected void Q() {
        this.l = 0;
    }

    protected boolean R() {
        return this.l == -1;
    }

    protected void S() {
        if (this.ap() && !this.I && this.k == 0) {
            this.I = true;
            com.startapp.common.a.h.a("VideoMode", 3, "Sending rewarded video completion broadcast.");
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            if (com.startapp.common.b.a((Context)this.b()).a(intent)) {
                com.startapp.common.a.h.a("VideoMode", 3, "Rewarded video completion broadcast sent successfully.");
            }
            this.az();
        }
    }

    protected VideoAdDetails T() {
        return ((e)this.w()).d();
    }

    protected void U() {
        if (this.M()) {
            this.L();
        }
        this.a(c.c);
        this.aA();
    }

    /*
     * Exception decompiling
     */
    protected void V() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl17.1 : ICONST_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    protected boolean W() {
        return this.g != null && this.g.f();
    }

    protected boolean X() {
        if (!this.t) {
            return this.W() && this.n;
        }
        return this.s >= com.startapp.android.publish.adsCommon.b.a().G().k() && this.W() && this.n;
    }

    protected void Y() {
        super.y();
        this.a(this.T().getVideoTrackingDetails().getImpressionUrls(), new VideoTrackingParams(this.n(), 0, this.k, this.z), 0, "impression");
        this.a(this.T().getVideoTrackingDetails().getCreativeViewUrls(), new VideoTrackingParams(this.n(), 0, this.k, this.z), 0, "creativeView");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(Bundle bundle) {
        super.a(bundle);
        try {
            this.Q = System.currentTimeMillis();
            this.y = 100 / com.startapp.android.publish.adsCommon.b.a().G().j();
            f.super.ab();
            f.super.ax();
            f.super.aa();
            if (bundle == null) return;
        }
        catch (Exception exception) {
            f.super.at();
            Context context = this.b().getApplicationContext();
            d d2 = d.b;
            StringBuilder stringBuilder = new StringBuilder("packages : ");
            stringBuilder.append((Object)this.j());
            com.startapp.android.publish.adsCommon.e.f.a(context, d2, "VideoMode.onCreate", stringBuilder.toString(), "");
            this.p();
            return;
        }
        if (!bundle.containsKey("currentPosition")) return;
        this.l = bundle.getInt("currentPosition");
        this.G = bundle.getInt("latestPosition");
        this.J = (HashMap)bundle.getSerializable("fractionProgressImpressionsSent");
        this.K = (HashMap)bundle.getSerializable("absoluteProgressImpressionsSent");
        this.j = bundle.getBoolean("isMuted");
        this.m = bundle.getBoolean("shouldSetBg");
        this.k = bundle.getInt("replayNum");
        this.I = bundle.getBoolean("videoCompletedBroadcastSent", false);
        this.L = bundle.getInt("pauseNum");
    }

    @Override
    public void a(WebView webView) {
        super.a(webView);
        webView.setBackgroundColor(33554431);
        com.startapp.common.a.c.a(webView, null);
    }

    protected void a(c.g g2) {
        com.startapp.android.publish.adsCommon.e.f.a((Context)this.b(), d.f, g2.a().toString(), g2.b(), f.super.aw());
        f.super.aD();
        int n2 = this.t ? this.g.d() : this.l;
        if (n2 == 0) {
            com.startapp.android.publish.adsCommon.c.a((Context)this.b(), this.h(), this.n(), this.k, AdDisplayListener.NotDisplayedReason.VIDEO_ERROR.toString());
            if (!this.t) {
                h.b((Context)this.b());
            } else if (!g2.a().equals((Object)c.h.c)) {
                h.b((Context)this.b());
            }
        }
        if (f.super.ap() && !this.I || this.T().getPostRollType() == VideoAdDetails.PostRollType.NONE) {
            f.super.at();
            this.p();
            return;
        }
        this.a(c.c);
    }

    protected void a(c c2) {
        if (c2 != c.c && c2 != c.b) {
            this.G = this.H;
            this.S();
        } else {
            this.A.removeCallbacksAndMessages(null);
            this.C.removeCallbacksAndMessages(null);
            if (this.g != null) {
                this.G = this.g.d();
                this.g.b();
            }
        }
        this.B.removeCallbacksAndMessages(null);
        this.J.clear();
        this.K.clear();
        if (c2 == c.b) {
            f.super.ak();
            return;
        }
        if (this.T().getPostRollType() != VideoAdDetails.PostRollType.NONE) {
            f.super.ad();
            this.a.a().setVisibility(0);
        }
        if (this.T().getPostRollType() == VideoAdDetails.PostRollType.IMAGE) {
            new Handler().postDelayed(new Runnable((f)this){
                final /* synthetic */ f a;
                {
                    this.a = f2;
                }

                public void run() {
                    if (!this.a.r) {
                        this.a.h.setVisibility(4);
                    }
                }
            }, 1000L);
        } else if (this.T().getPostRollType() == VideoAdDetails.PostRollType.NONE) {
            this.p();
        }
        f.super.ak();
        if (this.T().getPostRollType() != VideoAdDetails.PostRollType.NONE) {
            f.super.ay();
        }
    }

    protected void a(boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder("Sending sound ");
        String string = bl2 ? "muted " : "unmuted ";
        stringBuilder.append(string);
        stringBuilder.append("event");
        com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
        VideoTrackingLink[] arrvideoTrackingLink = bl2 ? this.T().getVideoTrackingDetails().getSoundMuteUrls() : this.T().getVideoTrackingDetails().getSoundUnmuteUrls();
        f.super.a(arrvideoTrackingLink, new VideoTrackingParams(this.n(), f.super.h(this.g.d()), this.k, this.z), this.g.d(), "sound");
    }

    @Override
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putInt("currentPosition", this.l);
        bundle.putInt("latestPosition", this.G);
        bundle.putSerializable("fractionProgressImpressionsSent", this.J);
        bundle.putSerializable("absoluteProgressImpressionsSent", this.K);
        bundle.putBoolean("isMuted", this.j);
        bundle.putBoolean("shouldSetBg", this.m);
        bundle.putInt("replayNum", this.k);
        bundle.putInt("pauseNum", this.L);
        bundle.putBoolean("videoCompletedBroadcastSent", this.I);
    }

    @Override
    public boolean b(String string) {
        VideoClickedTrackingParams.ClickOrigin clickOrigin = this.R() ? VideoClickedTrackingParams.ClickOrigin.POSTROLL : VideoClickedTrackingParams.ClickOrigin.VIDEO;
        this.R = clickOrigin;
        StringBuilder stringBuilder = new StringBuilder("Video clicked from: ");
        stringBuilder.append((Object)this.R);
        com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
        if (this.R == VideoClickedTrackingParams.ClickOrigin.VIDEO) {
            this.a(c.b);
        }
        f.super.a(this.R);
        return super.b(string);
    }

    protected long c(int n2) {
        int n3 = n2 % 1000;
        if (n3 == 0) {
            n3 = 1000;
        }
        return n3 + 50;
    }

    protected int d(int n2) {
        if (this.M) {
            return 0;
        }
        if (this.k > 0) {
            return 0;
        }
        int n3 = 1000 * this.T().getSkippableAfter() - n2;
        if (n3 <= 0) {
            return 0;
        }
        return 1 + n3 / 1000;
    }

    protected int e(int n2) {
        return n2 * this.H / 100;
    }

    protected void f(int n2) {
        if (this.J.get((Object)n2) == null) {
            if (this.O.containsKey((Object)n2)) {
                List list = (List)this.O.get((Object)n2);
                StringBuilder stringBuilder = new StringBuilder("Sending fraction progress event with fraction: ");
                stringBuilder.append(n2);
                stringBuilder.append(", total: ");
                stringBuilder.append(list.size());
                com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
                f.super.a((VideoTrackingLink[])list.toArray((Object[])new FractionTrackingLink[list.size()]), new VideoProgressTrackingParams(this.n(), n2, this.k, this.z), this.e(n2), "fraction");
            }
            this.J.put((Object)n2, (Object)Boolean.TRUE);
            return;
        }
        com.startapp.common.a.h.a("VideoMode", 3, "Fraction progress event already sent for fraction: ".concat(String.valueOf((int)n2)));
    }

    protected void g(int n2) {
        if (this.K.get((Object)n2) == null) {
            if (this.P.containsKey((Object)n2)) {
                List list = (List)this.P.get((Object)n2);
                StringBuilder stringBuilder = new StringBuilder("Sending absolute progress event with video progress: ");
                stringBuilder.append(n2);
                stringBuilder.append(", total: ");
                stringBuilder.append(list.size());
                com.startapp.common.a.h.a("VideoMode", 3, stringBuilder.toString());
                f.super.a((VideoTrackingLink[])list.toArray((Object[])new AbsoluteTrackingLink[list.size()]), new VideoProgressTrackingParams(this.n(), n2, this.k, this.z), n2, "absolute");
            }
            this.K.put((Object)n2, (Object)Boolean.TRUE);
            return;
        }
        com.startapp.common.a.h.a("VideoMode", 3, "Absolute progress event already sent for video progress: ".concat(String.valueOf((int)n2)));
    }

    @Override
    public void p() {
        super.p();
        if (this.w) {
            com.startapp.android.publish.ads.video.c.a().c(this.T().getLocalVideoPath());
        }
    }

    @Override
    public void q() {
        if (!this.q) {
            super.q();
        }
    }

    @Override
    public boolean r() {
        if (this.R()) {
            this.A();
            return false;
        }
        int n2 = this.d(50 + this.g.d());
        if (this.av() && n2 == 0) {
            this.U();
            return true;
        }
        if (!this.T().isCloseable() && !this.N) {
            return true;
        }
        this.A();
        return false;
    }

    @Override
    public void s() {
        if (!(this.R() || this.b().isFinishing() || this.N || this.M)) {
            this.a(VideoPausedTrackingParams.PauseOrigin.EXTERNAL);
        }
        this.au();
        this.A.removeCallbacksAndMessages(null);
        this.B.removeCallbacksAndMessages(null);
        this.C.removeCallbacksAndMessages(null);
        this.L();
        this.m = true;
        super.s();
    }

    @Override
    public void u() {
        super.u();
        if (!this.b().isFinishing()) {
            this.Z();
        }
    }

    @Override
    public JsInterface x() {
        VideoJsInterface videoJsInterface = new VideoJsInterface((Context)this.b(), this.e, this.e, this.as(), this.ar(), this.aq(), new com.startapp.android.publish.adsCommon.d.b(this.n()), this.a(0));
        return videoJsInterface;
    }

    @Override
    public void y() {
    }

    @Override
    public void z() {
        super.z();
        this.n = true;
        if (this.o && this.W()) {
            this.F();
        } else if (this.R()) {
            this.a((View)this.d);
        }
        if (this.X()) {
            this.J();
        }
        if (this.R()) {
            this.ad();
        }
    }

}

