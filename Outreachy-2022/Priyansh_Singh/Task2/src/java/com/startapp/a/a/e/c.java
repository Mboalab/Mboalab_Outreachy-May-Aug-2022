/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.a.a.e;

class c {
    private static final char[] a = "0123456789abcdef".toCharArray();

    c() {
    }

    private boolean b(String string) {
        return string.length() % 2 != 0;
    }

    String a(byte[] arrby) {
        char[] arrc = new char[2 * arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n2 = i2 * 2;
            arrc[n2] = a[(240 & arrby[i2]) >>> 4];
            arrc[n2 + 1] = a[15 & arrby[i2]];
        }
        return new String(arrc);
    }

    byte[] a(String string) {
        if (c.super.b(string)) {
            return null;
        }
        byte[] arrby = new byte[string.length() / 2];
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; i2 += 2) {
            arrby[i2 / 2] = (byte)((Character.digit((char)string.charAt(i2), (int)16) << 4) + Character.digit((char)string.charAt(i2 + 1), (int)16));
        }
        return arrby;
    }
}

