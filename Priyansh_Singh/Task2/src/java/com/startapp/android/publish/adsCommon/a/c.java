package com.startapp.android.publish.adsCommon.a;

import com.startapp.android.publish.adsCommon.a.a;
import com.startapp.common.b.e;
import java.io.Serializable;
import java.util.List;

@e(a="type", b="com.startapp.android.publish.adsCommon.adrules")
public abstract class c
implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient boolean a;

    public boolean a() {
        return this.a;
    }

    public abstract boolean a(List<a> var1);
}

