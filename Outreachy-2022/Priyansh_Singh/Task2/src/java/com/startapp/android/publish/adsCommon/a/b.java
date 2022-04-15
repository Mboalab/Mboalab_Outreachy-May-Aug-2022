package com.startapp.android.publish.adsCommon.a;

import com.startapp.android.publish.adsCommon.a.a;
import com.startapp.android.publish.common.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b {
    private static b a = new b();
    private List<a> b = new ArrayList();
    private Map<AdPreferences.Placement, List<a>> c = new HashMap();
    private Map<String, List<a>> d = new HashMap();

    public static b a() {
        return a;
    }

    public List<a> a(AdPreferences.Placement placement) {
        return (List)this.c.get((Object)placement);
    }

    public List<a> a(String string) {
        return (List)this.d.get((Object)string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a a2) {
        void var7_2 = this;
        synchronized (var7_2) {
            this.b.add(0, (Object)a2);
            List list = (List)this.c.get((Object)a2.a());
            if (list == null) {
                list = new ArrayList();
                this.c.put((Object)a2.a(), (Object)list);
            }
            list.add(0, (Object)a2);
            List list2 = (List)this.d.get((Object)a2.b());
            if (list2 == null) {
                list2 = new ArrayList();
                this.d.put((Object)a2.b(), (Object)list2);
            }
            list2.add(0, (Object)a2);
            return;
        }
    }

    public void b() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    public List<a> c() {
        return this.b;
    }

    public int d() {
        return this.b.size();
    }
}

