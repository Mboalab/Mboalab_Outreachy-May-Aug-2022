package com.startapp.android.publish.common.metaData;
import java.io.Serializable;
public class LocationConfig
implements Serializable {
    private static final boolean DEFAULT_CO_ENABLED = false;
    private static final boolean DEFAULT_FI_ENABLED = false;
    private static final long serialVersionUID = 1L;
    private boolean coEnabled = false;
    private boolean fiEnabled = false;

    public boolean isCoEnabled() {
        return this.coEnabled;
    }

    public boolean isFiEnabled() {
        return this.fiEnabled;
    }
}

