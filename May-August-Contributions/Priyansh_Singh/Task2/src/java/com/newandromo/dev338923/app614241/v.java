/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.support.v4.app.NavUtils
 *  android.support.v4.app.TaskStackBuilder
 *  android.support.v7.app.AppCompatActivity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  com.newandromo.dev338923.app614241.AndromoAboutActivity
 *  com.newandromo.dev338923.app614241.bq
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import com.newandromo.dev338923.app614241.AndromoAboutActivity;
import com.newandromo.dev338923.app614241.bq;
import com.newandromo.dev338923.app614241.c;
import com.newandromo.dev338923.app614241.f;

public final class v {
    private static boolean a;
    private static boolean b;

    static Class<?> a(Activity activity) {
        String string = NavUtils.getParentActivityName((Activity)activity);
        while (string != null) {
            Class class_;
            block6 : {
                block7 : {
                    Class<?> class_2;
                    try {
                        class_ = Class.forName((String)string);
                        if (!bq.class.isAssignableFrom(class_)) break block6;
                        class_2 = v.a(v.a((Context)activity, string));
                        if (class_2 == null) break block7;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        return null;
                    }
                    boolean bl = class_2.equals((Object)activity.getClass());
                    if (bl) break block7;
                    return class_2;
                }
                try {
                    string = NavUtils.getParentActivityName((Context)activity, (ComponentName)new ComponentName(activity.getPackageName(), string));
                    continue;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return null;
                }
            }
            return class_;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private static Class<?> a(String[] var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32.1 : IINC : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    static String a(Context context) {
        try {
            String string = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)128).versionName;
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return "";
        }
    }

    public static void a(Activity activity, Intent intent) {
        f.c();
        f.a(activity, new c((Context)activity, intent));
    }

    public static /* varargs */ void a(Activity activity,  /* corrupt varargs signature?! */ String string) {
        v.b(activity, string);
    }

    static void a(MenuInflater menuInflater, Menu menu, boolean bl) {
        if (bl) {
            menuInflater.inflate(2131492864, menu);
        }
        menuInflater.inflate(2131492866, menu);
    }

    private static boolean a() {
        if (!b) {
            try {
                Class.forName((String)"com.newandromo.dev338923.app614241.Dashboard_000");
                a = true;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            b = true;
        }
        return a;
    }

    public static boolean a(AppCompatActivity appCompatActivity) {
        Intent intent = NavUtils.getParentActivityIntent((Activity)appCompatActivity);
        if (intent == null) {
            return false;
        }
        if (v.a(intent.getComponent().getClassName())) {
            Class<?> class_ = v.a((Activity)appCompatActivity);
            if (class_ != null) {
                intent = new Intent("android.intent.action.MAIN").setClassName((Context)appCompatActivity, class_.getName());
            } else {
                return false;
            }
        }
        intent.putExtra("HomeAsUp", true);
        appCompatActivity.supportFinishAfterTransition();
        if (NavUtils.shouldUpRecreateTask((Activity)appCompatActivity, (Intent)intent)) {
            TaskStackBuilder.create((Context)appCompatActivity).addNextIntentWithParentStack(intent).startActivities();
            return true;
        }
        if (!"com.newandromo.dev338923.app614241.Dashboard_000".equals((Object)intent.getComponent().getClassName()) || v.a()) {
            intent.addFlags(603979776);
            v.a((Activity)appCompatActivity, intent);
        }
        return true;
    }

    private static boolean a(String string) {
        try {
            boolean bl = bq.class.isAssignableFrom(Class.forName((String)string));
            return bl;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    private static String[] a(Context var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl18.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    /*
     * Exception decompiling
     */
    static /* varargs */ void b(Activity var0,  /* corrupt varargs signature?! */ String var1) {
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

    static boolean b(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent((Context)appCompatActivity, AndromoAboutActivity.class);
        intent.addFlags(67108864);
        appCompatActivity.startActivity(intent);
        return true;
    }
}

