package chapter0402

class UserA(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val user = UserA("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
    user.address = "CONG"
}