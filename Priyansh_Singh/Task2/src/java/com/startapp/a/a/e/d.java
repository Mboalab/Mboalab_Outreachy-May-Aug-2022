/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.DataInput
 *  java.io.DataInputStream
 *  java.io.InputStream
 *  java.io.PrintStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.startapp.a.a.e;

import com.startapp.a.a.e.c;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public abstract class d {
    private final c a = new c();

    protected abstract com.startapp.a.a.a.c a(DataInput var1);

    public com.startapp.a.a.a.c a(String string) {
        byte[] arrby;
        block5 : {
            if (string == null) {
                return null;
            }
            try {
                arrby = this.a.a(string);
                if (arrby != null) break block5;
                return null;
            }
            catch (Exception exception) {
                if (exception.getMessage() != null && exception.getMessage().contains((CharSequence)"HighPageCountException")) {
                    PrintStream printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder("HighPageCountException (PLM-2573) ");
                    stringBuilder.append(exception.getMessage());
                    stringBuilder.append(", bad bloom token: ");
                    stringBuilder.append(string);
                    printStream.println(stringBuilder.toString());
                }
                return null;
            }
        }
        com.startapp.a.a.a.c c2 = this.a(this.a(arrby));
        return c2;
    }

    protected DataInput a(byte[] arrby) {
        return new DataInputStream((InputStream)new ByteArrayInputStream(arrby));
    }

    protected void a(DataInput dataInput, com.startapp.a.a.a.c c2, long l2) {
        int n2 = c2.c();
        long l3 = l2;
        block0 : for (int i2 = 0; i2 < n2; ++i2) {
            long[] arrl = c2.a(i2);
            long l4 = l3;
            for (int i3 = 0; i3 < 4096; ++i3) {
                long l5 = l4 - 1L;
                if (l4 > 0L) {
                    arrl[i3] = dataInput.readLong();
                    l4 = l5;
                    continue;
                }
                l3 = l5;
                continue block0;
            }
            l3 = l4;
        }
    }
}

