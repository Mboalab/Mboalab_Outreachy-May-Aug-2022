package com.startapp.android.publish.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.startapp.android.publish.adsCommon.Utils.a;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.common.a.e;

public class b
extends LinearLayout {
    public b(Context context) {
        super(context);
    }
    private void a(String string) {
        try {
            int n2 = h.a(this.getContext(), 2);
            int n3 = h.a(this.getContext(), 5);
            ImageView imageView = new ImageView(this.getContext());
            Bitmap bitmap = a.a(this.getContext(), string);
            if (bitmap == null) {
                bitmap = e.a((String)string);
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap)bitmap, (int)h.a(this.getContext(), 15), (int)h.a(this.getContext(), 15), (boolean)true));
            imageView.setPadding(n2, 0, 0, n3);
            this.addView((View)imageView);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    public void setRating(float f2) {
        this.removeAllViews();
        float f3 = (float)Math.round((float)(f2 * 2.0f)) / 2.0f;
        int n2 = (int)Math.floor((double)f3);
        int n3 = f3 - (float)n2 == 0.5f ? 1 : 0;
        int n4 = 5 - n2 - n3;
        for (int i2 = 0; i2 < n2; ++i2) {
            b.super.a("filled_star.png");
        }
        int n5 = 0;
        if (n3 != 0) {
            b.super.a("half_star.png");
        }
        while (n5 < n4) {
            b.super.a("empty_star.png");
            ++n5;
        }
    }
}

