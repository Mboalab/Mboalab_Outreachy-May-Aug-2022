
package com.startapp.a.a.a;

import com.startapp.a.a.a.b;
import com.startapp.a.a.a.c;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class a {
    private final int a;
    private final int b;

    public a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    private void a(ByteBuffer byteBuffer, c c2) {
        long[] arrl = a.super.a(byteBuffer, c2.a());
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            c2.a(arrl[i2]);
        }
    }

    private long[] a(ByteBuffer byteBuffer, long l2) {
        long[] arrl = new long[this.a];
        long l3 = l2 / (long)this.a;
        long l4 = b.a(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long l5 = b.a(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), l4);
        for (int i2 = 0; i2 < this.a; ++i2) {
            long l6 = i2;
            arrl[i2] = l6 * l3 + Math.abs((long)((l4 + l6 * l5) % l3));
        }
        return arrl;
    }

    public c a(List<String> list) {
        c c2 = new c(this.a * this.b);
        this.a(list, c2);
        return c2;
    }

    void a(List<String> list, c c2) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            a.super.a(ByteBuffer.wrap((byte[])((String)iterator.next()).getBytes()), c2);
        }
    }
}

