package com.alex.jokenporiginal.select_character.model

import android.os.Parcelable
import com.alex.jokenporiginal.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DCharacter(
    val character: Int,
    val nameCharacter: String
) : Parcelable

class CharacterBuilder {
    var character: Int = 0
    var nameCharacter: String = ""
    fun build(): DCharacter = DCharacter(character, nameCharacter)
}

fun character(block: CharacterBuilder.() -> Unit): DCharacter =
    CharacterBuilder().apply(block).build()

fun addCharacter(): MutableList<DCharacter> = mutableListOf(
    //X-MAN
    character {
        character = R.drawable.storm
        nameCharacter = "Storm"
    },
    character {
        character = R.drawable.ciclope
        nameCharacter = "Cyclops"
    },
    character {
        character = R.drawable.mystique
        nameCharacter = "Mystique"
    },
    character {
        character = R.drawable.logan
        nameCharacter = "Logan"
    },
    character {
        character = R.drawable.rogue
        nameCharacter = "Rogue"
    },
    character {
        character = R.drawable.magneto
        nameCharacter = "Magneto"
    },
    //NARUTO
    character {
        character = R.drawable.naruto
        nameCharacter = "Naruto"
    },
    character {
        character = R.drawable.sasuke
        nameCharacter = "Sasuke"
    },
    character {
        character = R.drawable.kakashi
        nameCharacter = "Kakashi"
    },
    character {
        character = R.drawable.itachi
        nameCharacter = "Itachi"
    },
    character {
        character = R.drawable.obito
        nameCharacter = "Obito"
    },
    character {
        character = R.drawable.tsunade
        nameCharacter = "Tsunade"
    },
    //DC
    character {
        character = R.drawable.batman
        nameCharacter = "Batman"
    },
    character {
        character = R.drawable.superman
        nameCharacter = "Superman"
    },
    character {
        character = R.drawable.flash
        nameCharacter = "Flash"
    },
    character {
        character = R.drawable.curinga
        nameCharacter = "Joker"
    },
    character {
        character = R.drawable.catwoman
        nameCharacter = "Catwoman"
    },
    character {
        character = R.drawable.isis
        nameCharacter = "Wonder Woman"
    },
    //ADVENTURE TIME
    character {
        character = R.drawable.finn
        nameCharacter = "Finn"
    },
    character {
        character = R.drawable.jake
        nameCharacter = "Jake"
    },
    character {
        character = R.drawable.bmo
        nameCharacter = "Bmo"
    },
    //MARVEL
    character {
        character = R.drawable.ironman
        nameCharacter = "Iron man"
    },
    character {
        character = R.drawable.black_widow
        nameCharacter = "Black Widow"
    },
    character {
        character = R.drawable.dead_pool
        nameCharacter = "Dead Pool"
    },
    character {
        character = R.drawable.thanos
        nameCharacter = "Thanos"
    },
    character {
        character = R.drawable.spiderman
        nameCharacter = "Spider Man"
    },
    character {
        character = R.drawable.groot
        nameCharacter = "Groot"
    },
    //FUTURAMA
    character {
        character = R.drawable.fry
        nameCharacter = "Fry"
    },
    character {
        character = R.drawable.leela
        nameCharacter = "Leela"
    },
    character {
        character = R.drawable.professor_farnsworth
        nameCharacter = "Teacher"
    },
    //MATRIX
    character {
        character = R.drawable.neo
        nameCharacter = "Neo"
    },
    character {
        character = R.drawable.agent_smith
        nameCharacter = "Agent"
    },
    character {
        character = R.drawable.morpheus
        nameCharacter = "Morpheus"
    },
    //STAR WARS
    character {
        character = R.drawable.darth_vader
        nameCharacter = "Darth Vader"
    },
    character {
        character = R.drawable.luke
        nameCharacter = "Luke"
    },
    character {
        character = R.drawable.c3po
        nameCharacter = "C3po"
    },
    character {
        character = R.drawable.chewbacca
        nameCharacter = "Chewbacca"
    },
    character {
        character = R.drawable.stormtrooper
        nameCharacter = "Stormtrooper"
    },
    character {
        character = R.drawable.baby_yoda
        nameCharacter = "Baby Yoda"
    },
    //TERROR
    character {
        character = R.drawable.chuky
        nameCharacter = "Chuky"
    },
    character {
        character = R.drawable.jason
        nameCharacter = "Jason"
    },
    character {
        character = R.drawable.predator
        nameCharacter = "Predator"
    },
    character {
        character = R.drawable.michael_myers
        nameCharacter = "Michael Myers"
    },
    character {
        character = R.drawable.pennywise
        nameCharacter = "Pennywise"
    },
    character {
        character = R.drawable.freddy_krueger
        nameCharacter = "Freddy Krueger"
    },
    //RICK AND MORTY
    character {
        character = R.drawable.rick
        nameCharacter = "Rick"
    },
    character {
        character = R.drawable.mory
        nameCharacter = "Morty"
    },
    //TURTLE
    character {
        character = R.drawable.rafael
        nameCharacter = "Rafael"
    },
    //AVATAR
    character {
        character = R.drawable.avatar
        nameCharacter = "Neytiri"
    },
    //TOM AND JERRY
    character {
        character = R.drawable.tom
        nameCharacter = "Tom"
    },character {
        character = R.drawable.isis
        nameCharacter = "Jerry"
    },
)