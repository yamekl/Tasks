fun main() {
    // Вводим трехзначное число
    val number = readLine()!!.toInt()
    
    // Извлекаем первую цифру числа
    val firstDigit = number / 100
    
    // Вычисляем оставшуюся часть числа, без первой цифры
    val rest = number % 100
    
    // Склеиваем первую цифру справа к оставшейся части числа
    val result = rest * 10 + firstDigit
    
    // Выводим результат
    println(result)
}