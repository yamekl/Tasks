fun main() {
    // Получаем значения переменных A и B
    print("Введите значение переменной A: ")
    var A = readLine()!!.toInt()
    print("Введите значение переменной B: ")
    var B = readLine()!!.toInt()

    // Меняем местами значения переменных A и B
    val temp = A
    A = B
    B = temp

    // Выводим новые значения переменных A и B
    println("Новое значение переменной A: $A")
    println("Новое значение переменной B: $B")
}