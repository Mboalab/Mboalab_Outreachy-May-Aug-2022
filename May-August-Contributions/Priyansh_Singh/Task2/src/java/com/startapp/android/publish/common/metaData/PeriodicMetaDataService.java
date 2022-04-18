package com.startapp.android.publish.common.metaData;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.common.metaData.f;
import com.startapp.common.a.h;

public class PeriodicMetaDataService
extends IntentService {
    public PeriodicMetaDataService() {
        super("PeriodicMetaDataService");
    }

    protected void onHandleIntent(Intent intent) {
        h.a(3, "MetaData intent onHandleIntent");
        final Context context = this.getApplicationContext();
        f.a(context, new Runnable(){

            public void run() {
                b.b(context);
            }
        });
    }

}

