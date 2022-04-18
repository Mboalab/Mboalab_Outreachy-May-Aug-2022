/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$Adapter
 *  android.util.AttributeSet
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class DetachingRecyclerView
extends RecyclerView {
    public DetachingRecyclerView(Context context) {
        super(context);
    }

    public DetachingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetachingRecyclerView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.swapAdapter(null, true);
    }
}

