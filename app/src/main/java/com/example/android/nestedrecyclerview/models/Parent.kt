package com.example.android.nestedrecyclerview.models

data class Parent(
    override val title: String,
    val movieList: ArrayList<Movie>
): Item()
