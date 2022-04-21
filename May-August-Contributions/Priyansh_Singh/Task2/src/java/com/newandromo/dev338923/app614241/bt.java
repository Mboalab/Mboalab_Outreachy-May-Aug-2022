/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.d.b
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.d.b;
import com.newandromo.dev338923.app614241.as;
import com.newandromo.dev338923.app614241.az;
import com.newandromo.dev338923.app614241.bz;
import java.util.Arrays;

public final class bt
implements bz {
    int a;
    b[] b;
    private int c;

    public bt() {
        this(10);
    }

    public bt(int n2) {
        this.c = n2;
    }

    @Override
    public final b a(int n2) {
        if (n2 >= 0 && n2 < this.a && this.b != null) {
            return this.b[n2];
        }
        return null;
    }

    @Override
    public final void a(int n2, b b2) {
        if (n2 >= 0) {
            if (n2 >= this.c) {
                return;
            }
            if (this.b == null) {
                this.b = new b[this.c];
            }
            this.b[n2] = b2;
            if (b2 != null && n2 >= this.a) {
                this.a = n2 + 1;
            }
            return;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!this.getClass().equals((Object)object.getClass())) {
            return false;
        }
        bt bt2 = (bt)object;
        return as.a(this.a, bt2.a) && Arrays.equals((Object[])this.b, (Object[])bt2.b);
    }

    public final int hashCode() {
        return az.a(az.a(23, this.a), this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("{");
        String string = stringBuilder.toString();
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (i2 > 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append(", ");
                string = stringBuilder2.toString();
            }
            if (this.b[i2] == null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(string);
                stringBuilder3.append(i2);
                stringBuilder3.append(":null");
                string = stringBuilder3.toString();
                continue;
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(string);
            stringBuilder4.append(i2);
            stringBuilder4.append(":");
            stringBuilder4.append(this.b[i2].toString());
            string = stringBuilder4.toString();
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(string);
        stringBuilder5.append("}");
        return stringBuilder5.toString();
    }
}

