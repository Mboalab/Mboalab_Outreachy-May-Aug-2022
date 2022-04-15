
package com.newandromo.dev338923.app614241;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

final class at
extends LinkMovementMethod {
    private static at a;
    private static String b;

    at() {
    }

    public static at a() {
        if (a == null) {
            a = new at();
        } else {
            b = null;
        }
        return a;
    }

    public static at a(String string) {
        b = string;
        return a;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        try {
            boolean bl = super.onTouchEvent(textView, spannable, motionEvent);
            return bl;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            if (motionEvent.getAction() == 1) {
                int n2 = (int)motionEvent.getX();
                int n3 = (int)motionEvent.getY();
                int n4 = n2 - textView.getTotalPaddingLeft();
                int n5 = n3 - textView.getTotalPaddingTop();
                int n6 = n4 + textView.getScrollX();
                int n7 = n5 + textView.getScrollY();
                Layout layout = textView.getLayout();
                int n8 = layout.getOffsetForHorizontal(layout.getLineForVertical(n7), (float)n6);
                URLSpan[] arruRLSpan = (URLSpan[])spannable.getSpans(n8, n8, URLSpan.class);
                if (arruRLSpan.length != 0) {
                    String string = arruRLSpan[0].getURL();
                    if (b != null && string != null) {
                        String string2 = String.format((String)b, (Object[])new Object[]{string});
                        Toast.makeText((Context)textView.getContext(), (CharSequence)string2, (int)0).show();
                    }
                }
            }
            return true;
        }
    }
}

