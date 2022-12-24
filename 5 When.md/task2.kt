fun main() {
    val n = 3 // Номер действия
    val a = 10.0 // Число A
    val b = 5.0 // Число B
    when (n) {
        1 -> { // Сложение
            val result = a + b
            println("Результат сложения: $result")
        }
        2 -> { // Вычитание
            val result = a - b
            println("Результат вычитания: $result")
        }
        3 -> { // Умножение
            val result = a * b
            println("Результат умножения: $result")
        }
        4 -> { // Деление
            val result = a / b
            println("Результат деления: $result")
        }
        else -> { // Неизвестное действие
            println("Неизвестное действие")
        }
    }
}