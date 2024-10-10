fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
fun main() {
    println("Введите число N:")
    val input = readLine()?.toIntOrNull()
    if (input != null && input > 0) {
        println("Простые числа до $input:")
        for (i in 2..input) {
            if (isPrime(i)) {
                println(i)
            }
        }
    } else {
        println("Пожалуйста, введите корректное положительное число.")
    }
}