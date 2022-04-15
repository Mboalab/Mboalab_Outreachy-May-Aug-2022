package com.startapp.common.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b
implements CookieStore {
    private final CookieStore a;
    private final SharedPreferences b;

    public b(Context context) {
        Context context2 = context.getApplicationContext();
        this.b = context2.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0);
        this.a = new CookieManager().getCookieStore();
        String string = this.b.getString("names", null);
        if (string != null) {
            for (String string2 : TextUtils.split((String)string, (String)";")) {
                HttpCookie httpCookie;
                String string3 = this.b.getString("cookie_".concat(String.valueOf((Object)string2)), null);
                if (string3 == null || (httpCookie = com.startapp.common.b.b.a(string3, HttpCookie.class)) == null) continue;
                if (httpCookie.hasExpired()) {
                    b.super.a(httpCookie);
                    b.super.b();
                    continue;
                }
                this.a.add(URI.create((String)httpCookie.getDomain()), httpCookie);
            }
        }
    }

    private void a() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.clear();
        editor.commit();
    }

    private void a(HttpCookie httpCookie) {
        SharedPreferences.Editor editor = this.b.edit();
        StringBuilder stringBuilder = new StringBuilder("cookie_");
        stringBuilder.append(b.super.b(httpCookie));
        editor.remove(stringBuilder.toString());
        editor.commit();
    }

    private void a(HttpCookie httpCookie, String string) {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putString("cookie_".concat(String.valueOf((Object)string)), com.startapp.common.b.b.a((Object)httpCookie));
        editor.commit();
    }

    private String b(HttpCookie httpCookie) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(httpCookie.getDomain());
        stringBuilder.append("_");
        stringBuilder.append(httpCookie.getName());
        return stringBuilder.toString();
    }

    private void b() {
        SharedPreferences.Editor editor = this.b.edit();
        editor.putString("names", TextUtils.join((CharSequence)";", this.c()));
        editor.commit();
    }

    private Set<String> c() {
        HashSet hashSet = new HashSet();
        Iterator iterator = this.a.getCookies().iterator();
        while (iterator.hasNext()) {
            hashSet.add((Object)this.b((HttpCookie)iterator.next()));
        }
        return hashSet;
    }

    public void add(URI uRI, HttpCookie httpCookie) {
        String string = b.super.b(httpCookie);
        this.a.add(uRI, httpCookie);
        b.super.a(httpCookie, string);
        b.super.b();
    }

    public List<HttpCookie> get(URI uRI) {
        return this.a.get(uRI);
    }

    public List<HttpCookie> getCookies() {
        return this.a.getCookies();
    }

    public List<URI> getURIs() {
        return this.a.getURIs();
    }

    public boolean remove(URI uRI, HttpCookie httpCookie) {
        if (this.a.remove(uRI, httpCookie)) {
            b.super.a(httpCookie);
            b.super.b();
            return true;
        }
        return false;
    }

    public boolean removeAll() {
        if (this.a.removeAll()) {
            this.a();
            this.b();
            return true;
        }
        return false;
    }
}

