fun main() {
    // Получаем длину ребра куба
    print("Введите длину ребра куба: ")
    val a = readLine()!!.toDouble()

    // Вычисляем объем куба
    val V = a * a * a

    // Вычисляем площадь поверхности куба
    val S = 6 * a * a

    // Выводим результаты
    println("Объем куба: $V")
    println("Площадь поверхности куба: $S")
}
