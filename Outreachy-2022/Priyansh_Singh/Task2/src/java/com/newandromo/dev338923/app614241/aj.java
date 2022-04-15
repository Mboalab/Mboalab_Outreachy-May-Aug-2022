package com.newandromo.dev338923.app614241;

import android.content.res.ColorStateList;
import android.graphics.Color;

public final class aj {
    static final int[] a = new int[]{-16842910};
    static final int[] b = new int[]{16842908};
    static final int[] c = new int[]{16843518};
    static final int[] d = new int[]{16842919};
    static final int[] e = new int[]{16842912};
    static final int[] f = new int[]{16842913};
    static final int[] g = new int[]{-16842919, -16842908};
    static final int[] h = new int[0];
    static final int[] i = new int[]{16842919, 16842910};
    static final int[] j = new int[]{16842908, 16842910};
    static final int[] k = new int[]{16842912, 16842910};
    static final int[] l = new int[]{16842913, 16842910};
    public static double a(double[] arrd, double[] arrd2) {
        double d2 = arrd[0];
        double d3 = arrd[1];
        double d4 = arrd[2];
        double d5 = arrd2[0];
        double d6 = arrd2[1];
        double d7 = arrd2[2];
        double d8 = (d2 + d5) / 2.0;
        double d9 = d3 * d3;
        double d10 = d4 * d4;
        double d11 = Math.sqrt((double)(d9 + d10));
        double d12 = d6 * d6;
        double d13 = d7 * d7;
        double d14 = (d11 + Math.sqrt((double)(d12 + d13))) / 2.0;
        double d15 = 1.0 + (1.0 - Math.sqrt((double)(Math.pow((double)d14, (double)7.0) / (Math.pow((double)d14, (double)7.0) + Math.pow((double)25.0, (double)7.0))))) / 2.0;
        double d16 = d3 * d15;
        double d17 = d6 * d15;
        double d18 = Math.sqrt((double)(d10 + d16 * d16));
        double d19 = Math.sqrt((double)(d13 + d17 * d17));
        double d20 = (d18 + d19) / 2.0;
        double d21 = Math.atan2((double)d4, (double)d16);
        boolean bl = Math.atan2((double)d4, (double)d16) < 0.0;
        double d22 = (double)bl;
        Double.isNaN((double)d22);
        double d23 = d21 + d22 * 6.283185307179586;
        double d24 = Math.atan2((double)d7, (double)d17);
        boolean bl2 = Math.atan2((double)d7, (double)d17) < 0.0;
        double d25 = (double)bl2;
        Double.isNaN((double)d25);
        double d26 = d24 + d25 * 6.283185307179586;
        double d27 = d23 - d26;
        double d28 = Math.abs((double)d27) > 3.141592653589793 ? 6.283185307179586 + (d23 + d26) : d23 + d26;
        double d29 = d28 / 2.0;
        double d30 = 1.0 - 0.17 * Math.cos((double)(d29 - 0.5235987755982988)) + 0.24 * Math.cos((double)(d29 * 2.0)) + 0.32 * Math.cos((double)(0.10471975511965977 + 3.0 * d29)) - 0.2 * Math.cos((double)(4.0 * d29 - 1.0995574287564276));
        double d31 = Math.abs((double)d27) <= 3.141592653589793 ? d26 - d23 : (d26 <= d23 ? 6.283185307179586 + (d26 - d23) : d26 - d23 - 6.283185307179586);
        double d32 = d5 - d2;
        double d33 = d19 - d18;
        double d34 = 2.0 * Math.sqrt((double)(d18 * d19)) * Math.sin((double)(d31 / 2.0));
        double d35 = d8 - 50.0;
        double d36 = 1.0 + d35 * (d35 * 0.015) / Math.sqrt((double)(20.0 + d35 * d35));
        double d37 = 1.0 + 0.045 * d20;
        double d38 = 1.0 + d30 * (0.015 * d20);
        double d39 = (d29 * 57.29577951308232 - 275.0) / 25.0;
        double d40 = 0.5235987755982988 * Math.exp((double)(d39 * -d39));
        double d41 = -(2.0 * Math.sqrt((double)(Math.pow((double)d20, (double)7.0) / (Math.pow((double)d20, (double)7.0) + Math.pow((double)25.0, (double)7.0))))) * Math.sin((double)(d40 * 2.0));
        double d42 = d32 / (d36 * 1.0);
        double d43 = d42 * d42;
        double d44 = d33 / (d37 * 1.0);
        double d45 = d43 + d44 * d44;
        double d46 = d34 / (d38 * 1.0);
        return Math.sqrt((double)(d45 + d46 * d46 + d46 * (d41 * d44)));
    }

    public static int a(int n2, float f2) {
        double d2 = f2 * (float)(n2 >>> 24);
        Double.isNaN((double)d2);
        int n3 = (int)(d2 + 0.5);
        if (n3 > 255) {
            n3 = 255;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        return n2 & 16777215 | n3 << 24;
    }

    public static int a(int n2, int n3) {
        return n2 & 16777215 | n3 << 24;
    }

    public static int a(boolean bl) {
        if (bl) {
            return -1;
        }
        return -570425344;
    }

    public static String a(int n2) {
        Object[] arrobject = new Object[]{n2};
        return String.format((String)"%08X", (Object[])arrobject);
    }

    public static String a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int n2 = colorStateList.getDefaultColor();
            if (colorStateList.isStateful()) {
                int n3;
                int n4;
                int n5;
                StringBuilder stringBuilder = new StringBuilder("ColorStateList(stateful:true, default:");
                stringBuilder.append(aj.a(n2));
                String string = stringBuilder.toString();
                int n6 = colorStateList.getColorForState(a, n2);
                if (n6 != n2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string);
                    stringBuilder2.append(", disabled:");
                    stringBuilder2.append(aj.a(n6));
                    string = stringBuilder2.toString();
                }
                if ((n3 = colorStateList.getColorForState(i, n2)) != n2) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string);
                    stringBuilder3.append(", pressed:");
                    stringBuilder3.append(aj.a(n3));
                    string = stringBuilder3.toString();
                }
                if ((n5 = colorStateList.getColorForState(j, n2)) != n2) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(string);
                    stringBuilder4.append(", focused:");
                    stringBuilder4.append(aj.a(n5));
                    string = stringBuilder4.toString();
                }
                if ((n4 = colorStateList.getColorForState(l, n2)) != n2) {
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(string);
                    stringBuilder5.append(", selected:");
                    stringBuilder5.append(aj.a(n4));
                    string = stringBuilder5.toString();
                }
                if (colorStateList.getColorForState(k, n2) != n2) {
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append(string);
                    stringBuilder6.append(", checked:");
                    stringBuilder6.append(aj.a(n4));
                    string = stringBuilder6.toString();
                }
                StringBuilder stringBuilder7 = new StringBuilder();
                stringBuilder7.append(string);
                stringBuilder7.append(")");
                return stringBuilder7.toString();
            }
            StringBuilder stringBuilder = new StringBuilder("ColorStateList(stateful:false, default:");
            stringBuilder.append(aj.a(n2));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return "ColorStateList:null";
    }

    public static int b(int n2) {
        float[] arrf = new float[3];
        Color.colorToHSV((int)n2, (float[])arrf);
        arrf[2] = 0.8f * arrf[2];
        return Color.HSVToColor((float[])arrf);
    }

    public static int b(boolean bl) {
        if (bl) {
            return -1275068417;
        }
        return -1979711488;
    }

    public static ColorStateList b(int n2, int n3) {
        int[][] arrarrn = new int[2][];
        int[] arrn = new int[2];
        arrarrn[0] = a;
        arrn[0] = n3;
        arrarrn[1] = h;
        arrn[1] = n2;
        return new ColorStateList((int[][])arrarrn, arrn);
    }

    public static boolean c(int n2) {
        int n3 = Color.red((int)n2);
        int n4 = Color.green((int)n2);
        int n5 = Color.blue((int)n2);
        double d2 = n3 * n3;
        Double.isNaN((double)d2);
        double d3 = d2 * 0.241;
        double d4 = n4 * n4;
        Double.isNaN((double)d4);
        double d5 = d3 + d4 * 0.691;
        double d6 = n5 * n5;
        Double.isNaN((double)d6);
        return (int)(d5 + d6 * 0.068) < 16900;
    }

    public static int d(int n2) {
        return 1073741824 | n2 & 16777215;
    }
}

