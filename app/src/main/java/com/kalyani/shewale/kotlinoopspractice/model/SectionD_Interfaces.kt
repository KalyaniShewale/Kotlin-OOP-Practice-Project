package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "SectionD"

// 8. Playable Interface
interface Playable {
    fun play()
}

class Cricket : Playable {
    override fun play() {
        Log.d(TAG, "Playing Cricket")
    }
}

class Football : Playable {
    override fun play() {
        Log.d(TAG, "Playing Football")
    }
}

// 9. Shape Interface
interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double = Math.PI * radius * radius
}

class Rectangle2(val l: Double, val b: Double) : Shape {
    override fun area(): Double = l * b
}

fun runSectionD() {
    Log.d(TAG, "---- Playable ----")
    Cricket().play()
    Football().play()

    Log.d(TAG, "---- Shape ----")
    val circle = Circle(5.0)
    val rect = Rectangle2(4.0, 6.0)
    Log.d(TAG, "Circle Area: ${"%.2f".format(circle.area())}")
    Log.d(TAG, "Rectangle Area: ${rect.area()}")
}