package com.startapp.android.publish.adsCommon.adinformation;

import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions;
import com.startapp.common.b.f;
import java.io.Serializable;

public class c
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean enable = true;
    private boolean enableOverride = false;
    @f(b="Lcom/startapp/android/publish/adsCommon/adinformation/AdInformationPositions$Position;")
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.a);
    private boolean positionOverride = false;

    private c() {
    }

    public static c a() {
        return new c();
    }

    public void a(AdInformationPositions.Position position) {
        this.position = position;
        if (position != null) {
            this.positionOverride = true;
            return;
        }
        this.positionOverride = false;
    }

    public void a(boolean bl) {
        this.enable = bl;
        this.enableOverride = true;
    }

    public boolean b() {
        return this.enable;
    }

    public AdInformationPositions.Position c() {
        return this.position;
    }

    public boolean d() {
        return this.positionOverride;
    }

    public boolean e() {
        return this.enableOverride;
    }
}

