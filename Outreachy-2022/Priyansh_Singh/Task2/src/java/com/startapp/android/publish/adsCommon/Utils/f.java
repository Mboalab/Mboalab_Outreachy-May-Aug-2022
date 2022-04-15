/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  com.startapp.common.a.h
 *  java.io.File
 *  java.io.FileFilter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.common.a.h;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f {
    private static boolean a = true;

    /*
     * Exception decompiling
     */
    private static String a(Context var0) {
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

    /*
     * Exception decompiling
     */
    protected static void a(Context var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl109 : ALOAD_3 : trying to set 1 previously set to 0
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, boolean bl) {
        boolean bl2;
        block6 : {
            boolean bl3;
            bl2 = true;
            if (bl) {
                a = bl2;
                k.b(context, "copyDrawables", Boolean.TRUE);
            }
            if (!a) {
                return;
            }
            a = bl3 = k.a(context, "copyDrawables", Boolean.TRUE).booleanValue();
            if (!bl3) {
                return;
            }
            try {
                String string = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)0).sourceDir;
                String string2 = f.a(context);
                if (f.a(context, string, "", "drawable-hdpi.zip") || f.a(context, string, "assets/", "drawable-hdpi.zip") || f.a(context, string2, "", "drawable-hdpi.zip") || f.a(context, string2, "assets/", "drawable-hdpi.zip")) break block6;
            }
            catch (Exception exception) {
                h.a((String)"ResourceHandler", (int)6, (String)"Error initializing resources", (Throwable)exception);
                return;
            }
            bl2 = false;
        }
        if (!bl2) {
            h.a((String)"ResourceHandler", (int)5, (String)"Error initializing resources");
        }
    }

    private static boolean a(Context context, String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("Trying to copy resources from ");
        stringBuilder.append(string);
        stringBuilder.append(" in /");
        stringBuilder.append(string2);
        h.a((String)"ResourceHandler", (int)3, (String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append(string3);
        String string4 = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(context.getFilesDir().getPath());
        stringBuilder3.append("/");
        stringBuilder3.append(string3);
        if (!f.a(string, string4, stringBuilder3.toString())) {
            StringBuilder stringBuilder4 = new StringBuilder("Failed copying resources from ");
            stringBuilder4.append(string);
            stringBuilder4.append(" in /");
            stringBuilder4.append(string2);
            h.a((String)"ResourceHandler", (int)3, (String)stringBuilder4.toString());
            return false;
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(context.getFilesDir().getPath());
        stringBuilder5.append("/");
        stringBuilder5.append(string3);
        f.a(context, stringBuilder5.toString());
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append(string2);
        stringBuilder6.append("drawable.zip");
        String string5 = stringBuilder6.toString();
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(context.getFilesDir().getPath());
        stringBuilder7.append("/drawable.zip");
        f.a(string, string5, stringBuilder7.toString());
        StringBuilder stringBuilder8 = new StringBuilder();
        stringBuilder8.append(context.getFilesDir().getPath());
        stringBuilder8.append("/drawable.zip");
        f.a(context, stringBuilder8.toString());
        k.b(context, "copyDrawables", Boolean.FALSE);
        StringBuilder stringBuilder9 = new StringBuilder("Copy from ");
        stringBuilder9.append(string);
        stringBuilder9.append(" in /");
        stringBuilder9.append(string2);
        stringBuilder9.append(" succeeded");
        h.a((String)"ResourceHandler", (int)3, (String)stringBuilder9.toString());
        return true;
    }

    /*
     * Exception decompiling
     */
    protected static boolean a(String var0, String var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl106.3 : FAKE_TRY : trying to set 1 previously set to 0
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

}

