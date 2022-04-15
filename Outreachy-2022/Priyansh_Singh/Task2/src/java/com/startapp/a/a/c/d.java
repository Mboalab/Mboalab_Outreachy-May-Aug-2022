
package com.startapp.a.a.c;

import com.startapp.a.a.c.e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class d {
    public static final char a = File.separatorChar;
    public static final String b;

    static {
        e e2 = new e(4);
        PrintWriter printWriter = new PrintWriter((Writer)e2);
        printWriter.println();
        b = e2.toString();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
    }

    public static void a(OutputStream outputStream) {
        d.a((Closeable)outputStream);
    }
}

