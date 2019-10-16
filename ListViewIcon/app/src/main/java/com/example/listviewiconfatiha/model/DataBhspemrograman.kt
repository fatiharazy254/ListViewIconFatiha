package com.example.listviewiconfatiha.model

import com.example.listviewiconfatiha.R
import com.example.listviewiconfatiha.model.Bhspemrograman as Bhspemrograman1

object DataBhspemrograman {
    private val nama_bhspemrograman = arrayOf(
        "Ruby",
        "Ralis",
        "Phyton",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralis is a server-side web application development framework written in Ruby language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Java Script is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation"
    )

    private val bhspemrogramanPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralis,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php
    )

    val listBhspemrograman: ArrayList<Bhspemrograman1>
        get(){
            val list = arrayListOf<Bhspemrograman1>()
            for (position in nama_bhspemrograman.indices){
                val bhspemrograman = Bhspemrograman1()
                bhspemrograman.name = nama_bhspemrograman[position]
                bhspemrograman.detail = detail[position]
                bhspemrograman.poster = bhspemrogramanPoster[position]
                list.add(bhspemrograman)
            }
            return list
        }
}