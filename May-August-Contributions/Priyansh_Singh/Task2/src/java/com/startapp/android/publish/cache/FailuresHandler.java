
package com.startapp.android.publish.cache;

import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class FailuresHandler
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean infiniteLastRetry;
    @f(b="Ljava/util/ArrayList;", c="Ljava/lang/Integer;")
    private List<Integer> intervals;

    public FailuresHandler() {
        Object[] arrobject = new Integer[]{10, 30, 60, 300};
        this.intervals = Arrays.asList((Object[])arrobject);
        this.infiniteLastRetry = true;
    }

    public List<Integer> getIntervals() {
        return this.intervals;
    }

    public boolean isInfiniteLastRetry() {
        return this.infiniteLastRetry;
    }
}

