/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.databinding.ObservableBoolean
 *  android.databinding.ObservableInt
 *  android.databinding.ViewDataBinding
 *  android.databinding.g
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$Adapter
 *  android.support.v7.widget.RecyclerView$AdapterDataObserver
 *  android.support.v7.widget.RecyclerView$ViewHolder
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  com.bumptech.glide.e
 *  com.bumptech.glide.f.b.i
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.databinding.g;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.e;
import com.bumptech.glide.f.b.i;
import com.newandromo.dev338923.app614241.ac;
import com.newandromo.dev338923.app614241.ad;
import com.newandromo.dev338923.app614241.ah;
import com.newandromo.dev338923.app614241.bc;
import com.newandromo.dev338923.app614241.be;
import com.newandromo.dev338923.app614241.bf;
import com.newandromo.dev338923.app614241.bj;
import com.newandromo.dev338923.app614241.bs;
import com.newandromo.dev338923.app614241.bu;
import com.newandromo.dev338923.app614241.bz;
import com.newandromo.dev338923.app614241.ce;
import com.newandromo.dev338923.app614241.cf;
import com.newandromo.dev338923.app614241.ch;
import com.newandromo.dev338923.app614241.cj;
import com.newandromo.dev338923.app614241.cv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class bd<T extends bc>
extends RecyclerView.Adapter<bj>
implements bs,
ch {
    private final be<T> a;
    private final cf b;
    private LayoutInflater c;
    protected RecyclerView d;
    protected boolean e;
    protected int f;
    final ObservableBoolean g;
    private boolean h;
    private List<RecyclerView.AdapterDataObserver> i;
    private final ObservableInt j;
    private final ObservableInt k;
    private final String l;
    private ac m;
    private bu n;
    private int o;
    private int p;
    private int q;
    private ViewDataBinding r;
    private boolean s;
    private int t;

    public bd(cf cf2, String string) {
        super(cf2, string, (byte)0);
    }

    private bd(cf cf2, String string, byte by2) {
        this.j = new ObservableInt();
        this.k = new ObservableInt();
        this.g = new ObservableBoolean();
        this.p = 10;
        this.q = 10;
        this.t = 0;
        this.a = null;
        this.b = cf2;
        this.f = 0;
        this.e = false;
        this.l = string;
    }

    private bj a(ViewGroup viewGroup, int n2) {
        Context context = viewGroup.getContext();
        if (this.c == null) {
            this.c = LayoutInflater.from((Context)context);
        }
        ViewDataBinding viewDataBinding = g.a((LayoutInflater)LayoutInflater.from((Context)context), (int)n2, (ViewGroup)viewGroup);
        if (this.r == null && !cv.a()) {
            this.r = g.a((LayoutInflater)LayoutInflater.from((Context)context), (int)n2, (ViewGroup)viewGroup);
        }
        viewDataBinding.a(35, (Object)this.r);
        viewDataBinding.a(4, (Object)this.j);
        viewDataBinding.a(38, (Object)this.k);
        viewDataBinding.a(11, (Object)this.l);
        ObservableBoolean observableBoolean = this.g;
        boolean bl2 = true ^ cv.a(context);
        if (bl2 != observableBoolean.a) {
            observableBoolean.a = bl2;
            observableBoolean.f_();
        }
        viewDataBinding.a(32, (Object)this.g);
        return new bj(viewDataBinding);
    }

    /*
     * Exception decompiling
     */
    private void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public abstract T a(Context var1, int var2, int var3);

    @Override
    public final void a() {
        this.b();
    }

    @Override
    public final void a(int n2) {
        this.j.b(n2);
        if (this.s) {
            this.k.b(n2);
        }
    }

    public long getItemId(int n2) {
        return -1L;
    }

    public final int getItemViewType(int n2) {
        if (this.b != null) {
            return this.b.a();
        }
        if (this.a != null) {
            throw new IllegalStateException("getItem(int position) needs to be implemented if using an ItemBinder instead of a PositionBinder.");
        }
        throw new IllegalStateException("itemBinder and positionBinder are both null");
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
        this.c = null;
        this.t = 1 + this.t;
        if (!this.h) {
            if (this.m != null) {
                this.registerAdapterDataObserver(this.m.a);
            }
            if (this.n != null) {
                this.registerAdapterDataObserver(this.n.a);
            }
            if (!this.h && this.i != null) {
                Iterator iterator = this.i.iterator();
                while (iterator.hasNext()) {
                    super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver)iterator.next());
                }
                this.i.clear();
                this.i = null;
                this.h = true;
            }
            this.h = true;
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n2) {
        block12 : {
            block13 : {
                block16 : {
                    T t2;
                    bj bj2;
                    block15 : {
                        block14 : {
                            bj2 = (bj)viewHolder;
                            if (bj2 == null) break block12;
                            this.o = 1 + this.o;
                            if (this.n != null) {
                                this.n.a(this.o, this.getItemCount());
                            }
                            if (this.m != null) {
                                this.m.a(this.o, this.getItemCount());
                            }
                            ViewDataBinding viewDataBinding = bj2.a;
                            viewDataBinding.a(14, (Object)bj2.getAdapterPosition());
                            Context context = viewDataBinding.d.getContext();
                            int n3 = bj2.getItemViewType();
                            if (cv.a()) {
                                viewDataBinding.a(35, (Object)g.a((LayoutInflater)LayoutInflater.from((Context)context), (int)n3, null));
                            }
                            if (this.n != null) {
                                this.n.b(n2);
                            }
                            if (this.m != null) {
                                this.m.b(n2);
                            }
                            if ((t2 = this.a(context, n2, n3)) == null) break block13;
                            if (this.s) {
                                if (this.j.a != 0) {
                                    this.k.b(this.j.a);
                                } else {
                                    this.k.b(((bc)t2).c);
                                }
                            } else {
                                this.k.b(((bc)t2).c);
                            }
                            ((bc)t2).a(bj2.a.d.getContext());
                            ((bc)t2).f = null;
                            ((bc)t2).e = null;
                            ((bc)t2).j = bj2.b;
                            if (this.b == null) break block14;
                            bj2.a.a(9, t2);
                            break block15;
                        }
                        if (this.a == null) break block16;
                        bj2.a.a(this.a.a(), t2);
                    }
                    bj2.a.a(14, (Object)bj2.getAdapterPosition());
                    bj2.a.d.setTag(2131296259, t2);
                    bj2.a.b();
                    return;
                }
                throw new IllegalStateException("itemBinder and positionBinder are both null");
            }
            throw new IllegalStateException("onBindViewHolder item is null, position: ".concat(String.valueOf((int)n2)));
        }
        StringBuilder stringBuilder = new StringBuilder("ItemViewHolder for position ");
        stringBuilder.append(n2);
        stringBuilder.append(" is null");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n2) {
        return bd.super.a(viewGroup, n2);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        int n2;
        this.t = n2 = -1 + this.t;
        if (n2 <= 0) {
            bd.super.b();
        }
        this.d = null;
    }

    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        bj bj2 = (bj)viewHolder;
        this.o = -1 + this.o;
        e.a(new ah<Z>(bj2));
        Iterator iterator = bj2.b.iterator();
        while (iterator.hasNext()) {
            e.a((i)((ce)((Object)iterator.next())));
        }
        bj2.b.clear();
        if (bj2.a != null) {
            Context context = bj2.itemView.getContext();
            if (context instanceof bf) {
                ImageView imageView = (ImageView)((bf)context).getItemImageViewFromBinding(bj2.a);
                if (imageView != null) {
                    e.a((View)imageView);
                }
            } else {
                ImageView imageView = (ImageView)bj2.itemView.findViewById(2131296399);
                if (imageView != null) {
                    e.a((View)imageView);
                }
            }
        }
        super.onViewRecycled((RecyclerView.ViewHolder)bj2);
    }

    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (this.h) {
            super.registerAdapterDataObserver(adapterDataObserver);
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add((Object)adapterDataObserver);
    }
}

