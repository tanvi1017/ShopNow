package com.tanvi.shopnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerView3: RecyclerView

    var listData1 = mutableListOf<FirstItemData>()
    var listData2 = mutableListOf<SecondItemData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView2)

        // for first recyclerview
        formRecyclerView1Data()
        setRecyclerView1Data()

        //for second recyclerview
        formRecyclerView2Data()
        setRecyclerView2Data()



    }
    fun formRecyclerView1Data(){
        val data1 = FirstItemData("Tanvi1",R.drawable.iv1)
        val data2 =FirstItemData ( "Tanvi2",R.drawable.iv1)
        val data3 = FirstItemData("Tanvi3",R.drawable.iv1)
        val data4 = FirstItemData( "Tanvi4",R.drawable.iv1)

        val data5 = FirstItemData("Tanvi1",R.drawable.iv1)
        val data6 =FirstItemData ( "Tanvi2",R.drawable.iv1)
        val data7 = FirstItemData("Tanvi3",R.drawable.iv1)
        val data8 = FirstItemData( "Tanvi4",R.drawable.iv1)
        listData1.add(data1)
        listData1.add(data2)
        listData1.add(data3)
        listData1.add(data4)
        listData1.add(data5)
        listData1.add(data6)
        listData1.add(data7)
        listData1.add(data8)
    }
    fun setRecyclerView1Data(){
        recyclerView.layoutManager=LinearLayoutManager( this, RecyclerView.HORIZONTAL,false)
        val adapter =FirstItemAdapter (listData1) // FirstItemAdapter not ItemListAdapter
        recyclerView.adapter = adapter
    }

    fun formRecyclerView2Data(){
        val data1 = SecondItemData("Tanvi 1",R.drawable.iv1)
        listData2.add(data1)
    }
    fun setRecyclerView2Data(){
        recyclerView2.layoutManager=LinearLayoutManager( this, RecyclerView.HORIZONTAL,false)
        val adapter =SecondItemAdapter (listData2) // FirstItemAdapter not ItemListAdapter
        recyclerView2.adapter = adapter
    }
}