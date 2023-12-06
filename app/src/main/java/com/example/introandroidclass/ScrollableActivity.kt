package com.example.introandroidclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.introandroidclass.model.BoltRide
import com.example.introandroidclass.model.BoltRideAdapter

class ScrollableActivity : AppCompatActivity() {

    private lateinit var rideListRecyclerView: RecyclerView
    private lateinit var rideListAdapter: BoltRideAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrollable)
        initializeView()
    }

    private fun getRides(): ArrayList<BoltRide> {
        val rides = arrayListOf<BoltRide>()
        rides.add(BoltRide("New garage, Bariga Lagos", "5 Dec, 7:02", "₦ 4,400"))
        rides.add(BoltRide("Ikeja", "5 Dec, 7:02", "₦ 4,400"))
        rides.add(BoltRide("Idi Aba, Abeokuta, Ogun State", "5 Dec, 7:02", "₦ 4,400"))
        return rides
    }

    private fun initializeView() {
        rideListRecyclerView = findViewById(R.id.rideList)
        rideListAdapter = BoltRideAdapter(this, getRides())
        rideListRecyclerView.adapter = rideListAdapter
//        rideListRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}