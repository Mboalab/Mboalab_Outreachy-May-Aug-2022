/*
 *  
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.startapp.android.publish.adsCommon.g;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    private HashMap<Integer, SensorEvent> a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(SensorEvent sensorEvent) {
        void var7_2 = this;
        synchronized (var7_2) {
            int n2 = sensorEvent.sensor.getType();
            SensorEvent sensorEvent2 = (SensorEvent)this.a.get((Object)n2);
            if (sensorEvent2 != null) {
                if (sensorEvent2.accuracy > sensorEvent.accuracy) return this.a.size();
            }
            this.a.put((Object)n2, (Object)sensorEvent);
            return this.a.size();
        }
    }

    public JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent sensorEvent : this.a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = sensorEvent.sensor;
            jSONObject2.put("name", (Object)sensor.getName());
            jSONObject2.put("vendor", (Object)sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            jSONObject2.put("maximum range", (double)sensor.getMaximumRange());
            jSONObject2.put("power", (double)sensor.getPower());
            jSONObject2.put("resolution", (double)sensor.getResolution());
            jSONObject2.put("accuracy", sensorEvent.accuracy);
            jSONObject2.put("timestamp", sensorEvent.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            float[] arrf = sensorEvent.values;
            int n2 = arrf.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                jSONArray2.put((double)arrf[i2]);
            }
            jSONObject2.put("values", (Object)jSONArray2);
            jSONObject.put(String.valueOf((int)sensor.getType()), (Object)jSONObject2);
            jSONArray.put((Object)jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}

