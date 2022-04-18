/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings
 *  android.text.TextUtils
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  com.startapp.android.publish.adsCommon.e
 *  com.startapp.android.publish.adsCommon.e.e
 *  com.startapp.android.publish.adsCommon.h
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.model.AdDetails
 *  com.startapp.android.publish.common.model.AdPreferences
 *  com.startapp.android.publish.common.model.AdPreferences$Placement
 *  com.startapp.common.Constants
 *  com.startapp.common.a.a
 *  com.startapp.common.a.b
 *  com.startapp.common.a.b$c
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  com.startapp.common.b
 *  com.startapp.common.e
 *  com.startapp.common.g
 *  com.startapp.common.g$a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.g;
import com.startapp.android.publish.adsCommon.h;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.Constants;
import com.startapp.common.a.b;
import com.startapp.common.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static ProgressDialog a;

    public static int a(String string) {
        String[] arrstring = string.split("&");
        return Integer.parseInt((String)arrstring[arrstring.length - 1].split("=")[1]);
    }

    public static Ad.AdType a(AdPreferences adPreferences, String string) {
        Object object = i.a(adPreferences.getClass(), string, (Object)adPreferences);
        if (object != null && object instanceof Ad.AdType) {
            return (Ad.AdType)((Object)object);
        }
        return null;
    }

    public static String a() {
        StringBuilder stringBuilder = new StringBuilder("&position=");
        stringBuilder.append(c.b());
        return stringBuilder.toString();
    }

    public static String a(Context context, String string) {
        try {
            String string2 = context.getResources().getString(context.getApplicationInfo().labelRes);
            return string2;
        }
        catch (Resources.NotFoundException throwable2) {
            ApplicationInfo applicationInfo;
            PackageManager packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            }
            catch (PackageManager.NameNotFoundException throwable2) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                string = packageManager.getApplicationLabel(applicationInfo);
            }
            return string;
        }
    }

    public static String a(String string, String string2) {
        String string3 = string2 != null && !string2.equals((Object)"") ? string2.split("[?&]d=")[1] : string.split("[?&]d=")[1];
        return string3.split("[?&]")[0];
    }

    public static List<String> a(List<String> list, String string, String string2) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (n2 < list.size()) {
            int n3 = n2 + 5;
            List list2 = list.subList(n2, Math.min((int)n3, (int)list.size()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(AdsConstants.f);
            stringBuilder.append("?");
            stringBuilder.append(TextUtils.join((CharSequence)"&", (Iterable)list2));
            stringBuilder.append("&isShown=");
            stringBuilder.append(string);
            String string3 = string2 != null ? "&appPresence=".concat(String.valueOf((Object)string2)) : "";
            stringBuilder.append(string3);
            arrayList.add((Object)stringBuilder.toString());
            n2 = n3;
        }
        StringBuilder stringBuilder = new StringBuilder("newUrlList size = ");
        stringBuilder.append(arrayList.size());
        com.startapp.common.a.h.a((int)3, (String)stringBuilder.toString());
        return arrayList;
    }

    public static final void a(Context context) {
        if (context != null && context instanceof Activity) {
            i.a((Activity)context, false);
        }
        c.d(context);
    }

    private static void a(Context context, Intent intent, int n2) {
        block5 : {
            String[] arrstring = new String[]{"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
            List list = context.getPackageManager().queryIntentActivities(intent, n2);
            if (list == null) break block5;
            try {
                if (list.size() <= 1) break block5;
            }
            catch (Exception exception) {
                f.a(context, d.b, "AdsCommonUtils.chooseDefaultBrowser", exception.getMessage(), "");
                return;
            }
            for (int i2 = 0; i2 < 5; ++i2) {
                String string = arrstring[i2];
                if (!com.startapp.common.a.c.a((Context)context, (String)string, (int)0)) continue;
                intent.setPackage(string);
                return;
            }
        }
        return;
    }

    public static void a(Context context, String string, com.startapp.android.publish.adsCommon.d.b b2) {
        if (string != null && !string.equalsIgnoreCase("")) {
            StringBuilder stringBuilder = new StringBuilder("Sending Impression: [");
            stringBuilder.append(string);
            stringBuilder.append("]");
            com.startapp.common.a.h.a((int)3, (String)stringBuilder.toString());
            if (b2 != null) {
                b2.setLocation(context);
            }
            c.a(context, string, b2, true);
        }
    }

    public static void a(final Context context, final String string, final com.startapp.android.publish.adsCommon.d.b b2, final boolean bl) {
        if (!string.equals((Object)"")) {
            com.startapp.common.g.a((g.a)g.a.b, (Runnable)new Runnable(){

                public final void run() {
                    try {
                        if (bl) {
                            Context context2 = context;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string);
                            stringBuilder.append(com.startapp.common.a.a.a((String)c.e(string)));
                            stringBuilder.append(b2.getQueryString());
                            com.startapp.android.publish.adsCommon.h.a.a(context2, stringBuilder.toString(), null);
                            return;
                        }
                        Context context3 = context;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        stringBuilder.append(b2.getQueryString());
                        com.startapp.android.publish.adsCommon.h.a.a(context3, stringBuilder.toString(), null);
                        return;
                    }
                    catch (com.startapp.common.e e2) {
                        f.a(context, d.b, "Util.sendTrackingMessage - Error sending tracking message", e2.getMessage(), c.e(string));
                        com.startapp.common.a.h.a((int)6, (String)"Error sending tracking message", (Throwable)e2);
                        return;
                    }
                }
            });
        }
    }

    public static void a(Context context, String string, String string2) {
        c.a(context, string, string2, c.d(string));
    }

    private static void a(Context context, String string, String string2, int n2) {
        try {
            Intent intent = Intent.parseUri((String)string, (int)n2);
            c.a(context, intent);
            context.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "Util.openUrlExternally - Couldn't start activity", exception.getMessage(), string2);
            StringBuilder stringBuilder = new StringBuilder("Cannot find activity to handle url: [");
            stringBuilder.append(string);
            stringBuilder.append("]");
            com.startapp.common.a.h.a((int)6, (String)stringBuilder.toString());
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void a(Context context, String string, String string2, com.startapp.android.publish.adsCommon.d.b b2, boolean bl) {
        String string5;
        String string4;
        String string3;
        void var16_18;
        block11 : {
            block12 : {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    c.b(context, string2, b2);
                }
                m.a().b();
                string5 = null;
                try {
                    String string6;
                    string5 = string6 = c.a(string, string2);
                }
                catch (Exception exception) {
                    d d2 = d.g;
                    StringBuilder stringBuilder = new StringBuilder("Util.clickWithoutSmartRedirect(): Couldn't extract dparams with clickUrl ");
                    stringBuilder.append(string);
                    stringBuilder.append(" and tacking click url ");
                    stringBuilder.append(string2);
                    f.a(context, d2, stringBuilder.toString(), exception.getMessage(), null);
                    StringBuilder stringBuilder2 = new StringBuilder("Cannot start activity to handle url: [");
                    stringBuilder2.append(string);
                    stringBuilder2.append("]");
                    com.startapp.common.a.h.a((int)6, (String)stringBuilder2.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                String string7 = c.f(string2) ? com.startapp.common.a.a.a((String)string5) : "";
                stringBuilder.append(string7);
                string3 = stringBuilder.toString();
                try {
                    if (MetaData.getInstance().isInAppBrowser() && bl) {
                        c.b(context, string3, string5);
                        return;
                    }
                    string4 = "externalBrowser";
                }
                catch (Exception exception) {}
                try {
                    if (TextUtils.isEmpty((CharSequence)string2) && c.e(context)) {
                        c.b(context);
                        c.c(context, c.g(string3));
                        com.startapp.common.a.h.a((int)6, (String)"forceExternal - click without - External");
                        com.startapp.common.a.h.a((int)6, (String)"forceExternal - click without - trackingClickUrl : ".concat(String.valueOf((Object)string2)));
                        return;
                    }
                    c.c(context, string3);
                    return;
                }
                catch (Exception exception) {}
                break block11;
                break block12;
                catch (Exception exception) {
                    string3 = string;
                }
            }
            string4 = "InAppBrowser";
        }
        f.a(context, d.b, "Util.clickWithoutSmartRedirect - Couldn't start activity for ".concat(String.valueOf((Object)string4)), var16_18.getMessage(), string5);
        StringBuilder stringBuilder = new StringBuilder("Cannot start activity to handle url: [");
        stringBuilder.append(string3);
        stringBuilder.append("]");
        com.startapp.common.a.h.a((int)6, (String)stringBuilder.toString());
    }

    private static final void a(Context context, String string, String string2, String string3, long l2, boolean bl, Boolean bl2, Runnable runnable) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        com.startapp.common.b.a((Context)context).a(intent);
        if (c.b(string)) {
            if (string2 != null && !string2.equals((Object)"") && !string.toLowerCase().contains((CharSequence)string2.toLowerCase())) {
                d d2 = d.e;
                StringBuilder stringBuilder = new StringBuilder("Expected: ");
                stringBuilder.append(string2);
                stringBuilder.append(" Link: ");
                stringBuilder.append(string);
                f.a(context, d2, "Wrong package name reached", stringBuilder.toString(), string3);
            }
            c.a(context, string, string3);
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        if (context instanceof Activity) {
            i.a((Activity)context, true);
        }
        try {
            WebView webView;
            block12 : {
                block13 : {
                    webView = new WebView(context);
                    if (a != null) break block12;
                    a = Build.VERSION.SDK_INT >= 22 ? new ProgressDialog(context, 16974545) : new ProgressDialog(context);
                    a.setTitle(null);
                    a.setMessage((CharSequence)"Loading....");
                    a.setIndeterminate(false);
                    a.setCancelable(false);
                    a.setOnCancelListener(new DialogInterface.OnCancelListener(){

                        public final void onCancel(DialogInterface dialogInterface) {
                            webView.stopLoading();
                        }
                    });
                    if (context instanceof Activity && !((Activity)context).isFinishing()) break block13;
                    if (context instanceof Activity || !c.c(context) || a.getWindow() == null) break block12;
                    if (Build.VERSION.SDK_INT >= 26) {
                        a.getWindow().setType(2038);
                    } else {
                        a.getWindow().setType(2003);
                    }
                }
                a.show();
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient());
            a a2 = new a(context, l2, bl, bl2, a, string, string2, string3, runnable);
            webView.setWebViewClient((WebViewClient)a2);
            webView.loadUrl(string);
            return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "Util.smartRedirect - Webview failed", exception.getMessage(), string3);
            c.a(context, string, string3);
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
    }

    public static final void a(Context context, String string, String string2, String string3, com.startapp.android.publish.adsCommon.d.b b2, long l2, boolean bl, Boolean bl2) {
        c.a(context, string, string2, string3, b2, l2, bl, bl2, null);
    }

    public static final void a(Context context, String string, String string2, String string3, com.startapp.android.publish.adsCommon.d.b b2, long l2, boolean bl, Boolean bl2, Runnable runnable) {
        if (b.a().B()) {
            String string4;
            m.a().b();
            try {
                string4 = c.a(string, string2);
            }
            catch (Exception exception) {
                d d2 = d.g;
                StringBuilder stringBuilder = new StringBuilder("Util.clickWithSmartRedirect(): Couldn't extract dparams with clickUrl ");
                stringBuilder.append(string);
                stringBuilder.append(" and tacking click url ");
                stringBuilder.append(string2);
                f.a(context, d2, stringBuilder.toString(), exception.getMessage(), null);
                StringBuilder stringBuilder2 = new StringBuilder("Cannot start activity to handle url: [");
                stringBuilder2.append(string);
                stringBuilder2.append("]");
                com.startapp.common.a.h.a((int)6, (String)stringBuilder2.toString());
                string4 = null;
            }
            if (string2 != null && !string2.equals((Object)"")) {
                c.b(context, string2, b2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            String string5 = c.f(string2) ? com.startapp.common.a.a.a((String)string4) : "";
            stringBuilder.append(string5);
            c.a(context, stringBuilder.toString(), string3, string4, l2, bl, bl2, runnable);
            return;
        }
        c.a(context, string, string2, b2, bl);
    }

    public static void a(Context context, String string, String string2, boolean bl) {
        if (context == null) {
            return;
        }
        int n2 = 76021760;
        if (b.a().F() || !(context instanceof Activity)) {
            n2 = 344457216;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
        intent.addFlags(n2);
        boolean bl2 = c.a(context, intent);
        if (bl && !bl2) {
            c.a(context, intent, n2);
        }
        try {
            context.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            c.a(context, string, string2, n2);
            return;
        }
    }

    public static void a(Context context, String[] arrstring, com.startapp.android.publish.adsCommon.d.b b2) {
        if (arrstring != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                c.a(context, arrstring[i2], b2);
            }
        }
    }

    public static void a(Context context, String[] arrstring, String string, int n2, String string2) {
        com.startapp.android.publish.adsCommon.d.b b2 = new com.startapp.android.publish.adsCommon.d.b(string).setOffset(n2).setNonImpressionReason(string2);
        if (arrstring != null) {
            for (String string3 : arrstring) {
                if (string3 == null || string3.equalsIgnoreCase("")) continue;
                StringBuilder stringBuilder = new StringBuilder("Sending Impression: [");
                stringBuilder.append(string3);
                stringBuilder.append("]");
                com.startapp.common.a.h.a((int)3, (String)stringBuilder.toString());
                c.a(context, string3, b2, false);
            }
        }
    }

    public static void a(Context context, String[] arrstring, String string, String string2) {
        c.a(context, arrstring, string, 0, string2);
    }

    public static void a(AdPreferences adPreferences, String string, Ad.AdType adType) {
        i.a(adPreferences.getClass(), string, (Object)adPreferences, (Object)adType);
    }

    public static void a(String string, String string2, String string3, Context context, com.startapp.android.publish.adsCommon.d.b b2) {
        c.a(context, string3, b2, true);
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(string);
        if (string2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(string2);
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                    String string4 = String.valueOf((Object)iterator.next());
                    intent.putExtra(string4, String.valueOf((Object)jSONObject.get(string4)));
                }
            }
            catch (JSONException jSONException) {
                com.startapp.common.a.h.a((int)6, (String)"Couldn't parse intent details json!", (Throwable)jSONException);
            }
        }
        try {
            context.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            String string5 = c.a(string3, null);
            f.a(context, d.b, "Util.handleCPEClick - Couldn't start activity", exception.getMessage(), string5);
            StringBuilder stringBuilder = new StringBuilder("Cannot find activity to handle url: [");
            stringBuilder.append(string3);
            stringBuilder.append("]");
            com.startapp.common.a.h.a((int)6, (String)stringBuilder.toString());
            return;
        }
    }

    private static boolean a(long l2, long l3) {
        if (l2 != 0L) {
            return l2 + 86400000L * (long)b.a().K() <= l3;
        }
        return true;
    }

    public static boolean a(Activity activity) {
        boolean bl = activity.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        if ((1024 & activity.getWindow().getAttributes().flags) != 0) {
            bl = true;
        }
        return bl;
    }

    public static boolean a(Context context, Intent intent) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (!resolveInfo.activityInfo.packageName.equalsIgnoreCase(Constants.a)) continue;
            intent.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            return true;
        }
        return false;
    }

    public static boolean a(Context context, AdPreferences.Placement placement) {
        com.startapp.common.a.h.a((String)"AdsCommonUtils", (int)6, (String)"forceExternal - check -placement is : ".concat(String.valueOf((Object)placement)));
        if (!placement.equals((Object)AdPreferences.Placement.INAPP_SPLASH) && b.a().L()) {
            return c.e(context);
        }
        return false;
    }

    public static String[] a(g g2) {
        if (g2 instanceof e) {
            return ((e)g2).k();
        }
        if (g2 instanceof h) {
            return c.a((List<AdDetails>)((h)g2).d());
        }
        return new String[0];
    }

    public static String[] a(List<AdDetails> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((AdDetails)iterator.next()).getTrackingUrl());
            }
        }
        return (String[])arrayList.toArray((Object[])new String[0]);
    }

    public static String b() {
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        for (int i2 = 0; i2 < 8; ++i2) {
            if (arrstackTraceElement[i2].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (arrstackTraceElement[i2].getMethodName().compareTo("onBackPressed") != 0) continue;
            if (!m.a().f() && !m.o()) {
                return "interstitial";
            }
            m.a().l();
            return "back";
        }
        return "interstitial";
    }

    private static void b(Context context) {
        k.b(context, "shared_prefs_CookieFeatureTS", System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder("forceExternal - write to sp - TS : ");
        stringBuilder.append(SimpleDateFormat.getDateInstance().format(new Date()));
        com.startapp.common.a.h.a((int)6, (String)stringBuilder.toString());
    }

    public static void b(final Context context, final String string) {
        com.startapp.common.g.a((g.a)g.a.b, (Runnable)new Runnable(){

            public final void run() {
                try {
                    com.startapp.android.publish.adsCommon.h.a.a(context, string, null);
                    return;
                }
                catch (com.startapp.common.e e2) {
                    f.a(context, d.b, "Util.sendTrackingMessage - Error sending tracking message", e2.getMessage(), "");
                    com.startapp.common.a.h.a((int)6, (String)"Error sending tracking message", (Throwable)e2);
                    return;
                }
            }
        });
    }

    public static void b(Context context, String string, com.startapp.android.publish.adsCommon.d.b b2) {
        c.a(context, string, b2, true);
    }

    public static void b(Context context, String string, String string2) {
        if (!c.b(string) && i.a(256L)) {
            Intent intent = new Intent(context, OverlayActivity.class);
            if (Build.VERSION.SDK_INT >= 21) {
                intent.addFlags(524288);
            }
            if (Build.VERSION.SDK_INT >= 11) {
                intent.addFlags(32768);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse((String)string));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.getIndex());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
                return;
            }
            catch (Exception exception) {
                f.a(context, d.b, "Util.OpenAsInAppBrowser - Couldn't start activity", exception.getMessage(), string2);
                StringBuilder stringBuilder = new StringBuilder("Cannot find activity to handle url: [");
                stringBuilder.append(string);
                stringBuilder.append("]");
                com.startapp.common.a.h.a((int)6, (String)stringBuilder.toString());
                return;
            }
        }
        c.a(context, string, string2);
    }

    public static boolean b(String string) {
        return string.startsWith("market") || string.startsWith("http://play.google.com") || string.startsWith("https://play.google.com");
        {
        }
    }

    public static void c(Context context, String string) {
        c.a(context, string, null);
    }

    private static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays((Context)context);
        }
        return com.startapp.common.a.c.a((Context)context, (String)"android.permission.SYSTEM_ALERT_WINDOW");
    }

    public static boolean c(String string) {
        return string.startsWith("intent://");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d(Context context) {
        ProgressDialog progressDialog;
        if (a == null) {
            return;
        }
        ProgressDialog progressDialog2 = progressDialog = a;
        synchronized (progressDialog2) {
            boolean bl;
            if (a != null && (bl = a.isShowing())) {
                try {
                    a.cancel();
                }
                catch (Exception exception) {
                    com.startapp.common.a.h.a((int)6, (String)"Error while cancelling progress", (Throwable)exception);
                    f.a(context, d.b, "AdsCommonUtils.cancelProgress - progress.cancel() failed", exception.getMessage(), "");
                }
                a = null;
            }
            return;
        }
    }

    public static boolean d(String string) {
        return string != null && (string.startsWith("http://") || string.startsWith("https://"));
    }

    public static String e(String string) {
        return c.a(string, null);
    }

    private static boolean e(Context context) {
        if (!com.startapp.common.a.b.a().a(context).b() && c.a(k.a(context, "shared_prefs_CookieFeatureTS", 0L), System.currentTimeMillis())) {
            com.startapp.common.a.h.a((String)"AdsCommonUtils", (int)6, (String)"forceExternal - check - true ");
            return true;
        }
        return false;
    }

    private static boolean f(String string) {
        return b.a().C() || TextUtils.isEmpty((CharSequence)string);
        {
        }
    }

    private static String g(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("&cki=1");
        return stringBuilder.toString();
    }

    static class a
    extends WebViewClient {
        protected String a = "";
        protected String b;
        protected boolean c = false;
        protected boolean d = false;
        protected long e;
        protected boolean f = true;
        protected Boolean g = null;
        protected String h;
        protected ProgressDialog i;
        protected Runnable j;
        protected boolean k = false;
        protected boolean l = false;
        protected Context m;
        private LinkedHashMap<String, Float> n = new LinkedHashMap();
        private long o;

        public a(Context context, long l2, boolean bl, Boolean bl2, ProgressDialog progressDialog, String string, String string2, String string3, Runnable runnable) {
            this.m = context;
            this.e = l2;
            this.f = bl;
            this.g = bl2;
            this.i = progressDialog;
            this.a = string;
            this.h = string2;
            this.b = string3;
            this.j = runnable;
        }

        private void a(String string) {
            if (((Float)this.n.get((Object)string)).floatValue() < 0.0f) {
                this.n.put((Object)string, (Object)Float.valueOf((float)((float)(System.currentTimeMillis() - this.o) / 1000.0f)));
            }
        }

        private void b() {
            com.startapp.common.g.a((Runnable)new Runnable(){

                /*
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                public void run() {
                    if (a.this.c != false) return;
                    try {
                        var1_1 = new com.startapp.android.publish.adsCommon.e.e(d.h);
                        var1_1.a(a.this.a());
                        if (a.this.l) {
                            var1_1.d("Page Finished");
                        } else {
                            var1_1.d("Timeout");
                        }
                        f.a(a.this.m, var1_1, a.this.b);
                        ** GOTO lbl-1000
                    }
                    catch (Exception v0) {
                        try lbl-1000: // 2 sources:
                        {
                            a.this.k = true;
                            c.a(a.this.m);
                            if (a.this.f && MetaData.getInstance().isInAppBrowser()) {
                                c.b(a.this.m, a.this.a, a.this.b);
                            } else {
                                c.a(a.this.m, a.this.a, a.this.b);
                            }
                            if (a.this.j == null) return;
                            a.this.j.run();
                            return;
                        }
                        catch (Exception var3_2) {
                            f.a(a.this.m, d.b, "AdsCommonUtils.startTimeout - error after time elapsed", var3_2.getMessage(), a.this.b);
                        }
                    }
                }
            }, (long)this.e);
        }

        /*
         * Exception decompiling
         */
        protected JSONArray a() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl10 : ALOAD_2 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
        public void onPageFinished(WebView var1, String var2) {
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
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
            StringBuilder stringBuilder = new StringBuilder("MyWebViewClientSmartRedirect::onPageStarted - [");
            stringBuilder.append(string);
            stringBuilder.append("]");
            com.startapp.common.a.h.a((int)2, (String)stringBuilder.toString());
            super.onPageStarted(webView, string, bitmap);
            if (!this.d) {
                this.o = System.currentTimeMillis();
                this.n.put((Object)string, (Object)Float.valueOf((float)-1.0f));
                a.super.b();
                this.d = true;
            }
            this.l = false;
        }

        public void onReceivedError(WebView webView, int n2, String string, String string2) {
            StringBuilder stringBuilder = new StringBuilder("MyWebViewClientSmartRedirect::onReceivedError - [");
            stringBuilder.append(string);
            stringBuilder.append("], [");
            stringBuilder.append(string2);
            stringBuilder.append("]");
            com.startapp.common.a.h.a((int)2, (String)stringBuilder.toString());
            if (string2 != null && !c.b(string2) && c.d(string2)) {
                f.a(this.m, d.a, Integer.toString((int)n2), string2, this.b);
            }
            super.onReceivedError(webView, n2, string, string2);
        }

        /*
         * Exception decompiling
         */
        public boolean shouldOverrideUrlLoading(WebView var1, String var2) {
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
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

}

