fun main () {
    println ("Введите число N:")
    val n = readLine()?.toIntOrNull()
    if (n != null && n > 0) {
        var sum = 0
        for (i in 1..n) {
            sum += i
        }
        println ("Сумма чисел от 1 до $n равна $sum")
    } else {
        println ("Пожалуйста, введите корректное положительное число.")
    }
}