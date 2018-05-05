package me.afor.dji

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import com.amap.api.maps2d.AMap
import com.amap.api.maps2d.MapView


class MainActivity : AppCompatActivity() {
    lateinit var map: AMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.VIBRATE,
                            Manifest.permission.INTERNET,
                            Manifest.permission.ACCESS_WIFI_STATE,
                            Manifest.permission.WAKE_LOCK,
                            Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_NETWORK_STATE,
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.CHANGE_WIFI_STATE,
                            Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS,
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.SYSTEM_ALERT_WINDOW,
                            Manifest.permission.READ_PHONE_STATE), 1)
        }
        setContentView(R.layout.activity_main)

/*        val filter = IntentFilter()
        filter.addAction(DjiInitializer.FLAG_CONNECTION_CHANGE)
        registerReceiver(mReceiver, filter)*/

        val mapView = findViewById<MapView>(R.id.map)
        mapView.onCreate(savedInstanceState)
        map = mapView.map
        map.mapType=
    }
}
