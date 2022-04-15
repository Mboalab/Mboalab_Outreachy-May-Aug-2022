/*
 *  
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package com.newandromo.dev338923.app614241;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

final class w
implements Runnable {
    private final WeakReference<View> a;
    private final Animation b;

    public w(View view, Animation animation) {
        this.a = new WeakReference((Object)view);
        this.b = animation;
    }

    public final void run() {
        View view = (View)this.a.get();
        Animation animation = this.b;
        if (view != null && animation != null) {
            if (view.getVisibility() == 8) {
                return;
            }
            view.startAnimation(animation);
        }
    }
}

