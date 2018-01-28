package chapter0601

fun strLenSafe(s: String?): Int =
        //与下面的表达式等价
        //s?.length ?: 0
        if (s != null) s.length else 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}
