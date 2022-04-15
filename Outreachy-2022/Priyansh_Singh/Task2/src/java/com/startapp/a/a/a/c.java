
package com.startapp.a.a.a;

import java.io.Serializable;

public class c
implements Serializable {
    static final /* synthetic */ boolean a;
    private final long[][] d;
    private int e;
    private final int f;

    static {
        a = true ^ c.class.desiredAssertionStatus();
    }

    public c(long l2) {
        this.e = c.super.d(l2);
        int n2 = this.e % 4096;
        int n3 = this.e / 4096;
        int n4 = n2 == 0 ? 0 : 1;
        this.f = n4 + n3;
        if (this.f <= 100) {
            this.d = new long[this.f][];
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d[i2] = new long[4096];
            }
            if (n2 != 0) {
                this.d[this.d.length - 1] = new long[n2];
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("HighPageCountException pageCount = ");
        stringBuilder.append(this.f);
        throw new RuntimeException(stringBuilder.toString());
    }

    private int b(long l2) {
        int n2 = (int)(l2 >> 6);
        if (n2 >= this.e) {
            c.super.c(l2 + 1L);
            this.e = n2 + 1;
        }
        return n2;
    }

    private void b(int n2) {
        if (!a) {
            if (n2 <= this.e) {
                return;
            }
            throw new AssertionError((Object)"Growing of paged bitset is not supported");
        }
    }

    private void c(long l2) {
        c.super.b(c.super.d(l2));
    }

    private int d(long l2) {
        return (int)(1L + (l2 - 1L >>> 6));
    }

    long a() {
        return (long)this.e << 6;
    }

    void a(long l2) {
        int n2 = c.super.b(l2);
        long l3 = 1L << (63 & (int)l2);
        long[] arrl = this.d[n2 / 4096];
        int n3 = n2 % 4096;
        arrl[n3] = l3 | arrl[n3];
    }

    public long[] a(int n2) {
        return this.d[n2];
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }
}

