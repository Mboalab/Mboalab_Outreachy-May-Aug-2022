/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.adsCommon.BaseRequest
 *  com.startapp.android.publish.adsCommon.e.e
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.common.a.h
 *  com.startapp.common.e
 *  com.startapp.common.g
 *  com.startapp.common.g$a
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.startapp.android.publish.adsCommon.e;

import android.content.Context;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.a;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import com.startapp.common.g;

public class g {
    private final Context a;
    private final AdPreferences b;
    private final e c;

    public g(Context context, AdPreferences adPreferences, e e2) {
        this.a = context;
        this.b = adPreferences;
        this.c = e2;
    }

    public void a() {
        com.startapp.common.g.a((g.a)g.a.a, (Runnable)new Runnable(){

            public void run() {
                g.this.b();
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected Boolean b() {
        var1_1 = new StringBuilder("Sending InfoEvent ");
        var1_1.append((Object)this.c);
        h.a((int)3, (String)var1_1.toString());
        try {
            i.a(this.a, this.b);
        }
        catch (Exception var3_5) {
            h.a((int)6, (String)"Unable to fill AdPreferences ", (Throwable)var3_5);
            return Boolean.FALSE;
        }
        try {
            l.b(this.a);
            this.c.fillLocationDetails(this.b, this.a);
            this.c.fillApplicationDetails(this.a, this.b);
            ** GOTO lbl-1000
        }
        catch (Exception v0) {
            try lbl-1000: // 2 sources:
            {
                h.a((int)3, (String)"Networking InfoEvent");
                var6_2 = MetaData.getInstance().getAnalyticsConfig().a();
                if (d.c.equals((Object)this.c.e())) {
                    var6_2 = MetaData.getInstance().getAnalyticsConfig().b();
                }
                var7_3 = var6_2;
                com.startapp.android.publish.adsCommon.h.a.a(this.a, var7_3, (BaseRequest)this.c, null, MetaData.getInstance().getAnalyticsConfig().d(), MetaData.getInstance().getAnalyticsConfig().e());
                return Boolean.TRUE;
            }
            catch (com.startapp.common.e var5_4) {
                h.a((int)6, (String)"Unable to send InfoEvent command!!!!", (Throwable)var5_4);
                return Boolean.FALSE;
            }
        }
    }

}

