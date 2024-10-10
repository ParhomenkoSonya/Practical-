fun main() {
    println ("Введите число:")
    val input = readLine()
    if (input != null && input.all {it.isDigit() }) {
        val sum = input.map { it.toString().toInt() }.sum()
        println ("Сумма цифр числа: $sum")
    } else {
        println ("Пожалуйста, введите корректное целое число.")
    }
}