/*
 *  
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.os.Parcel;
import android.os.Parcelable;

public final class AudioItem
implements Parcelable {
    public static final Parcelable.Creator<AudioItem> CREATOR = new Parcelable.Creator<AudioItem>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AudioItem(0);
        }
    };

    private AudioItem() {
    }

    /* synthetic */ AudioItem(byte by) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
    }

}

