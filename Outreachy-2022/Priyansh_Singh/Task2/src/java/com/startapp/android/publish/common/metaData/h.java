package com.startapp.android.publish.common.metaData;
import android.content.Context;
import com.startapp.android.publish.adsCommon.k;
import java.io.Serializable;

public class h
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean enabled = false;

    public void a(Context context, boolean bl2) {
        k.b(context, "userDisabledSimpleToken", bl2 ^ true);
    }

    public boolean a() {
        return this.enabled;
    }

    public boolean a(Context context) {
        return k.a(context, "userDisabledSimpleToken", Boolean.FALSE);
    }

    public boolean b(Context context) {
        return !this.a(context) && this.a();
    }
}

