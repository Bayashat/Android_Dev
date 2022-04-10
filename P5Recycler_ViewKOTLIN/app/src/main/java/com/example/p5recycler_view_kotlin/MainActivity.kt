package com.example.p5recycler_view_kotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = ArrayList<User>()
        for(i in 1..100)
        {
            users.add(User("User" + i, "employee", 20 + i))
        }

        val myAdapter = MyAdapter(users, this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        // val layoutManager = GridLayoutManager(this, 3)
        // val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        var rv = findViewById<RecyclerView>(R.id.recyclerview)

        rv.layoutManager = layoutManager
        rv.adapter = myAdapter
    }
}