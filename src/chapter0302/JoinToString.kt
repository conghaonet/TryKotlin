package chapter0302

//因为Java不支持默认值，@JvmOverloads为兼容Java，在编译时提供多个重载方法
@JvmOverloads
fun <T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "(", postfix: String =")"): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "[", "]"))
    println(joinToString(list))
    println(joinToString(list, " - "))
    println(joinToString(list, prefix = "{", postfix = "}"))
}
