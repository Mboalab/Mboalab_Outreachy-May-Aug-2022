/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.PaintDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.ShapeDrawable$ShaderFactory
 *  android.graphics.drawable.shapes.RectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.util.LruCache
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.LruCache;

public final class cl {
    private static final LruCache<Integer, Drawable> a = new LruCache(10);

    public static Drawable a() {
        Drawable drawable = (Drawable)a.get((Object)-1526726204);
        if (drawable != null) {
            return drawable;
        }
        int n2 = Math.max((int)12, (int)2);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape((Shape)new RectShape());
        int[] arrn = new int[n2];
        int n3 = Color.red((int)-452984832);
        int n4 = Color.green((int)-452984832);
        int n5 = Color.blue((int)-452984832);
        int n6 = Color.alpha((int)-452984832);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = Color.argb((int)((int)(Math.max((float)0.0f, (float)Math.min((float)1.0f, (float)((float)Math.pow((double)(1.0f * (float)i2 / (float)(n2 - 1)), (double)3.0)))) * (float)n6)), (int)n3, (int)n4, (int)n5);
        }
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory(arrn){
            final /* synthetic */ float a;
            final /* synthetic */ float b;
            final /* synthetic */ float c;
            final /* synthetic */ float d;
            final /* synthetic */ int[] e;
            {
                this.a = 0.0f;
                this.b = 0.0f;
                this.c = 0.0f;
                this.d = 1.0f;
                this.e = arrn;
            }

            public final Shader resize(int n2, int n3) {
                float f2 = n2;
                float f3 = f2 * this.a;
                float f4 = n3;
                LinearGradient linearGradient = new LinearGradient(f3, f4 * this.b, f2 * this.c, f4 * this.d, this.e, null, Shader.TileMode.CLAMP);
                return linearGradient;
            }
        });
        a.put((Object)-1526726204, (Object)paintDrawable);
        return paintDrawable;
    }

}

