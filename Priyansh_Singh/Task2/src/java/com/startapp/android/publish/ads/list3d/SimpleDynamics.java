package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.android.publish.ads.list3d.Dynamics;
import com.startapp.android.publish.ads.list3d.SimpleDynamics;

class SimpleDynamics
extends Dynamics
implements Parcelable {
    public static final Parcelable.Creator<SimpleDynamics> CREATOR = new Parcelable.Creator<SimpleDynamics>(){

        public final SimpleDynamics a(Parcel parcel) {
            return new SimpleDynamics(parcel);
        }

        public final SimpleDynamics[] a(int n2) {
            return new SimpleDynamics[n2];
        }

        public final /* synthetic */ java.lang.Object createFromParcel(Parcel parcel) {
            return this.a(parcel);
        }

        public final /* synthetic */ java.lang.Object[] newArray(int n2) {
            return this.a(n2);
        }
    };
    private float f;
    private float g;

    public SimpleDynamics(float f2, float f3) {
        this.f = f2;
        this.g = f3;
    }

    public SimpleDynamics(Parcel parcel) {
        super(parcel);
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
    }

    @Override
    public void a(double d2) {
        super.a(d2);
    }

    @Override
    protected void a(int n2) {
        this.b += this.c() * this.g;
        this.a += this.b * (float)n2 / 1000.0f;
        this.b *= this.f;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", Friction: [");
        stringBuilder.append(this.f);
        stringBuilder.append("], Snap:[");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
    }
}

