package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

public abstract class Dynamics
implements Parcelable {
    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected long e;

    public Dynamics() {
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.e = 0L;
    }

    public Dynamics(Parcel parcel) {
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.e = 0L;
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = AnimationUtils.currentAnimationTimeMillis();
    }

    public float a() {
        return this.a;
    }

    public void a(double d2) {
        double d3 = this.a;
        Double.isNaN((double)d3);
        this.a = (float)(d3 * d2);
    }

    public void a(float f2) {
        this.c = f2;
    }

    public void a(float f2, float f3, long l2) {
        this.b = f3;
        this.a = f2;
        this.e = l2;
    }

    protected abstract void a(int var1);

    public void a(long l2) {
        if (this.e != 0L) {
            int n2 = (int)(l2 - this.e);
            if (n2 > 50) {
                n2 = 50;
            }
            this.a(n2);
        }
        this.e = l2;
    }

    public boolean a(float f2, float f3) {
        boolean bl = Math.abs((float)this.b) < f2;
        boolean bl2 = this.a - f3 < this.c && f3 + this.a > this.d;
        return bl && bl2;
    }

    public float b() {
        return this.b;
    }

    public void b(float f2) {
        this.d = f2;
    }

    protected float c() {
        if (this.a > this.c) {
            return this.c - this.a;
        }
        if (this.a < this.d) {
            return this.d - this.a;
        }
        return 0.0f;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Position: [");
        stringBuilder.append(this.a);
        stringBuilder.append("], Velocity:[");
        stringBuilder.append(this.b);
        stringBuilder.append("], MaxPos: [");
        stringBuilder.append(this.c);
        stringBuilder.append("], mMinPos: [");
        stringBuilder.append(this.d);
        stringBuilder.append("] LastTime:[");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }
}

