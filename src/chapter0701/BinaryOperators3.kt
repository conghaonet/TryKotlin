package chapter0701

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
operator fun Int.times(char: Char): String {
    return char.toString().repeat(this)
}

operator fun String.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    println('a' * 3)
    println(3 * 'a')
    println("b" * 3)
}