package com.alex.jokenporiginal.select_character

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.alex.jokenporiginal.MainActivity
import com.alex.jokenporiginal.R
import com.alex.jokenporiginal.jokenpo.JokenpoActivity
import com.alex.jokenporiginal.select_character.adapter.CharacterAdapter
import com.alex.jokenporiginal.select_character.model.DCharacter
import com.alex.jokenporiginal.select_character.model.addCharacter
import kotlinx.android.synthetic.main.activity_choose_character.*

class ChooseCharacterActivity : AppCompatActivity(), CharacterAdapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_character)

        supportActionBar!!.hide()

        val recycler = rv_choose_character
        recycler.adapter = CharacterAdapter(addCharacter(), this)
        recycler.layoutManager = GridLayoutManager(applicationContext, 3)
    }

    override fun onItemClicked(character: DCharacter) {
        val intent = Intent(this, JokenpoActivity::class.java)
        intent.putExtra("key", character)
        startActivity(intent)
    }
}