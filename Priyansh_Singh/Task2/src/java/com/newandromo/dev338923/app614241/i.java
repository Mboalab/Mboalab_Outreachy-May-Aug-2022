/*
 *  
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Base64
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.security.Key
 *  java.util.HashMap
 *  java.util.Map
 *  javax.crypto.Mac
 *  javax.crypto.spec.SecretKeySpec
 *  org.json.JSONObject
 */
package com.newandromo.dev338923.app614241;

import android.os.Handler;
import android.util.Base64;
import com.newandromo.dev338923.app614241.AndromoApplication;
import com.newandromo.dev338923.app614241.i;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class i
implements AndromoApplication.a {
    private static i l;
    boolean a;
    long b;
    Handler c;
    Map<String, Boolean> d = new HashMap();
    private final String e = "AdReporter";
    private final String f = "https://sqz.andromo.com";
    private final String g = "/v3/ping/";
    private final String h = "/v3/event/";
    private final String i = "34e1fa93-58e2-45e5-b336-9074539bb899";
    private final String j = "38274449";
    private final long k = 180000L;
    private Thread m;
    private boolean n;
    private boolean o;
    private Runnable p = new Runnable(this){
        final /* synthetic */ i a;
        {
            this.a = i2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void run() {
            try {
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                java.util.Formatter formatter = new java.util.Formatter((java.lang.Appendable)stringBuilder);
                Object[] arrobject = new Object[]{"https://sqz.andromo.com", "/v3/ping/", "34e1fa93-58e2-45e5-b336-9074539bb899", i.b(this.a), i.c(this.a), java.lang.System.currentTimeMillis()};
                formatter.format("%s%s?_v=3&a=%s&l=%s&f=%s&_cb=%s", arrobject);
                JSONObject jSONObject = i.a(stringBuilder.toString());
                i.a(this.a, jSONObject.getBoolean("isEnabled"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("networks");
                java.util.Iterator iterator = jSONObject2.keys();
                i.d(this.a).clear();
                while (iterator.hasNext()) {
                    String string = iterator.next().toString();
                    i.d(this.a).put((Object)string, (Object)jSONObject2.getBoolean(string));
                }
                i.a(this.a, jSONObject.getLong("interstitialDelay"));
                com.newandromo.dev338923.app614241.SplashScreenActivity.a(jSONObject.getLong("splashDelayMin"), jSONObject.getLong("splashDelayMax"));
                return;
            }
            catch (Exception exception) {}
            return;
            finally {
                i.e(this.a).postDelayed((Runnable)this, 180000L);
            }
        }
    };

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private i() {
        i i2 = this;
        synchronized (i2) {
            this.o = false;
            this.n = true;
            this.a = true;
            this.b = 0L;
            this.m = new Thread(new Runnable(this){
                final /* synthetic */ i a;
                {
                    this.a = i2;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public final void run() {
                    i i2;
                    android.os.Looper.prepare();
                    i.a(this.a, new Handler());
                    i i3 = i2 = this.a;
                    synchronized (i3) {
                        this.a.notifyAll();
                    }
                    android.os.Looper.loop();
                }
            });
            this.m.start();
            try {
                this.wait(1000L);
            }
            catch (Exception exception) {}
            this.c.post(this.p);
            AndromoApplication.a = this;
            return;
        }
    }

    static /* synthetic */ long a(i i2, long l2) {
        i2.b = l2;
        return l2;
    }

    static /* synthetic */ Handler a(i i2, Handler handler) {
        i2.c = handler;
        return handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i a() {
        Class<i> class_ = i.class;
        synchronized (i.class) {
            if (l != null) return l;
            l = new i();
            return l;
        }
    }

    static /* synthetic */ String a(String string, String string2) {
        return i.b(string, string2);
    }

    static /* synthetic */ JSONObject a(String string) throws Exception {
        int n2;
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setRequestMethod("GET");
        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] arrby = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n2 = inputStream.read(arrby, 0, 1024)) > 0) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        inputStream.close();
        httpURLConnection.disconnect();
        String string2 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
        if (string2.isEmpty()) {
            string2 = "{}";
        }
        return new JSONObject(string2);
    }

    static /* synthetic */ boolean a(i i2) {
        i2.o = true;
        return true;
    }

    static /* synthetic */ boolean a(i i2, boolean bl2) {
        i2.a = bl2;
        return bl2;
    }

    static /* synthetic */ int b(i i2) {
        boolean bl2 = i2.n;
        int n2 = 0;
        if (bl2) {
            i2.n = false;
            n2 = 1;
        }
        return n2;
    }

    private static String b(String string, String string2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(string2.getBytes("utf-8"), "HmacSHA1");
            Mac mac = Mac.getInstance((String)"HmacSHA1");
            mac.init((Key)secretKeySpec);
            String string3 = Base64.encodeToString((byte[])mac.doFinal(string.getBytes("utf-8")), (int)1).toLowerCase();
            return string3;
        }
        catch (Exception exception) {
            return null;
        }
    }

    static /* synthetic */ int c(i i2) {
        boolean bl2 = i2.o;
        int n2 = 0;
        if (bl2) {
            i2.o = false;
            n2 = 1;
        }
        return n2;
    }

    static /* synthetic */ Map d(i i2) {
        return i2.d;
    }

    static /* synthetic */ Handler e(i i2) {
        return i2.c;
    }

    @Override
    public final void a(boolean bl2) {
        if (bl2) {
            this.c.removeCallbacksAndMessages(null);
            this.c.post(this.p);
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.c.post(new Runnable((i)this){
            final /* synthetic */ i a;
            {
                this.a = i2;
            }

            public final void run() {
                i.a(this.a);
            }
        });
    }
}

