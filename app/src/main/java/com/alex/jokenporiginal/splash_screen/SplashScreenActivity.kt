package com.alex.jokenporiginal.splash_screen

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import com.alex.jokenporiginal.MainActivity
import com.alex.jokenporiginal.R
import com.alex.jokenporiginal.home.HomeActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        supportActionBar!!.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            goToHome()
        },5000)

    }
    private fun goToHome(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}