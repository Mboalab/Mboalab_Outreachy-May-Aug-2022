package com.startapp.android.publish.common.metaData;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Handler;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.common.metaData.e;
import com.startapp.android.publish.common.metaData.f;
import com.startapp.common.a.h;
import com.startapp.common.g;

@TargetApi(value=21)
public class PeriodicJobService
extends JobService {
    private static final String TAG = "PeriodicJobService";

    void finish(JobParameters jobParameters) {
        try {
            this.jobFinished(jobParameters, false);
            return;
        }
        catch (Exception exception) {
            com.startapp.android.publish.adsCommon.e.f.a(this.getApplicationContext(), d.b, "PeriodicJobService.finish", exception.getMessage(), "");
            return;
        }
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        final int n2 = jobParameters.getJobId();
        StringBuilder stringBuilder = new StringBuilder("onStartJob with id = [");
        stringBuilder.append(n2);
        stringBuilder.append("]");
        h.a(TAG, 3, stringBuilder.toString());
        g.a(g.a.a, new Runnable(){

            public void run() {
                Context context = PeriodicJobService.this.getApplicationContext();
                int n22 = n2;
                if (n22 != 1022) {
                    if (n22 != 1033) {
                        PeriodicJobService.this.jobFinished(jobParameters, false);
                        return;
                    }
                    e.a(context, new Runnable(){

                        public void run() {
                            PeriodicJobService.this.finish(jobParameters);
                            PeriodicJobService.this.setAlarmWithDelay(n2);
                        }
                    });
                    return;
                }
                f.a(context, new Runnable(){

                    public void run() {
                        PeriodicJobService.this.finish(jobParameters);
                        PeriodicJobService.this.setAlarmWithDelay(n2);
                    }
                });
            }

        });
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        int n2 = jobParameters.getJobId();
        StringBuilder stringBuilder = new StringBuilder("onStopJob with id = [");
        stringBuilder.append(n2);
        stringBuilder.append("]");
        h.a(TAG, 3, stringBuilder.toString());
        this.setAlarm(n2);
        return false;
    }
    void setAlarm(int var1) {
        var2_2 = this.getApplicationContext();
        if (var1 == 1022) ** GOTO lbl8
        if (var1 != 1033) {
            return;
        }
        try {
            b.c(var2_2);
            return;
lbl8:
            b.b(var2_2);
            return;
        }
        catch (Exception var3_3) {
            com.startapp.android.publish.adsCommon.e.f.a(var2_2, d.b, "PeriodicJobService.setAlarm", var3_3.getMessage(), "");
            return;
        }
    }

    void setAlarmWithDelay(final int n2) {
        try {
            new Handler().postDelayed(new Runnable(){

                public void run() {
                    PeriodicJobService.this.setAlarm(n2);
                }
            }, 5000L);
            return;
        }
        catch (Exception exception) {
            com.startapp.android.publish.adsCommon.e.f.a(this.getApplicationContext(), d.b, "PeriodicJobService.setAlarmWithDelay", exception.getMessage(), "");
            return;
        }
    }

}

