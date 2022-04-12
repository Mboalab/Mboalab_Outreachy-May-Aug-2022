package com.flurry.android;
import java.util.Map;
public abstract class a {
    protected boolean a;
    protected Map<String, String> b;

    public final boolean a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            a a2 = (a)object;
            return this.a == a2.a && ((this.b != null) ? this.b.equals(a2.b) : a2.b == null);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.a * 31;
        int n3 = (this.b != null) ? (this.b.hashCode()) : 0;
        return n2 + n3;
    }
}

