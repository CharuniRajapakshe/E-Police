package com.example.epolice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pusher.pushnotifications.PushNotifications;
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.*


class MainActivity : AppCompatActivity() {

    private var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PushNotifications.start(getApplicationContext(), "e5f96f3b-a146-4915-a1b6-22e3e6b9b4d2");
        PushNotifications.addDeviceInterest("hello");

        btn = findViewById<Button>(R.id.button)

        btn?.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=6.901608599999999,80.0087746&daddr=6.909013113103953,79.85087127184295")
            )
            startActivity(intent)
        })



    }
}
