package chapter0503

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(1) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    val numList = naturalNumbers.take(100).filter { it % 2 == 0 }.toList()
    println(numList)
}
