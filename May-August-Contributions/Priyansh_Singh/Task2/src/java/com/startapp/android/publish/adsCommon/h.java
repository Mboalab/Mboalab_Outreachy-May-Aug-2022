/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class h
extends Ad {
    private static final long serialVersionUID = 1L;
    private List<AdDetails> adsDetails = null;

    public h(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    private void a() {
        Iterator iterator = this.adsDetails.iterator();
        boolean bl2 = true;
        while (iterator.hasNext()) {
            if (((AdDetails)iterator.next()).getIsBelowMinCPM()) continue;
            bl2 = false;
        }
        this.belowMinCPM = bl2;
    }

    private void b() {
        List<AdDetails> list = this.adsDetails;
        Long l2 = null;
        if (list != null) {
            for (AdDetails adDetails : this.adsDetails) {
                if (adDetails == null || adDetails.getTtl() == null || l2 != null && adDetails.getTtl() >= l2) continue;
                l2 = adDetails.getTtl();
            }
        }
        if (l2 != null) {
            this.adCacheTtl = TimeUnit.SECONDS.toMillis(l2.longValue());
        }
    }

    public void a(List<AdDetails> list) {
        this.adsDetails = list;
        h.super.b();
        h.super.a();
    }

    public List<AdDetails> d() {
        return this.adsDetails;
    }
}

