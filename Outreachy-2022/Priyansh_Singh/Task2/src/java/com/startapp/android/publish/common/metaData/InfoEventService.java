package com.startapp.android.publish.common.metaData;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.common.metaData.e;
import com.startapp.common.a.h;

public class InfoEventService
extends Service {
    private static final String TAG = "InfoEventService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        h.a(TAG, 3, "InfoEventService onStartCommand");
        final Context context = this.getApplicationContext();
        e.a(context, new Runnable(){

            public void run() {
                InfoEventService.this.stopSelf();
                b.c(context);
            }
        });
        return super.onStartCommand(intent, n2, n3);
    }

}

