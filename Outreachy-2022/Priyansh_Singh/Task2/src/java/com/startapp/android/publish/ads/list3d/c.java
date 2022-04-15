package com.startapp.android.publish.ads.list3d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.android.publish.ads.list3d.Dynamics;
import com.startapp.android.publish.ads.list3d.ListItem;
import com.startapp.android.publish.ads.list3d.b;
import com.startapp.common.a.h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class c
extends AdapterView<Adapter> {
    private int A = Integer.MIN_VALUE;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    protected int a = 0;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected Dynamics j;
    protected float k = 0.0f;
    protected boolean l = false;
    protected boolean m = false;
    protected String n;
    protected String o;
    public BroadcastReceiver p;
    private String q = "List3DView";
    private Adapter r;
    private VelocityTracker s;
    private Runnable t;
    private final LinkedList<View> u = new LinkedList();
    private Runnable v;
    private Rect w;
    private Camera x;
    private Matrix y;
    private Paint z;

    public c(Context context, AttributeSet attributeSet, String string, String string2) {
        super(context, attributeSet);
        this.p = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                int n2 = intent.getIntExtra("getHeight", c.this.getHeight());
                double d2 = c.this.getHeight();
                double d3 = n2;
                Double.isNaN((double)d2);
                Double.isNaN((double)d3);
                double d4 = d2 / d3;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c.this.q);
                stringBuilder.append("Updating Position with Ratio: [");
                stringBuilder.append(d4);
                stringBuilder.append("]");
                h.a((int)3, (String)stringBuilder.toString());
                c.this.a = intent.getIntExtra("mTouchState", c.this.a);
                c.this.b = intent.getIntExtra("mTouchStartX", c.this.b);
                c.this.c = intent.getIntExtra("mTouchStartY", c.this.c);
                c.this.g = intent.getIntExtra("mListRotation", c.this.g);
                c c2 = c.this;
                double d5 = intent.getIntExtra("mFirstItemPosition", c.this.h);
                Double.isNaN((double)d5);
                c2.h = (int)(d5 * d4);
                c c3 = c.this;
                --c3.h;
                c c4 = c.this;
                double d6 = intent.getIntExtra("mLastItemPosition", c.this.i);
                Double.isNaN((double)d6);
                c4.i = (int)(d6 * d4);
                c c5 = c.this;
                --c5.i;
                c c6 = c.this;
                double d7 = intent.getIntExtra("mListTop", c.this.e);
                Double.isNaN((double)d7);
                c6.e = (int)(d7 * d4);
                c c7 = c.this;
                double d8 = intent.getIntExtra("mListTopStart", c.this.d);
                Double.isNaN((double)d8);
                c7.d = (int)(d8 * d4);
                c c8 = c.this;
                double d9 = intent.getIntExtra("mListTopOffset", c.this.f);
                Double.isNaN((double)d9);
                c8.f = (int)(d9 * d4);
                c.this.j = (Dynamics)intent.getParcelableExtra("mDynamics");
                c.this.k = intent.getFloatExtra("mLastVelocity", c.this.k);
                c.this.j.a(d4);
                ArrayList arrayList = intent.getParcelableArrayListExtra("list");
                b b2 = new b(c.this.getContext(), (List<ListItem>)arrayList, "home", c.this.n, c.this.o);
                c.this.setAdapter((Adapter)b2);
                c.this.l = true;
                c.this.m = true;
                c.this.a(c.this.k, true);
                com.startapp.common.b.a((Context)context).a((BroadcastReceiver)this);
            }
        };
        this.n = string;
        this.o = string2;
    }

    private LightingColorFilter a(float f2) {
        double d2 = f2;
        Double.isNaN((double)d2);
        double d3 = Math.cos((double)(d2 * 3.141592653589793 / 180.0));
        int n2 = 55 + (int)(d3 * 200.0);
        int n3 = (int)(70.0 * Math.pow((double)d3, (double)200.0));
        if (n2 > 255) {
            n2 = 255;
        }
        if (n3 > 255) {
            n3 = 255;
        }
        return new LightingColorFilter(Color.rgb((int)n2, (int)n2, (int)n2), Color.rgb((int)n3, (int)n3, (int)n3));
    }

    private void a(Canvas canvas, Bitmap bitmap, int n2, int n3, int n4, int n5, float f2, float f3) {
        if (this.x == null) {
            this.x = new Camera();
        }
        this.x.save();
        this.x.translate(0.0f, 0.0f, (float)n5);
        this.x.rotateX(f3);
        Camera camera = this.x;
        float f4 = -n5;
        camera.translate(0.0f, 0.0f, f4);
        if (this.y == null) {
            this.y = new Matrix();
        }
        this.x.getMatrix(this.y);
        this.x.restore();
        this.y.preTranslate((float)(-n4), f4);
        this.y.postScale(f2, f2);
        this.y.postTranslate((float)(n3 + n4), (float)(n2 + n5));
        if (this.z == null) {
            this.z = new Paint();
            this.z.setAntiAlias(true);
            this.z.setFilterBitmap(true);
        }
        this.z.setColorFilter((ColorFilter)c.super.a(f3));
        canvas.drawBitmap(bitmap, this.y, this.z);
    }

    private void a(MotionEvent motionEvent) {
        this.removeCallbacks(this.t);
        this.b = (int)motionEvent.getX();
        this.c = (int)motionEvent.getY();
        this.d = this.a(this.getChildAt(0)) - this.f;
        c.super.g();
        this.s = VelocityTracker.obtain();
        this.s.addMovement(motionEvent);
        this.a = 1;
    }

    private void a(View view, int n2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int n3 = n2 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        this.addViewInLayout(view, n3, layoutParams, true);
        view.measure(1073741824 | (int)(0.85f * (float)this.getWidth()), 0);
    }

    private int b(View view) {
        return (int)(0.35000002f * (float)view.getMeasuredHeight() / 2.0f);
    }

    private void b(float f2) {
        this.a(f2, false);
    }

    private void b(int n2, int n3) {
        int n4 = this.a(n2, n3);
        if (n4 != -1) {
            View view = this.getChildAt(n4);
            int n5 = n4 + this.h;
            this.performItemClick(view, n5, this.r.getItemId(n5));
        }
    }

    private boolean b(MotionEvent motionEvent) {
        int n2 = (int)motionEvent.getX();
        int n3 = (int)motionEvent.getY();
        if (n2 >= -10 + this.b && n2 <= 10 + this.b && n3 >= -10 + this.c && n3 <= 10 + this.c) {
            return false;
        }
        this.removeCallbacks(this.v);
        this.a = 2;
        return true;
    }

    private int c(View view) {
        return view.getBottom() + c.super.b(view);
    }

    private void c(int n2) {
        int n3 = this.getChildCount();
        if (this.i != this.r.getCount() - 1 && n3 > 1) {
            View view = this.getChildAt(0);
            while (view != null && n2 + c.super.c(view) < 0) {
                this.removeViewInLayout(view);
                this.u.addLast((Object)view);
                this.h = 1 + this.h;
                this.f += c.super.d(view);
                if (--n3 > 1) {
                    view = this.getChildAt(0);
                    continue;
                }
                view = null;
            }
        }
        if (this.h != 0 && n3 > 1) {
            View view = this.getChildAt(n3 - 1);
            while (view != null && n2 + this.a(view) > this.getHeight()) {
                this.removeViewInLayout(view);
                this.u.addLast((Object)view);
                --this.i;
                if (--n3 > 1) {
                    view = this.getChildAt(n3 - 1);
                    continue;
                }
                view = null;
            }
        }
    }

    private void c(int n2, int n3) {
        while (n2 + n3 < this.getHeight() && this.i < -1 + this.r.getCount()) {
            this.i = 1 + this.i;
            View view = this.r.getView(this.i, c.super.getCachedView(), (ViewGroup)this);
            c.super.a(view, 0);
            n2 += c.super.d(view);
        }
    }

    private int d(View view) {
        return view.getMeasuredHeight() + 2 * c.super.b(view);
    }

    private void d(int n2) {
        c.super.c(c.super.c(this.getChildAt(-1 + this.getChildCount())), n2);
        c.super.d(this.a(this.getChildAt(0)), n2);
    }

    private void d(int n2, int n3) {
        while (n2 + n3 > 0 && this.h > 0) {
            --this.h;
            View view = this.r.getView(this.h, c.super.getCachedView(), (ViewGroup)this);
            c.super.a(view, 1);
            int n4 = c.super.d(view);
            n2 -= n4;
            this.f -= n4;
        }
    }

    private boolean d() {
        return com.startapp.common.a.c.a();
    }

    private void e() {
        if (!this.D) {
            this.D = true;
            this.dispatchTouchEvent(MotionEvent.obtain((long)System.currentTimeMillis(), (long)System.currentTimeMillis(), (int)0, (float)0.0f, (float)0.0f, (int)0));
            this.postDelayed(new Runnable(){

                public void run() {
                    MotionEvent motionEvent = MotionEvent.obtain((long)System.currentTimeMillis(), (long)System.currentTimeMillis(), (int)2, (float)0.0f, (float)-20.0f, (int)0);
                    c.this.dispatchTouchEvent(motionEvent);
                    MotionEvent motionEvent2 = MotionEvent.obtain((long)System.currentTimeMillis(), (long)System.currentTimeMillis(), (int)1, (float)0.0f, (float)-20.0f, (int)0);
                    c.this.dispatchTouchEvent(motionEvent2);
                }
            }, 5L);
        }
    }

    private void f() {
        int n2 = this.g % 90;
        int n3 = n2 < 45 ? -(this.g - n2) * this.getHeight() / 270 : -(90 + this.g - n2) * this.getHeight() / 270;
        if (this.A == Integer.MIN_VALUE && this.i == -1 + this.r.getCount() && this.c(this.getChildAt(-1 + this.getChildCount())) < this.getHeight()) {
            this.A = n3;
        }
        if (n3 > 0) {
            n3 = 0;
        } else if (n3 < this.A) {
            n3 = this.A;
        }
        Dynamics dynamics = this.j;
        float f2 = n3;
        dynamics.a(f2);
        this.j.b(f2);
    }

    private void g() {
        if (this.v == null) {
            this.v = new Runnable(){

                public void run() {
                    int n2;
                    if (c.this.a == 1 && (n2 = c.this.a(c.this.b, c.this.c)) != -1) {
                        c.this.b(n2);
                    }
                }
            };
        }
        this.postDelayed(this.v, (long)ViewConfiguration.getLongPressTimeout());
    }

    private View getCachedView() {
        if (this.u.size() != 0) {
            return (View)this.u.removeFirst();
        }
        return null;
    }

    private void h() {
        int n2 = this.e + this.f;
        float f2 = 0.0f * (float)this.getWidth();
        float f3 = 1.0f / (0.9f * (float)this.getHeight());
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            View view = this.getChildAt(i2);
            double d2 = f2;
            double d3 = f3;
            Double.isNaN((double)d3);
            double d4 = d3 * 6.283185307179586;
            double d5 = n2;
            Double.isNaN((double)d5);
            double d6 = Math.sin((double)(d4 * d5));
            Double.isNaN((double)d2);
            int n3 = (int)(d2 * d6);
            int n4 = view.getMeasuredWidth();
            int n5 = view.getMeasuredHeight();
            int n6 = n3 + (this.getWidth() - n4) / 2;
            int n7 = this.b(view);
            int n8 = n2 + n7;
            view.layout(n6, n8, n4 + n6, n8 + n5);
            n2 += n5 + n7 * 2;
        }
    }

    protected int a(int n2, int n3) {
        if (this.w == null) {
            this.w = new Rect();
        }
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            this.getChildAt(i2).getHitRect(this.w);
            if (!this.w.contains(n2, n3)) continue;
            return i2;
        }
        return -1;
    }

    protected int a(View view) {
        return view.getTop() - c.super.b(view);
    }

    public void a() {
        this.l = true;
    }

    protected void a(float f2, boolean bl) {
        if (this.s == null && !bl) {
            return;
        }
        if (this.s != null) {
            this.s.recycle();
        }
        this.s = null;
        this.removeCallbacks(this.v);
        if (this.t == null) {
            this.t = new Runnable(){

                public void run() {
                    if (c.this.j == null) {
                        return;
                    }
                    View view = c.this.getChildAt(0);
                    if (view != null) {
                        c.this.d = c.this.a(view) - c.this.f;
                        c.this.j.a(AnimationUtils.currentAnimationTimeMillis());
                        c.this.a((int)c.this.j.a() - c.this.d);
                    }
                    if (!c.this.j.a(0.5f, 0.4f)) {
                        c.this.postDelayed((Runnable)this, 16L);
                    }
                }
            };
        }
        if (this.j != null) {
            if (!bl) {
                this.j.a(this.e, f2, AnimationUtils.currentAnimationTimeMillis());
            }
            this.post(this.t);
        }
        this.a = 0;
    }

    protected void a(int n2) {
        this.e = n2 + this.d;
        this.g = -(270 * this.e) / this.getHeight();
        c.super.f();
        this.requestLayout();
    }

    protected void b(int n2) {
        View view = this.getChildAt(n2);
        int n3 = n2 + this.h;
        long l2 = this.r.getItemId(n3);
        AdapterView.OnItemLongClickListener onItemLongClickListener = this.getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick((AdapterView)this, view, n3, l2);
        }
    }

    public boolean b() {
        return this.C;
    }

    public boolean c() {
        return this.B;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    protected boolean drawChild(Canvas canvas, View view, long l2) {
        float f2;
        Bitmap bitmap = view.getDrawingCache();
        if (bitmap == null) {
            return super.drawChild(canvas, view, l2);
        }
        int n2 = view.getTop();
        int n3 = view.getLeft();
        int n4 = view.getWidth();
        int n5 = view.getHeight();
        int n6 = n4 / 2;
        int n7 = n5 / 2;
        float f3 = this.getHeight() / 2;
        float f4 = ((float)(n2 + n7) - f3) / f3;
        float f5 = (float)(1.0 - 0.15000000596046448 * (1.0 - Math.cos((double)f4)));
        float f6 = ((float)this.g - f4 * 20.0f) % 90.0f;
        if (f6 < 0.0f) {
            f6 += 90.0f;
        }
        if ((f2 = f6) < 45.0f) {
            c.super.a(canvas, bitmap, n2, n3, n6, n7, f5, f2 - 90.0f);
            c.super.a(canvas, bitmap, n2, n3, n6, n7, f5, f2);
        } else {
            c.super.a(canvas, bitmap, n2, n3, n6, n7, f5, f2);
            c.super.a(canvas, bitmap, n2, n3, n6, n7, f5, f2 - 90.0f);
        }
        return false;
    }

    public Adapter getAdapter() {
        return this.r;
    }

    public int getFirstItemPosition() {
        return this.h;
    }

    public int getLastItemPosition() {
        return this.i;
    }

    public View getSelectedView() {
        return null;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.t);
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        if (this.l) {
            if (this.r == null) {
                return;
            }
            if (this.getChildCount() == 0) {
                if (this.b()) {
                    this.e = this.getHeight() / 3;
                }
                if (!this.m) {
                    this.i = -1;
                } else {
                    this.i = this.h;
                    this.h = 1 + this.h;
                }
                this.c(this.e, 0);
            } else {
                int n6 = this.e + this.f - this.a(this.getChildAt(0));
                this.c(n6);
                this.d(n6);
            }
            this.h();
            if (this.b()) {
                this.e();
            }
            this.invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.getChildCount() == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            default: {
                c.super.b(0.0f);
                return true;
            }
            case 2: {
                if (this.a == 1) {
                    c.super.b(motionEvent);
                }
                if (this.a != 2) break;
                this.s.addMovement(motionEvent);
                this.a((int)motionEvent.getY() - this.c);
                return true;
            }
            case 1: {
                float f2;
                if (this.a == 1) {
                    c.super.b((int)motionEvent.getX(), (int)motionEvent.getY());
                    f2 = 0.0f;
                } else {
                    int n2 = this.a;
                    f2 = 0.0f;
                    if (n2 == 2) {
                        this.s.addMovement(motionEvent);
                        this.s.computeCurrentVelocity(1000);
                        this.k = f2 = this.s.getYVelocity();
                    }
                }
                c.super.b(f2);
                return true;
            }
            case 0: {
                if (c.super.d()) {
                    com.startapp.common.a.c.a((View)this, (long)1500L);
                }
                c.super.a(motionEvent);
            }
        }
        return true;
    }

    public void setAdapter(Adapter adapter) {
        if (c.super.d() && this.c()) {
            com.startapp.common.a.c.a((View)this, (float)0.0f);
        }
        this.r = adapter;
        this.removeAllViewsInLayout();
        this.requestLayout();
    }

    public void setDynamics(Dynamics dynamics) {
        if (this.j != null) {
            dynamics.a(this.j.a(), this.j.b(), AnimationUtils.currentAnimationTimeMillis());
        }
        this.j = dynamics;
    }

    public void setFade(boolean bl) {
        this.B = bl;
    }

    public void setHint(boolean bl) {
        this.C = bl;
    }

    public void setSelection(int n2) {
        throw new UnsupportedOperationException("Not supported");
    }

    public void setTag(String string) {
        this.q = string;
    }

}

