package com.alex.jokenporiginal.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alex.jokenporiginal.R
import com.alex.jokenporiginal.select_character.ChooseCharacterActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar!!.hide()

        bt_home.setOnClickListener {
            goToSelectCharacter()
        }
    }

    private fun goToSelectCharacter() {
        val intent = Intent(this, ChooseCharacterActivity::class.java)
        startActivity(intent)
    }
}