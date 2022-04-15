/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$ItemDecoration
 *  android.support.v7.widget.RecyclerView$State
 *  android.view.View
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.newandromo.dev338923.app614241.aq;

public final class br
extends RecyclerView.ItemDecoration {
    private int a;

    public br(Context context, float f2) {
        this.a = aq.a(context, f2 / 2.0f);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getPaddingLeft() != this.a) {
            recyclerView.setPadding(this.a, this.a, this.a, this.a);
            recyclerView.setClipToPadding(false);
        }
        rect.top = this.a;
        rect.bottom = this.a;
        rect.left = this.a;
        rect.right = this.a;
    }
}

