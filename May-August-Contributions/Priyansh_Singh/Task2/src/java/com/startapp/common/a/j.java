package com.startapp.common.a;
import android.content.Context;
import android.widget.Toast;

public class j {
    private static j a = new j();
    private Toast b;

    private j() {
    }

    public static j a() {
        return a;
    }

    public void a(Context context, String string) {
        if (this.b == null) {
            this.b = Toast.makeText((Context)context, (CharSequence)string, (int)0);
        } else {
            this.b.setText((CharSequence)string);
            this.b.setDuration(0);
        }
        this.b.show();
    }
}

