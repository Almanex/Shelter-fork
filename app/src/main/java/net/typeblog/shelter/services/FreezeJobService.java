package net.typeblog.shelter.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

/**
 * JobService for handling delayed app freezing tasks in Android 16+
 * Replaces AlarmManager for better battery optimization and quota compliance
 */
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class FreezeJobService extends JobService {
    private static final String TAG = "FreezeJobService";
    
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "Starting freeze job with ID: " + params.getJobId());
        
        // Perform the freeze work in background thread
        new Thread(() -> {
            try {
                FreezeService.performFreezeWork(this);
                Log.d(TAG, "Freeze job completed successfully");
            } catch (Exception e) {
                Log.e(TAG, "Error during freeze job execution", e);
            } finally {
                // Job finished, notify system
                jobFinished(params, false);
            }
        }).start();
        
        // Return true to indicate work is being done asynchronously
        return true;
    }
    
    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d(TAG, "Job stopped with ID: " + params.getJobId());
        // Return false to indicate job should not be rescheduled
        return false;
    }
}