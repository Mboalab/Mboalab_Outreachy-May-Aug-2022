package com.startapp.android.publish.adsCommon.a;
import com.startapp.android.publish.adsCommon.a.a;
import com.startapp.android.publish.adsCommon.a.b;
import com.startapp.android.publish.adsCommon.a.c;
import com.startapp.android.publish.adsCommon.a.d;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e
implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient Set<Class<? extends c>> a = new HashSet();
    private boolean applyOnBannerRefresh = true;
    @com.startapp.common.b.f(b="Ljava/util/HashMap;", c="Ljava/util/ArrayList;", d="Lcom/startapp/android/publish/common/model/AdPreferences$Placement;", e="Lcom/startapp/android/publish/adsCommon/a/c;")
    private Map<AdPreferences.Placement, List<c>> placements = new HashMap();
    @com.startapp.common.b.f(b="Ljava/util/ArrayList;", c="Lcom/startapp/android/publish/adsCommon/a/c;")
    private List<c> session = new ArrayList();
    @com.startapp.common.b.f(b="Ljava/util/HashMap;", c="Ljava/util/ArrayList;", e="Lcom/startapp/android/publish/adsCommon/a/c;")
    private Map<String, List<c>> tags = new HashMap();

    private f a(List<c> list, List<a> list2, d d2, String string) {
        if (list == null) {
            return new f(true);
        }
        for (c c2 : list) {
            if (!c2.a() && this.a.contains((Object)c2.getClass())) continue;
            if (!c2.a(list2)) {
                String string2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c2.getClass().getSimpleName());
                stringBuilder.append("_");
                stringBuilder.append((Object)d2);
                if (Constants.a().booleanValue()) {
                    StringBuilder stringBuilder2 = new StringBuilder(" ");
                    stringBuilder2.append(string);
                    stringBuilder2.append(":");
                    stringBuilder2.append((Object)c2);
                    string2 = stringBuilder2.toString();
                } else {
                    string2 = "";
                }
                stringBuilder.append(string2);
                return new f(false, stringBuilder.toString());
            }
            this.a.add((Object)c2.getClass());
        }
        return new f(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f a(AdPreferences.Placement placement, String string) {
        void var11_3 = this;
        synchronized (var11_3) {
            String string2;
            this.a.clear();
            f f2 = e.super.a((List<c>)((List)this.tags.get((Object)string)), b.a().a(string), d.a, string);
            if (f2.a() && (f2 = e.super.a((List<c>)((List)this.placements.get((Object)placement)), b.a().a(placement), d.b, placement.toString())).a()) {
                f2 = e.super.a(this.session, b.a().c(), d.c, "session");
            }
            StringBuilder stringBuilder = new StringBuilder("shouldDisplayAd result: ");
            stringBuilder.append(f2.a());
            if (f2.a()) {
                string2 = "";
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(" because of rule ");
                stringBuilder2.append(f2.b());
                string2 = stringBuilder2.toString();
            }
            stringBuilder.append(string2);
            h.a((String)"AdRules", (int)3, (String)stringBuilder.toString());
            return f2;
        }
    }

    public boolean a() {
        return this.applyOnBannerRefresh;
    }

    public void b() {
        this.a = new HashSet();
    }
}

