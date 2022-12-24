fun main() {
    // Получаем значение x
    print("Введите значение x: ")
    val x = readLine()!!.toDouble()

    // Вычисляем значение функции y
    val y = 3 * x * x * x * x * x * x - 6 * x * x - 7

    // Выводим результат
    println("Значение функции y: $y")
}