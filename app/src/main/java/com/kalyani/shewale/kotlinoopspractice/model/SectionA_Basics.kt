package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "SectionA"

// 1. Car Class
class Car(val brand: String, val model: String, val price: Double) {
    fun showDetails() {
        Log.d(TAG, "Car: $brand $model | Price: ₹$price")
    }
}

// 2. Student Class
class Student(val name: String, val rollNumber: Int) {
    fun introduce() {
        Log.d(TAG, "Hi, I am $name and my roll number is $rollNumber")
    }
}

// 3. Rectangle Class
class Rectangle(val length: Double, val breadth: Double) {
    fun area(): Double = length * breadth
}

fun runSectionA() {
    Log.d(TAG, "---- Car Objects ----")
    val c1 = Car("Toyota", "Corolla", 1800000.0)
    val c2 = Car("Honda", "City", 1200000.0)
    val c3 = Car("Tesla", "Model 3", 5000000.0)
    c1.showDetails()
    c2.showDetails()
    c3.showDetails()

    Log.d(TAG, "---- Student ----")
    val s = Student("Amit", 101)
    s.introduce()

    Log.d(TAG, "---- Rectangle ----")
    val r = Rectangle(10.0, 5.0)
    Log.d(TAG, "Area = ${r.area()}")
}