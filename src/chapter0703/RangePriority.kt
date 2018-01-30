package chapter0703

fun main(args: Array<String>) {
    val n = 9
    val range : IntRange = 0..(n + 1)
    println(range)
    range.forEach { print(it) }
}
