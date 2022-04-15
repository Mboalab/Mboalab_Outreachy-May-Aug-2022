/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.util.AttributeSet
 *  android.widget.ImageView
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TintableImageView
extends ImageView {
    private ColorStateList a;
    private PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;

    public TintableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintableImageView.super.a(context, attributeSet, 0);
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        TintableImageView.super.a(context, attributeSet, n2);
    }

    private void a() {
        if (this.a != null) {
            this.setColorFilter(this.a.getColorForState(this.getDrawableState(), 0), this.b);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(Context var1, AttributeSet var2, int var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl33.1 : RETURN : trying to set 0 previously set to 1
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

    public final void a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        this.a = colorStateList;
        this.b = mode;
        if (colorStateList != null) {
            super.setColorFilter(colorStateList.getColorForState(this.getDrawableState(), 0), mode);
            this.invalidate();
            return;
        }
        super.clearColorFilter();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a();
        }
    }
}

