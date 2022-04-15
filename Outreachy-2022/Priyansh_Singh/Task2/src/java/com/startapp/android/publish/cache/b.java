
package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.cache.ACMConfig;
import com.startapp.android.publish.cache.FailuresHandler;
import com.startapp.android.publish.cache.d;
import com.startapp.android.publish.cache.e;
import com.startapp.android.publish.cache.g;
import com.startapp.common.a.h;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class b
extends e {
    private final FailuresHandler b = d.a().b().getFailuresHandler();
    private int c = 0;
    private boolean d = false;

    public b(g g2) {
        super(g2);
    }

    private void j() {
        List<Integer> list = this.b.getIntervals();
        if (this.c == list.size() - 1) {
            this.d = true;
            StringBuilder stringBuilder = new StringBuilder("Reached end index: ");
            stringBuilder.append(this.c);
            h.a("CacheErrorReloadTimer", 4, stringBuilder.toString());
            return;
        }
        this.c = 1 + this.c;
        StringBuilder stringBuilder = new StringBuilder("Advanced to index: ");
        stringBuilder.append(this.c);
        h.a("CacheErrorReloadTimer", 4, stringBuilder.toString());
    }

    private boolean k() {
        return this.b != null && this.b.getIntervals() != null;
    }

    @Override
    public void a() {
        super.a();
        this.c = 0;
        this.d = false;
    }

    @Override
    protected void b() {
        this.j();
        super.b();
    }

    @Override
    protected boolean c() {
        if (!m.a().k()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        if (this.d) {
            return this.b.isInfiniteLastRetry();
        }
        return true;
    }

    @Override
    protected long d() {
        if (this.c >= this.b.getIntervals().size()) {
            return -1L;
        }
        Long l2 = this.i();
        if (l2 == null) {
            return -1L;
        }
        long l3 = TimeUnit.SECONDS.toMillis((long)((Integer)this.b.getIntervals().get(this.c)).intValue()) - (System.currentTimeMillis() - l2);
        if (l3 >= 0L) {
            return l3;
        }
        return 0L;
    }

    @Override
    protected String e() {
        return "CacheErrorReloadTimer";
    }
}

