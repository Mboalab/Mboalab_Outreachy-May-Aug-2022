/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  android.os.Build
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Build;
import android.widget.Toast;
import com.newandromo.dev338923.app614241.ct;
import com.newandromo.dev338923.app614241.dc;

public final class bb {
    public static final a a = a.a();

    public static Intent a(Context context) {
        boolean bl;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        boolean bl2 = a == a.b || (bl = Build.MANUFACTURER.equals((Object)"Amazon") && (Build.MODEL.equals((Object)"Kindle Fire") || Build.MODEL.startsWith("KF")));
        if (bl2) {
            String string = context.getString(2131558729);
            Object[] arrobject = new Object[2];
            arrobject[0] = context.getString(2131558527);
            StringBuilder stringBuilder = new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=");
            stringBuilder.append(context.getPackageName());
            arrobject[1] = stringBuilder.toString();
            intent.putExtra("android.intent.extra.TEXT", String.format((String)string, (Object[])arrobject));
            return intent;
        }
        boolean bl3 = a == a.c;
        if (bl3) {
            String string = context.getString(2131558731);
            Object[] arrobject = new Object[2];
            arrobject[0] = context.getString(2131558527);
            StringBuilder stringBuilder = new StringBuilder("http://www.samsungapps.com/appquery/appDetail.as?appId=");
            stringBuilder.append(context.getPackageName());
            arrobject[1] = stringBuilder.toString();
            intent.putExtra("android.intent.extra.TEXT", String.format((String)string, (Object[])arrobject));
            return intent;
        }
        String string = context.getString(2131558730);
        Object[] arrobject = new Object[2];
        arrobject[0] = context.getString(2131558527);
        StringBuilder stringBuilder = new StringBuilder("https://play.google.com/store/apps/details?id=");
        stringBuilder.append(context.getPackageName());
        arrobject[1] = stringBuilder.toString();
        intent.putExtra("android.intent.extra.TEXT", String.format((String)string, (Object[])arrobject));
        return intent;
    }

    public static Intent a(Uri uri, String string) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        String string2 = uri.toString();
        String string3 = string2.split("[:?]")[1];
        if (!string.endsWith(":")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(":");
            string = stringBuilder.toString();
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.registerParameter("body", dc.a());
        urlQuerySanitizer.parseUrl(string2);
        String string4 = urlQuerySanitizer.getValue("body");
        if (!ct.a(string3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(string3);
            intent.setData(Uri.parse((String)stringBuilder.toString()));
        } else {
            intent.setData(Uri.parse((String)string));
        }
        if (!ct.a(string4)) {
            intent.putExtra("sms_body", string4);
        }
        return intent;
    }

    public static void a(Context context, String string) throws ActivityNotFoundException {
        try {
            bb.a(context, string, "android.intent.category.BROWSABLE", "com.android.browser", "com.android.browser.BrowserActivity");
            return;
        }
        catch (SecurityException securityException) {
            try {
                try {
                    bb.b(context, string);
                    return;
                }
                catch (SecurityException securityException2) {
                    return;
                }
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                return;
            }
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            try {
                bb.a(context, string, "android.intent.category.BROWSABLE", "com.google.android.browser", "com.google.android.browser.BrowserActivity");
                return;
            }
            catch (SecurityException securityException) {
                bb.b(context, string);
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException2) {
                bb.b(context, string);
                return;
            }
        }
    }

    public static void a(Context context, String string, String string2, String string3) {
        String[] arrstring = new String[]{string};
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", arrstring);
        intent.putExtra("android.intent.extra.SUBJECT", string2);
        intent.putExtra("android.intent.extra.TEXT", string3);
        intent.setType("message/rfc822");
        try {
            context.startActivity(Intent.createChooser((Intent)intent, (CharSequence)context.getString(2131558723)));
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)context, (int)2131558694, (int)0).show();
            return;
        }
    }

    private static void a(Context context, String string, String string2, String string3, String string4) throws ActivityNotFoundException {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (string != null && !string.equals((Object)"")) {
            intent.setData(Uri.parse((String)string));
            intent.addCategory(string2);
            intent.setClassName(string3, string4);
            context.startActivity(intent);
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean a(Context var0, Uri var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl142 : IINC : trying to set 1 previously set to 0
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

    private static void b(Context context, String string) throws ActivityNotFoundException {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (string != null && !string.equals((Object)"")) {
            intent.setData(Uri.parse((String)string));
            intent.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(intent);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0);
        public static final /* enum */ a b = new a(1);
        public static final /* enum */ a c = new a(2);
        private static final /* synthetic */ a[] e;
        private final int d;

        static {
            a[] arra = new a[]{a, b, c};
            e = arra;
        }

        private a(int n3) {
            this.d = n3;
        }

        public static a a() {
            if (a.a.d == 0) {
                return a;
            }
            if (a.b.d == 0) {
                return b;
            }
            if (a.c.d == 0) {
                return c;
            }
            return a;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])e.clone();
        }
    }

}

