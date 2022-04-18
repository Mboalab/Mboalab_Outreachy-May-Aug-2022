package com.startapp.common.a;

import android.util.Base64;
import com.startapp.common.a.d;
import com.startapp.common.a.h;
import java.net.URLEncoder;
import java.security.MessageDigest;

public class a {
    private static final byte[] a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
    private static final String b = new String(new byte[]{116, 115});
    private static final String c = new String(new byte[]{116, 115, 104});
    private static final String d = new String(new byte[]{97, 102, 104});
    private static final String e = new String(new byte[]{77, 68, 53});
    private static final String f = new String(new byte[]{85, 84, 70, 45, 56});
    private static final byte[] g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};

    public static String a() {
        return b;
    }
    public static String a(String var0) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = new byte[Math.min((int)arrby.length, (int)n2)];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n3 = i2 % n2;
            arrby2[n3] = (byte)(arrby2[n3] ^ arrby[i2]);
        }
        return arrby2;
    }

    public static byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = new byte[arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby3[i2] = (byte)(arrby[i2] ^ arrby2[i2 % arrby2.length]);
        }
        return arrby3;
    }

    public static String b() {
        return c;
    }

    public static String b(String string) {
        string.getBytes();
        byte[] arrby = a.a(a.a(string.getBytes(), a[5]), new String(a).substring((int)a[0], (int)a[1]).getBytes());
        try {
            String string2 = URLEncoder.encode((String)d.b(MessageDigest.getInstance((String)e).digest(arrby), 3), (String)f);
            return string2;
        }
        catch (Exception exception) {
            h.a(6, "error", exception);
            return "";
        }
    }

    public static String c() {
        return d;
    }

    public static String c(String string) {
        g.hashCode();
        string.getBytes().hashCode();
        try {
            String string2 = Base64.encodeToString((byte[])a.a(a.a(string.getBytes(), new String(g).substring((int)g[5], (int)g[33]).getBytes()), new String(g).substring((int)g[35], (int)g[1]).getBytes()), (int)0);
            return string2;
        }
        catch (Exception exception) {
            return string;
        }
    }

    public static String d() {
        a.hashCode();
        System.currentTimeMillis();
        return new Long(System.currentTimeMillis()).toString();
    }
}

