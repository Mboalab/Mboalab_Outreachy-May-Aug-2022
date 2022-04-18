/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.DataInput
 */
package com.startapp.a.a.e;

import com.startapp.a.a.a.c;
import com.startapp.a.a.e.d;
import java.io.DataInput;

public class a
extends d {
    private final int a;
    private final int b;

    public a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    protected c a(DataInput dataInput) {
        c c2 = new c(this.a * this.b);
        this.a(dataInput, c2, c2.b());
        return c2;
    }
}

