/*
 *  
 * 
 * Could not load the following classes:
 *  com.startapp.a.a.g.a$1
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.a.a.g;

import com.startapp.a.a.g.a;

public class a
extends Enum<a> {
    public static final /* enum */ a a;
    public static final /* enum */ a b;
    public static final /* enum */ a c;
    public static final /* enum */ a d;
    private static final /* synthetic */ a[] h;
    private final String e;
    private final int f;
    private final int g;

    static {
        a a2;
        a a3;
        a a4;
        a = a3 = new a("0", 1, 720);
        1 var1_1 = new 1("THREE", 1, "3.0", 1, 720);
        b = var1_1;
        c = a2 = new a("4", 3, 3500);
        d = a4 = new a("5", 3, 1000000);
        a[] arra = new a[]{a, b, c, d};
        h = arra;
    }

    private a(String string2, int n3, int n4) {
        this.e = string2;
        this.f = n3;
        this.g = n4;
    }

    public static a valueOf(String string) {
        return (a)Enum.valueOf(a.class, (String)string);
    }

    public static a[] values() {
        return (a[])h.clone();
    }

    public String a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }
}

