package chapter0505.TheWithFunction1

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            //也可以写成：append(letter), 此处的this可以省略
            this.append(letter)
        }
        //也可以写成：this.append("\nNow I know the alphabet!"), 此处的this可以省略
        append("\nNow I know the alphabet!")
        //也可以写成：this.toString(), 此处的this可以省略
        toString()
    }
}

fun main(args: Array<String>) {
    println(alphabet())
}
