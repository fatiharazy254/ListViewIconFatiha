package com.example.listviewpresidenri.model

import com.example.listviewpresidenri.R

object DataPresiden {
    private val nama_presiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Ir. Soekarno adalah presiden pertama RI, dan wakilnya adalah Moh.Hatta",
        "Soeharto adalah presiden kedua RI yang menjabat selama lebih dari 30 tahun",
        "BJ. Habibie adalah presiden ketiga RI yang menggantikan Soeharto",
        "Abdurrahman Wahid atau biasa dikenal dengan Gusdur adalah presiden keempat RI",
        "Megawati adalah presiden kelima RI dan merupakan presiden wanita pertama di Indonesia",
        "Susilo Bambang Yudhoyono adalah presiden RI keenam",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden RI ketujuh"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in nama_presiden.indices){
            val presiden = Presiden()
            presiden.name = nama_presiden[position]
            presiden.detail = detail[position]
            presiden.poster = presidenPoster[position]
            list.add(presiden)
        }
        return list
    }
}