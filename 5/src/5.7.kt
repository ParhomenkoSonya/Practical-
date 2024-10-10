fun main() {
    println ("Введите количество чисел Фибоначчи для генерации:")
    val n = readLine()?.toIntOrNull()
    if (n == null || n <= 0) {
        println ("Пожалуйста, введите положительное целое число.")
        return
    }
    val fibonacciNumbers = generateFibonacci(n)
    println ("Первые $n чисел Фибоначчи: $fibonacciNumbers")
}
fun generateFibonacci(n: Int): List<Int> {
    val fibonacciList = mutableListOf<Int>()
    var a = 0
    var b = 1
    for (i in 0 until n) {
        fibonacciList.add(a)
        val next = a + b
        a = b
        b = next
    }
    return fibonacciList
}