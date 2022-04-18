/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.d.b
 *  com.bumptech.glide.load.b.l
 *  com.bumptech.glide.load.f
 *  java.io.IOException
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.d.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.f;
import com.newandromo.dev338923.app614241.cb;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class by
implements f<b> {
    private static boolean a(l<b> l2, OutputStream outputStream) {
        cb cb2 = new cb((b)l2.a());
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject((Object)cb2);
            objectOutputStream.flush();
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public final String a() {
        return by.class.getSimpleName();
    }
}

