package com.kalyani.shewale.kotlinoopspractice.model

import android.util.Log

private const val TAG = "SectionC"

// 6. Animal -> Dog
open class Animal {
    fun eat() = Log.d(TAG, "Animal is eating")
    fun sleep() = Log.d(TAG, "Animal is sleeping")
}

class Dog : Animal() {
    fun bark() = Log.d(TAG, "Dog is barking: Woof Woof!")
}

// 7. Person -> Teacher, Student
open class Person(val name: String) {
    fun display() = Log.d(TAG, "Person Name: $name")
}

class Teacher(name: String, val subject: String) : Person(name) {
    fun teach() = Log.d(TAG, "$name teaches $subject")
}

class Student2(name: String, val rollNo: Int) : Person(name) {
    fun study() = Log.d(TAG, "$name studies with roll no $rollNo")
}

fun runSectionC() {
    Log.d(TAG, "---- Animal & Dog ----")
    val d = Dog()
    d.eat()
    d.sleep()
    d.bark()

    Log.d(TAG, "---- Person Hierarchy ----")
    val t = Teacher("Mr. Sharma", "Maths")
    t.display()
    t.teach()

    val s = Student2("Riya", 22)
    s.display()
    s.study()
}