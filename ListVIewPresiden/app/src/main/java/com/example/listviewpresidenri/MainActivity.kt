package com.example.listviewpresidenri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresidenri.adapter.ListPresidenAdapter
import com.example.listviewpresidenri.model.DataPresiden
import com.example.listviewpresidenri.model.Presiden

class   MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presidenri)
        rvPresiden.setHasFixedSize(true)
        list.addAll(DataPresiden.listPresiden)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvPresiden.layoutManager = LinearLayoutManager(this)
        rvPresiden.adapter = ListPresidenAdapter(this,list){
            Toast.makeText(this,it.detail,Toast.LENGTH_SHORT).show();
        }
    }
}
