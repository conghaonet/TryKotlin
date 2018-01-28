package chapter0603

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c", "d")
    println(strings.toTypedArray().joinToString(separator=", "))
    println(strings.toTypedArray())
    println("%s/%s/%s".format(*strings.toTypedArray()))
}
