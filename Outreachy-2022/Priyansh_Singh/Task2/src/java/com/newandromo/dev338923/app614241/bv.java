/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.support.v7.d.b
 *  android.support.v7.d.b$a
 *  android.support.v7.d.c
 *  com.bumptech.glide.load.b.l
 *  com.bumptech.glide.load.e
 *  com.bumptech.glide.load.resource.c
 *  java.io.BufferedInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.newandromo.dev338923.app614241;

import android.graphics.Bitmap;
import android.support.v7.d.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.c;
import com.newandromo.dev338923.app614241.cd;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class bv
implements e<InputStream, b> {
    private final e<InputStream, b> a;
    private final e<InputStream, Bitmap> b;

    public bv(e<InputStream, b> e2, e<InputStream, Bitmap> e3) {
        this.a = e2;
        this.b = e3;
    }

    private l<b> a(InputStream inputStream, int n2, int n3) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (inputStream.markSupported()) {
            int n4 = 1;
            inputStream.mark(n4);
            if (inputStream.read() == 0) {
                n4 = 0;
            }
            inputStream.reset();
            if (n4 != 0) {
                l l2 = this.b.a((Object)inputStream, n2, n3);
                try {
                    b b2 = new b.a((Bitmap)l2.a()).a().a(cd.a).a(cd.b).a(cd.c).a(cd.d).a(cd.e).a(cd.f).a(cd.g).a(cd.h).b();
                    if (Collections.unmodifiableList((List)b2.a).isEmpty()) {
                        b.a a2 = new b.a((Bitmap)l2.a()).a().a(cd.a).a(cd.b).a(cd.c).a(cd.d).a(cd.e).a(cd.f).a(cd.g).a(cd.h);
                        a2.a.clear();
                        b2 = a2.b();
                    }
                    c c2 = new c((Object)b2);
                    return c2;
                }
                finally {
                    l2.c();
                }
            }
            if (inputStream.read() == 0) {
                return this.a.a((Object)inputStream, n2, n3);
            }
            throw new IOException("Cannot read palette magic.");
        }
        throw new IllegalArgumentException("Cannot peek");
    }

    public final String a() {
        return bv.class.getSimpleName();
    }
}

