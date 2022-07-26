package com.example.android.nestedrecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.nestedrecyclerview.R
import com.example.android.nestedrecyclerview.models.Header
import com.example.android.nestedrecyclerview.models.Item
import com.example.android.nestedrecyclerview.models.Parent

class ParentAdapter(private val context: Context, var parentList: ArrayList<Item>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var movieAdapter: MovieAdapter

    class ParentHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title: TextView
        val movieRecyclerView: RecyclerView

        init {
            title = itemView.findViewById(R.id.parent_title)
            movieRecyclerView = itemView.findViewById(R.id.child_recycler)
        }
    }

    class HeaderHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title: TextView

        init {
            title = itemView.findViewById(R.id.header)
        }
    }

    companion object {
        const val HEADER = 1
        const val CATEGORY = 2
    }

    override fun getItemViewType(position: Int): Int =
        when(parentList[position]){
            is Header -> HEADER
            is Parent -> CATEGORY
            else -> CATEGORY
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == HEADER){
            val header = LayoutInflater.from(parent.context).inflate(R.layout.header,parent,false)
            return HeaderHolder(header)
        }
        val movieView = LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return ParentHolder(movieView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(parentList[position]){
            is Header -> {
                (holder as HeaderHolder).title.text = parentList[position].title
            }
            else -> {
                (holder as ParentHolder).title.text = parentList[position].title
                movieAdapter = MovieAdapter((parentList[position] as Parent).movieList)
                holder.movieRecyclerView.adapter = movieAdapter
            }
        }
    }

    override fun getItemCount(): Int {
        return parentList.size
    }
}