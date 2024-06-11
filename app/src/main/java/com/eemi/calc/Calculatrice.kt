
class Calculatrice {
    fun addition(a: Double, b: Double, c: Double): Double {
        return a + b + c
    }

    fun soustraction(a: Double, b: Double, c: Double): Double {
        return a - b - c
    }

    fun division(a: Double, b: Double, c: Double): Double {
        if (b == 0.0 || c == 0.0) {
            throw IllegalArgumentException("Division by zero is not allowed")
        }
        return a / b / c
    }
}