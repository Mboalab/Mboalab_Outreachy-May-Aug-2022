package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.newandromo.dev338923.app614241.AndromoAboutActivity;
import com.newandromo.dev338923.app614241.cv;
import com.newandromo.dev338923.app614241.t;
import com.newandromo.dev338923.app614241.v;

public class AndromoAboutActivity
extends AppCompatActivity {
    protected Toolbar a;

    public void onCreate(Bundle bundle) {
        TextView textView;
        View view;
        View view2;
        View view3;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(cv.a((Context)this, 2130968707));
        }
        this.setContentView(2131427355);
        this.a = (Toolbar)this.findViewById(2131296526);
        if (this.a != null) {
            this.setSupportActionBar(this.a);
        } else {
            Log.e((String)"AndromoAboutActivity", (String)"Could not find toolbar in layout.");
        }
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.a();
            actionBar.c(false);
            actionBar.b();
            actionBar.a(true);
            actionBar.b(true);
            Object[] arrobject = new Object[]{this.getString(2131558527)};
            actionBar.a((CharSequence)this.getString(2131558461, arrobject));
        }
        if ((textView6 = (TextView)this.findViewById(2131296303)) != null) {
            Object[] arrobject = new Object[]{v.a((Context)this)};
            textView6.setText((CharSequence)Html.fromHtml((String)this.getString(2131558456, arrobject)));
        }
        if ((textView = (TextView)this.findViewById(2131296302)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText((CharSequence)Html.fromHtml((String)this.getString(2131558460, new Object[]{"<b><a href=\"https://www.andromo.com\">plada139cn</a></b>"})));
            textView.setVisibility(0);
        }
        if ((textView3 = (TextView)this.findViewById(2131296318)) != null) {
            textView3.setText((CharSequence)this.getString(2131558457, new Object[]{"5.2.0/2.0"}));
        }
        if ((textView4 = (TextView)this.findViewById(2131296336)) != null) {
            textView4.setText((CharSequence)this.getString(2131558458, new Object[]{"2020"}));
        }
        if ((view = this.findViewById(2131296297)) != null) {
            int n2 = t.a() ? 0 : 8;
            view.setVisibility(n2);
        }
        View.OnClickListener onClickListener = new View.OnClickListener((AndromoAboutActivity)this){
            final AndromoAboutActivity a;
            {
                this.a = andromoAboutActivity;
            }

            public final void onClick(View view) {
                try {
                    com.newandromo.dev338923.app614241.bb.a(view.getContext(), "http://www.andromo.com/?utm_source=about&utm_medium=app&utm_campaign=andromo_app");
                    return;
                }
                catch (android.content.ActivityNotFoundException activityNotFoundException) {
                    android.widget.Toast.makeText((Context)view.getContext(), (int)2131558655, (int)0).show();
                    return;
                }
            }
        };
        View view4 = this.findViewById(2131296267);
        if (view4 != null) {
            view4.setVisibility(0);
        }
        if ((textView2 = (TextView)this.findViewById(2131296265)) != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText((CharSequence)Html.fromHtml((String)this.getString(2131558455, new Object[]{"<b><a href=\"https://www.andromo.com\">Andromo</a></b>"})));
        }
        if ((view2 = this.findViewById(2131296299)) != null) {
            view2.setOnClickListener(onClickListener);
        }
        if ((view3 = this.findViewById(2131296298)) != null) {
            view3.setOnClickListener(onClickListener);
        }
        if ((textView5 = (TextView)this.findViewById(2131296339)) != null) {
            textView5.setVisibility(8);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        new StringBuilder("About ").append(this.getString(2131558527));
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}

