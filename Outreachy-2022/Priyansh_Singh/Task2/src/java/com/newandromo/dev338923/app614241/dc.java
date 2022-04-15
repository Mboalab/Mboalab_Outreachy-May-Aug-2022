/*
 *  
 * 
 * Could not load the following classes:
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$IllegalCharacterValueSanitizer
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.net.UrlQuerySanitizer;

public final class dc {
    static final boolean a;
    static final boolean b;
    private static final UrlQuerySanitizer.ValueSanitizer c;
    private static final UrlQuerySanitizer.ValueSanitizer d;
    private static final UrlQuerySanitizer.ValueSanitizer e;
    private static final UrlQuerySanitizer.ValueSanitizer f;
    private static final UrlQuerySanitizer.ValueSanitizer g;
    private static final UrlQuerySanitizer.ValueSanitizer h;
    private static final UrlQuerySanitizer.ValueSanitizer i;
    private static final UrlQuerySanitizer.ValueSanitizer j;
    private static final UrlQuerySanitizer.ValueSanitizer k;

    static {
        boolean bl;
        boolean bl2 = UrlQuerySanitizer.getAllIllegal().sanitize("javascript:").length() > 0;
        a = bl2;
        b = bl = bl2 ^ true;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer = bl ? UrlQuerySanitizer.getAllIllegal() : dc.b(0);
        c = valueSanitizer;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer2 = b ? UrlQuerySanitizer.getAllButNulLegal() : dc.b(1535);
        d = valueSanitizer2;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer3 = b ? UrlQuerySanitizer.getAllButWhitespaceLegal() : dc.b(1532);
        e = valueSanitizer3;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer4 = b ? UrlQuerySanitizer.getUrlLegal() : dc.b(404);
        f = valueSanitizer4;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer5 = b ? UrlQuerySanitizer.getUrlAndSpaceLegal() : dc.b(405);
        g = valueSanitizer5;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer6 = b ? UrlQuerySanitizer.getAmpLegal() : dc.b(128);
        h = valueSanitizer6;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer7 = b ? UrlQuerySanitizer.getAmpAndSpaceLegal() : dc.b(129);
        i = valueSanitizer7;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer8 = b ? UrlQuerySanitizer.getSpaceLegal() : dc.b(1);
        j = valueSanitizer8;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer9 = b ? UrlQuerySanitizer.getAllButNulAndAngleBracketsLegal() : dc.b(1439);
        k = valueSanitizer9;
    }

    public static int a(int n2) {
        if (a) {
            n2 ^= 1024;
        }
        return n2;
    }

    public static final UrlQuerySanitizer.ValueSanitizer a() {
        return d;
    }

    public static final UrlQuerySanitizer.ValueSanitizer b() {
        return g;
    }

    private static UrlQuerySanitizer.ValueSanitizer b(int n2) {
        return new UrlQuerySanitizer.IllegalCharacterValueSanitizer(dc.a(n2));
    }
}

