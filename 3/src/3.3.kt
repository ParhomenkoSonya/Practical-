fun main ()
{
    println ("Введите первое число: ")
    val firstNumber = readLine()?.toIntOrNull()
    println ("Ввелите второе число: ")
    val secondNumber = readLine()?.toIntOrNull()
    if (firstNumber != null && secondNumber != null) {
        val isFirstOdd = firstNumber % 2 != 0
        val isSecondOdd = secondNumber % 2 != 0
        if (isFirstOdd != isSecondOdd) {
            if (isFirstOdd) {
                println ("Нечётное число: $firstNumber")
            } else {
                println ("Нечётное число: $secondNumber")
            }
        }
    }
}