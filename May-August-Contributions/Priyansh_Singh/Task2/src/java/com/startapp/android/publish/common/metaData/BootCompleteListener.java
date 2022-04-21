package com.startapp.android.publish.common.metaData;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.metaData.InfoEventService;
import com.startapp.android.publish.common.metaData.PeriodicMetaDataService;
import com.startapp.common.a.h;

public class BootCompleteListener
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            h.a(3, "BootCompleteListener - onReceive");
            long l2 = 60000L + SystemClock.elapsedRealtime();
            b.a(context, PeriodicMetaDataService.class, l2, "periodicMetadataTriggerTime");
            b.a(context, InfoEventService.class, l2, "periodicInfoEventTriggerTime");
            return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "BootCompleteListener.onReceive - failed to start services", exception.getMessage(), "");
            return;
        }
    }
}

