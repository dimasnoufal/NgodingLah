package com.example.ngodinglah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private  val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setStatusBarColor(this.getResources().getColor(R.color.trans));

        handler.postDelayed({
            val main = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(main)
            finish()
        }, 3000)
    }
}