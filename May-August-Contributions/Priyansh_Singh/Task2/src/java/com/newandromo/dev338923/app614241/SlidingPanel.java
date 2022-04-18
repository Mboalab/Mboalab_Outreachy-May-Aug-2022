/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationUtils
 *  android.widget.LinearLayout
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.newandromo.dev338923.app614241.cg;

public class SlidingPanel
extends LinearLayout {
    Animation.AnimationListener a;
    private int b = 300;
    private boolean c = false;
    private Animation d = null;

    public SlidingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Animation.AnimationListener(){

            public final void onAnimationEnd(Animation animation) {
                SlidingPanel.this.setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        };
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, cg.a.SlidingPanel, 0, 0);
        this.b = typedArray.getInt(0, 300);
        typedArray.recycle();
        this.d = AnimationUtils.loadAnimation((Context)context, (int)2130771984);
    }

    static class SavedState
    extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, 0);
            }
        };
        int a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, byte by) {
            super(parcel);
        }

        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            parcel.writeInt(this.a);
        }

    }

}

