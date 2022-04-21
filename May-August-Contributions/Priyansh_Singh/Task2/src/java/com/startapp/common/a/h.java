package com.startapp.common.a;

import android.util.Log;
import com.startapp.common.Constants;

public class h {
    public static void a(int n2, String string) {
        if (Constants.a().booleanValue()) {
            h.a(n2, string, null);
        }
    }

    public static void a(int n2, String string, Throwable throwable) {
        h.a(null, n2, string, throwable);
    }

    public static void a(String string, int n2, String string2) {
        if (Constants.a().booleanValue()) {
            h.a(string, n2, string2, null);
        }
    }

    public static void a(String string, int n2, String string2, Throwable throwable) {
        String string3 = string == null ? "" : ".".concat(String.valueOf((Object)string));
        if (Constants.a().booleanValue()) {
            StringBuffer stringBuffer = new StringBuffer(string2);
            if (stringBuffer.length() > 4000) {
                String string4 = "startapp".concat(String.valueOf((Object)string3));
                StringBuilder stringBuilder = new StringBuilder("sb.length = ");
                stringBuilder.append(stringBuffer.length());
                h.b(string4, n2, stringBuilder.toString(), throwable);
                int n3 = stringBuffer.length() / 4000;
                int n4 = 0;
                while (n4 <= n3) {
                    int n5 = n4 + 1;
                    int n6 = n5 * 4000;
                    if (n6 >= stringBuffer.length()) {
                        String string5 = "startapp".concat(String.valueOf((Object)string3));
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(n4);
                        stringBuilder2.append("/");
                        stringBuilder2.append(n3);
                        stringBuilder2.append(":");
                        stringBuilder2.append(stringBuffer.substring(n4 * 4000));
                        h.b(string5, n2, stringBuilder2.toString(), null);
                    } else {
                        String string6 = "startapp".concat(String.valueOf((Object)string3));
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(n4);
                        stringBuilder3.append("/");
                        stringBuilder3.append(n3);
                        stringBuilder3.append(":");
                        stringBuilder3.append(stringBuffer.substring(n4 * 4000, n6));
                        h.b(string6, n2, stringBuilder3.toString(), null);
                    }
                    n4 = n5;
                }
                return;
            }
            h.b("startapp".concat(String.valueOf((Object)string3)), n2, string2, throwable);
        }
    }

    private static void b(String string, int n2, String string2, Throwable throwable) {
        switch (n2) {
            default: {
                return;
            }
            case 6: {
                Log.e((String)string, (String)string2, (Throwable)throwable);
                return;
            }
            case 5: {
                Log.w((String)string, (String)string2, (Throwable)throwable);
                return;
            }
            case 3: {
                return;
            }
            case 2: 
        }
    }
}

