package com.startapp.common.a;
import android.content.Context;
import android.location.Location;
import com.startapp.common.a.c;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class g {
    public static String a(List<Location> list) {
        StringBuilder stringBuilder = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (Location location : list) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(location.getLongitude());
                stringBuilder2.append(",");
                stringBuilder.append(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(location.getLatitude());
                stringBuilder3.append(",");
                stringBuilder.append(stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(location.getAccuracy());
                stringBuilder4.append(",");
                stringBuilder.append(stringBuilder4.toString());
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(location.getProvider());
                stringBuilder5.append(",");
                stringBuilder.append(stringBuilder5.toString());
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(location.getTime());
                stringBuilder6.append(";");
                stringBuilder.append(stringBuilder6.toString());
            }
            return stringBuilder.toString().substring(0, -1 + stringBuilder.toString().length());
        }
        return stringBuilder.toString();
    }
    public static List<Location> a(Context var0, boolean var1, boolean var2) {
        throw new IllegalStateException("Decompilation failed");
    }

    private static Queue<String> b(Context context, boolean bl2, boolean bl3) {
        LinkedList linkedList = new LinkedList();
        if (bl2 && c.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            linkedList.add((Object)"gps");
            linkedList.add((Object)"passive");
            linkedList.add((Object)"network");
            return linkedList;
        }
        if (bl3 && c.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            linkedList.add((Object)"network");
        }
        return linkedList;
    }
}

