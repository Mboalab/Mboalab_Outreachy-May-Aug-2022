package com.startapp.android.publish.ads.splash;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;

public class i {
    public static View a(Context context, SplashConfig splashConfig) {
        switch (1.a[splashConfig.getTheme().ordinal()]) {
            default: {
                return null;
            }
            case 6: {
                return i.b(context, splashConfig);
            }
            case 5: {
                return i.c(context, splashConfig);
            }
            case 4: {
                return i.d(context, splashConfig);
            }
            case 3: {
                return i.e(context, splashConfig);
            }
            case 2: {
                return i.f(context, splashConfig);
            }
            case 1: 
        }
        return i.g(context, splashConfig);
    }

    private static View b(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        view.setBackgroundDrawable((Drawable)new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14451558, -7876130}));
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)6, (int)61, (int)82));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)6, (int)61, (int)82));
        return view;
    }

    private static View c(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        view.setBackgroundColor(Color.rgb((int)47, (int)53, (int)63));
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)51, (int)181, (int)229));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)122, (int)130, (int)139));
        return view;
    }

    private static View d(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        int n2 = context.getResources().getDisplayMetrics().widthPixels;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-92376, -40960});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius((float)(n2 / 2));
        view.setBackgroundDrawable((Drawable)gradientDrawable);
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)255, (int)255, (int)255));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)255, (int)198, (int)151));
        return view;
    }

    private static View e(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        view.setBackgroundDrawable((Drawable)new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3881788, -1}));
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)51, (int)51, (int)51));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)153, (int)153, (int)153));
        return view;
    }

    private static View f(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        int n2 = context.getResources().getDisplayMetrics().widthPixels;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-921103, -6040347});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius((float)(n2 / 2));
        view.setBackgroundDrawable((Drawable)gradientDrawable);
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)51, (int)51, (int)51));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)162, (int)172, (int)175));
        return view;
    }

    private static View g(Context context, SplashConfig splashConfig) {
        View view = i.h(context, splashConfig);
        view.setBackgroundDrawable((Drawable)new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16356182, -15029533, -16356182}));
        ((TextView)view.findViewById(100)).setTextColor(Color.rgb((int)255, (int)255, (int)255));
        ((TextView)view.findViewById(105)).setTextColor(Color.rgb((int)208, (int)210, (int)210));
        return view;
    }

    private static View h(Context context, SplashConfig splashConfig) {
        int n2;
        int n3;
        int n4;
        int n5;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(1475346437);
        relativeLayout.setBackgroundColor(-1);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.addView((View)relativeLayout2, (ViewGroup.LayoutParams)layoutParams);
        Point point = new Point(h.a(context, 150), h.a(context, 28));
        if (splashConfig.getOrientation() == SplashConfig.Orientation.PORTRAIT) {
            n3 = h.a(context, 5);
            n2 = h.a(context, 8);
            n4 = h.a(context, 75);
            n5 = h.a(context, 130);
        } else {
            n3 = h.a(context, 5);
            n2 = h.a(context, 8);
            n4 = h.a(context, 40);
            n5 = h.a(context, 100);
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(splashConfig.getLogo());
        imageView.setId(101);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(n5, n5);
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(0, 0, 0, n3);
        relativeLayout2.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams2);
        TextView textView = new TextView(context);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText((CharSequence)splashConfig.getAppName());
        textView.setId(100);
        textView.setTextSize(1, 26.0f);
        textView.setTextColor(Color.rgb((int)255, (int)255, (int)255));
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, 101);
        layoutParams3.setMargins(0, 0, 0, n4);
        relativeLayout2.addView((View)textView, (ViewGroup.LayoutParams)layoutParams3);
        try {
            WebView webView = new WebView(context);
            webView.setId(102);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(point.x, point.y);
            layoutParams4.addRule(14);
            layoutParams4.addRule(3, 100);
            layoutParams4.setMargins(0, 0, 0, n2);
            webView.setBackgroundColor(Color.argb((int)0, (int)0, (int)0, (int)0));
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.loadDataWithBaseURL(null, "<html>\n<style>\n#fountainG{\nposition:relative;\nwidth:141px;\nheight:17px}\n.fountainG{\nposition:absolute;\ntop:0;\nbackground-color:#000000;\nwidth:18px;\nheight:18px;\n-moz-animation-name:bounce_fountainG;\n-moz-animation-duration:2s;\n-moz-animation-iteration-count:infinite;\n-moz-animation-direction:linear;\n-moz-transform:scale(.3);\n-moz-border-radius:12px;\n-webkit-animation-name:bounce_fountainG;\n-webkit-animation-duration:2s;\n-webkit-animation-iteration-count:infinite;\n-webkit-animation-direction:linear;\n-webkit-transform:scale(.3);\n-webkit-border-radius:12px;\n-ms-animation-name:bounce_fountainG;\n-ms-animation-duration:2s;\n-ms-animation-iteration-count:infinite;\n-ms-animation-direction:linear;\n-ms-transform:scale(.3);\n-ms-border-radius:12px;\n-o-animation-name:bounce_fountainG;\n-o-animation-duration:2s;\n-o-animation-iteration-count:infinite;\n-o-animation-direction:linear;\n-o-transform:scale(.3);\n-o-border-radius:12px;\nanimation-name:bounce_fountainG;\nanimation-duration:2s;\nanimation-iteration-count:infinite;\nanimation-direction:linear;\ntransform:scale(.3);\nborder-radius:12px;\n}\n#fountainG_1{\nleft:0;\n-moz-animation-delay:0.8s;\n-webkit-animation-delay:0.8s;\n-ms-animation-delay:0.8s;\n-o-animation-delay:0.8s;\nanimation-delay:0.8s;\n}\n#fountainG_2{\nleft:18px;\n-moz-animation-delay:1s;\n-webkit-animation-delay:1s;\n-ms-animation-delay:1s;\n-o-animation-delay:1s;\nanimation-delay:1s;\n}\n#fountainG_3{\nleft:35px;\n-moz-animation-delay:1.2s;\n-webkit-animation-delay:1.2s;\n-ms-animation-delay:1.2s;\n-o-animation-delay:1.2s;\nanimation-delay:1.2s;\n}\n#fountainG_4{\nleft:53px;\n-moz-animation-delay:1.4s;\n-webkit-animation-delay:1.4s;\n-ms-animation-delay:1.4s;\n-o-animation-delay:1.4s;\nanimation-delay:1.4s;\n}\n#fountainG_5{\nleft:71px;\n-moz-animation-delay:1.6s;\n-webkit-animation-delay:1.6s;\n-ms-animation-delay:1.6s;\n-o-animation-delay:1.6s;\nanimation-delay:1.6s;\n}\n#fountainG_6{\nleft:88px;\n-moz-animation-delay:1.8s;\n-webkit-animation-delay:1.8s;\n-ms-animation-delay:1.8s;\n-o-animation-delay:1.8s;\nanimation-delay:1.8s;\n}\n#fountainG_7{\nleft:106px;\n-moz-animation-delay:2s;\n-webkit-animation-delay:2s;\n-ms-animation-delay:2s;\n-o-animation-delay:2s;\nanimation-delay:2s;\n}\n#fountainG_8{\nleft:123px;\n-moz-animation-delay:2.2s;\n-webkit-animation-delay:2.2s;\n-ms-animation-delay:2.2s;\n-o-animation-delay:2.2s;\nanimation-delay:2.2s;\n}\n@-moz-keyframes bounce_fountainG{\n0%{\n-moz-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-moz-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-webkit-keyframes bounce_fountainG{\n0%{\n-webkit-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-webkit-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-ms-keyframes bounce_fountainG{\n0%{\n-ms-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-ms-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@-o-keyframes bounce_fountainG{\n0%{\n-o-transform:scale(1);\nbackground-color:#000000;\n}\n100%{\n-o-transform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n@keyframes bounce_fountainG{\n0%{\ntransform:scale(1);\nbackground-color:#000000;\n}\n100%{\ntransform:scale(.3);\nbackground-color:rgba(255,255,255,0.2);\n}\n}\n</style>\n<body style=\"margin:0;padding:0\">\n<div id=\"fountainG\">\n<div id=\"fountainG_1\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_2\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_3\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_4\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_5\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_6\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_7\" class=\"fountainG\">\n</div>\n<div id=\"fountainG_8\" class=\"fountainG\">\n</div>\n</div>\n</body>\n</html>", "text/html", "utf-8", null);
            relativeLayout2.addView((View)webView, (ViewGroup.LayoutParams)layoutParams4);
        }
        catch (Exception exception) {
            f.a(context, d.b, "TemplatesLayout.getBaseTemplate - webview failed", exception.getMessage(), "");
        }
        TextView textView2 = new TextView(context);
        textView2.setText((CharSequence)"Loading...");
        textView2.setId(105);
        textView2.setTextSize(1, 18.0f);
        textView2.setTextColor(Color.rgb((int)208, (int)210, (int)210));
        textView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, 102);
        layoutParams5.setMargins(0, 0, 0, 0);
        relativeLayout2.addView((View)textView2, (ViewGroup.LayoutParams)layoutParams5);
        return relativeLayout;
    }

}

