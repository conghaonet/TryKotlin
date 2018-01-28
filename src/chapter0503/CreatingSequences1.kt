package chapter0503

import java.io.File

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { println("$it -> ${it.isHidden}");it.isHidden }
fun File.findHiddenDirectory() =
        generateSequence(this) { it.parentFile }.find { println("$it -> ${it.isHidden}");it.isHidden }

fun main(args: Array<String>) {
    val file = File("C:\\Windows\\System32\\drivers\\etc")
    println(file.isInsideHiddenDirectory())

    val fileA = File("F:\\QQMusicCache\\Log\\DataTransformex")
    println(">>> ${fileA.findHiddenDirectory()}")

}
