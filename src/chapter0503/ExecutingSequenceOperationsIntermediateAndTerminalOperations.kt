package chapter0503

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }

    var  mylist = listOf(1, 2, 3, 4).asSequence()
            .map { print("filter($it) ");  it to it * it}.toMap()
//            .filter {it % 2 == 0 }.toList()
    println(mylist)
}
