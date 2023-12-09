package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Chara>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
        )

        heading = arrayOf(
            "Vergil is Devil May Cry game character",
            "Viper is Valorant game character",
            "Bayonetta is also from game named Bayonetta",
            "Vergil is Devil May Cry game character",
            "Viper is Valorant game character",
            "Bayonetta is also from game named Bayonetta",
            "Vergil is Devil May Cry game character",
            "Viper is Valorant game character",
            "Bayonetta is also from game named Bayonetta"

        )

        newRecyclerView =findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Chara>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val chara = Chara (imageId[i],heading[i])
            newArrayList.add(chara)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}