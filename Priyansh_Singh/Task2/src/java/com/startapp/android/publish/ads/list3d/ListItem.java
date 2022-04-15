package com.startapp.android.publish.ads.list3d;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.android.publish.common.model.AdDetails;

public class ListItem
implements Parcelable {
    public static final Parcelable.Creator<ListItem> CREATOR = new Parcelable.Creator<ListItem>(){

        public final ListItem a(Parcel parcel) {
            return new ListItem(parcel);
        }

        public final ListItem[] a(int n2) {
            return new ListItem[n2];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return this.a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int n2) {
            return this.a(n2);
        }
    };
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private float j = 0.0f;
    private boolean k = false;
    private boolean l = true;
    private Drawable m = null;
    private String n;
    private String o;
    private Long p;
    private Boolean q = null;
    private String r = "";

    public ListItem(Parcel parcel) {
        int n2;
        this.m = parcel.readInt() == 1 ? new BitmapDrawable((Bitmap)Bitmap.CREATOR.createFromParcel(parcel)) : null;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readFloat();
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() != 0;
        this.r = parcel.readString();
        this.o = parcel.readString();
        this.n = parcel.readString();
        this.p = parcel.readLong();
        if (this.p == -1L) {
            this.p = null;
        }
        if ((n2 = parcel.readInt()) == 0) {
            this.q = null;
            return;
        }
        boolean bl = false;
        if (n2 == 1) {
            bl = true;
        }
        this.q = bl;
    }

    public ListItem(AdDetails adDetails) {
        this.a = adDetails.getAdId();
        this.b = adDetails.getClickUrl();
        this.c = adDetails.getTrackingUrl();
        this.d = adDetails.getTrackingClickUrl();
        this.e = adDetails.getTrackingCloseUrl();
        this.f = adDetails.getPackageName();
        this.g = adDetails.getTitle();
        this.h = adDetails.getDescription();
        this.i = adDetails.getImageUrl();
        this.j = adDetails.getRating();
        this.k = adDetails.isSmartRedirect();
        this.l = adDetails.isStartappBrowserEnabled();
        this.m = null;
        this.r = adDetails.getTemplate();
        this.n = adDetails.getIntentDetails();
        this.o = adDetails.getIntentPackageName();
        this.p = adDetails.getDelayImpressionInSeconds();
        this.q = adDetails.shouldSendRedirectHops();
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public Drawable j() {
        return this.m;
    }

    public float k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.l;
    }

    public String n() {
        return this.r;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.o;
    }

    public boolean q() {
        return this.o != null;
    }

    public Long r() {
        return this.p;
    }

    public Boolean s() {
        return this.q;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        if (this.j() != null) {
            parcel.writeParcelable((Parcelable)((BitmapDrawable)this.j()).getBitmap(), n2);
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeFloat(this.j);
        parcel.writeInt((int)this.k);
        parcel.writeInt((int)this.l);
        parcel.writeString(this.r);
        parcel.writeString(this.o);
        parcel.writeString(this.n);
        if (this.p == null) {
            parcel.writeLong(-1L);
        } else {
            parcel.writeLong(this.p.longValue());
        }
        int n3 = this.q == null ? 0 : (this.q != false ? 1 : -1);
        parcel.writeInt(n3);
    }

}

