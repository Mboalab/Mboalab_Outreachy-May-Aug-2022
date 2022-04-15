/*
 *  
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$ParameterValuePair
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.StringTokenizer
 */
package com.newandromo.dev338923.app614241;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import com.newandromo.dev338923.app614241.cz;
import java.util.List;
import java.util.StringTokenizer;

public final class db
extends UrlQuerySanitizer {
    private int a;

    public db() {
    }

    public db(int n2) {
        this.a = n2 & 4123;
    }

    public static String a(UrlQuerySanitizer urlQuerySanitizer, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(cz.a(Uri.encode((String)parameterValuePair.mParameter, null), n3));
            if ("EmPtYeMpTyEmPtY".equals((Object)parameterValuePair.mValue)) continue;
            StringBuilder stringBuilder2 = new StringBuilder("=");
            stringBuilder2.append(cz.a(Uri.encode((String)parameterValuePair.mValue, (String)","), n3));
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder.toString();
    }

    private String a(String string) {
        if (db.super.a(4096)) {
            return cz.a(string);
        }
        return string;
    }

    private boolean a(int n2) {
        return (n2 & this.a) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void parseEntry(String string, String string2) {
        if (db.super.a(1) && !db.super.a(8)) {
            int n2 = string.length();
            if ((string = cz.b(string)).length() == 0 && n2 != 0) {
                return;
            }
        }
        boolean bl = false;
        if (bl) return;
        if (db.super.a(2) && !db.super.a(16)) {
            string2 = cz.b(string2);
        }
        int n3 = string.length();
        String string3 = this.unescape(db.super.a(string));
        if (string3.length() == 0 && n3 != 0) {
            return;
        }
        boolean bl2 = false;
        if (bl2) return;
        UrlQuerySanitizer.ValueSanitizer valueSanitizer = this.getEffectiveValueSanitizer(string3);
        if (valueSanitizer == null) {
            return;
        }
        String string4 = this.unescape(db.super.a(string2));
        if (db.super.a(8)) {
            if ((string3 = cz.c(string3)).length() == 0 && n3 != 0) {
                return;
            }
            bl2 = false;
        }
        if (bl2) return;
        if (db.super.a(16)) {
            string4 = cz.c(string4);
        }
        this.addSanitizedEntry(string3, valueSanitizer.sanitize(string4));
    }

    public final void parseQuery(String string) {
        this.clear();
        StringTokenizer stringTokenizer = new StringTokenizer(string, "&");
        while (stringTokenizer.hasMoreElements()) {
            String string2 = stringTokenizer.nextToken();
            if (string2.length() <= 0) continue;
            int n2 = string2.indexOf(61);
            if (n2 < 0) {
                this.parseEntry(string2, "EmPtYeMpTyEmPtY");
                continue;
            }
            this.parseEntry(string2.substring(0, n2), string2.substring(n2 + 1));
        }
    }

    public final String unescape(String string) {
        return cz.d(string);
    }
}

