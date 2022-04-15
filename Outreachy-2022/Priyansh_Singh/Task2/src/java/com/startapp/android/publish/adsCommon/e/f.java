/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  com.startapp.android.publish.adsCommon.e.e
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.startapp.android.publish.adsCommon.e;

import android.app.ActivityManager;
import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.a;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.g;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.c;
import com.startapp.common.a.h;

public class f {
    public static void a(Context context, d d2, String string, String string2, String string3) {
        f.a(context, new e(d2, string, string2), string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, e e2, String string) {
        if (MetaData.getInstance().getAnalyticsConfig().c()) {
            return;
        }
        e2.e(string);
        e2.a(context);
        try {
            e2.f(i.b(context));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            e2.h(Long.toString((long)(memoryInfo.availMem / 0x100000L)));
            Long l2 = c.a((ActivityManager.MemoryInfo)memoryInfo);
            if (l2 != null) {
                e2.g(Long.toString((long)((l2 - memoryInfo.availMem) / 0x100000L)));
            }
        }
        catch (Throwable throwable) {
            h.a((String)"InfoEventsManager", (int)6, (String)"Error filling infoEvent", (Throwable)throwable);
        }
        h.a((String)"InfoEventsManager", (int)3, (String)"Sending ".concat(String.valueOf((Object)e2)));
        new g(context, new AdPreferences(), e2).a();
    }
}

