/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Set
 */
package com.startapp.android.publish.adsCommon.Utils;

import com.startapp.android.publish.adsCommon.Utils.NameValueObject;
import com.startapp.android.publish.adsCommon.Utils.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class d
extends e {
    private List<NameValueObject> a = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string, Object object, boolean bl2, boolean bl3) {
        if (bl2 && object == null) {
            StringBuilder stringBuilder = new StringBuilder("Required key: [");
            stringBuilder.append(string);
            stringBuilder.append("] is missing");
            throw new com.startapp.common.e(stringBuilder.toString(), null);
        }
        if (object != null && !object.toString().equals((Object)"")) {
            try {
                NameValueObject nameValueObject = new NameValueObject();
                nameValueObject.setName(string);
                String string2 = object.toString();
                if (bl3) {
                    string2 = URLEncoder.encode((String)string2, (String)"UTF-8");
                }
                nameValueObject.setValue(string2);
                this.a.add((Object)nameValueObject);
                return;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                if (!bl2) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("failed encoding value: [");
                stringBuilder.append(object);
                stringBuilder.append("]");
                throw new com.startapp.common.e(stringBuilder.toString(), unsupportedEncodingException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(String var1, Set<String> var2, boolean var3, boolean var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl42 : ALOAD : trying to set 1 previously set to 0
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a == null) {
            return stringBuilder.toString();
        }
        stringBuilder.append('?');
        for (NameValueObject nameValueObject : this.a) {
            Set<String> set;
            if (nameValueObject.getValue() != null) {
                stringBuilder.append(nameValueObject.getName());
                stringBuilder.append('=');
                stringBuilder.append(nameValueObject.getValue());
                stringBuilder.append('&');
                continue;
            }
            if (nameValueObject.getValueSet() == null || (set = nameValueObject.getValueSet()) == null) continue;
            for (String string : set) {
                stringBuilder.append(nameValueObject.getName());
                stringBuilder.append('=');
                stringBuilder.append(string);
                stringBuilder.append('&');
            }
        }
        if (stringBuilder.length() != 0) {
            stringBuilder.deleteCharAt(-1 + stringBuilder.length());
        }
        return stringBuilder.toString().replace((CharSequence)"+", (CharSequence)"%20");
    }
}

