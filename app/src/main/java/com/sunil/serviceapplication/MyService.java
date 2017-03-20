package com.sunil.serviceapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Sunil on 20-03-2017.
 */

public class MyService extends Service {
    MediaPlayer player;

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(),"My Serices Created",Toast.LENGTH_SHORT).show();
        player =MediaPlayer.create(this,R.raw.dau);
        player.setLooping(false);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(),"My Services Started",Toast.LENGTH_SHORT).show();
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"My Services Stoped",Toast.LENGTH_SHORT).show();
        player.stop();
    }
}
