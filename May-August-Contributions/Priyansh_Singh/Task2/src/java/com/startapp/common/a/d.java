package com.startapp.common.a;
import java.io.UnsupportedEncodingException;

public class d {
    static final boolean a;

    static {
        a = true ^ d.class.desiredAssertionStatus();
    }

    private d() {
    }

    public static byte[] a(String string, int n2) {
        return d.a(string.getBytes(), n2);
    }

    public static byte[] a(byte[] arrby, int n2) {
        return d.a(arrby, 0, arrby.length, n2);
    }

    public static byte[] a(byte[] arrby, int n2, int n3, int n4) {
        b b2 = new b(n4, new byte[n3 * 3 / 4]);
        if (b2.a(arrby, n2, n3, true)) {
            if (b2.b == b2.a.length) {
                return b2.a;
            }
            byte[] arrby2 = new byte[b2.b];
            System.arraycopy((Object)b2.a, (int)0, (Object)arrby2, (int)0, (int)b2.b);
            return arrby2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String b(byte[] arrby, int n2) {
        try {
            String string = new String(d.c(arrby, n2), "US-ASCII");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public static byte[] b(byte[] arrby, int n2, int n3, int n4) {
        c c2 = new c(n4, null);
        int n5 = 4 * (n3 / 3);
        if (c2.d) {
            if (n3 % 3 > 0) {
                n5 += 4;
            }
        } else {
            switch (n3 % 3) {
                default: {
                    break;
                }
                case 2: {
                    n5 += 3;
                    break;
                }
                case 1: {
                    n5 += 2;
                }
                case 0: 
            }
        }
        if (c2.e && n3 > 0) {
            int n6 = 1 + (n3 - 1) / 57;
            int n7 = c2.f ? 2 : 1;
            n5 += n6 * n7;
        }
        c2.a = new byte[n5];
        c2.a(arrby, n2, n3, true);
        if (!a && c2.b != n5) {
            throw new AssertionError();
        }
        return c2.a;
    }

    public static byte[] c(byte[] arrby, int n2) {
        return d.b(arrby, 0, arrby.length, n2);
    }

    static abstract class a {
        public byte[] a;
        public int b;

        a() {
        }
    }

    static class b
    extends a {
        private static final int[] c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int e;
        private int f;
        private final int[] g;

        public b(int n2, byte[] arrby) {
            this.a = arrby;
            int[] arrn = (n2 & 8) == 0 ? c : d;
            this.g = arrn;
            this.e = 0;
            this.f = 0;
        }

        public boolean a(byte[] arrby, int n2, int n3, boolean bl2) {
            if (this.e == 6) {
                return false;
            }
            int n4 = n3 + n2;
            int n5 = this.e;
            int n6 = this.f;
            byte[] arrby2 = this.a;
            int[] arrn = this.g;
            int n7 = 0;
            block15 : while (n2 < n4) {
                if (n5 == 0) {
                    int n8;
                    while ((n8 = n2 + 4) <= n4 && (n6 = arrn[255 & arrby[n2]] << 18 | arrn[255 & arrby[n2 + 1]] << 12 | arrn[255 & arrby[n2 + 2]] << 6 | arrn[255 & arrby[n2 + 3]]) >= 0) {
                        arrby2[n7 + 2] = (byte)n6;
                        arrby2[n7 + 1] = (byte)(n6 >> 8);
                        arrby2[n7] = (byte)(n6 >> 16);
                        n7 += 3;
                        n2 = n8;
                    }
                    if (n2 >= n4) break;
                }
                int n9 = n2 + 1;
                int n10 = arrn[255 & arrby[n2]];
                switch (n5) {
                    default: {
                        break;
                    }
                    case 5: {
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                    case 4: {
                        if (n10 == -2) {
                            ++n5;
                            break;
                        }
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                    case 3: {
                        if (n10 >= 0) {
                            n6 = n10 | n6 << 6;
                            arrby2[n7 + 2] = (byte)n6;
                            arrby2[n7 + 1] = (byte)(n6 >> 8);
                            arrby2[n7] = (byte)(n6 >> 16);
                            n7 += 3;
                            n2 = n9;
                            n5 = 0;
                            continue block15;
                        }
                        if (n10 == -2) {
                            arrby2[n7 + 1] = (byte)(n6 >> 2);
                            arrby2[n7] = (byte)(n6 >> 10);
                            n7 += 2;
                            n5 = 5;
                            break;
                        }
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                    case 2: {
                        if (n10 >= 0) {
                            n6 = n10 | n6 << 6;
                            ++n5;
                            break;
                        }
                        if (n10 == -2) {
                            int n11 = n7 + 1;
                            arrby2[n7] = (byte)(n6 >> 4);
                            n7 = n11;
                            n2 = n9;
                            n5 = 4;
                            continue block15;
                        }
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                    case 1: {
                        if (n10 >= 0) {
                            n6 = n10 | n6 << 6;
                            ++n5;
                            break;
                        }
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                    case 0: {
                        if (n10 >= 0) {
                            ++n5;
                            n6 = n10;
                            break;
                        }
                        if (n10 == -1) break;
                        this.e = 6;
                        return false;
                    }
                }
                n2 = n9;
            }
            if (!bl2) {
                this.e = n5;
                this.f = n6;
                this.b = n7;
                return true;
            }
            switch (n5) {
                default: {
                    break;
                }
                case 4: {
                    this.e = 6;
                    return false;
                }
                case 3: {
                    int n12 = n7 + 1;
                    arrby2[n7] = (byte)(n6 >> 10);
                    n7 = n12 + 1;
                    arrby2[n12] = (byte)(n6 >> 2);
                    break;
                }
                case 2: {
                    int n13 = n7 + 1;
                    arrby2[n7] = (byte)(n6 >> 4);
                    n7 = n13;
                    break;
                }
                case 1: {
                    this.e = 6;
                    return false;
                }
                case 0: 
            }
            this.e = n5;
            this.b = n7;
            return true;
        }
    }

    static class c
    extends a {
        static final /* synthetic */ boolean g;
        private static final byte[] h;
        private static final byte[] i;
        int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte[] j;
        private int k;
        private final byte[] l;

        static {
            g = true ^ d.class.desiredAssertionStatus();
            h = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            i = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        }

        public c(int n2, byte[] arrby) {
            this.a = arrby;
            int n3 = n2 & 1;
            boolean bl2 = true;
            boolean bl3 = n3 == 0;
            this.d = bl3;
            boolean bl4 = (n2 & 2) == 0;
            this.e = bl4;
            if ((n2 & 4) == 0) {
                bl2 = false;
            }
            this.f = bl2;
            byte[] arrby2 = (n2 & 8) == 0 ? h : i;
            this.l = arrby2;
            this.j = new byte[2];
            this.c = 0;
            int n4 = this.e ? 19 : -1;
            this.k = n4;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean a(byte[] var1_1, int var2_4, int var3_3, boolean var4) {
            var5_5 = this.l;
            var6_6 = this.a;
            var7_7 = this.k;
            var8_8 = var3_3 + var2_4;
            var9_9 = this.c;
            var10_10 = 0;
            switch (var9_9) {
                default: {
                    break;
                }
                case 2: {
                    var11_11 = var2_4 + 1;
                    if (var11_11 > var8_8) break;
                    var12_12 = (255 & this.j[0]) << 16 | (255 & this.j[1]) << 8 | 255 & var1_1[var2_4];
                    this.c = 0;
                    ** break;
                }
                case 1: {
                    if (var2_4 + 2 > var8_8) break;
                    var49_13 = (255 & this.j[0]) << 16;
                    var50_14 = var2_4 + 1;
                    var51_15 = var49_13 | (255 & var1_1[var2_4]) << 8;
                    var11_11 = var50_14 + 1;
                    var12_12 = var51_15 | 255 & var1_1[var50_14];
                    this.c = 0;
                    ** break;
                }
                case 0: 
            }
            var11_11 = var2_4;
            var12_12 = -1;
lbl28: // 3 sources:
            if (var12_12 != -1) {
                var6_6[0] = var5_5[63 & var12_12 >> 18];
                var6_6[1] = var5_5[63 & var12_12 >> 12];
                var6_6[2] = var5_5[63 & var12_12 >> 6];
                var6_6[3] = var5_5[var12_12 & 63];
                var47_16 = var7_7 - 1;
                if (var47_16 == 0) {
                    if (this.f) {
                        var48_17 = 5;
                        var6_6[4] = 13;
                    } else {
                        var48_17 = 4;
                    }
                    var14_18 = var48_17 + 1;
                    var6_6[var48_17] = 10;
                    var13_19 = 19;
                } else {
                    var13_19 = var47_16;
                    var14_18 = 4;
                }
            } else {
                var13_19 = var7_7;
                var14_18 = 0;
            }
            while ((var15_21 = var11_11 + 3) <= var8_8) {
                var45_20 = (255 & var1_1[var11_11]) << 16 | (255 & var1_1[var11_11 + 1]) << 8 | 255 & var1_1[var11_11 + 2];
                var6_6[var14_18] = var5_5[63 & var45_20 >> 18];
                var6_6[var14_18 + 1] = var5_5[63 & var45_20 >> 12];
                var6_6[var14_18 + 2] = var5_5[63 & var45_20 >> 6];
                var6_6[var14_18 + 3] = var5_5[var45_20 & 63];
                var14_18 += 4;
                if (--var13_19 == 0) {
                    if (this.f) {
                        var46_22 = var14_18 + 1;
                        var6_6[var14_18] = 13;
                    } else {
                        var46_22 = var14_18;
                    }
                    var14_18 = var46_22 + 1;
                    var6_6[var46_22] = 10;
                    var11_11 = var15_21;
                    var13_19 = 19;
                    continue;
                }
                var11_11 = var15_21;
            }
            if (var4) {
                if (var11_11 - this.c == var8_8 - 1) {
                    if (this.c > 0) {
                        var40_23 = this.j[0];
                        var10_10 = 1;
                    } else {
                        var39_24 = var11_11 + 1;
                        var40_23 = var1_1[var11_11];
                        var11_11 = var39_24;
                    }
                    var41_25 = (var40_23 & 255) << 4;
                    this.c -= var10_10;
                    var42_26 = var14_18 + 1;
                    var6_6[var14_18] = var5_5[63 & var41_25 >> 6];
                    var14_18 = var42_26 + 1;
                    var6_6[var42_26] = var5_5[var41_25 & 63];
                    if (this.d) {
                        var44_27 = var14_18 + 1;
                        var6_6[var14_18] = 61;
                        var14_18 = var44_27 + 1;
                        var6_6[var44_27] = 61;
                    }
                    if (this.e) {
                        if (this.f) {
                            var43_28 = var14_18 + 1;
                            var6_6[var14_18] = 13;
                        } else {
                            var43_28 = var14_18;
                        }
                        var14_18 = var43_28 + 1;
                        var6_6[var43_28] = 10;
                    }
                } else if (var11_11 - this.c == var8_8 - 2) {
                    if (this.c > 1) {
                        var38_29 = this.j[0];
                        var10_10 = 1;
                        var24_30 = var11_11;
                        var25_31 = var38_29;
                    } else {
                        var24_30 = var11_11 + 1;
                        var25_31 = var1_1[var11_11];
                    }
                    var26_32 = (var25_31 & 255) << 10;
                    if (this.c > 0) {
                        var37_33 = this.j;
                        var29_34 = var10_10 + 1;
                        var28_35 = var37_33[var10_10];
                    } else {
                        var27_36 = var24_30 + 1;
                        var28_35 = var1_1[var24_30];
                        var24_30 = var27_36;
                        var29_34 = var10_10;
                    }
                    var30_37 = var26_32 | (var28_35 & 255) << 2;
                    this.c -= var29_34;
                    var31_38 = var14_18 + 1;
                    var6_6[var14_18] = var5_5[63 & var30_37 >> 12];
                    var32_39 = var31_38 + 1;
                    var6_6[var31_38] = var5_5[63 & var30_37 >> 6];
                    var33_40 = var32_39 + 1;
                    var6_6[var32_39] = var5_5[var30_37 & 63];
                    if (this.d) {
                        var34_41 = var33_40 + 1;
                        var6_6[var33_40] = 61;
                    } else {
                        var34_41 = var33_40;
                    }
                    if (this.e) {
                        if (this.f) {
                            var36_42 = var34_41 + 1;
                            var6_6[var34_41] = 13;
                            var34_41 = var36_42;
                        }
                        var35_43 = var34_41 + 1;
                        var6_6[var34_41] = 10;
                        var34_41 = var35_43;
                    }
                    var14_18 = var34_41;
                    var11_11 = var24_30;
                } else if (this.e && var14_18 > 0 && var13_19 != 19) {
                    if (this.f) {
                        var22_44 = var14_18 + 1;
                        var6_6[var14_18] = 13;
                    } else {
                        var22_44 = var14_18;
                    }
                    var23_45 = var22_44 + 1;
                    var6_6[var22_44] = 10;
                    var14_18 = var23_45;
                }
                if (!c.g) {
                    if (this.c != 0) throw new AssertionError();
                }
                if (!c.g) {
                    if (var11_11 != var8_8) throw new AssertionError();
                }
            } else if (var11_11 == var8_8 - 1) {
                var20_46 = this.j;
                var21_47 = this.c;
                this.c = var21_47 + 1;
                var20_46[var21_47] = var1_1[var11_11];
            } else if (var11_11 == var8_8 - 2) {
                var16_48 = this.j;
                var17_49 = this.c;
                this.c = var17_49 + 1;
                var16_48[var17_49] = var1_1[var11_11];
                var18_50 = this.j;
                var19_51 = this.c;
                this.c = var19_51 + 1;
                var18_50[var19_51] = var1_1[var11_11 + 1];
            }
            this.b = var14_18;
            this.k = var13_19;
            return true;
        }
    }

}

