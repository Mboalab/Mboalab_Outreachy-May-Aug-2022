package com.startapp.common;
import android.os.Build;
import com.startapp.common.a.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class g {
    private static final String a = "g";
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final ThreadFactory e;
    private static final RejectedExecutionHandler f;
    private static final Executor g;
    private static final Executor h;
    private static final ScheduledExecutorService i;

    static {
        int n2 = Build.VERSION.SDK_INT < 22 ? 10 : 20;
        b = n2;
        int n3 = Build.VERSION.SDK_INT < 22 ? 4 : 8;
        c = n3;
        d = new ThreadFactory(){
            private final AtomicInteger a = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable) {
                StringBuilder stringBuilder = new StringBuilder("highPriorityThreadFactory #");
                stringBuilder.append(this.a.getAndIncrement());
                return new Thread(runnable, stringBuilder.toString());
            }
        };
        e = new ThreadFactory(){
            private final AtomicInteger a = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable) {
                StringBuilder stringBuilder = new StringBuilder("defaultPriorityThreadFactory #");
                stringBuilder.append(this.a.getAndIncrement());
                return new Thread(runnable, stringBuilder.toString());
            }
        };
        f = new RejectedExecutionHandler(){

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                h.a(a, 6, "ThreadPoolExecutor rejected execution! ".concat(String.valueOf((Object)threadPoolExecutor)));
            }
        };
        int n4 = b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n4, n4, 20L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), d, f);
        g = threadPoolExecutor;
        int n5 = c;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(n5, n5, 20L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), e, f);
        h = threadPoolExecutor2;
        i = new ScheduledThreadPoolExecutor(1);
    }

    public static ScheduledFuture<?> a(Runnable runnable, long l2) {
        return i.schedule(runnable, l2, TimeUnit.MILLISECONDS);
    }
    public static void a(a var0, Runnable var1) {
        throw new IllegalStateException("Decompilation failed");
    }

    public static final class a
    extends Enum<a> {
        public static final a a = new a();
        public static final a b = new a();
        private static final a[] c;

        static {
            a[] arra = new a[]{a, b};
            c = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }
    }

}

