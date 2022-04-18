package com.newandromo.dev338923.app614241;

import android.database.Cursor;
import android.os.Parcelable;
import android.support.v7.h.c;
import android.support.v7.widget.RecyclerView;
import com.newandromo.dev338923.app614241.al;
import com.newandromo.dev338923.app614241.bc;
import com.newandromo.dev338923.app614241.bd;

public abstract class am<T extends bc>
extends bd<T> {
    protected boolean a;
    protected Cursor b;
    protected int c;

    public final Cursor a(Cursor cursor) {
        if (cursor == this.b) {
            return null;
        }
        Cursor cursor2 = this.b;
        this.b = cursor;
        if (cursor != null) {
            this.c = cursor.getColumnIndexOrThrow("_id");
            this.a = true;
            if (cursor2 != null) {
                c.b b2 = c.b((c.a)new al(cursor2, cursor, cursor2.getColumnIndexOrThrow("_id"), this.c));
                Parcelable parcelable = this.d.getLayoutManager().onSaveInstanceState();
                b2.a((RecyclerView.Adapter)this);
                this.d.getLayoutManager().onRestoreInstanceState(parcelable);
                return cursor2;
            }
            this.notifyItemRangeInserted(0, cursor.getCount());
            return cursor2;
        }
        this.c = -1;
        this.a = false;
        this.notifyItemRangeRemoved(0, this.getItemCount());
        return cursor2;
    }

    public int getItemCount() {
        if (this.a && this.b != null) {
            return this.b.getCount();
        }
        return 0;
    }
}

