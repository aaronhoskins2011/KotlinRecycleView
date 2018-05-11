package com.aaronhoskins.kotlinrecycleview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.car_list_item.view.*

class CarsRecycleViewAdapter(val carList : ArrayList<Car>, val context: Context) : RecyclerView.Adapter<CarsRecycleViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CarsRecycleViewAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.car_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarsRecycleViewAdapter.ViewHolder?, position: Int) {
        holder?.tvCarMake?.text = carList[position].getCarMake()
        holder?.tvCarModel?.text = carList[position].getCarModel()
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvCarMake = view.tv_car_make
        val tvCarModel = view.tv_car_model
    }
}


