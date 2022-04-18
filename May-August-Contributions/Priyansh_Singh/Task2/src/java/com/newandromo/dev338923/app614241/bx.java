/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.d.b
 *  com.bumptech.glide.load.b.l
 *  com.bumptech.glide.load.e
 *  com.bumptech.glide.load.resource.c
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.d.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.c;
import com.newandromo.dev338923.app614241.cb;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class bx
implements e<InputStream, b> {
    private static l<b> a(InputStream inputStream) throws IOException {
        try {
            c c2 = new c((Object)((cb)new ObjectInputStream((InputStream)inputStream).readObject()).a);
            return c2;
        }
        catch (Exception exception) {
            throw new IOException("Cannot read palette", (Throwable)exception);
        }
    }

    public final String a() {
        return bx.class.getSimpleName();
    }
}

