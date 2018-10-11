package com.example.rajareddy.hello;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myAidlInterface;
    }

    private final IMyAidlInterface.Stub myAidlInterface = new IMyAidlInterface.Stub() {

        @Override
        public String getMessage(String name) throws RemoteException {
            return name;
        }

        @Override
        public int getResult(int val1, int val2) throws RemoteException {
            return val1 * val2;
        }
    };
}
