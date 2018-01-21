package chapter0205

import java.io.BufferedReader
import java.io.StringReader

fun readNumberB(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        "error"
    }

    println(">>>>$number")
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumberB(reader)
}