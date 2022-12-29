package org.benjaminakponasa.kotlinpractice

fun main() {
    println("I'm an Android App Developer!")


    // When Expressions
//    val name = "Jack"
//
//    when (name) {
//        "Chris" -> println("$name works as an Estate Agent")
//        "Michael" -> println("$name works as a Chef")
//        "Jack" -> {
//            print("$name is 30 years old\n")
//            print("He works as a Journalist")
//        }
//    }
}

// Interfaces
interface MotorInterface {
    val topSpeed: Double
    fun drive(): String
    fun brake() {
        println("Vehicle braking")
    }
}

// Inheritance
open class Motor(val model: String, val colour: String, val doors: Int) {
    // Properties
    // Methods
}

class MotorOne(model: String, colour: String, doors: Int, owner: String): Motor(model, colour, doors) {}