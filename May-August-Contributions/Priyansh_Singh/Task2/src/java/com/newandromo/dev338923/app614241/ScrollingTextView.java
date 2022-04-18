/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.widget.TextView
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScrollingTextView
extends TextView {
    public ScrollingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollingTextView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public boolean isFocused() {
        return true;
    }

    protected void onFocusChanged(boolean bl, int n2, Rect rect) {
        if (bl) {
            super.onFocusChanged(bl, n2, rect);
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        if (bl) {
            super.onWindowFocusChanged(bl);
        }
    }
}

