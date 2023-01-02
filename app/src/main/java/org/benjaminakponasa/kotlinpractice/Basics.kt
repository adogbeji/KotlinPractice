package org.benjaminakponasa.kotlinpractice

import java.lang.NullPointerException

fun main() {
    println("I'm an Android App Developer!")


    // When Expressions
//    val name = "Alex"
//
//    when (name) {
//        "Tom" -> println("$name works as an Architect")
//        "Paul" -> println("$name works as a Chef")
//        "Chris" -> {
//            println("$name is self-employed")
//            println("He works as a copywriter")
//        }
//    }


    // ArrayLists
//    val guests: ArrayList<String> = ArrayList<String>()
//    guests.add("Jack")
//    guests.add("Peter")
//    guests.add("Rachael")
//    println(guests)
}

// Interfaces
interface MyInterface {
    val topSpeed: Double
    fun drive(): String
    fun brake() {
        println("Vehicle braking")
    }
}

// Inheritance
open class Motor(val model: String, val colour: String, val doors: Int) {
    var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    fun drive(distance: Double) {
        println("Drove for ${distance}km")
    }
}

class MotorOne(model: String, colour: String, doors: Int, owner: String): Motor(model, colour, doors) {}