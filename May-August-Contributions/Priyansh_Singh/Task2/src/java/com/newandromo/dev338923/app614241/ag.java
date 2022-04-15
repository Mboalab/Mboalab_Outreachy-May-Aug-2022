package com.newandromo.dev338923.app614241;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public final class ag {
    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
            return;
        }
        view.setBackgroundDrawable(drawable);
    }
}

