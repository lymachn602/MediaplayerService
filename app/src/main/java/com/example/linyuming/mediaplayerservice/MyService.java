package com.example.linyuming.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by hasee on 2016/11/25.
 */

public class MyService extends Service {
    MediaPlayer player;
    public MyService(){

    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw  new UnsupportedOperationException("not yet implements");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       player.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        player=MediaPlayer.create(this,R.raw.exodus);
        player.setLooping(true);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        player.stop();
        player.release();
        super.onDestroy();
    }
}
