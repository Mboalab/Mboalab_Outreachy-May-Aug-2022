package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.newandromo.dev338923.app614241.cm;
import com.newandromo.dev338923.app614241.d;
import com.newandromo.dev338923.app614241.e;
import com.newandromo.dev338923.app614241.w;

public abstract class af {
    d a;
    boolean b = false;
    boolean c = false;

    protected void a(Activity activity) {
    }

    protected abstract boolean a();

    protected abstract boolean a(Activity var1, View var2);

    public boolean a(Activity activity, ViewGroup viewGroup, int n2) {
        if (activity != null && viewGroup != null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            int n3 = this.b();
            boolean bl = this.a();
            View view = null;
            if (bl) {
                view = null;
                if (layoutInflater != null && (view = layoutInflater.inflate(n3, null)) != null) {
                    this.a(activity, view);
                }
            }
            boolean bl2 = false;
            if (view != null) {
                viewGroup.addView(view);
                switch (1.a[n2 - 1]) {
                    default: {
                        break;
                    }
                    case 2: {
                        if (!e.a.a((Context)activity)) break;
                        Handler handler = new Handler();
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                        translateAnimation.setDuration(500L);
                        translateAnimation.setInterpolator((Interpolator)new AccelerateInterpolator(1.0f));
                        translateAnimation.setAnimationListener((Animation.AnimationListener)new cm(view));
                        handler.postDelayed((Runnable)new w(view, (Animation)translateAnimation), 20000L);
                        break;
                    }
                    case 1: {
                        if (!e.a.a((Context)activity)) break;
                        Handler handler = new Handler();
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                        translateAnimation.setDuration(500L);
                        translateAnimation.setInterpolator((Interpolator)new AccelerateInterpolator(1.0f));
                        translateAnimation.setAnimationListener((Animation.AnimationListener)new cm(view));
                        handler.postDelayed((Runnable)new w(view, (Animation)translateAnimation), 20000L);
                    }
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    protected abstract int b();

}

