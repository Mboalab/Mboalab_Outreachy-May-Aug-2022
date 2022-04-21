/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.adsCommon.f;

import android.content.Context;
import com.startapp.android.publish.adsCommon.f.a;
import com.startapp.android.publish.adsCommon.f.b;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.d;
import java.util.concurrent.TimeUnit;

public class b
extends a {
    public b(Context context, Runnable runnable, com.startapp.android.publish.adsCommon.e.b b2) {
        super(context, runnable, b2);
    }

    private boolean c() {
        long l2;
        long l3;
        long l4 = System.currentTimeMillis();
        boolean bl2 = l4 - (l2 = k.a(this.a, "lastBtDiscoveringTime", 0L).longValue()) >= (l3 = 60000L * (long)MetaData.getInstance().getBluetoothConfig().c());
        if (bl2) {
            k.b(this.a, "lastBtDiscoveringTime", l4);
        }
        return bl2;
    }

    @Override
    public void a(Object object) {
        if (object != null) {
            this.c.b(object.toString());
        }
        super.a(object);
    }

    @Override
    protected void b() {
        try {
            long l2 = TimeUnit.SECONDS.toMillis((long)MetaData.getInstance().getBluetoothConfig().a());
            com.startapp.android.publish.adsCommon.c.b b2 = new com.startapp.android.publish.adsCommon.c.b(this.a, this);
            this.a(new Runnable(this, b2){
                final /* synthetic */ com.startapp.android.publish.adsCommon.c.b a;
                final /* synthetic */ b b;
                {
                    this.b = b2;
                    this.a = b3;
                }

                public void run() {
                    this.a.a();
                    this.b.a((Object)this.a.b());
                }
            }, l2);
            b2.a(this.c());
            return;
        }
        catch (Exception exception) {
            this.a(null);
            return;
        }
    }
}

