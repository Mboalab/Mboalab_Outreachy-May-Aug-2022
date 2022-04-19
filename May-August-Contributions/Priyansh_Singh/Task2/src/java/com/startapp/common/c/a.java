package com.startapp.common.c;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.startapp.common.c.b;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class a {
    private static CookieManager a;

    public static CookieManager a() {
        return a;
    }

    public static void a(Context context) {
        a = new CookieManager((CookieStore)new b(context), CookiePolicy.ACCEPT_ALL);
    }

    public static void a(HttpURLConnection httpURLConnection, String string) {
        CookieManager cookieManager;
        Map map;
        if (Build.VERSION.SDK_INT >= 9 && (cookieManager = a.a()) != null && (map = cookieManager.get(URI.create((String)string), httpURLConnection.getRequestProperties())) != null && map.size() > 0 && ((List)map.get((Object)"Cookie")).size() > 0) {
            httpURLConnection.addRequestProperty("Cookie", TextUtils.join((CharSequence)"=", (Iterable)((Iterable)map.get((Object)"Cookie"))));
        }
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 9) {
            a.a(context);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String string) {
        CookieManager cookieManager;
        if (Build.VERSION.SDK_INT >= 9 && (cookieManager = a.a()) != null) {
            cookieManager.put(URI.create((String)string), httpURLConnection.getHeaderFields());
        }
    }
}

