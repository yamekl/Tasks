fun main() {
    val x = 3
    val y = 5

    if (x > 0 && y > 0) {
        println("Точка находится в первой координатной четверти")
    } else if (x < 0 && y > 0) {
        println("Точка находится во второй координатной четверти")
    } else if (x < 0 && y < 0) {
        println("Точка находится в третьей координатной четверти")
    } else if (x > 0 && y < 0) {
        println("Точка находится в четвертой координатной четверти")
    }
}