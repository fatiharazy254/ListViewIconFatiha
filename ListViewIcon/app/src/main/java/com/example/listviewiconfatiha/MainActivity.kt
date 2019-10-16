package com.example.listviewiconfatiha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewiconfatiha.adapter.ListBhspemrogramanAdapter
import com.example.listviewiconfatiha.model.Bhspemrograman
import com.example.listviewiconfatiha.model.DataBhspemrograman

class MainActivity : AppCompatActivity() {
    private lateinit var rvBhspemrograman: RecyclerView
    private var list: ArrayList<Bhspemrograman> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBhspemrograman = findViewById(R.id.rv_bhspemrograman)
        rvBhspemrograman.setHasFixedSize(true)
        list.addAll(DataBhspemrograman.listBhspemrograman)
        showBhspemrogramanList()
    }

    private fun showBhspemrogramanList(){
        rvBhspemrograman.layoutManager = LinearLayoutManager(this)
        rvBhspemrograman.adapter = ListBhspemrogramanAdapter(this,list){
            Toast.makeText(this,it.detail,Toast.LENGTH_SHORT).show();
        }
    }
}
