package chapter0304

fun main(args: Array<String>) {

    var argsA:Array<String> = arrayOf("How", "Are", "You")

    val list = listOf("argsA: ", *argsA)
    println(list.toString())
}