/*
 *  
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.net.Uri;

public final class cy {
    public static final String a = "cy";
    private Uri.Builder b;
    private boolean c;

    public cy() {
        this.b = new Uri.Builder();
    }

    private cy(Uri uri) {
        if (uri != null) {
            String string = uri.getEncodedFragment();
            boolean bl = string != null && string.isEmpty();
            this.c = bl;
            this.b = uri.buildUpon();
            return;
        }
        this.b = new Uri.Builder();
    }

    public static cy a(Uri uri) {
        return new cy(uri);
    }

    public final cy a(String string) {
        this.b.scheme(string);
        return this;
    }

    public final cy b(String string) {
        this.b.encodedAuthority(string);
        return this;
    }

    public final cy c(String string) {
        this.b.encodedPath(string);
        return this;
    }

    public final cy d(String string) {
        this.b.encodedQuery(string);
        return this;
    }

    public final cy e(String string) {
        boolean bl = string != null && string.isEmpty();
        this.c = bl;
        this.b.encodedFragment(string);
        return this;
    }

    public final String toString() {
        if (this.c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b.toString());
            stringBuilder.append("#");
            return stringBuilder.toString();
        }
        return this.b.toString();
    }
}

