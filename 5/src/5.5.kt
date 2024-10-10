fun main () {
    println ("Введите число:")
    val input = readLine()
    val number = input?.toIntOrNull()
    if (number == null || number < 2) {
        println ("Пожалуйста, введите целое число больше 1.")
    } else {
        if (isPrime(number)) {
            println ("$number является простым числом.")
        } else {
            println ("$number не является простым числом.")
        }
    }
}
fun isPrime (num: Int): Boolean {
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}