package example.coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

fun main(args: Array<String>) {
/*
    launch {
        delay(100)
        val letters = Array(26) {
            it -> ('A'+it).toString()
        }
        println(letters.joinToString(", "))

    }.start()
*/

    launch {
        println("Hello from Kotlin Coroutines!")
        delay(1000)
        println("Hello from Kotlin Coroutines!")
    }
}