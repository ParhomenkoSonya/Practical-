fun main() {
    println ("Введите значение N:")
    val input = readLine()
    val n = input?.toIntOrNull()
    if (n == null || n <= 0) {
        println ("Пожалуйста, введите положительное целое число.")
        return
    }
    val sumOfSquares = (1..n).sumOf { it * it }
    println ("Сумма квадратов от 1 до $n равна $sumOfSquares.")
}