
package com.startapp.a.a.c;

import com.startapp.a.a.c.b;
import com.startapp.a.a.c.f;

public class a
extends b {
    static final byte[] a = new byte[]{13, 10};
    private static final byte[] d = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] e = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] f = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] g;
    private final byte[] h;
    private final byte[] i;
    private final int j;
    private final int k;

    public a() {
        this(0);
    }

    public a(int n2) {
        super(n2, a);
    }

    public a(int n2, byte[] arrby) {
        super(n2, arrby, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public a(int n2, byte[] arrby, boolean bl2) {
        int n3 = arrby == null ? 0 : arrby.length;
        super(3, 4, n2, n3);
        this.h = f;
        if (arrby != null) {
            if (this.c(arrby)) {
                String string = f.a(arrby);
                StringBuilder stringBuilder = new StringBuilder("lineSeparator must not contain base64 characters: [");
                stringBuilder.append(string);
                stringBuilder.append("]");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (n2 > 0) {
                this.k = 4 + arrby.length;
                this.i = new byte[arrby.length];
                System.arraycopy((Object)arrby, (int)0, (Object)this.i, (int)0, (int)arrby.length);
            } else {
                this.k = 4;
                this.i = null;
            }
        } else {
            this.k = 4;
            this.i = null;
        }
        this.j = -1 + this.k;
        byte[] arrby2 = bl2 ? e : d;
        this.g = arrby2;
    }

    public a(boolean bl2) {
        super(76, a, bl2);
    }

    public static String a(byte[] arrby) {
        return f.a(a.a(arrby, false));
    }

    public static byte[] a(byte[] arrby, boolean bl2) {
        return a.a(arrby, bl2, false);
    }

    public static byte[] a(byte[] arrby, boolean bl2, boolean bl3) {
        return a.a(arrby, bl2, bl3, Integer.MAX_VALUE);
    }

    public static byte[] a(byte[] arrby, boolean bl2, boolean bl3, int n2) {
        if (arrby != null) {
            if (arrby.length == 0) {
                return arrby;
            }
            a a2 = bl2 ? new a(bl3) : new a(0, a, bl3);
            long l2 = a2.d(arrby);
            if (l2 <= (long)n2) {
                return a2.b(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder("Input array too big, the output array would be bigger (");
            stringBuilder.append(l2);
            stringBuilder.append(") than the specified maximum size of ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return arrby;
    }

    @Override
    void a(byte[] arrby, int n2, int n3, b.a a2) {
        if (a2.f) {
            return;
        }
        if (n3 < 0) {
            a2.f = true;
            if (a2.h == 0 && this.c == 0) {
                return;
            }
            byte[] arrby2 = this.a(this.k, a2);
            int n4 = a2.d;
            switch (a2.h) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder("Impossible modulus ");
                    stringBuilder.append(a2.h);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                case 2: {
                    int n5 = a2.d;
                    a2.d = n5 + 1;
                    arrby2[n5] = this.g[63 & a2.a >> 10];
                    int n6 = a2.d;
                    a2.d = n6 + 1;
                    arrby2[n6] = this.g[63 & a2.a >> 4];
                    int n7 = a2.d;
                    a2.d = n7 + 1;
                    arrby2[n7] = this.g[63 & a2.a << 2];
                    if (this.g != d) break;
                    int n8 = a2.d;
                    a2.d = n8 + 1;
                    arrby2[n8] = 61;
                    break;
                }
                case 1: {
                    int n9 = a2.d;
                    a2.d = n9 + 1;
                    arrby2[n9] = this.g[63 & a2.a >> 2];
                    int n10 = a2.d;
                    a2.d = n10 + 1;
                    arrby2[n10] = this.g[63 & a2.a << 4];
                    if (this.g != d) break;
                    int n11 = a2.d;
                    a2.d = n11 + 1;
                    arrby2[n11] = 61;
                    int n12 = a2.d;
                    a2.d = n12 + 1;
                    arrby2[n12] = 61;
                }
                case 0: 
            }
            a2.g += a2.d - n4;
            if (this.c > 0 && a2.g > 0) {
                System.arraycopy((Object)this.i, (int)0, (Object)arrby2, (int)a2.d, (int)this.i.length);
                a2.d += this.i.length;
            }
            return;
        }
        int n13 = n2;
        for (int i2 = 0; i2 < n3; ++i2) {
            byte[] arrby3 = this.a(this.k, a2);
            a2.h = (1 + a2.h) % 3;
            int n14 = n13 + 1;
            int n15 = arrby[n13];
            if (n15 < 0) {
                n15 += 256;
            }
            a2.a = n15 + (a2.a << 8);
            if (a2.h == 0) {
                int n16 = a2.d;
                a2.d = n16 + 1;
                arrby3[n16] = this.g[63 & a2.a >> 18];
                int n17 = a2.d;
                a2.d = n17 + 1;
                arrby3[n17] = this.g[63 & a2.a >> 12];
                int n18 = a2.d;
                a2.d = n18 + 1;
                arrby3[n18] = this.g[63 & a2.a >> 6];
                int n19 = a2.d;
                a2.d = n19 + 1;
                arrby3[n19] = this.g[63 & a2.a];
                a2.g = 4 + a2.g;
                if (this.c > 0 && this.c <= a2.g) {
                    System.arraycopy((Object)this.i, (int)0, (Object)arrby3, (int)a2.d, (int)this.i.length);
                    a2.d += this.i.length;
                    a2.g = 0;
                }
            }
            n13 = n14;
        }
    }

    @Override
    protected boolean a(byte by2) {
        return by2 >= 0 && by2 < this.h.length && this.h[by2] != -1;
    }
}

