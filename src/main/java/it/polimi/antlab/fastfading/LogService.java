package it.polimi.antlab.fastfading;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LogService extends Service {
  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
    return Service.START_STICKY;
  }

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
}