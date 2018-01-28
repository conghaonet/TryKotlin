package chapter0601

import chapter06.Person

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person("Jason"))
    yellAtSafe(Person(null))

    println("42".toInt())
    println(42.toString())
}