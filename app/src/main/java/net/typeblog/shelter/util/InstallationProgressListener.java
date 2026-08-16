package net.typeblog.shelter.util;

import android.app.Activity;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.LinearProgressIndicator;

import net.typeblog.shelter.R;

public class InstallationProgressListener extends PackageInstaller.SessionCallback {
    private AlertDialog mDialog;
    private LinearProgressIndicator mProgress;
    private int mSessionId;
    private PackageInstaller mPi;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    // Create a listener from an activity, and show a progress dialog for the sessionId
    // Only cares about the one sessionId provided here.
    // The caller is responsible for registering the callback;
    // however, this class will remove itself once the session has been finished.
    public InstallationProgressListener(Activity activity, PackageInstaller pi, int sessionId) {
        this(activity, pi, sessionId, null);
    }

    public InstallationProgressListener(Activity activity, PackageInstaller pi, int sessionId, String appLabel) {
        mPi = pi;
        mSessionId = sessionId;

        View layout = LayoutInflater.from(activity)
                .inflate(R.layout.progress_dialog, null, false);
        mProgress = layout.findViewById(R.id.progress);
        TextView title = layout.findViewById(R.id.progress_dialog_title);
        TextView subtitle = layout.findViewById(R.id.progress_dialog_subtitle);

        if (appLabel != null && !appLabel.isEmpty()) {
            title.setText(appLabel);
            subtitle.setText(R.string.app_installing);
        }

        mDialog = new MaterialAlertDialogBuilder(activity)
                .setCancelable(false)
                .setView(layout)
                .create();
        mDialog.show();
    }

    @Override
    public void onCreated(int sessionId) {

    }

    @Override
    public void onBadgingChanged(int sessionId) {

    }

    @Override
    public void onActiveChanged(int sessionId, boolean active) {

    }

    @Override
    public void onProgressChanged(int sessionId, float progress) {
        if (sessionId != mSessionId) return;
        mHandler.post(() -> {
            if (mProgress != null) {
                int p = (int) (progress * 100);
                if (p > 0) {
                    if (mProgress.isIndeterminate()) {
                        mProgress.setIndeterminate(false);
                    }
                    mProgress.setProgressCompat(p, true);
                }
            }
        });
    }

    @Override
    public void onFinished(int sessionId, boolean success) {
        if (sessionId != mSessionId) {
            return;
        }

        mHandler.post(() -> {
            try {
                if (mDialog != null && mDialog.isShowing()) {
                    mDialog.dismiss();
                }
            } catch (Exception ignored) {
            }
            try {
                mPi.unregisterSessionCallback(this);
            } catch (Exception ignored) {
            }
        });
    }
}

