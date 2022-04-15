
package com.startapp.common;

public class e
extends Exception {
    private boolean b;
    private int c;

    public e() {
        this.b = false;
        this.c = 0;
    }

    public e(String string, Throwable throwable) {
        super(string, throwable, false);
    }

    public e(String string, Throwable throwable, int n2) {
        super(string, throwable, false, n2);
    }

    public e(String string, Throwable throwable, boolean bl2) {
        super(string, throwable, bl2, 0);
    }

    public e(String string, Throwable throwable, boolean bl2, int n2) {
        super(string, throwable);
        this.b = false;
        this.c = 0;
        this.b = bl2;
        this.c = n2;
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }
}

