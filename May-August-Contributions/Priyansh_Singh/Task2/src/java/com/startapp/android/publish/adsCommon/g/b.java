/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.a
 *  com.startapp.android.publish.common.metaData.g
 *  com.startapp.common.d
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 *  org.json.JSONArray
 */
package com.startapp.android.publish.adsCommon.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.g;
import com.startapp.common.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

public class b {
    protected com.startapp.android.publish.adsCommon.g.a a;
    protected SensorManager b;
    protected d c;
    private HashMap<Integer, a> d = null;
    private int e;
    private SensorEventListener f;

    public b(Context context, d d2) {
        this.f = new SensorEventListener(){

            public void onAccuracyChanged(Sensor sensor, int n2) {
            }

            public void onSensorChanged(SensorEvent sensorEvent) {
                if (b.this.a.a(sensorEvent) == b.this.e) {
                    b.this.b();
                    if (b.this.c != null) {
                        b.this.c.a((Object)b.this.c());
                    }
                }
            }
        };
        this.a = new com.startapp.android.publish.adsCommon.g.a();
        this.b = (SensorManager)context.getSystemService("sensor");
        this.c = d2;
        this.e = 0;
        b.super.d();
    }

    private void a(int n2, com.startapp.android.publish.common.metaData.a a2) {
        if (a2.c()) {
            this.d.put((Object)n2, (Object)(b)this.new a(a2.b(), a2.a()));
        }
    }

    private void d() {
        this.d = new HashMap();
        g g2 = MetaData.getInstance().getSensorsConfig();
        this.a(13, g2.c());
        this.a(9, g2.d());
        this.a(5, g2.e());
        this.a(10, g2.f());
        this.a(2, g2.g());
        this.a(6, g2.h());
        this.a(12, g2.i());
        this.a(11, g2.j());
        this.a(16, g2.k());
    }

    public void a() {
        Iterator iterator = this.d.keySet().iterator();
        while (iterator.hasNext()) {
            Sensor sensor;
            int n2 = (Integer)iterator.next();
            a a2 = (a)this.d.get((Object)n2);
            if (Build.VERSION.SDK_INT < a2.a() || (sensor = this.b.getDefaultSensor(n2)) == null) continue;
            this.b.registerListener(this.f, sensor, a2.b());
            this.e = 1 + this.e;
        }
    }

    public void b() {
        this.b.unregisterListener(this.f);
    }

    public JSONArray c() {
        try {
            JSONArray jSONArray = this.a.a();
            return jSONArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    class a {
        private int b;
        private int c;

        public a(int n2, int n3) {
            this.b = n2;
            this.c = n3;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

}

