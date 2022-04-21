
package com.startapp.android.publish.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.android.publish.ads.b.d;
import com.startapp.android.publish.ads.b.e;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b.c;
import com.startapp.android.publish.cache.b;
import com.startapp.android.publish.cache.f;
import com.startapp.android.publish.cache.i;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
    public static boolean h;
    protected final AdPreferences.Placement a;
    protected com.startapp.android.publish.adsCommon.g b = null;
    protected AtomicBoolean c = new AtomicBoolean(false);
    protected long d;
    protected f e = null;
    protected b f = null;
    protected Map<AdEventListener, List<StartAppAd>> g = new ConcurrentHashMap();
    private Context i;
    private com.startapp.android.publish.adsCommon.a j;
    private AdPreferences k;
    private String l = null;
    private boolean m = false;

    public g(Context context, AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.a = placement;
        this.k = adPreferences;
        g.super.a(context);
        g.super.k();
    }

    private void a(Context context) {
        if (context instanceof Activity) {
            this.i = context.getApplicationContext();
            this.j = new com.startapp.android.publish.adsCommon.a((Activity)context);
            return;
        }
        this.i = context;
        this.j = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(StartAppAd startAppAd, AdEventListener adEventListener, boolean bl2) {
        Map<AdEventListener, List<StartAppAd>> map;
        Map<AdEventListener, List<StartAppAd>> map2 = map = this.g;
        synchronized (map2) {
            boolean bl3 = !this.g() || g.super.o() || bl2;
            if (bl3) {
                if (startAppAd != null && adEventListener != null) {
                    List list = (List)this.g.get((Object)adEventListener);
                    if (list == null) {
                        list = new ArrayList();
                        this.g.put((Object)adEventListener, (Object)list);
                    }
                    list.add((Object)startAppAd);
                }
                if (!this.c.compareAndSet(false, true)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)this.a);
                    stringBuilder.append(" ad is currently loading");
                    h.a("CachedAd", 3, stringBuilder.toString());
                    return;
                }
                this.e.g();
                this.f.g();
                g.super.l();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.a);
                stringBuilder.append(" ad already loaded");
                h.a("CachedAd", 3, stringBuilder.toString());
                if (startAppAd != null && adEventListener != null) {
                    new com.startapp.android.publish.adsCommon.adListeners.b(adEventListener).onReceiveAd(startAppAd);
                }
            }
            return;
        }
    }

    private void k() {
        this.e = new f(this);
        this.f = new b(this);
    }

    private void l() {
        if (this.b != null) {
            this.b.setVideoCancelCallBack(false);
        }
        if (this.m()) {
            this.a(false);
            this.n();
            return;
        }
        this.j();
    }

    private boolean m() {
        return this.m && this.l != null;
    }

    private void n() {
        StringBuilder stringBuilder = new StringBuilder("Loading ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" from disk file name: ");
        stringBuilder.append(this.l);
        h.a("CachedAd", 4, stringBuilder.toString());
        AdEventListener adEventListener = new AdEventListener(new a()){
            final /* synthetic */ a a;
            {
                this.a = a2;
            }

            @Override
            public void onFailedToReceiveAd(Ad ad2) {
                StringBuilder stringBuilder = new StringBuilder("Failed to load ");
                stringBuilder.append((Object)g.this.a);
                stringBuilder.append(" from disk");
                h.a("CachedAd", 3, stringBuilder.toString());
                g.this.b = null;
                g.this.j();
            }

            @Override
            public void onReceiveAd(Ad ad2) {
                this.a.onReceiveAd(ad2);
            }
        };
        i.a(this.i, this.l, new i.a(){

            @Override
            public void a(com.startapp.android.publish.adsCommon.g g2) {
                StringBuilder stringBuilder = new StringBuilder("Success loading from disk: ");
                stringBuilder.append((Object)g.this.a);
                h.a("CachedAd", 4, stringBuilder.toString());
                g.this.b = g2;
            }
        }, adEventListener);
    }

    private boolean o() {
        if (this.b == null) {
            return false;
        }
        return this.b.hasAdCacheTtlPassed();
    }

    private com.startapp.android.publish.adsCommon.g p() {
        int n2 = com.startapp.android.publish.adsCommon.b.a().d();
        boolean bl2 = new Random().nextInt(100) < n2;
        boolean bl3 = com.startapp.android.publish.adsCommon.Utils.i.a(this.k, "forceOfferWall3D");
        boolean bl4 = true ^ com.startapp.android.publish.adsCommon.Utils.i.a(this.k, "forceOfferWall2D");
        boolean bl5 = com.startapp.android.publish.adsCommon.Utils.i.a(64L);
        if (!(this.q() || bl5 && (bl2 || bl3) && bl4)) {
            return new com.startapp.android.publish.ads.c.a.b(this.i);
        }
        return new com.startapp.android.publish.ads.c.b.b(this.i);
    }

    private boolean q() {
        return com.startapp.android.publish.adsCommon.Utils.i.a(64L) && !com.startapp.android.publish.adsCommon.Utils.i.a(128L);
    }

    public AdPreferences a() {
        return this.k;
    }

    public void a(StartAppAd startAppAd, AdEventListener adEventListener) {
        g.super.a(startAppAd, adEventListener, false);
    }

    protected void a(AdPreferences adPreferences) {
        this.k = adPreferences;
    }

    protected void a(String string) {
        this.l = string;
    }

    protected void a(boolean bl2) {
        this.m = bl2;
    }

    public com.startapp.android.publish.adsCommon.g b() {
        return this.b;
    }

    protected void b(boolean bl2) {
        g.super.a(null, null, bl2);
    }

    protected AdPreferences.Placement c() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void d() {
        StringBuilder stringBuilder = new StringBuilder("Invalidating: ");
        stringBuilder.append((Object)this.a);
        h.a("CachedAd", 4, stringBuilder.toString());
        if (this.g()) {
            if (!c.a(this.i, (Ad)((Object)this.b)) && !this.o()) {
                if (this.c.get()) return;
                this.e.f();
                return;
            }
            h.a("CachedAd", 3, "App present or cache TTL passed, reloading");
            this.b(true);
            return;
        }
        if (this.c.get()) return;
        this.f.f();
    }

    protected void e() {
        this.f.h();
    }

    protected void f() {
        this.e.h();
    }

    public boolean g() {
        return this.b != null && this.b.isReady();
    }

    public com.startapp.android.publish.adsCommon.g h() {
        com.startapp.android.publish.adsCommon.g g2;
        if (this.g()) {
            g2 = this.b;
            if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                StringBuilder stringBuilder = new StringBuilder("Ad shown, reloading ");
                stringBuilder.append((Object)this.a);
                h.a("CachedAd", 3, stringBuilder.toString());
                this.b(true);
                return g2;
            }
        } else {
            g2 = null;
        }
        return g2;
    }

    public com.startapp.android.publish.adsCommon.g i() {
        com.startapp.android.publish.adsCommon.g g2;
        com.startapp.android.publish.adsCommon.Utils.i.a(this.i, this.k);
        switch (3.a[this.a.ordinal()]) {
            default: {
                g2 = new d(this.i);
                break;
            }
            case 5: {
                g2 = new com.startapp.android.publish.ads.splash.b(this.i);
                break;
            }
            case 4: {
                g2 = new e(this.i);
                break;
            }
            case 3: {
                g2 = this.p();
                break;
            }
            case 2: {
                if (com.startapp.android.publish.adsCommon.Utils.i.a(4L)) {
                    g2 = new com.startapp.android.publish.ads.video.e(this.i);
                    break;
                }
                g2 = new d(this.i);
                break;
            }
            case 1: {
                g2 = new d(this.i);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("ad Type: [");
        stringBuilder.append(g2.getClass().toString());
        stringBuilder.append("]");
        h.a("CachedAd", 4, stringBuilder.toString());
        return g2;
    }

    protected void j() {
        StringBuilder stringBuilder = new StringBuilder("Loading ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" from server");
        h.a("CachedAd", 4, stringBuilder.toString());
        this.b = this.i();
        this.b.setActivityExtra(this.j);
        this.b.load(this.k, new a());
        this.d = System.currentTimeMillis();
    }

    class a
    implements AdEventListener {
        private boolean b = false;
        private boolean c = false;

        a() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void onFailedToReceiveAd(Ad ad2) {
            boolean bl2 = this.c;
            ConcurrentHashMap concurrentHashMap = null;
            if (!bl2) {
                Map<AdEventListener, List<StartAppAd>> map;
                ConcurrentHashMap concurrentHashMap2;
                Map<AdEventListener, List<StartAppAd>> map2 = map = g.this.g;
                synchronized (map2) {
                    concurrentHashMap2 = new ConcurrentHashMap(g.this.g);
                    g.this.b = null;
                    g.this.g.clear();
                }
                concurrentHashMap = concurrentHashMap2;
            }
            if (concurrentHashMap != null) {
                for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                    List list;
                    if (adEventListener == null || (list = (List)concurrentHashMap.get((Object)adEventListener)) == null) continue;
                    for (StartAppAd startAppAd : list) {
                        startAppAd.setErrorMessage(ad2.getErrorMessage());
                        new com.startapp.android.publish.adsCommon.adListeners.b(adEventListener).onFailedToReceiveAd(startAppAd);
                    }
                }
            }
            this.c = true;
            g.this.f.f();
            g.this.e.a();
            g.this.c.set(false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void onReceiveAd(Ad ad2) {
            boolean bl2 = g.this.b != null && g.this.b.getVideoCancelCallBack();
            if (!this.b && !bl2) {
                Map<AdEventListener, List<StartAppAd>> map;
                this.b = true;
                Map<AdEventListener, List<StartAppAd>> map2 = map = g.this.g;
                synchronized (map2) {
                    for (AdEventListener adEventListener : g.this.g.keySet()) {
                        List list;
                        if (adEventListener == null || (list = (List)g.this.g.get((Object)adEventListener)) == null) continue;
                        for (StartAppAd startAppAd : list) {
                            startAppAd.setErrorMessage(ad2.getErrorMessage());
                            new com.startapp.android.publish.adsCommon.adListeners.b(adEventListener).onReceiveAd(startAppAd);
                        }
                    }
                    g.this.g.clear();
                }
            }
            g.this.e.f();
            g.this.f.a();
            g.this.c.set(false);
        }
    }

}

