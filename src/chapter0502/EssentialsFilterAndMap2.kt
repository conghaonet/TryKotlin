package chapter0502

data class PersonB(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.map{ it * it })

    val people = listOf(PersonB("Alice", 29), PersonB("Bob", 31))
    println(people.map { it.name })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
}