package chapter0701a

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}
operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}


fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 - p2)
    println(p1 * 1.5)
}
