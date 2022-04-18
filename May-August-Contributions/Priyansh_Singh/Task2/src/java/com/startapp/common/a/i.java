package com.startapp.common.a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import com.startapp.common.a.c;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteOrder;
import java.util.Map;

public class i {
    static {
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty((String)"http.keepAlive", (String)"false");
        }
    }

    public static a a(Context context, String string) {
        if (string.toLowerCase().compareTo("WIFI".toLowerCase()) == 0) {
            return i.b(context);
        }
        return null;
    }
    public static String a(Context var0) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static String a(Context context, String string, byte[] arrby, Map<String, String> map, String string2, boolean bl2) {
        return i.a(context, string, arrby, map, string2, bl2, "application/json");
    }

    /*
     * Exception decompiling
     */
    public static String a(Context var0, String var1, byte[] var2, Map<String, String> var3, String var4, boolean var5, String var6) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static String a(WifiInfo wifiInfo) {
        int n2 = wifiInfo.getIpAddress();
        if (ByteOrder.nativeOrder().equals((Object)ByteOrder.LITTLE_ENDIAN)) {
            n2 = Integer.reverseBytes((int)n2);
        }
        byte[] arrby = BigInteger.valueOf((long)n2).toByteArray();
        try {
            String string = InetAddress.getByAddress((byte[])arrby).getHostAddress();
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }
    public static boolean a(Context var0, String var1, Map<String, String> var2, StringBuilder var3, String var4, boolean var5) {
        throw new IllegalStateException("Decompilation failed");
    }
    public static a b(Context var0) {
        throw new IllegalStateException("Decompilation failed");
    }

    private static HttpURLConnection b(Context context, String string, byte[] arrby, Map<String, String> map, String string2, boolean bl2, String string3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        com.startapp.common.c.a.a(httpURLConnection, string);
        if (string2 != null && string2.compareTo("-1") != 0) {
            httpURLConnection.addRequestProperty("User-Agent", string2);
        }
        httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        if (arrby != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(arrby.length);
            httpURLConnection.setRequestProperty("Content-Type", string3);
            if (bl2) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return httpURLConnection;
            }
        } else {
            httpURLConnection.setRequestMethod("GET");
        }
        return httpURLConnection;
    }

    public static Boolean c(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        if (connectivityManager != null && c.a(context, "android.permission.ACCESS_NETWORK_STATE") && (networkInfo = connectivityManager.getActiveNetworkInfo()) != null && networkInfo.isConnected()) {
            return networkInfo.isRoaming();
        }
        return null;
    }

    public static class a {
        private String a;
        private String b;
        private String c;

        public String a() {
            return this.a;
        }

        public void a(String string) {
            this.a = string;
        }

        public String b() {
            return this.b;
        }

        public void b(String string) {
            this.b = string;
        }

        public String c() {
            return this.c;
        }

        public void c(String string) {
            this.c = string;
        }
    }

}

