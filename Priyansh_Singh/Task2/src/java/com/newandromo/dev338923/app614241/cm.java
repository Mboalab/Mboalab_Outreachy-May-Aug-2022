/*
 *  
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.newandromo.dev338923.app614241;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

final class cm
implements Animation.AnimationListener {
    final WeakReference<View> a;
    final int b;

    public cm(View view) {
        this.a = new WeakReference((Object)view);
        this.b = 8;
    }

    public final void onAnimationEnd(Animation animation) {
        View view = (View)this.a.get();
        if (view != null) {
            view.setVisibility(this.b);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

