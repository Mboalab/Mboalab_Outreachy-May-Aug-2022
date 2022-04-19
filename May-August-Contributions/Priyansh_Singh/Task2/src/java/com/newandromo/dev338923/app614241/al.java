package com.newandromo.dev338923.app614241;

import android.database.Cursor;
import android.support.v7.h.c;

public final class al
extends c.a {
    private final long[] a;
    private final long[] b;

    public al(Cursor cursor, Cursor cursor2, int n2, int n3) {
        this.a = new long[cursor.getCount()];
        this.b = new long[cursor2.getCount()];
        cursor.moveToFirst();
        int n4 = 0;
        int n5 = 0;
        while (!cursor.isAfterLast()) {
            long[] arrl = this.a;
            int n6 = n5 + 1;
            arrl[n5] = cursor.getLong(n2);
            cursor.moveToNext();
            n5 = n6;
        }
        cursor2.moveToFirst();
        while (!cursor2.isAfterLast()) {
            long[] arrl = this.b;
            int n7 = n4 + 1;
            arrl[n4] = cursor2.getLong(n3);
            cursor2.moveToNext();
            n4 = n7;
        }
    }

    public final int a() {
        if (this.a != null) {
            return this.a.length;
        }
        return 0;
    }

    public final boolean a(int n2, int n3) {
        return this.b[n3] == this.a[n2];
    }

    public final int b() {
        if (this.b != null) {
            return this.b.length;
        }
        return 0;
    }

    public final boolean b(int n2, int n3) {
        return this.b[n3] == this.a[n2];
    }

    public final Object c(int n2, int n3) {
        return super.c(n2, n3);
    }
}

