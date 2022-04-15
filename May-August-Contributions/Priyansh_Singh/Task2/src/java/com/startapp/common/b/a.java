package com.startapp.common.b;
import android.os.Build;
import com.startapp.common.Constants;
import com.startapp.common.a.h;
import com.startapp.common.b.c;
import com.startapp.common.b.d;
import com.startapp.common.b.e;
import com.startapp.common.b.f;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
extends InputStream {
    public static Map<String, Class> a;
    private InputStream b;
    private String c;

    static {
        HashMap hashMap;
        a = hashMap = new HashMap();
        hashMap.put((Object)"int[]", Integer.class);
        a.put((Object)"long[]", Long.class);
        a.put((Object)"double[]", Double.class);
        a.put((Object)"float[]", Float.class);
        a.put((Object)"bool[]", Boolean.class);
        a.put((Object)"char[]", Character.class);
        a.put((Object)"byte[]", Byte.class);
        a.put((Object)"void[]", Void.class);
        a.put((Object)"short[]", Short.class);
    }

    public a(String string) {
        this.c = string;
        this.b = null;
    }

    private Enum<?> a(String string, Class class_) {
        return Enum.valueOf((Class)class_, (String)string);
    }

    private static Object a(Object object, Class<?> class_) {
        if (!object.getClass().equals(class_)) {
            if (class_.equals(Integer.class)) {
                if (object.getClass().equals(Double.class)) {
                    return ((Double)object).intValue();
                }
                if (object.getClass().equals(Long.class)) {
                    return ((Long)object).intValue();
                }
            } else if (class_.equals(Long.class) && object.getClass().equals(Integer.class)) {
                object = ((Integer)object).longValue();
            }
        }
        return object;
    }

    private <T> Object a(JSONObject jSONObject, Class<T> class_, Field field) {
        if (class_ != null) {
            return a.super.b(jSONObject, class_, field);
        }
        return a.super.a(jSONObject, field);
    }

    private Object a(JSONObject jSONObject, Field field) {
        JSONArray jSONArray = jSONObject.getJSONArray(c.a(field));
        int n2 = jSONArray.length();
        Class class_ = field.getType();
        Class class_2 = (Class)a.get((Object)class_.getSimpleName());
        Object object = Array.newInstance((Class)((Class)class_2.getField("TYPE").get(null)), (int)n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2;
            String string = jSONArray.getString(i2);
            Class class_3 = String.class;
            if (class_2.equals(Character.class)) {
                class_3 = Character.TYPE;
            }
            Constructor constructor = class_2.getConstructor(new Class[]{class_3});
            if (class_2.equals(Character.class)) {
                Object[] arrobject = new Object[]{Character.valueOf((char)string.charAt(0))};
                object2 = constructor.newInstance(arrobject);
            } else {
                object2 = constructor.newInstance(new Object[]{string});
            }
            Array.set((Object)object, (int)i2, (Object)object2);
        }
        return object;
    }

    private static Object a(JSONObject jSONObject, Field field, Object object, Class<?> class_) {
        if (!object.getClass().equals(class_)) {
            if (object.getClass().equals(String.class)) {
                if (class_.equals((Object)Integer.TYPE)) {
                    return jSONObject.getInt(c.a(field));
                }
            } else {
                if (class_.equals((Object)Integer.TYPE)) {
                    return ((Number)object).intValue();
                }
                if (class_.equals((Object)Float.TYPE)) {
                    return Float.valueOf((float)((Number)object).floatValue());
                }
                if (class_.equals((Object)Long.TYPE)) {
                    return ((Number)object).longValue();
                }
                if (class_.equals((Object)Double.TYPE)) {
                    object = ((Number)object).doubleValue();
                }
            }
        }
        return object;
    }
    private static String a(InputStream var0_1, String var1) {
        throw new IllegalStateException("Decompilation failed");
    }

    private <K, V> Map<K, V> a(Class<K> class_, Class<V> class_2, Class class_3, Field field, JSONObject jSONObject, Iterator<K> iterator) {
        HashMap hashMap = new HashMap();
        while (iterator.hasNext()) {
            String string;
            JSONObject jSONObject2;
            Enum<?> enum_ = iterator.next();
            Object object = class_.equals(Integer.class) ? class_.cast((Object)Integer.parseInt((String)((String)((Object)enum_)))) : enum_;
            if (class_.isEnum()) {
                object = this.a(object.toString(), class_);
            }
            if ((jSONObject2 = jSONObject.optJSONObject(string = (String)((Object)enum_))) == null) {
                JSONArray jSONArray = jSONObject.optJSONArray(string);
                if (jSONArray == null) {
                    if (class_2.isEnum()) {
                        hashMap.put(object, this.a((String)jSONObject.get(string), class_2));
                        continue;
                    }
                    hashMap.put(object, jSONObject.get(string));
                    continue;
                }
                hashMap.put(object, this.a(class_3, jSONArray));
                continue;
            }
            hashMap.put(object, this.b(class_2, jSONObject2));
        }
        return hashMap;
    }

    private <V> Set a(Class<V> class_, Field field, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            hashSet.add(a.super.a(jSONArray.getString(i2), class_));
        }
        return hashSet;
    }

    private <V> Set<V> a(Class<V> class_, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject = jSONArray.optJSONObject(i2);
            if (jSONObject == null) {
                hashSet.add(jSONArray.get(i2));
                continue;
            }
            hashSet.add(a.super.b(class_, jSONObject));
        }
        return hashSet;
    }

    private <T> Field[] a(Class<T> class_, Field[] arrfield) {
        int n2 = arrfield.length;
        Field[] arrfield2 = class_.getSuperclass().getDeclaredFields();
        int n3 = arrfield2.length;
        Field[] arrfield3 = new Field[n2 + n3];
        System.arraycopy((Object)arrfield, (int)0, (Object)arrfield3, (int)0, (int)n2);
        System.arraycopy((Object)arrfield2, (int)0, (Object)arrfield3, (int)n2, (int)n3);
        return arrfield3;
    }
    private <T> T b(Class<T> var1, JSONObject var2_2) {
        block44 : {
            block43 : {
                if (this.b == null && this.c == null) {
                    throw new d("Can't read object, the input is null.");
                }
                if (this.c == null) {
                    try {
                        this.c = a.a(this.b, null);
                    }
                    catch (Exception var59_3) {
                        throw new d("Can't read input stream.", var59_3);
                    }
                }
                if (var2_2 == null) {
                    try {
                        var3_5 = var57_4 = new JSONObject(this.c);
                    }
                    catch (JSONException var58_6) {
                        throw new d("Can't deserialize the object. Failed to create JSON object.", var58_6);
                    }
                } else {
                    var3_5 = var2_2;
                }
                try {
                    var5_7 = (e)var1.getAnnotation(e.class);
                    var6_8 = Build.VERSION.SDK_INT;
                    var7_9 = true;
                    if (var6_8 >= 9 && var1.equals(HttpCookie.class)) {
                        var55_10 = var1.getDeclaredConstructors()[0];
                        var55_10.setAccessible(var7_9);
                        var56_11 = new Object[2];
                        var56_11[0] = "name";
                        var56_11[var7_9] = "value";
                        var9_12 = var55_10.newInstance(var56_11);
                    } else {
                        if (var1.isPrimitive()) {
                            return (T)var1.newInstance();
                        }
                        if (var1.getAnnotation(e.class) != null && !var5_7.c()) {
                            var45_13 = var5_7.c();
                            if (!var45_13) {
                                try {
                                    var48_14 = var3_5.getString(var5_7.a());
                                    var49_15 = var5_7.b();
                                    var50_16 = new StringBuilder();
                                    var50_16.append(var49_15);
                                    var50_16.append(".");
                                    var50_16.append(var48_14);
                                    var54_17 = a.super.b(Class.forName((String)var50_16.toString()), var3_5);
                                }
                                catch (JSONException var47_18) {
                                    throw new d("Problem instantiating object class ", var47_18);
                                }
                                catch (ClassNotFoundException var46_19) {
                                    throw new d("Problem instantiating object class ", var46_19);
                                }
                                return var54_17;
                            }
                            break block43;
                        }
                        var8_20 = var1.getDeclaredConstructor(new Class[0]);
                        var8_20.setAccessible(var7_9);
                        var9_12 = var8_20.newInstance(new Object[0]);
                    }
                    var10_21 = var9_12;
                    break block44;
                }
                catch (Exception var4_55) {
                    throw new d("Can't deserialize the object. Failed to instantiate object.", var4_55);
                }
            }
            var10_21 = null;
        }
        var11_22 = var1.getDeclaredFields();
        if (var5_7 != null && var5_7.c()) {
            var11_22 = a.super.a(var1, var11_22);
        }
        var12_23 = var11_22;
        var13_24 = var12_23.length;
        var14_25 = 0;
        do {
            block45 : {
                block46 : {
                    if (var14_25 >= var13_24) {
                        return (T)var10_21;
                    }
                    var15_30 = var12_23[var14_25];
                    var16_35 = var15_30.getModifiers();
                    if (Modifier.isStatic((int)var16_35) || Modifier.isTransient((int)var16_35)) break block46;
                    var19_42 = c.a(var15_30);
                    try {
                        try {
                            if (!var3_5.has(var19_42)) ** GOTO lbl-1000
                            var15_30.setAccessible(var7_9);
                            if (var15_30.getDeclaredAnnotations().length <= 0 || !(var43_44 = var15_30.getDeclaredAnnotations()[0]).annotationType().equals(f.class)) ** GOTO lbl89
                            var44_39 = (f)var43_44;
                            var25_32 = var44_39.b();
                            var26_31 = var44_39.d();
                            var27_45 = var44_39.c();
                            var28_27 = var44_39.a();
                            var29_41 = var44_39.e();
                            var24_51 = true;
                            ** GOTO lbl95
lbl-1000: // 1 sources:
                            {
                                var21_34 = var19_42;
                                var17_33 = var14_25;
                                var18_47 = var13_24;
                                if (Constants.a().booleanValue()) {
                                    h.a("JSONInputStream", 4, String.format((String)"Field [%s] doesn't exist. Keeping default value.", (Object[])new Object[]{var21_34}));
                                }
                                break block45;
lbl89: // 1 sources:
                                var24_51 = false;
                                var25_32 = null;
                                var26_31 = null;
                                var27_45 = null;
                                var28_27 = false;
                                var29_41 = null;
lbl95: // 2 sources:
                                if (var15_30.getType().getAnnotation(e.class) != null) {
                                    var36_29 = (e)var15_30.getType().getAnnotation(e.class);
                                    var37_28 = var3_5.getJSONObject(var19_42).getString(var36_29.a());
                                    var38_50 = var36_29.b();
                                    var39_49 = new StringBuilder();
                                    var39_49.append(var38_50);
                                    var39_49.append(".");
                                    var39_49.append(var37_28);
                                    var15_30.set(var10_21, a.super.b(Class.forName((String)var39_49.toString()), var3_5.getJSONObject(var19_42)));
                                    break block46;
                                }
                                if (var28_27) {
                                    var15_30.set(var10_21, a.super.b(var15_30.getType(), var3_5.getJSONObject(var19_42)));
                                    break block46;
                                }
                                if (!var24_51 || !Map.class.isAssignableFrom(var25_32) && !Collection.class.isAssignableFrom(var25_32)) break block47;
                                if (!var25_32.equals(HashMap.class)) break block48;
                                var30_40 = var3_5.getJSONObject(var19_42);
                                var31_53 = var30_40.keys();
                                var32_48 = var26_31;
                                var33_26 = var27_45;
                                var34_46 = var29_41;
                                var21_34 = var19_42;
                                var17_33 = var14_25;
                                var18_47 = var13_24;
                            }
                        }
                        catch (Exception var20_38) {
                            var21_34 = var19_42;
                            var17_33 = var14_25;
                            var18_47 = var13_24;
                        }
                        {
                            block47 : {
                                block48 : {
                                    ** try [egrp 6[TRYBLOCK] [23 : 793->1143)] { 
lbl124: // 1 sources:
                                    var15_30.set(var10_21, a.super.a(var32_48, var33_26, var34_46, var15_30, var30_40, var31_53));
                                    break block45;
                                }
                                var21_34 = var19_42;
                                var17_33 = var14_25;
                                var18_47 = var13_24;
                                if (var25_32.equals(ArrayList.class)) {
                                    var15_30.set(var10_21, a.super.b(var27_45, var15_30, var3_5.getJSONArray(var21_34)));
                                } else if (var25_32.equals(HashSet.class)) {
                                    var15_30.set(var10_21, a.super.a(var27_45, var3_5.getJSONArray(var21_34)));
                                } else if (var25_32.equals(EnumSet.class)) {
                                    var15_30.set(var10_21, (Object)a.super.a(var27_45, var15_30, var3_5.getJSONArray(var21_34)));
                                }
                                break block45;
                            }
                            var21_34 = var19_42;
                            var17_33 = var14_25;
                            var18_47 = var13_24;
                            if (var15_30.getType().isEnum()) {
                                var15_30.set(var10_21, a.super.a((String)var3_5.get(var21_34), var25_32));
                            } else if (var15_30.getType().isPrimitive()) {
                                var15_30.set(var10_21, a.a(var3_5, var15_30, var3_5.get(var21_34), var15_30.getType()));
                            } else if (var15_30.getType().isArray()) {
                                var15_30.set(var10_21, a.super.a(var3_5, var25_32, var15_30));
                            } else {
                                var35_52 = a.a(var3_5.get(var21_34), var15_30.getType());
                                if (var35_52.equals(null)) {
                                    var15_30.set(var10_21, null);
                                } else {
                                    var15_30.set(var10_21, var35_52);
                                }
                            }
                            break block45;
                        }
lbl158: // 1 sources:
                        catch (Exception var20_37) {
                        }
                    }
                    catch (Throwable var23_54) {
                        throw new d("Unknown error occurred ", var23_54);
                    }
                    var22_43 = new Object[]{var21_34, var20_36.toString()};
                    h.a("JSONInputStream", 6, String.format((String)"Failed to get field [%s] %s", (Object[])var22_43));
                    break block45;
                }
                var17_33 = var14_25;
                var18_47 = var13_24;
            }
            var14_25 = var17_33 + 1;
            var13_24 = var18_47;
            var7_9 = true;
        } while (true);
    }

    private <V> List<V> b(Class<V> class_, Field field, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject = jSONArray.optJSONObject(i2);
            if (jSONObject == null) {
                arrayList.add(jSONArray.get(i2));
                continue;
            }
            arrayList.add(a.super.b(class_, jSONObject));
        }
        return arrayList;
    }

    private <T> T[] b(JSONObject jSONObject, Class<T> class_, Field field) {
        JSONArray jSONArray = jSONObject.getJSONArray(c.a(field));
        int n2 = jSONArray.length();
        Object object = Array.newInstance(class_, (int)n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set((Object)object, (int)i2, a.super.b(class_, jSONArray.getJSONObject(i2)));
        }
        return (Object[])object;
    }

    public final <T> T a(Class<T> class_, JSONObject jSONObject) {
        T t2;
        try {
            t2 = a.super.b(class_, jSONObject);
        }
        catch (d d2) {
            StringBuilder stringBuilder = new StringBuilder("Error while trying to parse object ");
            stringBuilder.append(class_.toString());
            h.a("JSONInputStream", 6, stringBuilder.toString(), (Throwable)((Object)d2));
            return null;
        }
        return t2;
    }

    public void close() {
        super.close();
        if (this.b != null) {
            this.b.close();
        }
    }

    @Deprecated
    public final int read() {
        return 0;
    }
}

