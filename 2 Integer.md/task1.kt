fun main() {
    // Получаем расстояние L в сантиметрах
    print("Введите расстояние L в сантиметрах: ")
    val L = readLine()!!.toInt()

    // Находим количество полных метров в расстоянии L
    val meters = L / 100

    // Выводим результат
    println("Количество полных метров в расстоянии L: $meters")
}
