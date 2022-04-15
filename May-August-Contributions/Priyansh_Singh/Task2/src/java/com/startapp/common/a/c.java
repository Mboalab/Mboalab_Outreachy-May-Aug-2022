package com.startapp.common.a;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class c {
    private static Object a;

    public static int a(int n2) {
        if (Build.VERSION.SDK_INT < 17) {
            switch (n2) {
                default: {
                    return n2;
                }
                case 8388613: {
                    if (Build.VERSION.SDK_INT >= 14) break;
                    return 5;
                }
                case 8388611: {
                    if (Build.VERSION.SDK_INT >= 14) break;
                    return 3;
                }
                case 21: {
                    return 11;
                }
                case 20: {
                    return 9;
                }
                case 17: {
                    return 1;
                }
                case 16: {
                    n2 = 0;
                }
            }
        }
        return n2;
    }

    public static int a(int n2, int n3, boolean bl2) {
        switch (n2) {
            default: {
                return 1;
            }
            case 2: {
                if (Build.VERSION.SDK_INT <= 8) {
                    return 0;
                }
                if (!bl2 && n3 != 0) {
                    if (n3 == 1) {
                        return 0;
                    }
                    return 8;
                }
                return 0;
            }
            case 1: 
        }
        if (Build.VERSION.SDK_INT <= 8) {
            return 1;
        }
        if (!(bl2 || n3 != 1 && n3 != 2)) {
            return 9;
        }
        return 1;
    }

    public static int a(Activity activity, int n2, boolean bl2) {
        int n3 = c.a(n2, activity.getWindowManager().getDefaultDisplay().getRotation(), bl2);
        c.a(activity, n3);
        return n3;
    }

    public static long a(ScanResult scanResult) {
        if (Build.VERSION.SDK_INT >= 17) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime() + scanResult.timestamp / 1000L;
        }
        return 0L;
    }
    public static long a(File var0_1, long var1) {
        if (var0_1 == null) ** GOTO lbl14
        try {
            if (var0_1.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 9) {
                    return var0_1.getFreeSpace();
                }
                var6_2 = new StatFs(var0_1.getPath());
                if (Build.VERSION.SDK_INT >= 18) {
                    var7_3 = var6_2.getBlockSizeLong();
                    var9_4 = var6_2.getFreeBlocksLong();
                    return var7_3 * var9_4;
                }
                var7_3 = var6_2.getBlockSize();
                var9_4 = var6_2.getFreeBlocks();
                return var7_3 * var9_4;
            }
lbl14:
            h.a("ApiUtil", 6, "Invalid filesDir argument - null or not a directory");
            return var1;
        }
        catch (Exception var3_5) {}
        var4_6 = new StringBuilder("Failed calculating free space with error: ");
        var4_6.append(var3_5.getMessage());
        h.a("ApiUtil", 6, var4_6.toString());
        return var1;
    }

    public static Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return null;
    }

    public static List<ScanResult> a(Context context, WifiManager wifiManager) {
        if (context != null) {
            if (wifiManager == null) {
                return null;
            }
            int n2 = Build.VERSION.SDK_INT;
            boolean bl2 = true;
            if (n2 >= 23 && !c.a(context, "android.permission.ACCESS_FINE_LOCATION") && !c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                bl2 = false;
            }
            if (bl2) {
                try {
                    List list = wifiManager.getScanResults();
                    return list;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder("Failed to retreive WIFI scan results: ");
                    stringBuilder.append(exception.getLocalizedMessage());
                    h.a("ApiUtil", 6, stringBuilder.toString());
                    return null;
                }
            }
            h.a("ApiUtil", 3, "Unable to get WIFI scan results: API level >= 23 but no location permission granted");
            return null;
        }
        return null;
    }

    public static List<CellInfo> a(Context context, TelephonyManager telephonyManager) {
        if (context != null) {
            if (telephonyManager == null) {
                return null;
            }
            if ((c.a(context, "android.permission.ACCESS_FINE_LOCATION") || c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) && Build.VERSION.SDK_INT >= 17) {
                return telephonyManager.getAllCellInfo();
            }
            return null;
        }
        return null;
    }

    public static List<PackageInfo> a(PackageManager packageManager) {
        String string = new String(new byte[]{103, 101, 116, 73, 110, 115, 116, 97, 108, 108, 101, 100, 80, 97, 99, 107, 97, 103, 101, 115});
        Class class_ = packageManager.getClass();
        Class[] arrclass = new Class[]{Integer.TYPE};
        Method method = class_.getMethod(string, arrclass);
        Object[] arrobject = new Object[]{8192};
        return (List)method.invoke((Object)packageManager, arrobject);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 9) {
            c.a(activity, 7);
            return;
        }
        c.a(activity, 1);
    }

    public static void a(Activity activity, int n2) {
        try {
            activity.setRequestedOrientation(n2);
            return;
        }
        catch (Exception exception) {
            h.a(6, "Error to setRequestedOrientation ", exception);
            return;
        }
    }

    @SuppressLint(value={"NewApi"})
    public static void a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            editor.commit();
            return;
        }
        editor.apply();
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(f2);
        }
    }

    public static void a(View view, long l2) {
        view.animate().alpha(1.0f).setDuration(l2).setListener(null);
    }

    public static void a(View view, final a a2) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(){

                public final void onLayoutChange(View view, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
                    a2.a(view, n2, n3, n4, n5, n6, n7, n8, n9);
                }
            });
        }
    }

    public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            return;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public static void a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    public static void a(WebView webView, Paint paint) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.setLayerType(1, paint);
        }
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 12;
    }
    public static boolean a(Context var0) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean a(Context context, String string) {
        block3 : {
            try {
                if (Build.VERSION.SDK_INT < 23) break block3;
                return context.checkSelfPermission(string) == 0;
            }
            catch (Throwable throwable) {
                String string2 = "Exception while checking permission: ".concat(String.valueOf((Object)((Object)throwable))) != null ? throwable.getMessage() : "";
                h.a(6, string2);
                return false;
            }
        }
        int n2 = context.checkCallingOrSelfPermission(string);
        return n2 == 0;
    }

    public static boolean a(Context context, String string, int n2) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int n3 = packageManager.getPackageInfo((String)string, (int)128).versionCode;
            return n3 >= n2;
        }
        catch (Exception exception) {
            return false;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo) {
        if ((1 & packageInfo.applicationInfo.flags) == 0) {
            return (128 & packageInfo.applicationInfo.flags) != 0;
        }
        return true;
    }

    public static boolean a(View view, boolean bl2) {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        if (1 == view.getLayerType()) {
            return false;
        }
        if (bl2) {
            return view.isHardwareAccelerated();
        }
        return false;
    }

    public static CharSequence b(ScanResult scanResult) {
        if (Build.VERSION.SDK_INT >= 23) {
            return scanResult.venueName;
        }
        return "";
    }

    public static String b(Context context, TelephonyManager telephonyManager) {
        List list;
        if (Build.VERSION.SDK_INT >= 17 && (c.a(context, "android.permission.ACCESS_FINE_LOCATION") || c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) && (list = telephonyManager.getAllCellInfo()) != null) {
            for (CellInfo cellInfo : list) {
                if (!cellInfo.isRegistered()) continue;
                try {
                    Object object = Class.forName((String)cellInfo.getClass().getName()).getMethod("getCellSignalStrength", null).invoke((Object)cellInfo, null);
                    String string = Integer.toString((int)Integer.parseInt((String)Class.forName((String)object.getClass().getName()).getMethod("getTimingAdvance", null).invoke(object, null).toString()));
                    return string;
                }
                catch (Exception exception) {
                    h.a(6, "Error while calling ApiUtil.getCellTimingAdv()");
                    return null;
                }
            }
        }
        return null;
    }

    public static Set<String> b(Context context) {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
                Iterator iterator = inputMethodManager.getEnabledInputMethodList().iterator();
                while (iterator.hasNext()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo)iterator.next(), true)) {
                        if (!inputMethodSubtype.getMode().equals((Object)"keyboard")) continue;
                        hashSet.add((Object)inputMethodSubtype.getLocale());
                    }
                }
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("Failed to retreive keyboard input langs: ");
                stringBuilder.append(exception.getLocalizedMessage());
                h.a("ApiUtil", 6, stringBuilder.toString());
            }
        }
        return hashSet;
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 9) {
            c.a(activity, 6);
            return;
        }
        c.a(activity, 0);
    }

    public static void b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onPause();
            return;
        }
        try {
            Class.forName((String)"android.webkit.WebView").getMethod("onPause", null).invoke((Object)webView, null);
            return;
        }
        catch (Exception exception) {
            h.a(6, "Error while calling webView.onPause()");
            return;
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 14;
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onResume();
            return;
        }
        try {
            Class.forName((String)"android.webkit.WebView").getMethod("onResume", null).invoke((Object)webView, null);
            return;
        }
        catch (Exception exception) {
            h.a(6, "Error while calling webView.onResume()");
            return;
        }
    }

    public static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getInt((ContentResolver)context.getContentResolver(), (String)"auto_time", (int)0) > 0;
        }
        return Settings.System.getInt((ContentResolver)context.getContentResolver(), (String)"auto_time", (int)0) > 0;
    }

    public static int d(Context context) {
        try {
            int n2 = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
            return n2;
        }
        catch (PackageManager.NameNotFoundException | Exception throwable) {
            return 0;
        }
    }

    public static String e(Context context) {
        try {
            String string = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionName;
            return string;
        }
        catch (PackageManager.NameNotFoundException | Exception throwable) {
            return null;
        }
    }

    public static int f(Context context) {
        h.a("ApiUtil", 3, "getPackageList entered");
        int n2 = 0;
        try {
            for (PackageInfo packageInfo : c.a(context.getPackageManager())) {
                boolean bl2;
                if (c.a(packageInfo) && !(bl2 = packageInfo.packageName.equals((Object)Constants.a))) continue;
            }
        }
        catch (Exception exception) {
            h.a("ApiUtil", 6, "Could not complete getPackagesList", exception);
        }
        {
            ++n2;
            continue;
            break;
        }
        return n2;
    }

    public static boolean g(Context context) {
        try {
            int n2 = Build.VERSION.SDK_INT < 17 ? Settings.Secure.getInt((ContentResolver)context.getContentResolver(), (String)"adb_enabled", (int)0) : Settings.Global.getInt((ContentResolver)context.getContentResolver(), (String)"adb_enabled", (int)0);
            return n2 != 0;
        }
        catch (Exception exception) {
            h.a("ApiUtil", 6, "getUsbDebug", exception);
            return false;
        }
    }
    public String a(InputStream var1, String var2) {
        throw new IllegalStateException("Decompilation failed");
    }
    public String a(String var1, Context var2) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static interface a {
        public void a(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);
    }

}

