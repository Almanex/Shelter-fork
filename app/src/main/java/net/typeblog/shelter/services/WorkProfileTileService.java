package net.typeblog.shelter.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.util.Log;

import net.typeblog.shelter.R;

import java.util.List;

public class WorkProfileTileService extends TileService {
    private static final String TAG = "WorkProfileTileService";

    private final BroadcastReceiver mProfileReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "Profile broadcast received: " + intent.getAction());
            updateTileState();
        }
    };

    @Override
    public void onStartListening() {
        super.onStartListening();
        Log.d(TAG, "onStartListening");
        updateTileState();
        try {
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_MANAGED_PROFILE_AVAILABLE);
            filter.addAction(Intent.ACTION_MANAGED_PROFILE_UNAVAILABLE);
            filter.addAction(Intent.ACTION_MANAGED_PROFILE_UNLOCKED);
            filter.addAction(Intent.ACTION_MANAGED_PROFILE_ADDED);
            filter.addAction(Intent.ACTION_MANAGED_PROFILE_REMOVED);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                registerReceiver(mProfileReceiver, filter, Context.RECEIVER_NOT_EXPORTED);
            } else {
                registerReceiver(mProfileReceiver, filter);
            }
        } catch (Exception ignored) {
        }
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
        Log.d(TAG, "onStopListening");
        try {
            unregisterReceiver(mProfileReceiver);
        } catch (Exception ignored) {
        }
    }

    @Override
    public void onClick() {
        super.onClick();
        Log.d(TAG, "onClick");
        UserManager um = getSystemService(UserManager.class);
        UserHandle workProfile = getWorkProfileHandle();
        if (um == null || workProfile == null) {
            Log.w(TAG, "onClick: workProfile or um is null");
            return;
        }

        boolean isEnabled = isWorkProfileEnabled(um, workProfile);
        Log.d(TAG, "onClick: isEnabled=" + isEnabled + ", requesting quiet mode=" + isEnabled);
        try {
            boolean res = um.requestQuietModeEnabled(isEnabled, workProfile);
            Log.d(TAG, "onClick: requestQuietModeEnabled returned " + res);
        } catch (Exception e) {
            Log.e(TAG, "Failed to toggle quiet mode", e);
        }
        updateTileState();
    }

    private UserHandle getWorkProfileHandle() {
        UserManager um = getSystemService(UserManager.class);
        if (um == null) return null;
        UserHandle myUserHandle = Process.myUserHandle();
        List<UserHandle> profiles = um.getUserProfiles();
        for (UserHandle profile : profiles) {
            if (!profile.equals(myUserHandle)) {
                return profile;
            }
        }
        return null;
    }

    private boolean isWorkProfileEnabled(UserManager um, UserHandle handle) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return !um.isQuietModeEnabled(handle);
        }
        return true;
    }

    private void updateTileState() {
        Tile tile = getQsTile();
        if (tile == null) return;

        UserManager um = getSystemService(UserManager.class);
        UserHandle workProfile = getWorkProfileHandle();

        tile.setLabel(getString(R.string.tile_work_profile_label));
        tile.setIcon(Icon.createWithResource(this, R.drawable.ic_work));

        if (workProfile == null || um == null) {
            tile.setState(Tile.STATE_UNAVAILABLE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.setSubtitle(getString(R.string.tile_work_profile_not_setup));
            }
        } else {
            boolean enabled = isWorkProfileEnabled(um, workProfile);
            tile.setState(enabled ? Tile.STATE_ACTIVE : Tile.STATE_INACTIVE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.setSubtitle(getString(enabled ? R.string.tile_work_profile_state_on : R.string.tile_work_profile_state_off));
            }
        }
        tile.updateTile();
    }
}
