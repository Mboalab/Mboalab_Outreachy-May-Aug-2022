/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.MetaDataRequest
 *  com.startapp.android.publish.common.metaData.MetaDataRequest$a
 *  com.startapp.android.publish.common.metaData.d
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.common.a.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.UUID
 */
package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.a.b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import java.util.UUID;

public class g {
    private static g a = new g();
    private String b = "";
    private long c = 0L;
    private MetaDataRequest.a d = MetaDataRequest.a.a;

    public static g d() {
        return a;
    }

    public String a() {
        return this.b;
    }

    public void a(Context context, MetaDataRequest.a a2) {
        void var9_3 = this;
        synchronized (var9_3) {
            this.b = UUID.randomUUID().toString();
            this.c = System.currentTimeMillis();
            this.d = a2;
            StringBuilder stringBuilder = new StringBuilder("Starting new session: reason=");
            stringBuilder.append((Object)a2);
            stringBuilder.append(" sessionId=");
            stringBuilder.append(this.b);
            h.a((String)"SessionManager", (int)3, (String)stringBuilder.toString());
            if (!i.a()) {
                b.a().b();
            }
            AdPreferences adPreferences = new AdPreferences();
            i.a(context, adPreferences);
            MetaData.getInstance().loadFromServer(context, adPreferences, a2, false, null, true);
            return;
        }
    }

    public long b() {
        return this.c;
    }

    public MetaDataRequest.a c() {
        return this.d;
    }
}

