package com.example.android.nestedrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.nestedrecyclerview.R
import com.example.android.nestedrecyclerview.models.Movie

class MovieAdapter(private val movieList: ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {
    class MovieHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView
        val img: ImageView

        init {
            title = itemView.findViewById(R.id.child_title)
            img = itemView.findViewById(R.id.child_img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val movieView = LayoutInflater.from(parent.context).inflate(R.layout.child_item,parent,false)
        return MovieHolder(movieView)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.title.text = movieList[position].title
        Glide.with(holder.itemView.context)
            .load(movieList[position].img)
            .into(holder.img)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}