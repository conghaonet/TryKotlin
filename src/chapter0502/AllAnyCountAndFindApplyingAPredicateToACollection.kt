package chapter0502

data class PersonA(val name: String, val age: Int)

val canBeInClub27 = { p: PersonA -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(PersonA("Alice", 27), PersonA("Bob", 31))
    println(people.all(canBeInClub27))
}
