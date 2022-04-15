package com.startapp.android.publish.cache;
import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.cache.a;
import com.startapp.android.publish.cache.c;
import com.startapp.android.publish.cache.d;
import com.startapp.android.publish.cache.g;
import com.startapp.android.publish.cache.i;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import com.startapp.common.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a {
    private static a c = new a();
    Map<c, g> a = new ConcurrentHashMap();
    protected boolean b = false;
    private Map<String, String> d = new WeakHashMap();
    private boolean e = false;
    private Queue<a> f = new ConcurrentLinkedQueue();

    private a() {
    }

    public static a a() {
        return c;
    }

    private AdPreferences.Placement a(AdPreferences adPreferences) {
        int n2 = b.a().c();
        if ((new Random().nextInt(100) < n2 || com.startapp.android.publish.adsCommon.Utils.i.a(adPreferences, "forceFullpage")) && !com.startapp.android.publish.adsCommon.Utils.i.a(adPreferences, "forceOverlay")) {
            return AdPreferences.Placement.INAPP_FULL_SCREEN;
        }
        return AdPreferences.Placement.INAPP_OVERLAY;
    }

    private void a(StartAppAd.AdMode adMode, AdPreferences adPreferences) {
        if (adMode.equals((Object)StartAppAd.AdMode.REWARDED_VIDEO)) {
            com.startapp.android.publish.adsCommon.c.a(adPreferences, "type", Ad.AdType.REWARDED_VIDEO);
        }
        if (adMode.equals((Object)StartAppAd.AdMode.VIDEO)) {
            com.startapp.android.publish.adsCommon.c.a(adPreferences, "type", Ad.AdType.VIDEO);
        }
    }
    private void a(c c2, g g2, Context context) {
        Map<c, g> map;
        Map<c, g> map2 = map = this.a;
        synchronized (map2) {
            int n2 = d.a().b().getMaxCacheSize();
            if (n2 != 0 && this.c() >= n2) {
                long l2 = Long.MAX_VALUE;
                c c3 = null;
                for (c c4 : this.a.keySet()) {
                    g g3 = (g)this.a.get((Object)c4);
                    if (g3.c() != g2.c() || g3.d >= l2) continue;
                    l2 = g3.d;
                    c3 = c4;
                }
                if (c3 != null) {
                    this.a.remove(c3);
                }
            }
            this.a.put((Object)c2, (Object)g2);
            if (100.0 * Math.random() < (double)d.a().c()) {
                f.a(context, new e(com.startapp.android.publish.adsCommon.e.d.d, "Cache Size", String.valueOf((int)this.c())), "");
            }
            return;
        }
    }

    private void a(boolean bl2) {
        for (g g2 : this.a.values()) {
            if (g2.b() == null || !com.startapp.android.publish.adsCommon.Utils.i.a(2L) || !(g2.b() instanceof com.startapp.android.publish.ads.b.e) || bl2 || !d.a().b().shouldReturnAdLoadInBg()) {
                g2.f();
            }
            g2.e();
        }
    }
    private AdPreferences.Placement b(StartAppAd.AdMode var1, AdPreferences var2_2) {
        block14 : {
            block13 : {
                switch (5.a[var1.ordinal()]) {
                    default: {
                        return AdPreferences.Placement.INAPP_FULL_SCREEN;
                    }
                    case 6: {
                        if (com.startapp.android.publish.adsCommon.Utils.i.a(128L)) ** GOTO lbl9
                        var9_3 = com.startapp.android.publish.adsCommon.Utils.i.a(64L);
                        var5_4 = false;
                        if (!var9_3) ** GOTO lbl10
lbl9:
                        var5_4 = true;
lbl10:
                        var6_5 = com.startapp.android.publish.adsCommon.Utils.i.a(4L);
                        var7_6 = com.startapp.android.publish.adsCommon.Utils.i.a(2L);
                        if (var6_5 && var7_6 && var5_4) {
                            var8_7 = b.a().b();
                            if (new Random().nextInt(100) >= var8_7) return AdPreferences.Placement.INAPP_FULL_SCREEN;
                            return a.super.a(var2_2);
                        }
                        if (var6_5 != false) return AdPreferences.Placement.INAPP_OVERLAY;
                        if (var7_6) {
                            return AdPreferences.Placement.INAPP_OVERLAY;
                        }
                        if (var5_4 == false) return AdPreferences.Placement.INAPP_FULL_SCREEN;
                        return AdPreferences.Placement.INAPP_OFFER_WALL;
                    }
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        return AdPreferences.Placement.INAPP_OVERLAY;
                    }
                    case 1: 
                }
                if (com.startapp.android.publish.adsCommon.Utils.i.a(128L)) break block13;
                var4_8 = com.startapp.android.publish.adsCommon.Utils.i.a(64L);
                var3_9 = false;
                if (!var4_8) break block14;
            }
            var3_9 = true;
        }
        if (var3_9 != true) return AdPreferences.Placement.INAPP_FULL_SCREEN;
        return AdPreferences.Placement.INAPP_OFFER_WALL;
    }

    private void e(Context context) {
        h.a("AdCacheManager", 3, "Saving to disk: eneter save to disk ");
        if (a.super.e()) {
            h.a("AdCacheManager", 3, "Saving to disk: cache to disk is enebaled ");
            com.startapp.common.g.a(g.a.a, new Runnable((a)this, context){
                final /* synthetic */ Context a;
                final /* synthetic */ a b;
                {
                    this.b = a2;
                    this.a = context;
                }

                public void run() {
                    try {
                        for (java.util.Map$Entry entry : this.b.a.entrySet()) {
                            c c2 = (c)entry.getKey();
                            g g2 = (g)entry.getValue();
                            StringBuilder stringBuilder = new StringBuilder("Saving to disk: ");
                            stringBuilder.append(c2.toString());
                            h.a("AdCacheManager", 3, stringBuilder.toString());
                            i.a(this.a, c2.a(), g2.a(), this.b.c(c2));
                            i.a(this.a, g2, this.b.c(c2));
                        }
                        return;
                    }
                    catch (Exception exception) {
                        h.a("AdCacheManager", 3, "Saving to disk: exception caught");
                        f.a(this.a, com.startapp.android.publish.adsCommon.e.d.b, "AdCacheManager.saveToDisk - Unexpected Thread Exception", exception.getMessage(), "");
                        return;
                    }
                }
            });
        }
    }

    private boolean e() {
        return !this.b && d.a().b().isLocalCache();
    }

    public com.startapp.android.publish.adsCommon.g a(c c2) {
        if (c2 == null) {
            h.a("AdCacheManager", 3, "Cache key is null");
            return null;
        }
        h.a("AdCacheManager", 3, "Retrieving ad with ".concat(String.valueOf((Object)c2)));
        g g2 = (g)this.a.get((Object)c2);
        if (g2 != null) {
            return g2.h();
        }
        return null;
    }

    public c a(Context context, StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        AdPreferences.Placement placement = this.b(adMode, adPreferences2);
        this.a(adMode, adPreferences2);
        return this.a(context, startAppAd, placement, adPreferences2, adEventListener);
    }

    public c a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
        return this.a(context, startAppAd, placement, adPreferences, adEventListener, false);
    }
    protected c a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener, boolean bl2) {
        Map<c, g> map;
        g g2;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        c c2 = new c(placement, adPreferences2);
        if (this.e && !bl2) {
            h.a("AdCacheManager", 4, "Adding to pending queue: ".concat(String.valueOf((Object)((Object)placement))));
            Queue<a> queue = this.f;
            Object object = new Object(startAppAd, placement, adPreferences2, adEventListener){
                StartAppAd a;
                AdPreferences.Placement b;
                AdPreferences c;
                AdEventListener d;
                {
                    this.a = startAppAd;
                    this.b = placement;
                    this.c = adPreferences;
                    this.d = adEventListener;
                }
            };
            queue.add(object);
            return c2;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        Map<c, g> map2 = map = this.a;
        synchronized (map2) {
            g2 = (g)this.a.get((Object)c2);
            if (g2 == null) {
                StringBuilder stringBuilder = new StringBuilder("CachedAd for ");
                stringBuilder.append((Object)placement);
                stringBuilder.append(" not found. Adding new CachedAd with ");
                stringBuilder.append((Object)c2);
                h.a("AdCacheManager", 3, stringBuilder.toString());
                g2 = new g(context, placement, adPreferences3);
                if (bl2) {
                    g2.a(this.c(c2));
                    g2.a(true);
                }
                this.a(c2, g2, context);
            } else {
                StringBuilder stringBuilder = new StringBuilder("CachedAd for ");
                stringBuilder.append((Object)placement);
                stringBuilder.append(" already exists.");
                h.a("AdCacheManager", 3, stringBuilder.toString());
                g2.a(adPreferences3);
            }
        }
        g2.a(startAppAd, adEventListener);
        return c2;
    }

    public c a(Context context, StartAppAd startAppAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        h.a("AdCacheManager", 3, "Loading splash");
        return this.a(context, startAppAd, AdPreferences.Placement.INAPP_SPLASH, adPreferences, adEventListener);
    }

    public c a(Context context, AdPreferences adPreferences) {
        h.a("AdCacheManager", 3, "Loading return ad");
        return this.a(context, null, AdPreferences.Placement.INAPP_RETURN, adPreferences, null);
    }

    public String a(String string) {
        return this.a(string, UUID.randomUUID().toString());
    }

    public String a(String string, String string2) {
        this.d.put((Object)string2, (Object)string);
        return string2;
    }

    protected Set<StartAppAd.AdMode> a(Set<StartAppAd.AdMode> set) {
        if (!com.startapp.android.publish.adsCommon.Utils.i.a(128L) && !com.startapp.android.publish.adsCommon.Utils.i.a(64L)) {
            set.remove((Object)StartAppAd.AdMode.OFFERWALL);
        }
        if (!com.startapp.android.publish.adsCommon.Utils.i.a(2L) && !com.startapp.android.publish.adsCommon.Utils.i.a(4L)) {
            set.remove((Object)StartAppAd.AdMode.FULLPAGE);
        }
        if (!com.startapp.android.publish.adsCommon.Utils.i.a(4L)) {
            set.remove((Object)StartAppAd.AdMode.REWARDED_VIDEO);
            set.remove((Object)StartAppAd.AdMode.VIDEO);
        }
        return set;
    }

    public void a(final Context context) {
        if (a.super.e()) {
            this.e = true;
            i.a(context, new i.c(){

                @Override
                public void a(List<i.b> list) {
                    if (list != null) {
                        try {
                            for (i.b b2 : list) {
                                StringBuilder stringBuilder = new StringBuilder("Loading from disk: ");
                                stringBuilder.append((Object)b2.placement);
                                h.a("AdCacheManager", 4, stringBuilder.toString());
                                a.this.a(context, null, b2.a(), b2.b(), null, true);
                            }
                        }
                        catch (Exception exception) {
                            h.a("AdCacheManager", 6, "loadFromDisk - onCacheKeysLoaded failed", exception);
                        }
                    }
                    a.this.d(context);
                }
            });
        }
    }

    public void a(Context context, boolean bl2) {
        a.super.e(context);
        a.super.a(bl2);
    }

    public com.startapp.android.publish.adsCommon.g b(c c2) {
        g g2 = c2 != null ? (g)this.a.get((Object)c2) : null;
        if (g2 != null) {
            return g2.b();
        }
        return null;
    }

    public String b(String string) {
        return (String)this.d.get((Object)string);
    }
    public void b() {
        Map<c, g> map;
        if (this.e) {
            return;
        }
        Map<c, g> map2 = map = this.a;
        synchronized (map2) {
            Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                ((g)iterator.next()).d();
            }
            return;
        }
    }

    public void b(Context context) {
        this.b = true;
        i.a(context, new i.e(){

            @Override
            public void a() {
                a.this.b = false;
            }
        });
    }

    public int c() {
        return this.a.size();
    }

    protected String c(c c2) {
        return String.valueOf((int)c2.hashCode()).replace('-', '_');
    }

    public String c(String string) {
        StringBuilder stringBuilder = new StringBuilder("cache size: ");
        stringBuilder.append(this.d.size());
        stringBuilder.append(" - removing ");
        stringBuilder.append(string);
        h.a("AdCacheManager", 3, stringBuilder.toString());
        return (String)this.d.remove((Object)string);
    }
    public void c(final Context context) {
        Object object;
        com.startapp.android.publish.common.metaData.d d2 = new com.startapp.android.publish.common.metaData.d(){

            @Override
            public void a() {
                Set<StartAppAd.AdMode> set = d.a().b().getAutoLoad();
                if (set != null) {
                    for (StartAppAd.AdMode adMode : a.this.a(set)) {
                        int n2 = b.a().b();
                        if (adMode == StartAppAd.AdMode.FULLPAGE) {
                            if (n2 <= 0) continue;
                            a.this.a(context, null, StartAppAd.AdMode.FULLPAGE, new AdPreferences(), null);
                            continue;
                        }
                        if (adMode == StartAppAd.AdMode.OFFERWALL) {
                            if (n2 >= 100) continue;
                            a.this.a(context, null, StartAppAd.AdMode.OFFERWALL, new AdPreferences(), null);
                            continue;
                        }
                        a.this.a(context, null, adMode, new AdPreferences(), null);
                    }
                }
            }

            @Override
            public void b() {
                h.a("AdCacheManager", 3, "Failed loading metadata, unable to pre-cache.");
            }
        };
        Object object2 = object = MetaData.getLock();
        synchronized (object2) {
            if (MetaData.getInstance().isReady()) {
                d2.a();
            } else {
                MetaData.getInstance().addMetaDataListener(d2);
            }
            return;
        }
    }

    public List<g> d() {
        a a2 = this;
        synchronized (a2) {
            ArrayList arrayList = new ArrayList(this.a.values());
            return arrayList;
        }
    }

    protected void d(Context context) {
        this.e = false;
        for (a a2 : this.f) {
            StringBuilder stringBuilder = new StringBuilder("Loading pending request for: ");
            stringBuilder.append((Object)a2.b);
            h.a("AdCacheManager", 4, stringBuilder.toString());
            this.a(context, a2.a, a2.b, a2.c, a2.d);
        }
        this.f.clear();
    }

}

