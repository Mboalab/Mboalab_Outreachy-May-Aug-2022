/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.res.Resources
 *  android.support.multidex.a
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.newandromo.dev338923.app614241.AirBopApplication;
import com.newandromo.dev338923.app614241.AndromoApplication;
import com.newandromo.dev338923.app614241.f;
import com.newandromo.dev338923.app614241.i;
import com.newandromo.dev338923.app614241.t;

public class AndromoApplication
extends AirBopApplication {
    public static a a;
    private static Resources c;
    private static Context d;
    public int b = 0;

    public static Context a() {
        return d;
    }

    static void a(boolean bl2) {
        if (bl2) {
            t.b();
            return;
        }
        t.a(d);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        android.support.multidex.a.a((Context)this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this){
            final /* synthetic */ AndromoApplication a;
            {
                this.a = andromoApplication;
            }

            public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            }

            public final void onActivityDestroyed(android.app.Activity activity) {
            }

            public final void onActivityPaused(android.app.Activity activity) {
            }

            public final void onActivityResumed(android.app.Activity activity) {
            }

            public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            }

            public final void onActivityStarted(android.app.Activity activity) {
                AndromoApplication andromoApplication = this.a;
                andromoApplication.b = 1 + andromoApplication.b;
                if (this.a.b == 1 && AndromoApplication.a != null) {
                    AndromoApplication.a.a(true);
                }
            }

            public final void onActivityStopped(android.app.Activity activity) {
                AndromoApplication andromoApplication = this.a;
                andromoApplication.b = -1 + andromoApplication.b;
                if (this.a.b == 0 && AndromoApplication.a != null) {
                    AndromoApplication.a.a(false);
                }
            }
        });
        c = this.getResources();
        d = this.getApplicationContext();
        i.a();
        f.a((Context)this);
    }

}

