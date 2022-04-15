/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.ads.video.e
 *  com.startapp.android.publish.adsCommon.activities.FullScreenActivity
 *  com.startapp.android.publish.cache.a
 *  com.startapp.android.publish.cache.g
 *  java.io.File
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 *  java.util.Iterator
 *  java.util.List
 */
package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.video.VideoAdDetails;
import com.startapp.android.publish.ads.video.e;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.android.publish.cache.g;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class h {
    public static a a(Context context) {
        a a2 = a.a;
        if (h.c(context)) {
            a2 = a.d;
        }
        if (!i.a(context, FullScreenActivity.class)) {
            a2 = a.c;
        }
        if (!h.d(context)) {
            a2 = a.b;
        }
        return a2;
    }

    static String a(Context context, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)context.getFilesDir());
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    public static String a(Context context, URL uRL, String string) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.NullPointerException: Attempt to invoke interface method 'org.benf.cfr.reader.b.a.e.u org.benf.cfr.reader.b.a.e.q.m()' on a null object reference
        // org.benf.cfr.reader.b.a.e.b.b$d.a(InferredJavaType.java:471)
        // org.benf.cfr.reader.b.a.e.b.b.g(InferredJavaType.java:1173)
        // org.benf.cfr.reader.b.a.b.a.t.<init>(CastExpression.java:29)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:44)
        // org.benf.cfr.reader.b.a.d.b.o.a(StructuredExpressionStatement.java:63)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:31)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.y.a(StructuredTry.java:116)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:407)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:30)
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:680)
        // org.benf.cfr.reader.b.a.a.c.c.h.a(NakedNullCaster.java:25)
        // org.benf.cfr.reader.b.a.a.j.l(Op04StructuredStatement.java:763)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:772)
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

    public static void a(Context context, com.startapp.android.publish.ads.video.a.a a2) {
        if (a2 != null) {
            Iterator iterator = a2.a().iterator();
            while (iterator.hasNext()) {
                c.b(context, (String)iterator.next());
            }
        }
    }

    public static boolean a(String string) {
        for (g g2 : com.startapp.android.publish.cache.a.a().d()) {
            e e2;
            if (!(g2.b() instanceof e) || (e2 = (e)g2.b()).d() == null || e2.d().getLocalVideoPath() == null || !e2.d().getLocalVideoPath().equals((Object)string)) continue;
            return true;
        }
        return false;
    }

    public static void b(Context context) {
        k.b(context, "videoErrorsCount", 1 + k.a(context, "videoErrorsCount", 0));
    }

    private static boolean c(Context context) {
        if (b.a().G().e() < 0) {
            return false;
        }
        return k.a(context, "videoErrorsCount", 0) >= b.a().G().e();
    }

    private static boolean d(Context context) {
        long l2 = i.a(context.getFilesDir(), -1L);
        if (l2 < 0L) {
            return false;
        }
        long l3 = b.a().G().c();
        long l4 = l2 / 1024L LCMP l3 * 1024L;
        boolean bl = false;
        if (l4 > 0) {
            bl = true;
        }
        return bl;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("");
        public static final /* enum */ a b = new a("Not enough storage for video");
        public static final /* enum */ a c = new a("FullScreenActivity not declared in AndroidManifest.xml");
        public static final /* enum */ a d = new a("Video errors threshold reached.");
        private static final /* synthetic */ a[] e;
        private String desctiption;

        static {
            a[] arra = new a[]{a, b, c, d};
            e = arra;
        }

        private a(String string2) {
            this.desctiption = string2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])e.clone();
        }

        public final String a() {
            return this.desctiption;
        }
    }

}

