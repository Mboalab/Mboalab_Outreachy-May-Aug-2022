/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.DataInput
 *  java.io.IOException
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.startapp.a.a.e;

import com.startapp.a.a.a.c;
import com.startapp.a.a.e.d;
import java.io.DataInput;
import java.io.IOException;

public class e
extends d {
    private void b(DataInput dataInput) {
        try {
            dataInput.readInt();
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", (Throwable)iOException);
        }
    }

    @Override
    protected c a(DataInput dataInput) {
        long l2 = dataInput.readInt();
        c c2 = new c(l2 << 6);
        this.a(dataInput, c2, l2);
        return c2;
    }

    @Override
    protected DataInput a(byte[] arrby) {
        DataInput dataInput = super.a(arrby);
        e.super.b(dataInput);
        return dataInput;
    }
}

