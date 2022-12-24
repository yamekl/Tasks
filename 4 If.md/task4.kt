fun main() {
    var a = 3
    var b = 5

    if (a != b) {
        if (a > b) {
            b = a
        } else {
            a = b
        }
    } else {
        a = 0
        b = 0
    }

    println("Новое значение A: $a")
    println("Новое значение B: $b")
}