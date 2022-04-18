package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import java.util.Locale;

class ak
extends AsyncTask<Void, Void, String> {
    private static final String a = "ak";
    private a b;
    private Context c;

    public ak(Context context, a a2) {
        this.c = context.getApplicationContext();
        this.b = a2;
    }
    private static String a() {
        throw new IllegalStateException("Decompilation failed");
    }
    protected Object doInBackground(Object[] var1) {
        var2_2 = this.c;
        if (var2_2 == null || (var7_3 = (TelephonyManager)var2_2.getSystemService("phone")) == null) ** GOTO lbl-1000
        switch (var7_3.getPhoneType()) {
            default: {
                ** GOTO lbl16
            }
            case 1: {
                var9_4 = var7_3.getNetworkCountryIso();
                if (var9_4 != null && var9_4.length() >= 2) {
                    var3_5 = var9_4;
                    break;
                }
            }
            case 2: {
                var3_5 = var7_3.getSimCountryIso();
                if (var3_5 == null) break;
                var3_5.length();
                break;
            }
lbl16:
            case 0: lbl-1000:
            {
                var3_5 = null;
            }
        }
        if (var3_5 == null || var3_5.length() < 2) {
            var3_5 = ak.a();
        }
        if (var3_5 != null) {
            if (var3_5.length() >= 2) return var3_5;
        }
        var4_6 = this.c;
        var5_7 = null;
        if (var4_6 == null) return var5_7;
        var5_7 = var4_6.getResources().getConfiguration().locale.getCountry();
        if (var5_7 == null) return var5_7;
        var5_7.length();
        return var5_7;
    }

    protected void onCancelled() {
        this.b = null;
    }

    protected void onPostExecute(Object object) {
        String string = (String)object;
        if (!this.isCancelled() && this.b != null) {
            this.b.a(string);
        }
    }

    public static interface a {
        public void a(String var1);
    }

}

