package chapter0705e

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!! //name属性为空时，会抛出异常
    val company: String
        get() = _attributes["company"] ?: ""
    val city: String?
        get() = _attributes["city"].let { it } //city属性为空时，不抛异常
    val age: String? by _attributes
}

fun main(args: Array<String>) {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains", "city" to "Beijing", "age" to "23")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
    println(p.company)
    println(p.city)
    println(p.age)
}
