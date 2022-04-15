package com.startapp.android.publish.adsCommon.a;

import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.a.e;
import com.startapp.common.b.f;
import java.io.Serializable;

public class g
implements Serializable {
    private static transient g a = new g();
    @f(a=true)
    private e adRules = new e();
    private String adaptMetaDataUpdateVersion = AdsConstants.h;

    private g() {
    }

    public static g a() {
        return a;
    }

    public e b() {
        return this.adRules;
    }
}

