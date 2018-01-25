package chapter0305

val kotlinLogo = """| //
                   >|//
                   >|/ \"""

val hellowWorld = """|Tell me and I forget.
                     |Teach me and I remember.
                     |Involve me and I learn.
                     |(Benjamin Franklin)"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin(">"))
    println("########################")
    println(kotlinLogo)
    println("########################")
    println(hellowWorld.trimMargin())
    println("########################")
    val price = """${'$'}7.99"""
    println(price)
}