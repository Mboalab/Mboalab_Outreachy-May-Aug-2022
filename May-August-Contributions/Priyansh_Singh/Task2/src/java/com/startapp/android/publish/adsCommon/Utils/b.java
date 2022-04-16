/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.SystemClock
 *  com.startapp.android.publish.common.metaData.InfoEventService
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.PeriodicJobService
 *  com.startapp.android.publish.common.metaData.PeriodicMetaDataService
 *  com.startapp.common.a.h
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon.Utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.startapp.android.publish.adsCommon.e.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.metaData.InfoEventService;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.PeriodicJobService;
import com.startapp.android.publish.common.metaData.PeriodicMetaDataService;
import com.startapp.common.a.h;

public class b {
    static Handler a;

    public static long a() {
        return SystemClock.elapsedRealtime() + 60000L * (long)MetaData.getInstance().getPeriodicMetaDataInterval();
    }

    public static long a(Context context) {
        return SystemClock.elapsedRealtime() + 60000L * (long)MetaData.getInstance().getPeriodicInfoEventIntervalInMinutes(context);
    }

    public static void a(Context context, long l2) {
        h.a((String)"StartAppWall.DataUtils", (int)3, (String)"setInfoEventPeriodicAlarm executes");
        if (!k.a(context, "periodicInfoEventPaused", Boolean.FALSE).booleanValue()) {
            if (MetaData.getInstance().isPeriodicInfoEventEnabled() && b.d(context)) {
                b.a(context, InfoEventService.class, l2, "periodicInfoEventTriggerTime");
                return;
            }
            if (MetaData.getInstance().isPeriodicInfoEventOnRunTimeEnabled()) {
                b.b(context, l2);
            }
        }
    }

    private static void a(Context context, Intent intent, AlarmManager alarmManager) {
        PendingIntent pendingIntent = PendingIntent.getService((Context)context, (int)0, (Intent)intent, (int)134217728);
        if (PendingIntent.getService((Context)context, (int)0, (Intent)intent, (int)268435456) != null) {
            alarmManager.cancel(pendingIntent);
            pendingIntent.cancel();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, Class<?> class_) {
        JobScheduler jobScheduler;
        int n2;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                h.a((String)"StartAppWall.DataUtils", (int)3, (String)"cancelAlarm - lower then Android oreo");
                AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
                b.a(context, new Intent(context, class_), alarmManager);
                return;
            }
            h.a((String)"StartAppWall.DataUtils", (int)3, (String)"cancelAlarm - Android oreo or above");
            jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
            n2 = class_.equals(PeriodicMetaDataService.class) ? 1022 : 1033;
        }
        catch (Exception exception) {
            String string = class_ != null ? class_.getSimpleName() : "";
            f.a(context, d.b, "cancelAlarm - failed cancelling alarm ".concat(String.valueOf((Object)string)), exception.getMessage(), "");
            return;
        }
        jobScheduler.cancel(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, Class<?> class_, long l2, String string) {
        block3 : {
            int n2;
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    h.a((String)"StartAppWall.DataUtils", (int)3, (String)"setPeriodicAlarm - lower then Android oreo");
                    AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
                    Intent intent = new Intent(context, class_);
                    b.a(context, intent, alarmManager);
                    alarmManager.set(3, l2, PendingIntent.getService((Context)context, (int)0, (Intent)intent, (int)134217728));
                    break block3;
                }
                h.a((String)"StartAppWall.DataUtils", (int)3, (String)"setPeriodicAlarm - Android oreo or above");
                n2 = class_.equals(PeriodicMetaDataService.class) ? 1022 : 1033;
            }
            catch (Exception exception) {
                String string2 = class_ != null ? class_.getSimpleName() : "";
                f.a(context, d.b, "Util.setPeriodicAlarm - failed setting alarm ".concat(String.valueOf((Object)string2)), exception.getMessage(), "");
                return;
            }
            long l3 = l2 - SystemClock.elapsedRealtime();
            long l4 = 3600000L + l3;
            ((JobScheduler)context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(n2, new ComponentName(context, PeriodicJobService.class)).setRequiredNetworkType(1).setMinimumLatency(l3).setOverrideDeadline(l4).build());
        }
        k.b(context, string, l2);
    }

    public static void a(Context context, Long l2) {
        h.a((String)"StartAppWall.DataUtils", (int)3, (String)"setMetaDataPeriodicAlarm executes");
        if (!k.a(context, "periodicMetadataPaused", Boolean.FALSE).booleanValue() && MetaData.getInstance().isPeriodicMetaDataEnabled()) {
            b.a(context, PeriodicMetaDataService.class, l2, "periodicMetadataTriggerTime");
        }
    }

    public static void b(Context context) {
        b.a(context, (Long)b.a());
    }

    private static void b(final Context context, long l2) {
        try {
            final long l3 = 60000L * (long)MetaData.getInstance().getPeriodicInfoEventIntervalInMinutes(context);
            if (a == null) {
                a = new Handler();
            }
            k.b(context, "periodicInfoEventTriggerTime", l2);
            a.removeCallbacksAndMessages(null);
            a.postDelayed(new Runnable(){

                public final void run() {
                    if (!k.a(context, "periodicInfoEventPaused", Boolean.FALSE).booleanValue() && b.a != null) {
                        new c(context, false).a();
                        k.b(context, "periodicInfoEventTriggerTime", b.a(context));
                        b.a.postDelayed((Runnable)this, l3);
                    }
                }
            }, l2 - SystemClock.elapsedRealtime());
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("postDelayedDataEvent failed ");
            stringBuilder.append(exception.getMessage());
            h.a((String)"StartAppWall.DataUtils", (int)6, (String)stringBuilder.toString());
            return;
        }
    }

    public static void c(Context context) {
        b.a(context, b.a(context));
    }

    /*
     * Exception decompiling
     */
    private static boolean d(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

}

