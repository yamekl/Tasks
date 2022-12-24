fun main() {
    val a = 3
    val b = 4
    val c = 5

    if (a + b > c && a + c > b && b + c > a) {
        println("Существует треугольник со сторонами $a, $b, $c")
    } else {
        println("Не существует треугольника со сторонами $a, $b, $c")
    }
}