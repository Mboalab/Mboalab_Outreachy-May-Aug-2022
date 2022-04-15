
package com.startapp.common;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class c {
    private static c b;
    protected String a = "e106";
    private Context c;
    private PhoneStateListener d;

    private c(Context context) {
        this.d = c.super.c();
        this.c = context.getApplicationContext();
    }

    public static c a() {
        return b;
    }

    private void a(Context context, int n2) {
        try {
            ((TelephonyManager)context.getSystemService("phone")).listen(this.d, n2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private PhoneStateListener c() {
        try {
            PhoneStateListener phoneStateListener = new PhoneStateListener(){

                public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                    try {
                        Method method = SignalStrength.class.getMethod("getLevel", null);
                        c.this.a = Integer.toString((int)((Integer)method.invoke((Object)signalStrength, null)));
                        return;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        c.this.a = "e105";
                        return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        c.this.a = "e105";
                        return;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        c.this.a = "e105";
                        return;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        c.this.a = "e104";
                        return;
                    }
                }
            };
            return phoneStateListener;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void c(Context context) {
        if (b == null) {
            b = new c(context);
            c.a().a(context);
        }
    }

    public void a(Context context) {
        c.super.a(context, 256);
    }

    public String b() {
        return this.a;
    }

    public void b(Context context) {
        c.super.a(context, 0);
    }

}

