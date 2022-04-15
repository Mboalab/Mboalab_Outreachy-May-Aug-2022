package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.adinformation.e;
import com.startapp.common.a;
import java.io.Serializable;

public class e
implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient Bitmap a;
    private transient Bitmap b;
    private transient Bitmap c = null;
    private int height = 1;
    private String imageFallbackUrl = "";
    private String imageUrlSecured = "";
    private String name;
    private int width = 1;

    private e() {
    }

    public static e c(String string) {
        e e2 = new e();
        e2.b(string);
        return e2;
    }

    public Bitmap a(Context context) {
        if (this.c == null) {
            this.c = this.f();
            if (this.c == null) {
                this.c = this.b(context);
            }
        }
        return this.c;
    }

    public String a() {
        return this.name;
    }

    public void a(int n2) {
        this.width = n2;
    }

    protected void a(Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap != null) {
            this.c = bitmap;
        }
    }

    public void a(String string) {
        this.imageFallbackUrl = string;
    }

    public int b() {
        return this.width;
    }

    protected Bitmap b(Context context) {
        if (this.b == null) {
            this.b = com.startapp.android.publish.adsCommon.Utils.a.a(context, this.g());
        }
        return this.b;
    }

    public void b(int n2) {
        this.height = n2;
    }

    protected void b(String string) {
        this.name = string;
    }

    public int c() {
        return this.height;
    }

    public String d() {
        if (this.imageUrlSecured != null) {
            return this.imageUrlSecured;
        }
        return "";
    }

    protected void e() {
        this.a((Bitmap)null);
        new a(this.d(), (a.a)new 1(this), 0).a();
    }

    protected Bitmap f() {
        return this.a;
    }

    protected String g() {
        return this.imageFallbackUrl;
    }
}

