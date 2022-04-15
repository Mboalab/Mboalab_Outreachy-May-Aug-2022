package com.startapp.common.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.startapp.common.g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

public final class b {
    private static c a;

    public static b a() {
        return e.a;
    }

    public static boolean a(String string) {
        try {
            Class.forName((String)string);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public static a b(Context context) {
        if (b.b()) {
            return b.c(context);
        }
        return b.d(context);
    }

    public static boolean b() {
        return b.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private static a c(Context context) {
        try {
            Method method = Class.forName((String)"com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class});
            Object[] arrobject = new Object[]{context.getApplicationContext()};
            Object object = method.invoke(null, arrobject);
            a a2 = new a((String)object.getClass().getMethod("getId", new Class[0]).invoke(object, new Object[0]), (Boolean)object.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(object, new Object[0]), "APP");
            return a2;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
    private static a d(Context context) {
        Throwable throwable2222;
        if (Looper.myLooper() == Looper.getMainLooper()) throw new IllegalStateException("Cannot be called from the main thread");
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        b b2 = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.getApplicationContext().bindService(intent, (ServiceConnection)b2, 1)) throw new IOException("Google Play connection failed");
        d d2 = new d(b2.a());
        a a2 = new a(d2.a(), d2.a(true), "DEVICE");
        context.getApplicationContext().unbindService((ServiceConnection)b2);
        return a2;
        {
            catch (Throwable throwable2222) {
            }
            catch (Exception exception) {}
            {
                throw exception;
            }
        }
        context.getApplicationContext().unbindService((ServiceConnection)b2);
        throw throwable2222;
    }

    public final c a(final Context context) {
        if (a == null) {
            a = new c();
            try {
                this.a(b.b(context));
            }
            catch (Exception exception) {
                exception.getStackTrace();
                a.a("0");
            }
        } else {
            g.a(g.a.b, new Runnable(){
                public void run() {
                    throw new IllegalStateException("Decompilation failed");
                }
            });
        }
        return a;
    }

    protected final void a(a a2) {
        void var3_2 = this;
        synchronized (var3_2) {
            a.a(a2.a());
            a.a(a2.b());
            a.b(a2.c());
            return;
        }
    }

    public static final class a {
        private final String a;
        private final boolean b;
        private final String c;

        a(String string, boolean bl2, String string2) {
            this.a = string;
            this.b = bl2;
            this.c = string2;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }
    }

    protected static final class b
    implements ServiceConnection {
        boolean a = false;
        private final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue(1);

        protected b() {
        }

        public final IBinder a() {
            if (!this.a) {
                this.a = true;
                return (IBinder)this.b.take();
            }
            throw new IllegalStateException();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put((Object)iBinder);
                return;
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static class c {
        private String a = "";
        private String b = "";
        private boolean c = false;

        public String a() {
            return this.a;
        }

        public void a(String string) {
            this.a = string;
        }

        public void a(boolean bl2) {
            this.c = bl2;
        }

        public void b(String string) {
            this.b = string;
        }

        public boolean b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }
    }

    static final class d
    implements IInterface {
        private IBinder a;

        public d(IBinder iBinder) {
            this.a = iBinder;
        }

        public final String a() {
            Parcel parcel = Parcel.obtain();
            Parcel parcel2 = Parcel.obtain();
            try {
                parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcel, parcel2, 0);
                parcel2.readException();
                String string = parcel2.readString();
                return string;
            }
            finally {
                parcel2.recycle();
                parcel.recycle();
            }
        }

        public final boolean a(boolean bl2) {
            Parcel parcel;
            Parcel parcel2;
            boolean bl3;
            block2 : {
                parcel = Parcel.obtain();
                parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel.writeInt((int)bl2);
                    this.a.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    int n2 = parcel2.readInt();
                    bl3 = false;
                    if (n2 == 0) break block2;
                    bl3 = true;
                }
                catch (Throwable throwable) {
                    parcel2.recycle();
                    parcel.recycle();
                    throw throwable;
                }
            }
            parcel2.recycle();
            parcel.recycle();
            return bl3;
        }

        public final IBinder asBinder() {
            return this.a;
        }
    }

    static class e {
        private static final b a = new b();
    }

}

