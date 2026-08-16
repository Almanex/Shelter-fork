package net.typeblog.shelter.services;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class FreezeJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        FreezeService.performFreezeWork(this);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
