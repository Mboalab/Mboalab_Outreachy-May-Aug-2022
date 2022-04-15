package com.startapp.android.publish.cache;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.list3d.f;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.cache.g;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import com.startapp.common.g;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class i {
    protected static String a() {
        return "startapp_ads";
    }

    private static void a(Context context, final com.startapp.android.publish.ads.b.c c2, String string, final AdEventListener adEventListener) {
        com.startapp.android.publish.adsCommon.Utils.i.a(context, string, new i.a(){

            @Override
            public final void a() {
                adEventListener.onReceiveAd(c2);
            }

            @Override
            public final void a(String string) {
                h.a("DiskAdCacheManager", 3, "Html Cache failed: ".concat(String.valueOf((Object)string)));
                adEventListener.onFailedToReceiveAd(c2);
            }
        });
    }

    private static void a(Context context, com.startapp.android.publish.ads.b.c c2, String string, a a2, AdEventListener adEventListener) {
        if (string != null && !string.equals((Object)"")) {
            if (!i.a(c2)) {
                h.a("DiskAdCacheManager", 3, "Missing video file");
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            if (!i.a(context, string)) {
                h.a("DiskAdCacheManager", 3, "App is present");
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            com.startapp.android.publish.cache.a.a().a(string, c2.f());
            a2.a(c2);
            i.a(context, c2, string, adEventListener);
            return;
        }
        h.a("DiskAdCacheManager", 3, "Missing Html");
        adEventListener.onFailedToReceiveAd(null);
    }

    private static void a(Context context, com.startapp.android.publish.ads.c.b.b b2, a a2, AdEventListener adEventListener) {
        List<AdDetails> list = b2.d();
        if (list == null) {
            h.a("DiskAdCacheManager", 4, "No ad details");
            adEventListener.onFailedToReceiveAd(null);
            return;
        }
        if (com.startapp.android.publish.adsCommon.b.a().D()) {
            list = com.startapp.android.publish.adsCommon.b.c.a(context, list, 0, (Set<String>)new HashSet());
        }
        if (list != null && list.size() > 0) {
            a2.a(b2);
            i.a(b2, adEventListener, list);
            return;
        }
        h.a("DiskAdCacheManager", 4, "App presence - no interstitials to display");
        adEventListener.onFailedToReceiveAd(null);
    }

    protected static void a(Context context, g g2, String string) {
        d d2 = new d(g2.b());
        com.startapp.common.a.f.a(context, i.c(), string, d2);
    }

    protected static void a(final Context context, final c c2) {
        com.startapp.common.g.a(g.a.b, new Runnable(){

            public final void run() {
                try {
                    final List<b> list = com.startapp.common.a.f.b(context, i.b(), b.class);
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        public void run() {
                            c2.a((List<b>)list);
                        }
                    });
                    return;
                }
                catch (Exception exception) {
                    com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, " DiskAdCacheManager.loadCacheKeysAsync - Unexpected Thread Exception", exception.getMessage(), "");
                    return;
                }
            }

        });
    }

    protected static void a(Context context, d d2, a a2, AdEventListener adEventListener) {
        com.startapp.android.publish.adsCommon.g g2 = d2.a();
        g2.setContext(context);
        if (com.startapp.android.publish.adsCommon.Utils.i.a(2L) && g2 instanceof com.startapp.android.publish.ads.b.c) {
            i.a(context, (com.startapp.android.publish.ads.b.c)g2, d2.b(), a2, adEventListener);
            return;
        }
        if (com.startapp.android.publish.adsCommon.Utils.i.a(64L) && g2 instanceof com.startapp.android.publish.ads.c.b.b) {
            i.a(context, (com.startapp.android.publish.ads.c.b.b)g2, a2, adEventListener);
            return;
        }
        h.a("DiskAdCacheManager", 4, "Unsupported disk ad type");
        adEventListener.onFailedToReceiveAd(null);
    }

    protected static void a(final Context context, final e e2) {
        com.startapp.common.g.a(g.a.a, new Runnable(){

            public final void run() {
                try {
                    com.startapp.common.a.f.a(context, i.a());
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        public void run() {
                            e2.a();
                        }
                    });
                    return;
                }
                catch (Exception exception) {
                    com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, " DiskAdCacheManager.deleteDiskCacheAsync - Unexpected Thread Exception", exception.getMessage(), "");
                    return;
                }
            }

        });
    }

    protected static void a(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, String string) {
        b b2 = new b(placement, adPreferences);
        com.startapp.common.a.f.a(context, i.b(), string, b2);
    }

    protected static void a(final Context context, final String string, final a a2, final AdEventListener adEventListener) {
        com.startapp.common.g.a(g.a.b, new Runnable(){

            public final void run() {
                try {
                    final d d2 = com.startapp.common.a.f.a(context, i.c(), string, d.class);
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        public void run() {
                            try {
                                if (d2 == null) {
                                    StringBuilder stringBuilder = new StringBuilder("File not found or error: ");
                                    stringBuilder.append(string);
                                    h.a("DiskAdCacheManager", 4, stringBuilder.toString());
                                    adEventListener.onFailedToReceiveAd(null);
                                    return;
                                }
                                if (d2.a() != null && d2.a().isReady()) {
                                    if (d2.a().hasAdCacheTtlPassed()) {
                                        h.a("DiskAdCacheManager", 3, "Disk ad TTL has passed");
                                        adEventListener.onFailedToReceiveAd(null);
                                        return;
                                    }
                                    i.a(context, d2, a2, adEventListener);
                                    return;
                                }
                                h.a("DiskAdCacheManager", 3, "Disk ad is not ready or null");
                                adEventListener.onFailedToReceiveAd(null);
                                return;
                            }
                            catch (Exception exception) {
                                com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", exception.getMessage(), "");
                                adEventListener.onFailedToReceiveAd(null);
                                return;
                            }
                        }
                    });
                    return;
                }
                catch (Exception exception) {
                    com.startapp.android.publish.adsCommon.e.f.a(context, com.startapp.android.publish.adsCommon.e.d.b, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", exception.getMessage(), "");
                    adEventListener.onFailedToReceiveAd(null);
                    return;
                }
            }

        });
    }

    private static void a(com.startapp.android.publish.ads.c.b.b b2, AdEventListener adEventListener, List<AdDetails> list) {
        com.startapp.android.publish.ads.list3d.e e2 = f.a().a(b2.a());
        e2.a();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            e2.a((AdDetails)iterator.next());
        }
        adEventListener.onReceiveAd(b2);
    }

    private static boolean a(Context context, String string) {
        ArrayList arrayList;
        List<com.startapp.android.publish.adsCommon.b.a> list;
        if (com.startapp.android.publish.adsCommon.b.a().D() && (list = com.startapp.android.publish.adsCommon.b.c.a(string, 0)) != null && com.startapp.android.publish.adsCommon.b.c.a(context, list, 0, (Set<String>)new HashSet(), (List<com.startapp.android.publish.adsCommon.b.a>)(arrayList = new ArrayList())).booleanValue()) {
            new com.startapp.android.publish.adsCommon.b.b(context, (List<com.startapp.android.publish.adsCommon.b.a>)arrayList).a();
            return false;
        }
        return true;
    }

    private static boolean a(com.startapp.android.publish.ads.b.c c2) {
        return true;
    }

    protected static String b() {
        return i.a().concat(File.separator).concat("keys");
    }

    protected static String c() {
        return i.a().concat(File.separator).concat("interstitials");
    }

    protected static interface a {
        public void a(com.startapp.android.publish.adsCommon.g var1);
    }

    protected static class b
    implements Serializable {
        private static final long serialVersionUID = 1L;
        protected AdPreferences adPreferences;
        protected AdPreferences.Placement placement;

        protected b(AdPreferences.Placement placement, AdPreferences adPreferences) {
            this.placement = placement;
            this.adPreferences = adPreferences;
        }

        protected AdPreferences.Placement a() {
            return this.placement;
        }

        protected AdPreferences b() {
            return this.adPreferences;
        }
    }

    protected static interface c {
        public void a(List<b> var1);
    }

    protected static class d
    implements Serializable {
        private static final long serialVersionUID = 1L;
        private com.startapp.android.publish.adsCommon.g ad;
        private String html;

        protected d(com.startapp.android.publish.adsCommon.g g2) {
            d.super.a(g2);
            d.super.c();
        }

        private void a(com.startapp.android.publish.adsCommon.g g2) {
            this.ad = g2;
        }

        private void c() {
            if (this.ad != null && this.ad instanceof com.startapp.android.publish.adsCommon.e) {
                this.html = ((com.startapp.android.publish.adsCommon.e)((Object)this.ad)).e();
            }
        }

        protected com.startapp.android.publish.adsCommon.g a() {
            return this.ad;
        }

        protected String b() {
            return this.html;
        }
    }

    protected static interface e {
        public void a();
    }

}

