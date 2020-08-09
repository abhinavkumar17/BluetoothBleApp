package com.example.bluetoothbleapp;


import android.bluetooth.le.AdvertiseSettings;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uriio.beacons.Beacons;
import com.uriio.beacons.model.EddystoneTLM;
import com.uriio.beacons.model.EddystoneUID;
import com.uriio.beacons.model.EddystoneURL;
import com.uriio.beacons.model.iBeacon;

@Deprecated
public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Beacons.initialize(this);

        // starts an Eddystone-URL beacon ASAP
        new EddystoneURL("https://github.com").start();

        // a custom Beacon
       // new iBeacon(uuid, major, minor).start();

        // a more sophisticated beacon
       // new EddystoneUID(myUID, AdvertiseSettings.ADVERTISE_MODE_BALANCED, AdvertiseSettings.ADVERTISE_TX_POWER_LOW)
           //     .start();

        // a telemetry beacon that updates the data once every minute
      //  new EddystoneTLM(60000).start();
    }
}
