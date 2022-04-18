/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.adsCommon.e.b
 *  com.startapp.android.publish.adsCommon.e.e
 *  com.startapp.android.publish.adsCommon.f.a
 *  com.startapp.android.publish.adsCommon.f.b
 *  com.startapp.android.publish.adsCommon.f.c
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.b
 *  com.startapp.android.publish.common.metaData.g
 *  com.startapp.common.a.h
 *  com.startapp.common.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.startapp.android.publish.adsCommon.e;

import android.content.Context;
import com.startapp.android.publish.adsCommon.e.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.f.a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.g;
import com.startapp.common.a.h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {
    static AtomicBoolean f = new AtomicBoolean(false);
    Context a;
    com.startapp.common.d b;
    ArrayList<a> c;
    int d;
    b e;
    private Runnable g;

    public c(Context context, boolean bl) {
        super(context, bl, null);
    }

    public c(Context context, boolean bl, com.startapp.common.d d2) {
        this.g = new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                1 var4_1 = this;
                synchronized (var4_1) {
                    int n2;
                    c c2 = c.this;
                    c2.d = n2 = -1 + c2.d;
                    if (n2 == 0) {
                        h.a((String)"DataEventTask", (int)3, (String)"sending DataEvent");
                        f.a(c.this.a, (e)c.this.e, "");
                        c.f.set(false);
                        c.this.b();
                    }
                    return;
                }
            }
        };
        this.a = context;
        this.b = d2;
        this.c = new ArrayList();
        this.e = new b(d.c);
        this.e.a(bl);
        if (MetaData.getInstance().getSensorsConfig().b()) {
            this.c.add((Object)new com.startapp.android.publish.adsCommon.f.c(context, this.g, this.e));
        }
        if (MetaData.getInstance().getBluetoothConfig().b()) {
            this.c.add((Object)new com.startapp.android.publish.adsCommon.f.b(context, this.g, this.e));
        }
        this.d = this.c.size();
    }

    public void a() {
        if (this.d > 0) {
            boolean bl = f.compareAndSet(false, true);
            if (bl) {
                for (int i2 = 0; i2 < this.d; ++i2) {
                    ((a)this.c.get(i2)).a();
                }
                return;
            }
        }
        this.b();
    }

    void b() {
        if (this.b != null) {
            this.b.a(null);
        }
    }

    public b c() {
        return this.e;
    }

}

