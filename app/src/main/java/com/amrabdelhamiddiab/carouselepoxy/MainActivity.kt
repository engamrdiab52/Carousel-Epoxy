package com.amrabdelhamiddiab.carouselepoxy

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.EpoxyRecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: EpoxyRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller = HomeController()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setController(controller)
       /* val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)*/
        controller.setData(listOfItems)

    }

}