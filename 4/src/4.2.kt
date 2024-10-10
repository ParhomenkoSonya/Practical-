fun triangleType (a: Double, b: Double, c: Double): String {
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= 0 || b + c <= a) {
        return "Треугольник не существует"
    }
    return when {
        a == b && b == c -> "Равносторонний треугольник"
        a == b || a == c || b == c -> "Равнобедренный треугольник"
        else -> "Разносторонний треугольник"
    }
}
fun main () {
    val sideA = 5.0
    val sideB = 5.0
    val sideC = 5.0
    println (triangleType(sideA, sideB, sideC))
}