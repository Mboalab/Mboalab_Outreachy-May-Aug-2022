/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.android.publish.adsCommon.Utils.i;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class k {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        if (a == null) {
            a = context.getApplicationContext().getSharedPreferences("com.startapp.android.publish", 0);
        }
        return a;
    }

    public static Boolean a(Context context, String string, Boolean bl) {
        return k.a(context).getBoolean(string, bl.booleanValue());
    }

    public static Float a(Context context, String string, Float f2) {
        return Float.valueOf((float)k.a(context).getFloat(string, f2.floatValue()));
    }

    public static Integer a(Context context, String string, Integer n2) {
        return k.a(context).getInt(string, n2.intValue());
    }

    public static Long a(Context context, String string, Long l2) {
        return k.a(context).getLong(string, l2.longValue());
    }

    public static String a(Context context, String string, String string2) {
        return k.a(context).getString(string, string2);
    }

    public static void a(Context context, String string, Map<String, String> map) {
        k.b(context, string, new JSONObject(map).toString());
    }

    public static Map<String, String> b(Context context, String string, Map<String, String> map) {
        String string2 = k.a(context).getString(string, null);
        try {
            JSONObject jSONObject = new JSONObject(string2);
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                map.put((Object)string3, (Object)((String)jSONObject.get(string3)));
            }
            return map;
        }
        catch (JSONException jSONException) {
            try {
                jSONException.printStackTrace();
            }
            catch (Throwable throwable) {}
        }
        return map;
    }

    public static void b(Context context, String string, Boolean bl) {
        i.a(k.a(context).edit().putBoolean(string, bl.booleanValue()));
    }

    public static void b(Context context, String string, Float f2) {
        i.a(k.a(context).edit().putFloat(string, f2.floatValue()));
    }

    public static void b(Context context, String string, Integer n2) {
        i.a(k.a(context).edit().putInt(string, n2.intValue()));
    }

    public static void b(Context context, String string, Long l2) {
        i.a(k.a(context).edit().putLong(string, l2.longValue()));
    }

    public static void b(Context context, String string, String string2) {
        i.a(k.a(context).edit().putString(string, string2));
    }
}

