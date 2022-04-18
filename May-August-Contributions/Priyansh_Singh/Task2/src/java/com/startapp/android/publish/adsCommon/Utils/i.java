/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Handler
 *  android.util.Base64
 *  android.util.Log
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  com.startapp.common.b.b
 *  com.startapp.common.e
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.lang.reflect.Modifier
 *  java.math.BigInteger
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.WeakHashMap
 */
package com.startapp.android.publish.adsCommon.Utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.c;
import com.startapp.common.a.h;
import com.startapp.common.b.b;
import com.startapp.common.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class i {
    protected static int a;
    private static Map<Activity, Integer> b;
    private static boolean c;

    static {
        b = new WeakHashMap();
        c = false;
    }

    public static int a(Activity activity, int n2, boolean bl) {
        if (bl) {
            if (!b.containsKey((Object)activity)) {
                b.put((Object)activity, (Object)activity.getRequestedOrientation());
            }
            if (n2 == activity.getResources().getConfiguration().orientation) {
                return c.a((Activity)activity, (int)n2, (boolean)false);
            }
            return c.a((Activity)activity, (int)n2, (boolean)true);
        }
        int n3 = -1;
        if (b.containsKey((Object)activity)) {
            n3 = (Integer)b.get((Object)activity);
            c.a((Activity)activity, (int)n3);
            b.remove((Object)activity);
        }
        return n3;
    }

    public static long a(File file, long l2) {
        return c.a((File)file, (long)l2);
    }

    public static Class<?> a(Context context, Class<? extends Activity> class_, Class<? extends Activity> class_2) {
        if (!i.a(context, class_)) {
            if (!i.a(context, class_2)) {
                return class_;
            }
            StringBuilder stringBuilder = new StringBuilder("Expected activity ");
            stringBuilder.append(class_.getName());
            stringBuilder.append(" is missing from AndroidManifest.xml");
            Log.w((String)"StartAppWall.Util", (String)stringBuilder.toString());
            return class_2;
        }
        return class_;
    }

    public static Object a(Class class_, String string, Object object) {
        try {
            Field field = class_.getDeclaredField(string);
            field.setAccessible(true);
            Object object2 = field.get(object);
            return object2;
        }
        catch (IllegalAccessException illegalAccessException) {
            h.a((String)"StartAppWall.Util", (int)6, (String)illegalAccessException.getLocalizedMessage());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            h.a((String)"StartAppWall.Util", (int)6, (String)illegalArgumentException.getLocalizedMessage());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            h.a((String)"StartAppWall.Util", (int)6, (String)noSuchFieldException.getLocalizedMessage());
        }
        return null;
    }

    public static <T> T a(String string, Class<T> class_) {
        Object object = b.a((String)string, class_);
        if (object != null) {
            return (T)object;
        }
        throw new e();
    }

    public static String a(Context context, int n2) {
        try {
            Bitmap bitmap = BitmapFactory.decodeResource((Resources)context.getResources(), (int)n2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
            String string = Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)2);
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static String a(Double d2) {
        if (d2 != null) {
            return String.format((String)"%.2f", (Object[])new Object[]{d2});
        }
        return null;
    }

    public static String a(String string, String string2, String string3) {
        if (string != null && string2 != null) {
            int n2;
            if (string3 == null) {
                return null;
            }
            int n3 = string.indexOf(string2);
            if (n3 != -1 && (n2 = string.indexOf(string3, n3 + string2.length())) != -1) {
                return string.substring(n3 + string2.length(), n2);
            }
            return null;
        }
        return null;
    }

    private static List<Field> a(Class class_) {
        return i.a((List<Field>)new LinkedList(), class_);
    }

    private static List<Field> a(List<Field> list, Class<?> class_) {
        list.addAll((Collection)Arrays.asList((Object[])class_.getDeclaredFields()));
        if (class_.getSuperclass() != null) {
            i.a(list, class_.getSuperclass());
        }
        return list;
    }

    public static void a(Activity activity, boolean bl) {
        i.a(activity, activity.getResources().getConfiguration().orientation, bl);
    }

    public static void a(Context context, WebView webView, String string) {
        try {
            webView.loadDataWithBaseURL(MetaData.getInstance().getAdPlatformHost(), string, "text/html", "utf-8", null);
            return;
        }
        catch (Exception exception) {
            if (context != null) {
                f.a(context, d.b, "Util.loadDataToWebview failed", exception.getMessage(), "");
            }
            h.a((int)6, (String)"StartAppWall.UtilError while encoding html");
            return;
        }
    }

    public static void a(Context context, AdPreferences adPreferences) {
        String string = k.a(context, "shared_prefs_devId", null);
        String string2 = k.a(context, "shared_prefs_appId", null);
        if (adPreferences.getPublisherId() == null) {
            adPreferences.setPublisherId(string);
        }
        if (adPreferences.getProductId() == null) {
            adPreferences.setProductId(string2);
        }
        if (adPreferences.getProductId() == null && !c) {
            c = true;
            Log.e((String)"StartApp", (String)"Integration Error - App ID is missing");
        }
    }

    public static void a(Context context, String string, final a a2) {
        if ("true".equals((Object)i.a(string, "@doNotRender@", "@doNotRender@"))) {
            a2.a();
            return;
        }
        try {
            final WebView webView = new WebView(context);
            final Handler handler = new Handler();
            if (AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                a = 25000;
                webView.getSettings().setBlockNetworkImage(false);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
            } else {
                a = 0;
            }
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(new WebViewClient(){

                public final void onPageFinished(WebView webView2, String string) {
                    super.onPageFinished(webView2, string);
                    StringBuilder stringBuilder = new StringBuilder("onPageFinished url=[");
                    stringBuilder.append(string);
                    stringBuilder.append("]");
                    h.a((String)"StartAppWall.Util", (int)4, (String)stringBuilder.toString());
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new Runnable(){

                        public void run() {
                            webView.destroy();
                            h.a((String)"StartAppWall.Util", (int)4, (String)"webview destroyed");
                            a2.a();
                        }
                    }, (long)i.a);
                }

                public final void onReceivedError(final WebView webView2, int n2, final String string, String string2) {
                    super.onReceivedError(webView2, n2, string, string2);
                    StringBuilder stringBuilder = new StringBuilder("onReceivedError failingUrl=[");
                    stringBuilder.append(string2);
                    stringBuilder.append("], description=[");
                    stringBuilder.append(string);
                    stringBuilder.append("]");
                    h.a((String)"StartAppWall.Util", (int)6, (String)stringBuilder.toString());
                    handler.removeCallbacksAndMessages(null);
                    handler.post(new Runnable(){

                        public void run() {
                            webView2.destroy();
                            a2.a(string);
                        }
                    });
                }

                public final boolean shouldOverrideUrlLoading(WebView webView2, String string) {
                    StringBuilder stringBuilder = new StringBuilder("shouldOverrideUrlLoading url=[");
                    stringBuilder.append(string);
                    stringBuilder.append("]");
                    h.a((String)"StartAppWall.Util", (int)4, (String)stringBuilder.toString());
                    return super.shouldOverrideUrlLoading(webView2, string);
                }

            });
            i.a(context, webView, string);
            h.a((String)"StartAppWall.Util", (int)4, (String)"Data loaded to webview");
            handler.postDelayed(new Runnable(){

                public final void run() {
                    webView.destroy();
                    a2.a();
                    h.a((String)"StartAppWall.Util", (int)4, (String)"webview destroyed pos 2");
                }
            }, 25000L);
            return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "Util.loadHtmlToCacheWebView - webview failed", exception.getMessage(), "");
            a2.a("WebView instantiation Error");
            return;
        }
    }

    public static void a(Context context, String string, String string2) {
        if (string != null) {
            k.b(context, "shared_prefs_devId", string.trim());
        } else {
            k.b(context, "shared_prefs_devId", null);
        }
        k.b(context, "shared_prefs_appId", string2.trim());
    }

    public static void a(SharedPreferences.Editor editor) {
        c.a((SharedPreferences.Editor)editor);
    }

    public static /* varargs */ void a(WebView webView, String string, Object ... arrobject) {
        if (webView != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("(");
            if (arrobject != null) {
                for (int i2 = 0; i2 < arrobject.length; ++i2) {
                    if (arrobject[i2] instanceof String) {
                        stringBuilder.append("\"");
                        stringBuilder.append(arrobject[i2]);
                        stringBuilder.append("\"");
                    } else {
                        stringBuilder.append(arrobject[i2]);
                    }
                    if (i2 >= -1 + arrobject.length) continue;
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append(")");
            StringBuilder stringBuilder2 = new StringBuilder("runJavascript: ");
            stringBuilder2.append(stringBuilder.toString());
            h.a((String)"StartAppWall.Util", (int)3, (String)stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder("javascript:");
            stringBuilder3.append(stringBuilder.toString());
            webView.loadUrl(stringBuilder3.toString());
        }
    }

    public static void a(AdPreferences adPreferences, String string, boolean bl) {
        i.a(adPreferences.getClass(), string, (Object)adPreferences, (Object)bl);
    }

    public static void a(Class class_, String string, Object object, Object object2) {
        try {
            Field field = class_.getDeclaredField(string);
            field.setAccessible(true);
            field.set(object, object2);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
            return;
        }
    }

    public static <T> void a(T t2, T t3) {
        try {
            for (Field field : i.a(t3.getClass())) {
                int n2 = field.getModifiers();
                if (Modifier.isTransient((int)n2) || Modifier.isStatic((int)n2)) continue;
                field.setAccessible(true);
                if (field.get(t2) != null) continue;
                field.set(t2, field.get(t3));
            }
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Util.mergeDefaultValues failed: ");
            stringBuilder.append(exception.getMessage());
            h.a((int)3, (String)stringBuilder.toString());
            return;
        }
    }

    public static boolean a() {
        return new BigInteger(AdsConstants.i, 10).intValue() == 0;
    }

    public static boolean a(long l2) {
        String string = AdsConstants.i;
        if (!string.equals((Object)"${flavor}")) {
            return (l2 & new BigInteger(string, 2).longValue()) != 0L;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Context context) {
        NetworkInfo networkInfo;
        if (AdsConstants.OVERRIDE_HOST != null) return true;
        if (AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            return true;
        }
        if (!c.a((Context)context, (String)"android.permission.ACCESS_NETWORK_STATE")) return false;
        try {
            networkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkInfo == null) return false;
        }
        catch (Exception exception) {
            f.a(context, d.b, "Util.isNetworkAvailable - system service failed", exception.getMessage(), "");
            return false;
        }
        boolean bl = networkInfo.isConnected();
        if (!bl) return false;
        return true;
    }

    /*
     * Exception decompiling
     */
    public static boolean a(Context var0, Class<? extends Activity> var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl31.1 : ICONST_0 : trying to set 1 previously set to 0
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

    public static boolean a(AdPreferences adPreferences, String string) {
        Object object = i.a(adPreferences.getClass(), string, (Object)adPreferences);
        if (object != null && object instanceof Boolean) {
            return (Boolean)object;
        }
        return false;
    }

    public static String b() {
        String string = "3.8.4";
        if (string.equals((Object)"${version}")) {
            string = "0";
        }
        StringBuilder stringBuilder = new StringBuilder("SDK version: [");
        stringBuilder.append(string);
        stringBuilder.append("]");
        h.a((int)3, (String)stringBuilder.toString());
        return string;
    }

    public static String b(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return "landscape";
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            return "portrait";
        }
        return "undefined";
    }

    public static String b(AdPreferences adPreferences, String string) {
        Object object = i.a(adPreferences.getClass(), string, (Object)adPreferences);
        if (object != null && object instanceof String) {
            return (String)object;
        }
        return null;
    }

    public static String c() {
        String string = "1111111111";
        if (string.equals((Object)"${flavor}")) {
            string = "1111111111";
        }
        StringBuilder stringBuilder = new StringBuilder("SDK Flavor: [");
        stringBuilder.append(string);
        stringBuilder.append("]");
        h.a((int)3, (String)stringBuilder.toString());
        return string;
    }

    /*
     * Exception decompiling
     */
    public static String c(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl37.1 : ALOAD : trying to set 0 previously set to 1
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

    public static String d() {
        String string = "aar";
        if (string.equals((Object)"${packaging}")) {
            string = "";
        }
        return string;
    }

    public static String d(Context context) {
        return context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public static boolean e() {
        return i.a(2L) || i.a(16L) || i.a(32L) || i.a(4L);
        {
        }
    }

    public static boolean e(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance != 100 || !runningAppProcessInfo.processName.equals((Object)context.getPackageName())) continue;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static boolean f(Context var0) {
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

    public String a(String string, Context context) {
        try {
            String string2 = new c().a(string, context);
            return string2;
        }
        catch (Exception exception) {
            f.a(context, d.b, "Util.getApkHash - system service failed", exception.getMessage(), "");
            return null;
        }
    }

    public static interface a {
        public void a();

        public void a(String var1);
    }

}

