package org.benjaminakponasa.kotlinpractice

fun main() {
    println("I'm an Android App Developer!")

    val worker = Worker("Jack", 33)
//    worker.workerDetails()


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

// Abstract Classes
abstract class Food(private val name: String, private val price: Double) {
    abstract val shop: String

    abstract fun eat()
    abstract fun drink()

    fun foodDetails() {
        println("Bought some $name for £$price")
    }
}

class Guest(name: String, price: Double, override val shop: String): Food(name, price) {

    override fun eat() {
        println("Eat function")
    }

    override fun drink() {
        println("Drink function")
    }
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
class Car {
    lateinit var owner: String

    val model: String = "Honda"
        // Customer Getter
    get() {
        return field.toLowerCase()
    }

    var topSpeed: Int = 115
    get() = field
    set(value) {
        field = value
    }

    init {
        this.owner = "Chris"
    }
}

// Classes
class Person(name: String, age: Int) {

    // Initialiser
    init {
        println("$name is $age years old")
    }
}