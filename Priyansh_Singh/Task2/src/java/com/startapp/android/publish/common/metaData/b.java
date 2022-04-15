package com.startapp.android.publish.common.metaData;

import java.io.Serializable;

public class b
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int discoveryIntervalInMinutes = 1440;
    private boolean enabled = false;
    private int timeoutInSec = 20;

    public int a() {
        return this.timeoutInSec;
    }

    public boolean b() {
        return this.enabled;
    }

    public int c() {
        return this.discoveryIntervalInMinutes;
    }
}

