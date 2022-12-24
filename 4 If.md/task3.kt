fun main() {
    val a = 3
    val b = 5
    val c = 2

    var min = a
    if (b < min) min = b
    if (c < min) min = c

    println("Наименьшее число: $min")
}