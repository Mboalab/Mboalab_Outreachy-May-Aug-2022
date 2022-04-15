
package com.startapp.android.publish.cache;

import java.io.Serializable;

public class h
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String filename;
    private long lastUseTimestamp;
    private String videoLocation;

    public h(String string) {
        this.filename = string;
    }

    public String a() {
        return this.filename;
    }

    public void a(long l2) {
        this.lastUseTimestamp = l2;
    }

    public void a(String string) {
        this.videoLocation = string;
    }

    public String b() {
        return this.videoLocation;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        h h2 = (h)object;
        return !(this.filename == null ? h2.filename != null : !this.filename.equals((Object)h2.filename));
    }

    public int hashCode() {
        int n2 = this.filename == null ? 0 : this.filename.hashCode();
        return n2 + 31;
    }
}

