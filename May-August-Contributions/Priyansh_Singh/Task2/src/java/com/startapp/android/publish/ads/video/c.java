/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.startapp.common.a.h
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URL
 *  java.net.URLConnection
 */
package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.video.b.c;
import com.startapp.android.publish.ads.video.h;
import com.startapp.android.publish.adsCommon.n;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class c {
    private boolean a;
    private c.c b;
    private String c;

    private c() {
        this.a = true;
        this.b = null;
        this.c = null;
    }

    /* synthetic */ c(1 var1) {
    }

    public static c a() {
        return b.a;
    }

    private void a(final int n2) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(){

                public void run() {
                    if (c.this.b != null) {
                        c.this.b.a(n2);
                    }
                }
            });
        }
    }

    /*
     * Exception decompiling
     */
    private void a(Context var1, File var2, File var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl64 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1112)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:587)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    private void a(final a a2, final String string) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public void run() {
                a2.a(string);
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String a(Context var1_1, URL var2_4, String var3_3, a var4) {
        block34 : {
            block36 : {
                block35 : {
                    block33 : {
                        com.startapp.common.a.h.a((String)"StartAppWall.ProgressiveVideoManager", (int)3, (String)"Downloading video from ".concat(String.valueOf((Object)var2_4)));
                        this.c = var2_4.toString();
                        this.a = true;
                        var5_5 = com.startapp.android.publish.adsCommon.b.a().G().l();
                        var16_6 = h.a(var1_1, var3_3);
                        var17_7 = new File(var16_6);
                        var18_8 = var17_7.exists();
                        if (!var18_8) break block33;
                        try {
                            this.c = null;
                            null.close();
                            null.close();
                            null.close();
                            return var16_6;
                        }
                        catch (Exception v0) {}
                        return var16_6;
                    }
                    var19_9 = var2_4.openConnection();
                    var19_9.connect();
                    var20_10 = var19_9.getContentLength();
                    var12_11 = var19_9.getInputStream();
                    var21_12 = new DataInputStream(var12_11);
                    try {
                        var22_13 = new byte[4096];
                        var23_14 = new StringBuilder();
                        var23_14.append(var3_3);
                        var23_14.append(".temp");
                        var9_15 = var23_14.toString();
                        try {
                            var26_16 = new StringBuilder();
                            var26_16.append(var16_6);
                            var26_16.append(".temp");
                            var29_17 = var26_16.toString();
                            var7_18 = var1_1.openFileOutput(var9_15, 0);
                            var30_19 = 0;
                            var31_20 = false;
                            var32_21 = 0;
                            break block34;
                        }
                        catch (Exception var6_42) {
                            var10_30 = var21_12;
                            var8_46 = var12_11;
                            var7_18 = null;
                            ** GOTO lbl139
                        }
                    }
                    catch (Throwable var11_34) {
                        var10_30 = var21_12;
                        var7_18 = null;
                        ** GOTO lbl151
                    }
                    catch (Exception var6_43) {
                        var10_30 = var21_12;
                        var8_46 = var12_11;
                        var7_18 = null;
                        var9_15 = null;
                        ** GOTO lbl139
                    }
                    catch (Throwable var11_35) {
                        break block35;
                    }
                    catch (Exception var6_44) {
                        var8_46 = var12_11;
                        var7_18 = null;
                        break block36;
                    }
                    catch (Throwable var11_36) {
                        var12_11 = null;
                    }
                }
                var7_18 = null;
                var10_30 = null;
                ** GOTO lbl151
                catch (Exception var6_45) {
                    var7_18 = null;
                    var8_46 = null;
                }
            }
            var9_15 = null;
            var10_30 = null;
            ** GOTO lbl139
        }
        do {
            block38 : {
                block37 : {
                    block40 : {
                        block41 : {
                            block39 : {
                                var33_23 = var21_12.read(var22_13);
                                if (var33_23 <= 0 || !this.a) ** GOTO lbl103
                                var7_18.write(var22_13, 0, var33_23);
                                var38_28 = var30_19 + var33_23;
                                var39_27 = var16_6;
                                var40_29 = var38_28;
                                Double.isNaN((double)var40_29);
                                var43_26 = var40_29 * 100.0;
                                var10_30 = var21_12;
                                var45_22 = var22_13;
                                var46_24 = var20_10;
                                Double.isNaN((double)var46_24);
                                var49_25 = (int)(var43_26 / var46_24);
                                if (var49_25 < var5_5) break block37;
                                if (var31_20 || var4 == null) ** GOTO lbl98
                                c.super.a(var4, var29_17);
                                var31_20 = true;
lbl98: // 2 sources:
                                if (var49_25 < var32_21 + 1) break block37;
                                c.super.a(var49_25);
                                var30_19 = var38_28;
                                var32_21 = var49_25;
                                break block38;
lbl103: // 1 sources:
                                var34_31 = var16_6;
                                var10_30 = var21_12;
                                if (this.a || var33_23 <= 0) break block39;
                                com.startapp.common.a.h.a((String)"StartAppWall.ProgressiveVideoManager", (int)3, (String)"Video downloading disabled");
                                new File(h.a(var1_1, var9_15)).delete();
                                try {
                                    this.c = null;
                                    var12_11.close();
                                    var10_30.close();
                                    var7_18.close();
                                    return "downloadInterrupted";
                                }
                                catch (Exception v1) {}
                                return "downloadInterrupted";
                            }
                            c.super.a(var1_1, new File(h.a(var1_1, var9_15)), var17_7);
                            try {
                                this.c = null;
                                var12_11.close();
                                var10_30.close();
                                var7_18.close();
                                return var34_31;
                            }
                            catch (Exception v2) {}
                            return var34_31;
                            catch (Throwable var11_32) {
                                break block40;
                            }
                            catch (Exception var6_39) {
                                break block41;
                            }
                            catch (Throwable var11_33) {
                                var10_30 = var21_12;
                                break block40;
                            }
                            catch (Exception var6_40) {
                                var10_30 = var21_12;
                            }
                        }
                        var8_46 = var12_11;
lbl139: // 5 sources:
                        com.startapp.common.a.h.a((String)"StartAppWall.ProgressiveVideoManager", (int)6, (String)"Error downloading video from ".concat(String.valueOf((Object)var2_4)), (Throwable)var6_41);
                        new File(h.a(var1_1, var9_15)).delete();
                        try {
                            this.c = null;
                            var8_46.close();
                            var10_30.close();
                            var7_18.close();
                            return null;
                        }
                        catch (Exception v3) {}
                        return null;
                        catch (Throwable var11_38) {
                            var12_11 = var8_46;
                        }
                    }
                    try {
                        this.c = null;
                        var12_11.close();
                        var10_30.close();
                        var7_18.close();
                        throw var11_37;
                    }
                    catch (Exception v4) {}
                    throw var11_37;
                }
                var30_19 = var38_28;
            }
            var16_6 = var39_27;
            var21_12 = var10_30;
            var22_13 = var45_22;
        } while (true);
    }

    public void a(c.c c2) {
        this.b = c2;
    }

    public void a(String string) {
        if (string != null && string.equals((Object)this.c)) {
            this.a = false;
        }
    }

    public boolean b(String string) {
        return string != null && string.endsWith(".temp");
    }

    public void c(String string) {
        if (this.b(string)) {
            new File(string).delete();
        }
    }

    public static interface a {
        public void a(String var1);
    }

    static class b {
        private static final c a = new c(null);
    }

}

