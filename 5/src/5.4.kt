fun main() {
    println("Введите число для вычисления факториала:")
    val input = readLine()?.toIntOrNull()
    if (input != null && input >= 0) {
        val factorial = calculateFactorial(input)
        println("Факториал числа $input равен $factorial")
    } else {
        println("Пожалуйста, введите корректное неотрицательное целое число.")
    }
}
fun calculateFactorial(n: Int): Long {
    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}