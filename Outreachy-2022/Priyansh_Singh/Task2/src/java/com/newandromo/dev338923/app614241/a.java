package com.newandromo.dev338923.app614241;

import java.util.Arrays;

public abstract class a<E> {
    private final int a;
    private final int b;
    private E[] c;
    private int[] d;
    private int e;

    protected abstract E a();
    public final void a(int n2, int n3) {
        if (this.c != null && n2 > this.c.length) {
            int n4 = this.a;
            int n5 = n4 * (1 + n2 / n4);
            int[] arrn = this.d;
            if (arrn != null) {
                if (this.c == null || this.c.length < this.d.length) throw new IllegalStateException("positions.length > elements.length");
                E[] arrE = this.a(n5);
                int[] arrn2 = new int[n5];
                Arrays.fill((int[])arrn2, (int)-1);
                for (int i2 = 0; i2 < this.d.length; ++i2) {
                    int n6 = this.d[i2];
                    if (n6 != -1) {
                        int n7 = n6 % n5;
                        arrE[n7] = this.c[i2];
                        arrn2[n7] = n6;
                        continue;
                    }
                    E e2 = this.c[i2];
                    if (e2 == null) continue;
                    this.a(e2);
                }
                this.c = arrE;
                this.d = arrn2;
            } else if (this.c != null) {
                E[] arrE = this.a(n5);
                System.arraycopy(this.c, (int)0, arrE, (int)0, (int)this.c.length);
                this.c = arrE;
            }
        }
        if (this.c == null) {
            if (n3 <= Math.max((int)n2, (int)this.b)) {
                this.c = this.a(Math.max((int)n3, (int)n2));
                this.d = null;
            } else {
                int n8 = Math.max((int)n2, (int)this.a);
                this.c = this.a(n8);
                this.d = new int[n8];
                Arrays.fill((int[])this.d, (int)-1);
            }
        }
        this.e = n3;
    }

    protected abstract void a(E var1);

    protected abstract E[] a(int var1);

    public final E b(int n2) {
        int n3 = this.c != null ? this.c.length : this.a;
        this.a(n3, this.e);
        if (this.c != null) {
            if (this.c.length >= this.e) {
                if (this.c[n2] == null) {
                    this.c[n2] = this.a();
                }
            } else {
                int n4 = n2 % this.c.length;
                if (this.c[n4] != null) {
                    if (this.d == null || this.d[n4] != n2) {
                        this.a(this.c[n4]);
                    }
                } else {
                    this.c[n4] = this.a();
                }
                if (this.d != null) {
                    this.d[n4] = n2;
                }
            }
        }
        return null;
    }
}

