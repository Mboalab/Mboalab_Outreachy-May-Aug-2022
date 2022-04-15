/*
 *  
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.URLUtil
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.net.Uri;
import android.webkit.URLUtil;

public final class da {
    public static final String a = "da";

    private da() {
    }

    public static String a(String string) {
        if (string != null && string.length() >= 22) {
            return string.substring(22);
        }
        return string;
    }

    public static boolean a(Uri uri) {
        return uri != null && URLUtil.isAssetUrl((String)uri.toString());
    }

    public static boolean b(Uri uri) {
        return uri != null && "andromo".equals((Object)uri.getScheme());
    }

    public static Uri c(Uri uri) {
        String string = uri.toString();
        String string2 = string != null ? string.replace((CharSequence)"#", (CharSequence)"%23") : null;
        return Uri.parse(string2);
    }

    public static String d(Uri uri) {
        if (uri != null) {
            String string = uri.getScheme();
            String string2 = uri.getSchemeSpecificPart();
            if (string != null) {
                if (!(string.equalsIgnoreCase("tel") || string.equalsIgnoreCase("sip") || string.equalsIgnoreCase("sms") || string.equalsIgnoreCase("smsto") || string.equalsIgnoreCase("mailto"))) {
                    if (string.equalsIgnoreCase("http") || string.equalsIgnoreCase("https") || string.equalsIgnoreCase("ftp")) {
                        String string3;
                        StringBuilder stringBuilder = new StringBuilder("//");
                        String string4 = uri.getHost() != null ? uri.getHost() : "";
                        stringBuilder.append(string4);
                        if (uri.getPort() != -1) {
                            StringBuilder stringBuilder2 = new StringBuilder(":");
                            stringBuilder2.append(uri.getPort());
                            string3 = stringBuilder2.toString();
                        } else {
                            string3 = "";
                        }
                        stringBuilder.append(string3);
                        stringBuilder.append("/...");
                        string2 = stringBuilder.toString();
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(64);
                    stringBuilder.append(string);
                    stringBuilder.append(':');
                    if (string2 != null) {
                        for (int i2 = 0; i2 < string2.length(); ++i2) {
                            char c2 = string2.charAt(i2);
                            if (c2 != '-' && c2 != '@' && c2 != '.') {
                                stringBuilder.append('x');
                                continue;
                            }
                            stringBuilder.append(c2);
                        }
                    }
                    return stringBuilder.toString();
                }
            }
            StringBuilder stringBuilder = new StringBuilder(64);
            if (string != null) {
                stringBuilder.append(string);
                stringBuilder.append(':');
            }
            if (string2 != null) {
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        return "";
    }
}

