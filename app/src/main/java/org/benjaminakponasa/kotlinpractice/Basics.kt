package org.benjaminakponasa.kotlinpractice

fun main() {
    println("I'm an Android App Developer!")
}

// Interfaces
interface MotorInterface {
    var topSpeed: Double
    fun drive(): String
    fun brake() {
        println("Vehicle braking")
    }
}

// Inheritance
open class Motor (val model: String, val colour: String, val doors: Int) {
    // Properties
    // Methods
}

class MotorOne(model: String, colour: String, doors: Int): Motor(model, colour, doors) {}