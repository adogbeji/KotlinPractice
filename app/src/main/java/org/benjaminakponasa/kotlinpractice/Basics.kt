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
open class Motor {
    // Properties
    // Methods
}

open class MotorOne: Motor() {}

class MotorTwo: MotorOne() {}