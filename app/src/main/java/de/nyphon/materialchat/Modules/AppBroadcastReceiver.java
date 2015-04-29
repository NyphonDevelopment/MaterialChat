package de.nyphon.materialchat.Modules;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ralph Schuler on 21.04.2015.
 */
public class AppBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, AppService.class);
        context.startService(startServiceIntent);

        Toast.makeText(context, "BOOTUP", Toast.LENGTH_LONG).show();
    }
}
