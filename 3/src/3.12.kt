fun main ()
{
    val number = 53
    if (number in 10..99) {
        val firstDigit = number / 10
        val secondDigit = number % 10
        if (firstDigit > secondDigit) {
            println ("Первая цифра ($firstDigit) больше второй (secondDigit).")
        } else if (firstDigit < secondDigit) {
            println ("Вторая цифра ($secondDigit) больше первой ($firstDigit).")
        } else {
            println ("Цифры одинаковы: $firstDigit и $secondDigit.")
        }
    } else {
        println ("Введите двузначное число.")
    }
}