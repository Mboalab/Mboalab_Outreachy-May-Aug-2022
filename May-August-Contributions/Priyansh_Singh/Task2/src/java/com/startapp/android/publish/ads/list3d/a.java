package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.startapp.android.publish.ads.list3d.g;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.common.a.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a {
    HashMap<String, i> a = new HashMap();
    Hashtable<String, Bitmap> b = new Hashtable();
    Set<String> c = new HashSet();
    g d;
    int e = 0;
    ConcurrentLinkedQueue<b> f = new ConcurrentLinkedQueue();

    public Bitmap a(int n2, String string, String string2) {
        Bitmap bitmap = (Bitmap)this.b.get((Object)string);
        if (bitmap != null) {
            return bitmap;
        }
        if (!this.c.contains((Object)string)) {
            this.c.add((Object)string);
            if (this.e >= 15) {
                this.f.add((Object)(a)this.new b(n2, string, string2));
            } else {
                this.e = 1 + this.e;
                (a)this.new a(n2, string, string2).execute((Object[])new Void[0]);
            }
        }
        return null;
    }

    public void a() {
        this.c.clear();
        this.e = 0;
        this.f.clear();
        if (this.a != null) {
            for (String string : this.a.keySet()) {
                ((i)this.a.get((Object)string)).a(false);
            }
            this.a.clear();
        }
    }

    public void a(Context context, String string, String string2, com.startapp.android.publish.adsCommon.d.b b2, long l2) {
        if (this.a.containsKey((Object)string2)) {
            return;
        }
        i i2 = new i(context, new String[]{string2}, b2, l2);
        this.a.put((Object)string2, (Object)i2);
        i2.a();
    }

    public void a(g g2, boolean bl) {
        this.d = g2;
        if (bl) {
            this.a();
        }
    }

    public void a(String string) {
        if (this.a != null && this.a.containsKey((Object)string) && this.a.get((Object)string) != null) {
            ((i)this.a.get((Object)string)).a(true);
        }
    }

    public void b() {
        for (String string : this.a.keySet()) {
            if (this.a.get((Object)string) == null) continue;
            ((i)this.a.get((Object)string)).b();
        }
    }

    public void c() {
        for (String string : this.a.keySet()) {
            if (this.a.get((Object)string) == null) continue;
            ((i)this.a.get((Object)string)).a();
        }
    }

    public void d() {
        for (String string : this.a.keySet()) {
            if (this.a.get((Object)string) == null) continue;
            ((i)this.a.get((Object)string)).a(false);
        }
    }

    public void e() {
        if (!this.f.isEmpty()) {
            b b2 = (b)this.f.poll();
            new a(b2.a, b2.b, b2.c).execute((Object[])new Void[0]);
        }
    }

    class a
    extends AsyncTask<Void, Void, Bitmap> {
        int a = -1;
        String b;
        String c;

        public a(int n2, String string, String string2) {
            this.a = n2;
            this.b = string;
            this.c = string2;
        }

        protected /* varargs */ Bitmap a(Void ... arrvoid) {
            return e.b((String)this.c);
        }

        protected void a(Bitmap bitmap) {
            a a2 = a.this;
            a2.e = -1 + a2.e;
            if (bitmap != null) {
                a.this.b.put((Object)this.b, (Object)bitmap);
                if (a.this.d != null) {
                    a.this.d.a(this.a);
                }
                a.this.e();
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] arrobject) {
            return this.a((Void[])arrobject);
        }

        protected /* synthetic */ void onPostExecute(Object object) {
            this.a((Bitmap)object);
        }
    }

    class b {
        int a;
        String b;
        String c;

        public b(int n2, String string, String string2) {
            this.a = n2;
            this.b = string;
            this.c = string2;
        }
    }

}

