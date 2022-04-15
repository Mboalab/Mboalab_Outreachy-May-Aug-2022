
package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.cache.e;
import com.startapp.android.publish.cache.g;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;

public class f
extends e {
    public f(g g2) {
        super(g2);
    }

    @Override
    protected boolean c() {
        return m.a().a(this.a.c());
    }

    @Override
    protected long d() {
        com.startapp.android.publish.adsCommon.g g2 = this.a.b();
        if (g2 == null) {
            h.a("CacheTTLReloadTimer", 3, "Missing ad");
            return -1L;
        }
        Long l2 = g2.getAdCacheTtl();
        Long l3 = g2.getLastLoadTime();
        if (l2 != null && l3 != null) {
            long l4 = l2 - (System.currentTimeMillis() - l3);
            if (l4 >= 0L) {
                return l4;
            }
            return 0L;
        }
        h.a("CacheTTLReloadTimer", 3, "Missing TTL or last loading time");
        return -1L;
    }

    @Override
    protected String e() {
        return "CacheTTLReloadTimer";
    }
}

