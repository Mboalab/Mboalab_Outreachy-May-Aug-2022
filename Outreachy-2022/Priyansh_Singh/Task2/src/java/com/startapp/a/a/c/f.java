/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package com.startapp.a.a.c;

import com.startapp.a.a.c.c;
import java.nio.charset.Charset;

public class f {
    public static String a(byte[] arrby) {
        return f.a(arrby, c.f);
    }

    private static String a(byte[] arrby, Charset charset) {
        if (arrby == null) {
            return null;
        }
        return new String(arrby, charset);
    }
}

