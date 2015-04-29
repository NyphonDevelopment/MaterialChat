package de.nyphon.materialchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import de.nyphon.materialchat.Modules.AppService;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent startServiceIntent = new Intent(this, AppService.class);
        this.startService(startServiceIntent);
    }

    @Override
    public void onBackPressed() {
    }
}
