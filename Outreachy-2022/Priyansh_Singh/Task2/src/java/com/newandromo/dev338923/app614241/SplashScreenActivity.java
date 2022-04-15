/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Random
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.newandromo.dev338923.app614241.f;
import java.io.InputStream;
import java.util.Random;

public class SplashScreenActivity
extends Activity {
    private static SplashScreenActivity m;
    final String a = "";
    final int b = 0;
    final int c = 0;
    final int d = 0;
    final int e = 0;
    final int f = 0;
    final int g = 0;
    final String h = "";
    final long i = 0L;
    final long j = 0L;
    final String k = "";
    private final String l = "SplashScreenActivity";
    private long n;
    private Handler o;
    private boolean p = false;
    private Runnable q = new Runnable(){

        public final void run() {
            f.a((Activity)SplashScreenActivity.this, new Runnable(){

                public final void run() {
                    try {
                        SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                        SplashScreenActivity splashScreenActivity2 = SplashScreenActivity.this;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(SplashScreenActivity.this.getPackageName());
                        stringBuilder.append(".");
                        splashScreenActivity.startActivity(new Intent((Context)splashScreenActivity2, Class.forName((String)stringBuilder.toString())));
                    }
                    catch (Exception exception) {}
                    SplashScreenActivity.this.o.post(new Runnable(){

                        public final void run() {
                            SplashScreenActivity.this.finish();
                        }
                    });
                }

            });
        }

    };

    public static int a(float f2, int n2, int n3) {
        int n4 = n2 + Math.round((float)(f2 * 0.0f));
        if (n4 < 0) {
            return 0;
        }
        if (n4 > n3) {
            return n3;
        }
        return n4;
    }

    public static void a(long l2, long l3) {
        if (m != null) {
            SplashScreenActivity splashScreenActivity = m;
            long l4 = Math.max((long)0L, (long)(SplashScreenActivity.b(l2, l3) - (System.currentTimeMillis() - splashScreenActivity.n)));
            splashScreenActivity.o.removeCallbacks(splashScreenActivity.q);
            splashScreenActivity.o.postDelayed(splashScreenActivity.q, l4);
            splashScreenActivity.p = true;
        }
    }

    public static Object[] a(ImageView imageView) {
        Object[] arrobject = new Object[10];
        if (imageView != null && imageView.getDrawable() != null) {
            float[] arrf = new float[9];
            imageView.getImageMatrix().getValues(arrf);
            float f2 = arrf[0];
            float f3 = arrf[4];
            arrobject[6] = Float.valueOf((float)f2);
            arrobject[7] = Float.valueOf((float)f3);
            Drawable drawable = imageView.getDrawable();
            int n2 = drawable.getIntrinsicWidth();
            int n3 = drawable.getIntrinsicHeight();
            arrobject[4] = n2;
            arrobject[5] = n3;
            int n4 = Math.round((float)(f2 * (float)n2));
            int n5 = Math.round((float)(f3 * (float)n3));
            arrobject[2] = n4;
            arrobject[3] = n5;
            int n6 = imageView.getWidth();
            int n7 = imageView.getHeight();
            int n8 = (n7 - n5) / 2;
            arrobject[0] = (n6 - n4) / 2;
            arrobject[1] = n8;
            arrobject[8] = n6;
            arrobject[9] = n7;
            return arrobject;
        }
        return null;
    }

    private static long b(long l2, long l3) {
        return new Random().nextInt(1 + (int)(l3 - l2)) + (int)l2;
    }

    protected void onCreate(Bundle bundle) {
        ImageView imageView;
        ImageView imageView2;
        super.onCreate(bundle);
        m = this;
        this.o = new Handler();
        f.a((Activity)this);
        this.getWindow().getDecorView().setSystemUiVisibility(3846);
        this.setContentView(2131427418);
        imageView2 = (ImageView)this.findViewById(2131296496);
        imageView = (ImageView)this.findViewById(2131296494);
        try {
            imageView2.setImageBitmap(BitmapFactory.decodeStream((InputStream)this.getAssets().open("")));
            imageView.setVisibility(8);
        }
        catch (Exception exception) {}
        final ProgressBar progressBar = (ProgressBar)this.findViewById(2131296495);
        progressBar.post(new Runnable(){

            public final void run() {
                progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor((String)""), PorterDuff.Mode.MULTIPLY);
                Object[] arrobject = SplashScreenActivity.a(imageView2);
                int n2 = SplashScreenActivity.a(((Float)arrobject[6]).floatValue(), (Integer)arrobject[0], (Integer)arrobject[8]);
                int n3 = SplashScreenActivity.a(((Float)arrobject[7]).floatValue(), (Integer)arrobject[1], (Integer)arrobject[9]);
                int n4 = Math.round((float)(0.0f * ((Float)arrobject[6]).floatValue()));
                progressBar.setX((float)n2);
                progressBar.setY((float)n3);
                ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
                layoutParams.height = n4;
                layoutParams.width = n4;
                progressBar.setLayoutParams(layoutParams);
            }
        });
        this.n = System.currentTimeMillis();
        if (!this.p) {
            this.p = true;
            this.o.postDelayed(this.q, SplashScreenActivity.b(0L, 0L));
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        m = null;
        f.f(this);
    }

    protected void onStart() {
        super.onStart();
        f.b(this);
    }

    protected void onStop() {
        super.onStop();
        m = null;
        this.getWindow().getDecorView().setSystemUiVisibility(1792);
    }

}

