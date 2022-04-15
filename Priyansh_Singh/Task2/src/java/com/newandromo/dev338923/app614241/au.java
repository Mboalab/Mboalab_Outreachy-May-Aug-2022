
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.c;
import android.text.Html;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import com.newandromo.dev338923.app614241.AndromoActivity;
import com.newandromo.dev338923.app614241.at;
import com.newandromo.dev338923.app614241.f;

public final class au {
    public static void a(final AndromoActivity andromoActivity) {
        TextView textView;
        c.a a2 = new c.a((Context)andromoActivity).a(2131558664).b((CharSequence)Html.fromHtml((String)andromoActivity.getString(2131558663))).b();
        a2.a();
        a2.a(2131558462, new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                PreferenceManager.getDefaultSharedPreferences((Context)andromoActivity).edit().putBoolean("accepted_eula", true).apply();
                dialogInterface.dismiss();
                au.b(andromoActivity);
            }
        }).b(2131558630, new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
                andromoActivity.finish();
            }
        });
        c c2 = a2.d();
        if (c2 != null && (textView = (TextView)c2.findViewById(16908299)) != null) {
            String string = andromoActivity.getString(2131558666);
            at.a();
            textView.setMovementMethod((MovementMethod)at.a(string));
        }
    }

    public static boolean a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences((Context)context).getBoolean("accepted_eula", false);
    }

    public static void b(AndromoActivity andromoActivity) {
        au.c((Context)andromoActivity);
        if (!au.b((Context)andromoActivity)) {
            au.c(andromoActivity);
            return;
        }
        if (f.d()) {
            andromoActivity.onDelayedAdLoad();
        }
    }

    public static boolean b(Context context) {
        return PreferenceManager.getDefaultSharedPreferences((Context)context).getBoolean("launch_notice_shown", false);
    }

    private static void c(final AndromoActivity andromoActivity) {
        TextView textView;
        c.a a2 = new c.a((Context)andromoActivity).a(2131558674).b((CharSequence)Html.fromHtml((String)andromoActivity.getString(2131558673))).b();
        a2.a();
        a2.a(17039370, new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                PreferenceManager.getDefaultSharedPreferences((Context)andromoActivity).edit().putBoolean("launch_notice_shown", true).apply();
                andromoActivity.onDelayedAdLoad();
                dialogInterface.dismiss();
            }
        });
        c c2 = a2.d();
        if (c2 != null && (textView = (TextView)c2.findViewById(16908299)) != null) {
            String string = andromoActivity.getString(2131558666);
            at.a();
            textView.setMovementMethod((MovementMethod)at.a(string));
        }
    }

    private static boolean c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences((Context)context).getBoolean("eu_country", false);
    }

}

