package de.nyphon.materialchat.Modules;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Ralph Schuler on 21.04.2015.
 */
public class AppService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
