/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.databinding.a
 *  android.graphics.Bitmap
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.TransitionDrawable
 *  android.support.v7.d.b
 *  android.view.View
 *  android.widget.ImageView
 *  com.bumptech.glide.a
 *  com.bumptech.glide.b
 *  com.bumptech.glide.c
 *  com.bumptech.glide.d
 *  com.bumptech.glide.e
 *  com.bumptech.glide.f.a.c
 *  com.bumptech.glide.f.b
 *  com.bumptech.glide.f.b.i
 *  com.bumptech.glide.g.a
 *  com.bumptech.glide.g.b
 *  com.bumptech.glide.h
 *  com.bumptech.glide.h$a
 *  com.bumptech.glide.h$a$a
 *  com.bumptech.glide.load.a
 *  com.bumptech.glide.load.b
 *  com.bumptech.glide.load.b.a.c
 *  com.bumptech.glide.load.b.b
 *  com.bumptech.glide.load.c
 *  com.bumptech.glide.load.c.b.f
 *  com.bumptech.glide.load.c.l
 *  com.bumptech.glide.load.c.o
 *  com.bumptech.glide.load.e
 *  com.bumptech.glide.load.f
 *  com.bumptech.glide.load.resource.a.b
 *  com.bumptech.glide.load.resource.b.c
 *  com.bumptech.glide.load.resource.bitmap.f
 *  com.bumptech.glide.load.resource.bitmap.p
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.Set
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.d;
import com.bumptech.glide.f.b.i;
import com.bumptech.glide.h;
import com.bumptech.glide.load.c.l;
import com.bumptech.glide.load.c.o;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.b.c;
import com.bumptech.glide.load.resource.bitmap.p;
import com.newandromo.dev338923.app614241.aa;
import com.newandromo.dev338923.app614241.ab;
import com.newandromo.dev338923.app614241.ad;
import com.newandromo.dev338923.app614241.aj;
import com.newandromo.dev338923.app614241.bh;
import com.newandromo.dev338923.app614241.bi;
import com.newandromo.dev338923.app614241.bt;
import com.newandromo.dev338923.app614241.bv;
import com.newandromo.dev338923.app614241.bw;
import com.newandromo.dev338923.app614241.bx;
import com.newandromo.dev338923.app614241.by;
import com.newandromo.dev338923.app614241.bz;
import com.newandromo.dev338923.app614241.ca;
import com.newandromo.dev338923.app614241.cd;
import com.newandromo.dev338923.app614241.ce;
import com.newandromo.dev338923.app614241.cq;
import com.newandromo.dev338923.app614241.cv;
import com.newandromo.dev338923.app614241.cw;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Set;

public abstract class bc
extends android.databinding.a
implements ca {
    private static int n = 229;
    private final boolean a;
    public final int b;
    public final int c;
    protected final boolean d;
    public bz e;
    public ad f;
    public WeakReference<Context> g;
    public bh h;
    public bi i;
    public Set<ce> j;
    private final int k;
    private final int l;
    private final int m;
    private com.bumptech.glide.c<String, InputStream, android.support.v7.d.b, android.support.v7.d.b> o;
    private cq p;

    protected <T extends bc, B extends a<T, B>> bc(a<T, B> a2) {
        this.b = a2.a;
        this.c = a2.b;
        this.d = a2.c;
        this.a = a2.d;
        this.k = a2.e;
        this.l = a2.f;
        this.m = a2.g;
        this.h = a2.h;
        this.i = a2.i;
        if (a2.j != null) {
            this.a(a2.j);
        }
    }

    private void a(int n2, aa aa2) {
        if (n2 >= 0) {
            aa aa3;
            if (n2 > 9) {
                return;
            }
            if (this.f == null) {
                this.f = new ab(this.m);
            }
            boolean bl2 = (aa3 = this.f.a(n2)) != null ? true ^ aa3.equals(aa2) : true;
            this.f.a(n2, aa2);
            if (bl2) {
                switch (n2) {
                    default: {
                        return;
                    }
                    case 9: {
                        this.a(44);
                        return;
                    }
                    case 8: {
                        this.a(41);
                        return;
                    }
                    case 7: {
                        this.a(43);
                        return;
                    }
                    case 6: {
                        this.a(48);
                        return;
                    }
                    case 5: {
                        this.a(50);
                        return;
                    }
                    case 4: {
                        this.a(45);
                        return;
                    }
                    case 3: {
                        this.a(47);
                        return;
                    }
                    case 2: {
                        this.a(53);
                        return;
                    }
                    case 1: {
                        this.a(54);
                        return;
                    }
                    case 0: 
                }
                this.a(51);
                this.a(1);
                this.a(39);
                return;
            }
            return;
        }
    }

    public static void a(ImageView imageView, a a2) {
        if (a2 != null) {
            b b2 = a2.b();
            if (imageView != null) {
                if (b2.b != null) {
                    b2.b.a(imageView, b2);
                    return;
                }
                throw new IllegalArgumentException("imageInfo.item is null");
            }
            throw new IllegalArgumentException("target imageView is null");
        }
    }

    private void a(final ImageView imageView, final b b2) {
        if (imageView == null) {
            return;
        }
        if (b2 != null) {
            if (b2.q()) {
                boolean bl2;
                Context context = imageView.getContext();
                if (this.d && (bl2 = b2.e >= 0 && b2.a(33825, 31))) {
                    int n2 = b2.e;
                    bz bz2 = this.e;
                    boolean bl3 = false;
                    if (bz2 != null) {
                        android.support.v7.d.b b3 = this.e.a(n2);
                        bl3 = false;
                        if (b3 != null) {
                            bl3 = true;
                        }
                    }
                    if (!bl3) {
                        if (b2 != null) {
                            String string = b2.c;
                            com.bumptech.glide.load.c c2 = b2.d;
                            if (string != null && c2 != null) {
                                com.bumptech.glide.f.b b4;
                                com.bumptech.glide.c<String, InputStream, android.support.v7.d.b, android.support.v7.d.b> c3;
                                if (this.p != null) {
                                    com.bumptech.glide.e.a((i)this.p);
                                }
                                if ((b4 = ce.a((View)imageView)) != null) {
                                    b4.c();
                                }
                                ce ce2 = new ce((View)imageView, (ca)this, b2.e);
                                if (this.j != null) {
                                    this.j.add((Object)ce2);
                                }
                                Context context2 = imageView.getContext();
                                if (this.o == null) {
                                    this.o = com.bumptech.glide.e.b((Context)context2).a((l)new com.bumptech.glide.load.c.b.f(context2), InputStream.class).a(String.class).a(android.support.v7.d.b.class).b(com.bumptech.glide.load.b.b.a).a((f)new bw(new by())).a((com.bumptech.glide.load.b)new o()).a((e)new c((e)new bv(new bx(), (e<InputStream, Bitmap>)new p(com.bumptech.glide.load.resource.bitmap.f.b, com.bumptech.glide.e.a((Context)context2).b, com.bumptech.glide.load.a.d)))).b(256, 256).h().g();
                                    c3 = this.o;
                                } else {
                                    c3 = this.o.f();
                                }
                                c3.b(c2).b((Object)string).a((i)ce2);
                            }
                        }
                    } else {
                        bc.super.b(b2.e);
                    }
                }
                if (b2.o != -1 && b2.q != 0) {
                    b2.b.a(b2.o, new aa(b2.q));
                }
                boolean bl4 = cv.a(b2.c);
                com.bumptech.glide.b b5 = com.bumptech.glide.e.b((Context)context).a(String.class);
                com.bumptech.glide.load.b.b b6 = bl4 ? com.bumptech.glide.load.b.b.b : com.bumptech.glide.load.b.b.a;
                com.bumptech.glide.a a2 = b5.a(b6).d().b(b2.f).c(b2.i).c().a(b2.d).a((Object)b2.c);
                ColorStateList colorStateList = b2.h() ? b2.k : null;
                ColorStateList colorStateList2 = b2.i() ? b2.l : null;
                boolean bl5 = b2.k();
                ColorStateList colorStateList3 = null;
                if (bl5) {
                    colorStateList3 = b2.n;
                }
                cw cw2 = new cw(imageView, colorStateList, colorStateList2, colorStateList3, 131204 & (135300 & b2.t)){

                    @Override
                    public final void a(com.bumptech.glide.load.resource.a.b b22, com.bumptech.glide.f.a.c<? super com.bumptech.glide.load.resource.a.b> c2) {
                        super.a(b22, c2);
                        if (b2.o != -1 && b2.p != 0) {
                            b2.b.a(b2.o, new aa(b2.p));
                        }
                        bc.c();
                    }

                    @Override
                    public final void a(Exception exception, Drawable drawable) {
                        super.a(exception, drawable);
                        if (b2.o != -1 && b2.s != 0) {
                            b2.b.a(b2.o, new aa(b2.s));
                        }
                        bc.this.b(imageView, b2);
                    }

                    public final void c(Drawable drawable) {
                        if (drawable != null) {
                            boolean bl2 = drawable.getOpacity() == -1;
                            if (b2.a(270600, 31) && bl2 && drawable instanceof TransitionDrawable) {
                                ((TransitionDrawable)drawable).setCrossFadeEnabled(false);
                            }
                        }
                        super.c(drawable);
                    }
                };
                a2.a((i)cw2);
                return;
            }
            com.bumptech.glide.f.b b7 = ce.a((View)imageView);
            if (b7 != null) {
                b7.c();
            }
            bc.super.b(imageView, b2);
            return;
        }
        imageView.setImageDrawable(null);
    }

    private static com.bumptech.glide.load.c b(Context context) {
        if (context != null) {
            return com.bumptech.glide.g.a.a((Context)context);
        }
        return null;
    }

    private void b(int n2) {
        switch (n2) {
            default: {
                return;
            }
            case 9: {
                this.a(31);
                return;
            }
            case 8: {
                this.a(28);
                return;
            }
            case 7: {
                this.a(29);
                return;
            }
            case 6: {
                this.a(24);
                return;
            }
            case 5: {
                this.a(26);
                return;
            }
            case 4: {
                this.a(21);
                return;
            }
            case 3: {
                this.a(23);
                return;
            }
            case 2: {
                this.a(18);
                return;
            }
            case 1: {
                this.a(19);
                return;
            }
            case 0: 
        }
        this.a(17);
        this.a(5);
        this.a(39);
    }

    private void b(ImageView imageView, b b2) {
        if (imageView == null) {
            return;
        }
        if (b2 != null) {
            if (b2.j != null && b2.j instanceof b) {
                b b3;
                if (b2.e() && b2.j.f() && b2.j.g()) {
                    a a2 = new a(b2.j);
                    if (b2.j.b != this) {
                        a2.a = this;
                    }
                    if (b2.j.l == null && !b2.j.a() && b2.j.i()) {
                        a2.b(b2.l);
                    }
                    if (b2.j.m == null && !b2.j.b() && b2.j.j()) {
                        a2.c(b2.m);
                    }
                    if (b2.j.n == null && !b2.j.c() && b2.j.k()) {
                        a2.d(b2.n);
                    }
                    if (b2.j.k == null && !b2.j.d() && b2.j.h()) {
                        a2.a(b2.k);
                    }
                    if (b2.j.o == -1) {
                        a2.n = b2.o;
                    }
                    if (b2.j.p == 0) {
                        a2.q = b2.r;
                    }
                    b3 = a2.b();
                } else {
                    b3 = b2.j.b != this ? b2.j.a((bc)this) : b2.j;
                }
                bc.super.c(b2.e);
                bc.super.a(imageView, b3);
                return;
            }
            if (b2.i != 0) {
                a a3 = new a(b2);
                a3.a = this;
                a3.b = cv.f(imageView.getContext(), b2.i);
                a3.c = bc.b(imageView.getContext());
                a a4 = a3.a(b2.m).a(b2.j());
                a4.g = b2.h;
                if (!b2.n()) {
                    a a5 = a4.c(b2.l());
                    a5.o = b2.r;
                    a5.b(b2.o()).a(b2.m).a(b2.j());
                }
                a4.a();
                bc.super.c(b2.e);
                bc.super.a(imageView, a4.b());
                return;
            }
            if (b2.h != 0) {
                imageView.setImageDrawable((Drawable)new ColorDrawable(b2.h));
                return;
            }
            if (b2.g != 0 && b2.q()) {
                a a6 = new a(b2);
                a6.a = this;
                a6.b = cv.f(imageView.getContext(), b2.g);
                a6.c = bc.b(imageView.getContext());
                a a7 = a6.a(b2.n).a(b2.k()).c(b2.m());
                a7.o = b2.s;
                a7.d = b2.e;
                a7.e = b2.f;
                b b4 = a7.b(b2.p()).b();
                bc.super.c(b2.e);
                bc.super.a(imageView, b4);
                return;
            }
            imageView.setImageDrawable(null);
            if (b2.o != -1 && b2.r != 0) {
                b2.b.a(b2.o, new aa(b2.r));
                return;
            }
        } else {
            imageView.setImageDrawable(null);
        }
    }

    static /* synthetic */ void c() {
    }

    private void c(int n2) {
        if (n2 >= 0) {
            if (n2 >= this.l) {
                return;
            }
            if (this.e != null) {
                this.e.a(n2, null);
            }
            return;
        }
    }

    public final void a(Context context) {
        this.g = new WeakReference((Object)context);
    }

    public a b() {
        return null;
    }

    @Override
    public void onPaletteReady(android.support.v7.d.b b2) {
    }

    @Override
    public void onPaletteReady(android.support.v7.d.b b2, View view, int n2) {
        if (this.d) {
            if (n2 >= 0) {
                if (n2 >= this.l) {
                    return;
                }
                if (this.e == null) {
                    this.e = new bt(this.l);
                }
                android.support.v7.d.b b3 = this.e.a(n2);
                boolean bl2 = true;
                if (b3 != null) {
                    bl2 ^= cd.a(b3, b2);
                }
                this.e.a(n2, b2);
                if (bl2) {
                    bc.super.b(n2);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("[ layoutId: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", primaryColor: ");
        stringBuilder.append(aj.a(this.c));
        stringBuilder.append(", isDarkTheme: ");
        stringBuilder.append(this.a);
        stringBuilder.append(", backgroundType: ");
        int n2 = this.k;
        switch (n2) {
            default: {
                StringBuilder stringBuilder2 = new StringBuilder("unknown {");
                stringBuilder2.append(n2);
                stringBuilder2.append(")");
                string = stringBuilder2.toString();
                break;
            }
            case 4: {
                string = "autocolor-translucent";
                break;
            }
            case 3: {
                string = "autocolor-solid";
                break;
            }
            case 2: {
                string = "autocolor";
                break;
            }
            case 1: {
                string = "translucent";
                break;
            }
            case 0: {
                string = "default";
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(", isAutoEnabled: ");
        stringBuilder.append(this.d);
        stringBuilder.append(", paletteCapacity: ");
        stringBuilder.append(this.l);
        stringBuilder.append(", autoColorCapacity: ");
        stringBuilder.append(this.m);
        stringBuilder.append(", palettes: ");
        String string2 = this.e != null ? this.e.toString() : "null";
        stringBuilder.append(string2);
        stringBuilder.append(", autoColors: ");
        String string3 = this.f != null ? this.f.toString() : "null";
        stringBuilder.append(string3);
        stringBuilder.append(", clickListener: '");
        String string4 = this.h != null ? "present" : "null";
        stringBuilder.append(string4);
        stringBuilder.append(", longClickListener: '");
        String string5 = this.i != null ? "present" : "null";
        stringBuilder.append(string5);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

