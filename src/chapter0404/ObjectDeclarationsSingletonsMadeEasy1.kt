package chapter0404

import java.util.Comparator

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
                p1.name.compareTo(p2.name)
    }
    object NameF : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o2.name.compareTo(o1.name)
        }
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
    println(persons.sortedWith(Person.NameF))
}
