fun main() {
    println ("Введите начальное значение диапазона:")
    val start = readLine()?.toIntOrNull() ?: return
    println ("Введите конечное значение диапазона:")
    val end = readLine()?.toIntOrNull() ?: return
    println ("Простые числа в диапазоне от $start до $end:")
    for (num in start..end) {
        if (isPrime(num)) {
            println(num)
        }
    }
}
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}