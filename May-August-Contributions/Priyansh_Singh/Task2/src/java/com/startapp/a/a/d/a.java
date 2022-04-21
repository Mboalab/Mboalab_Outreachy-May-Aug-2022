/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.zip.GZIPOutputStream
 */
package com.startapp.a.a.d;

import com.startapp.a.a.c.d;
import com.startapp.a.a.d.c;
import com.startapp.a.a.d.e;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class a
implements e {
    private final c a;

    public a(c c2) {
        this.a = c2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public String a(String string) {
        GZIPOutputStream gZIPOutputStream;
        block7 : {
            GZIPOutputStream gZIPOutputStream2;
            void var5_9;
            Exception exception2;
            block6 : {
                String string2;
                gZIPOutputStream = null;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream2 = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(string.getBytes());
                    d.a((OutputStream)gZIPOutputStream2);
                    String string3 = com.startapp.a.a.c.a.a(byteArrayOutputStream.toByteArray());
                    string2 = this.a.a(string3);
                }
                catch (Throwable throwable) {
                    break block6;
                }
                catch (Exception exception2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    break block7;
                }
                d.a((OutputStream)gZIPOutputStream2);
                return string2;
                catch (Throwable throwable) {
                    gZIPOutputStream2 = null;
                }
            }
            d.a(gZIPOutputStream2);
            throw var5_9;
            catch (Exception exception2) {
                // empty catch block
            }
        }
        d.a(gZIPOutputStream);
        return "";
    }
}

