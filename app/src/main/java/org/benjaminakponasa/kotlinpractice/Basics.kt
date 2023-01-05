package org.benjaminakponasa.kotlinpractice

fun main() {
    println("I'm an Android App Developer!")

    val worker = Worker("Peter", 38)
//    println(worker.name)
//    println(worker.age)


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
//    val digits: ArrayList<Double> = ArrayList<Double>()
//    digits.add(4.25)
//    digits.add(7.3)
//    digits.add(-1.45)
//    digits.add(2.82)
//    println(digits)
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


// Lateinit
class Car() {
    lateinit var owner: String
}

// Classes
class Person constructor(name: String, age: Int) {}