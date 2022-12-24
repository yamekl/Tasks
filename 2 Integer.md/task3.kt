fun main() {
    val number = 99 // двузначное число
    var sum = 0 // сумма цифр
    var product = 1 // произведение цифр
    
    // разбиваем число на цифры
    val digits = number.toString().toCharArray().map { it.toString().toInt() }
    
    // считаем сумму и произведение
    for (digit in digits) {
        sum += digit
        product *= digit
    }
    
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")
}