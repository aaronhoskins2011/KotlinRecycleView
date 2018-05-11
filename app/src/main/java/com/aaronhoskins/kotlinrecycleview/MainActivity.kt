package com.aaronhoskins.kotlinrecycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.rv_cars

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_cars.layoutManager = LinearLayoutManager(this)
        rv_cars.adapter = CarsRecycleViewAdapter(getListOfCars(),this)

    }


    fun getListOfCars() : ArrayList<Car> {
        var returnList : ArrayList<Car> = ArrayList()

        returnList.add(Car("Honda", "Accord"))
        returnList.add(Car("Honda", "Civic"))
        returnList.add(Car("Toyota", "Camry"))
        returnList.add(Car("Toyota", "Corolla"))
        returnList.add(Car("Toyota", "Supra"))
        returnList.add(Car("Nissan", "Maxima"))
        returnList.add(Car("Nissan", "Skyline"))
        returnList.add(Car("Chevy", "Malibu"))

        return returnList
    }
}
