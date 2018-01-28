package chapter0504

fun createAllDoneRunnable(str: String): Runnable {
    return Runnable { println("All done! $str") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable("aaa").run()
}
