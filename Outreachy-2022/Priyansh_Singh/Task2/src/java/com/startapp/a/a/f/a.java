/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.startapp.a.a.f;

import com.startapp.a.a.a.c;
import com.startapp.a.a.d.e;
import com.startapp.a.a.e.b;

public class a {
    private final b a;
    private final com.startapp.a.a.g.c b;

    public a(b b2, com.startapp.a.a.g.c c2) {
        this.b = c2;
        this.a = b2;
    }

    public String a(com.startapp.a.a.g.a a2, c c2, long l2) {
        try {
            String string = this.a.a(c2);
            e e2 = this.b.b(a2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l2);
            stringBuilder.append("-");
            stringBuilder.append(a2.a());
            stringBuilder.append("-");
            stringBuilder.append(e2.a(string));
            String string2 = stringBuilder.toString();
            return string2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

