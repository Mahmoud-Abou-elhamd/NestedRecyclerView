package com.example.android.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.android.nestedrecyclerview.adapters.ParentAdapter
import com.example.android.nestedrecyclerview.models.DataManager

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: ParentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.parent_recycler)
        setAdapter()
    }

    private fun setAdapter() {
        mAdapter = ParentAdapter(this,DataManager.parentList)
        mRecyclerView.adapter = mAdapter
    }
}