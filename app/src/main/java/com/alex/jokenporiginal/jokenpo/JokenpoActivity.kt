package com.alex.jokenporiginal.jokenpo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.alex.jokenporiginal.R
import com.alex.jokenporiginal.select_character.model.DCharacter
import kotlinx.android.synthetic.main.activity_jokenpo.*
import kotlinx.android.synthetic.main.dialog_view_win.view.*
import kotlin.random.Random

class JokenpoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jokenpo)

        supportActionBar!!.hide()

        val extras = intent.extras
        if (extras != null) {
            val character = intent.getParcelableExtra<DCharacter>("key")
            setComponents(character!!)
        }

        btn_papel.setOnClickListener {
             play(0)
        }
        btn_pedra.setOnClickListener {
             play(1)
        }
        btn_tesoura.setOnClickListener {
             play(2)
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun play(num: Int) {
        image_view_comp.visibility = View.VISIBLE
        val comp = Random.nextInt(3)
        when(comp){
            0 -> image_play_comp.setImageDrawable(getDrawable(R.drawable.papel))
            1 -> image_play_comp.setImageDrawable(getDrawable(R.drawable.pedra))
            2 -> image_play_comp.setImageDrawable(getDrawable(R.drawable.tesoura))
        }
        if(comp == num){
            tieDialogAlert()
        }else if((comp == 0 && num == 1) || (comp == 1 && num == 2) || (comp == 2 && num == 0)){
            loseDialogAlert()
        }else{
            winDialogAlert()
        }
    }

    private fun setComponents(character: DCharacter){
        val image = image_you
        image.setImageResource(character.character)
    }

    private fun winDialogAlert(){
        val view = View.inflate(this, R.layout.dialog_view_win, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        view.btn_confirm.setOnClickListener {
            dialog.dismiss()
        }
    }

    private fun loseDialogAlert(){
        val view = View.inflate(this, R.layout.dialog_view_lose, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        view.btn_confirm.setOnClickListener {
            dialog.dismiss()
        }
    }

    private fun tieDialogAlert(){
        val view = View.inflate(this, R.layout.dialog_view_tie, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        view.btn_confirm.setOnClickListener {
            dialog.dismiss()
        }
    }
}