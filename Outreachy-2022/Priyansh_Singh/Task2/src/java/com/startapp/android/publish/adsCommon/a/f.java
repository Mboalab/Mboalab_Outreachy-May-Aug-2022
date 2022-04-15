package com.startapp.android.publish.adsCommon.a;

import java.io.Serializable;

public class f
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String reason;
    private boolean shouldDisplayAd;

    public f(boolean bl) {
        super(bl, "");
    }

    public f(boolean bl, String string) {
        this.shouldDisplayAd = bl;
        this.reason = string;
    }

    public boolean a() {
        return this.shouldDisplayAd;
    }

    public String b() {
        return this.reason;
    }

    public String c() {
        if (this.reason != null) {
            return this.reason.split(" ")[0];
        }
        return "";
    }
}

