package com.example.p5recycler_view_kotlin

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MyAdapter(val users: ArrayList<User>, val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder
    {
        Log.e("MyAdapter", "onCreateViewHolder")
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = users.get(position)
        holder.nameText.text = user.name
        holder.positionText.text = user.position
        Log.e("MyAdapter", "onBindViewHolder")
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class MyViewHolder(view: View, context: Context):RecyclerView.ViewHolder(view)
    {
        var nameText: TextView = view.findViewById(R.id.name)
        var positionText: TextView = view.findViewById(R.id.position)
        // var imageView: ImageView  = view.findViewById(R.id.image)
        // var random = Random()
        /*
        init {
            imageView.layoutParams.height = getRandomIntInRange(250,150)
            view.setOnClickListener { Toast.makeText(context, nameText.text, Toast.LENGTH_SHORT).show()}
        }
        private fun getRandomIntInRange(max: Int, min: Int): Int{
            return random.nextInt(max - min  + min) + min
        }
         */
    }
}