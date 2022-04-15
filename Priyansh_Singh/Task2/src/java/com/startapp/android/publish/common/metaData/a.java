package com.startapp.android.publish.common.metaData;
import java.io.Serializable;

public class a
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int delay;
    private boolean enabled;
    private int minApiLevel;

    public a() {
        this.delay = 3;
        this.minApiLevel = 18;
        this.enabled = true;
    }

    public a(int n2) {
        this.delay = 3;
        this.minApiLevel = 18;
        this.enabled = true;
        this.minApiLevel = n2;
    }

    public int a() {
        return this.delay;
    }

    public int b() {
        return this.minApiLevel;
    }

    public boolean c() {
        return this.enabled;
    }
}

