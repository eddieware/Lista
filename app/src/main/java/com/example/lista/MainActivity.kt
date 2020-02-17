package com.example.lista

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this ,LinearLayout.VERTICAL,false)
        val albums=ArrayList<Album>()

        albums.add(Album("Ariana Grande",23,R.drawable.ic_launcher_background))
        val adapter=AdapterAlbum(albums)
        recyclerView.adapter=adapter
    }
}
