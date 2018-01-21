package chapter0204

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    binaryReps.forEach { t, u -> println("$t = $u") }
    println("################################")
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}