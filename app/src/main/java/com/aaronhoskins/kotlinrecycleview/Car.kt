package com.aaronhoskins.kotlinrecycleview

class Car(private var carModel: String = "", private var carMake: String = "") {

    fun getCarMake() : String {
        return carMake
    }

    fun setCarMake(make : String) {
        carMake = make
    }
    fun getCarModel() : String {
        return carModel
    }
    fun setCarModel(model : String) {
        carModel = model
    }
}