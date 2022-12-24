fun f(x: Double): Double {
    return when {
        x <= 0 -> -x
        x < 2 -> x * x
        else -> 4.0
    }
}