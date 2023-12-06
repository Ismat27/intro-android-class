package com.example.introandroidclass.model

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.introandroidclass.R

class BoltRideAdapter(private val context: Activity, private val rides: ArrayList<BoltRide>) :
    RecyclerView.Adapter<BoltRideAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var rideImageView: ImageView = itemView.findViewById(R.id.rideImage)
        val rideAddressView: TextView = itemView.findViewById(R.id.rideAddress)
        val ridePriceView: TextView = itemView.findViewById(R.id.rideAmount)
        val rideDateView: TextView = itemView.findViewById(R.id.rideDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(
            R.layout.bolt_list_item, parent,
            false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentRideItem = rides[position]
        holder.rideAddressView.text = currentRideItem.address
        holder.ridePriceView.text = currentRideItem.price
        holder.rideDateView.text = currentRideItem.date
    }

    override fun getItemCount(): Int {
        return rides.size
    }
}
