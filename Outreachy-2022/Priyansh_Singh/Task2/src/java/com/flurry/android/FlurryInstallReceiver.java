package com.flurry.android;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.bx;
import com.flurry.sdk.dh;
import com.flurry.sdk.dw;

public final class FlurryInstallReceiver
extends BroadcastReceiver {
    private static final String a = "FlurryInstallReceiver";

    public final void onReceive(Context context, Intent intent) {
        String string = a;
        StringBuilder stringBuilder = new StringBuilder("Received an Install notification of ");
        stringBuilder.append(intent.getAction());
        bx.a((int)4, (String)string, (String)stringBuilder.toString());
        String string2 = intent.getExtras().getString("referrer");
        bx.a((int)4, (String)a, (String)"Received an Install referrer of ".concat(String.valueOf((Object)string2)));
        if (string2 != null && "com.android.vending.INSTALL_REFERRER".equals((Object)intent.getAction())) {
            if (!string2.contains((CharSequence)"=")) {
                bx.a((int)4, (String)a, (String)"referrer is before decoding: ".concat(String.valueOf((Object)string2)));
                string2 = dh.f((String)string2);
                bx.a((int)4, (String)a, (String)"referrer is: ".concat(String.valueOf((Object)string2)));
            }
            new dw(context).a(string2);
            return;
        }
        bx.a((int)5, (String)a, (String)"referrer is null");
    }
}

