package chapter0505

fun alphabet(): StringBuilder {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result
}

fun main(args: Array<String>) {
    println(alphabet())
}