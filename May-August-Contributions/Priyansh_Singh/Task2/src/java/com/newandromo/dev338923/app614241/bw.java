/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.d.b
 *  com.bumptech.glide.load.b.l
 *  com.bumptech.glide.load.f
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.d.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.io.OutputStream;

public class bw
implements f<b> {
    private final f<b> a;

    public bw(f<b> f2) {
        this.a = f2;
    }

    private boolean a(l<b> l2, OutputStream outputStream) {
        try {
            outputStream.write(0);
            boolean bl2 = this.a.a(l2, outputStream);
            return bl2;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public final String a() {
        return bw.class.getSimpleName();
    }
}

