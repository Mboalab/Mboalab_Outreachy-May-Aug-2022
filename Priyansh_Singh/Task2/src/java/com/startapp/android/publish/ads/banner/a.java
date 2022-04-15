package com.startapp.android.publish.ads.banner;

import com.startapp.android.publish.adsCommon.Utils.d;
import com.startapp.android.publish.adsCommon.Utils.e;
import com.startapp.android.publish.common.model.GetAdRequest;

public class a
extends GetAdRequest {
    private boolean a;
    private int b;

    private void a(e e2) {
        e2.a("fixedSize", this.a(), false);
        e2.a("bnrt", this.b(), false);
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    @Override
    public e getNameValueMap() {
        e e2 = super.getNameValueMap();
        if (e2 == null) {
            e2 = new d();
        }
        this.a(e2);
        return e2;
    }
}

