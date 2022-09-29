package com.tanvi.shopnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var listData = mutableListOf<FirstItemData>()//FirstItemData - ItemData different hai
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView2)
//kam
        val data1 = FirstItemData("Tanvi1",R.drawable.iv1)//drable
        val data2 =FirstItemData ( "Tanvi2",R.drawable.iv1)
        val data3 = FirstItemData("Tanvi3",R.drawable.iv1)
        val data4 = FirstItemData( "Tanvi4",R.drawable.iv1)

        val data5 = FirstItemData("Tanvi1",R.drawable.iv1)//drable
        val data6 =FirstItemData ( "Tanvi2",R.drawable.iv1)
        val data7 = FirstItemData("Tanvi3",R.drawable.iv1)
        val data8 = FirstItemData( "Tanvi4",R.drawable.iv1)
        listData.add(data1)
        listData.add(data2)
        listData.add(data3)
        listData.add(data4)

        listData.add(data5)
        listData.add(data6)
        listData.add(data7)
        listData.add(data8)
        recyclerView.layoutManager=LinearLayoutManager( this, RecyclerView.HORIZONTAL,false)
        val adapter =FirstItemAdapter (listData) // FirstItemAdapter not ItemListAdapter
        recyclerView.adapter = adapter

        //change intent filter in manifest an run app on mobile
    }
}