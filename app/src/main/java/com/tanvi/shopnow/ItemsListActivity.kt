package com.tanvi.shopnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsListActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    var listData = mutableListOf<ItemData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_list)
        recyclerView = findViewById(R.id.recyclerView)

       val data1 = ItemData("Tanvi 1","Priceless",R.drawable.iv1)

       val data2 = ItemData("Tanvi 2","Priceless",R.drawable.iv1)
       val data3 = ItemData("Tanvi 3","Priceless",R.drawable.iv1)
       val data4 = ItemData("Tanvi 4","Priceless",R.drawable.iv1)
       val data5 = ItemData("Tanvi 5","Priceless",R.drawable.iv1)

        listData.add(data1)
        listData.add(data2)
        listData.add(data3)
        listData.add(data4)
        listData.add(data5)

        //. layoumanager
        recyclerView.layoutManager =GridLayoutManager(this,2,RecyclerView.VERTICAL,false)//LinearLayoutManager(this)
        val adapter = ItemListAdapter(listData)
        recyclerView.adapter = adapter

    }

}
