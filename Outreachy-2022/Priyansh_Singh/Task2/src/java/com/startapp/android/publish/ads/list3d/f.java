package com.startapp.android.publish.ads.list3d;

import com.startapp.android.publish.ads.list3d.e;
import com.startapp.common.a.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f {
    private static f a = new f();
    private Map<String, e> b = new ConcurrentHashMap();

    private f() {
    }

    public static f a() {
        return a;
    }

    public e a(String string) {
        if (this.b.containsKey((Object)string)) {
            return (e)this.b.get((Object)string);
        }
        e e2 = new e();
        this.b.put((Object)string, (Object)e2);
        StringBuilder stringBuilder = new StringBuilder("Created new model for uuid ");
        stringBuilder.append(string);
        stringBuilder.append(", Size = ");
        stringBuilder.append(this.b.size());
        h.a((String)"ListModelManager", (int)3, (String)stringBuilder.toString());
        return e2;
    }

    public void b(String string) {
        this.b.remove((Object)string);
        StringBuilder stringBuilder = new StringBuilder("Model for ");
        stringBuilder.append(string);
        stringBuilder.append(" was removed, Size = ");
        stringBuilder.append(this.b.size());
        h.a((String)"ListModelManager", (int)3, (String)stringBuilder.toString());
    }
}

