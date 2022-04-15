/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.adsCommon.f;

import android.content.Context;
import com.startapp.android.publish.adsCommon.f.a;
import com.startapp.android.publish.adsCommon.f.c;
import com.startapp.android.publish.adsCommon.g.b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.g;
import com.startapp.common.d;
import java.util.concurrent.TimeUnit;

public class c
extends a {
    public c(Context context, Runnable runnable, com.startapp.android.publish.adsCommon.e.b b2) {
        super(context, runnable, b2);
    }

    @Override
    public void a(Object object) {
        if (object != null) {
            this.c.a(object.toString());
        }
        super.a(object);
    }

    @Override
    protected void b() {
        try {
            long l2 = TimeUnit.SECONDS.toMillis((long)MetaData.getInstance().getSensorsConfig().a());
            b b2 = new b(this.a, this);
            this.a(new Runnable(this, b2){
                final /* synthetic */ b a;
                final /* synthetic */ c b;
                {
                    this.b = c2;
                    this.a = b2;
                }

                public void run() {
                    this.a.b();
                    this.b.a((Object)this.a.c());
                }
            }, l2);
            b2.a();
            return;
        }
        catch (Exception exception) {
            this.a(null);
            return;
        }
    }
}

