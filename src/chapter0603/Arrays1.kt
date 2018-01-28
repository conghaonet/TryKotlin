package chapter0603

import kotlinx.coroutines.experimental.launch


fun main(args: Array<String>) {
    val letters = Array(26) {
        it -> ('A'+it).toString()
    }
    println(letters.joinToString(", "))

    launch {

    }
}