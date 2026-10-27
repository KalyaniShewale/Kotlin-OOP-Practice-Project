package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "SectionE"

// 10. Shape Base Class
open class ShapeBase {
    open fun area(): Double = 0.0
    open fun name(): String = "Shape"
}

class CircleP(val radius: Double) : ShapeBase() {
    override fun area(): Double = Math.PI * radius * radius
    override fun name(): String = "Circle"
}

class RectangleP(val l: Double, val b: Double) : ShapeBase() {
    override fun area(): Double = l * b
    override fun name(): String = "Rectangle"
}

// 11. Animal Polymorphism
open class AnimalP {
    open fun makeSound() = Log.d(TAG, "Some generic animal sound")
}

class DogP : AnimalP() {
    override fun makeSound() = Log.d(TAG, "Dog says: Woof!")
}

class Cat : AnimalP() {
    override fun makeSound() = Log.d(TAG, "Cat says: Meow!")
}

class Cow : AnimalP() {
    override fun makeSound() = Log.d(TAG, "Cow says: Moo!")
}

fun runSectionE() {
    Log.d(TAG, "---- Shape Polymorphism ----")
    val shapes: List<ShapeBase> = listOf(
        CircleP(3.0),
        RectangleP(4.0, 5.0),
        CircleP(7.0)
    )
    for (s in shapes) {
        Log.d(TAG, "${s.name()} area = ${"%.2f".format(s.area())}")
    }

    Log.d(TAG, "---- Animal Polymorphism ----")
    val animals: List<AnimalP> = listOf(DogP(), Cat(), Cow())
    for (a in animals) {
        a.makeSound()
    }
}