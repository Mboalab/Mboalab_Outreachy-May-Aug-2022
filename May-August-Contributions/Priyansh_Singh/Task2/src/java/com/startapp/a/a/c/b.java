
package com.startapp.a.a.c;

import java.util.Arrays;

public abstract class b {
    private final int a;
    protected final byte b = (byte)61;
    protected final int c;
    private final int d;
    private final int e;

    protected b(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.d = n3;
        boolean bl = n4 > 0 && n5 > 0;
        int n6 = 0;
        if (bl) {
            n6 = n3 * (n4 / n3);
        }
        this.c = n6;
        this.e = n5;
    }

    private byte[] b(a a2) {
        if (a2.c == null) {
            a2.c = new byte[this.a()];
            a2.d = 0;
            a2.e = 0;
        } else {
            byte[] arrby = new byte[2 * a2.c.length];
            System.arraycopy((Object)a2.c, (int)0, (Object)arrby, (int)0, (int)a2.c.length);
            a2.c = arrby;
        }
        return a2.c;
    }

    protected int a() {
        return 8192;
    }

    int a(a a2) {
        if (a2.c != null) {
            return a2.d - a2.e;
        }
        return 0;
    }

    abstract void a(byte[] var1, int var2, int var3, a var4);

    protected abstract boolean a(byte var1);

    protected byte[] a(int n2, a a2) {
        if (a2.c != null && a2.c.length >= n2 + a2.d) {
            return a2.c;
        }
        return b.super.b(a2);
    }

    int b(byte[] arrby, int n2, int n3, a a2) {
        if (a2.c != null) {
            int n4 = Math.min((int)this.a(a2), (int)n3);
            System.arraycopy((Object)a2.c, (int)a2.e, (Object)arrby, (int)n2, (int)n4);
            a2.e = n4 + a2.e;
            if (a2.e >= a2.d) {
                a2.c = null;
            }
            return n4;
        }
        if (a2.f) {
            return -1;
        }
        return 0;
    }

    public byte[] b(byte[] arrby) {
        if (arrby != null) {
            if (arrby.length == 0) {
                return arrby;
            }
            a a2 = new a();
            this.a(arrby, 0, arrby.length, a2);
            this.a(arrby, 0, -1, a2);
            byte[] arrby2 = new byte[a2.d - a2.e];
            this.b(arrby2, 0, arrby2.length, a2);
            return arrby2;
        }
        return arrby;
    }

    protected boolean c(byte[] arrby) {
        if (arrby == null) {
            return false;
        }
        for (byte by : arrby) {
            if (61 != by && !this.a(by)) {
                continue;
            }
            return true;
        }
        return false;
    }

    public long d(byte[] arrby) {
        long l2 = (long)((-1 + (arrby.length + this.a)) / this.a) * (long)this.d;
        if (this.c > 0) {
            l2 += (l2 + (long)this.c - 1L) / (long)this.c * (long)this.e;
        }
        return l2;
    }

    static class a {
        int a;
        long b;
        byte[] c;
        int d;
        int e;
        boolean f;
        int g;
        int h;

        a() {
        }

        public String toString() {
            Object[] arrobject = new Object[]{this.getClass().getSimpleName(), Arrays.toString((byte[])this.c), this.g, this.f, this.a, this.b, this.h, this.d, this.e};
            return String.format((String)"%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", (Object[])arrobject);
        }
    }

}

