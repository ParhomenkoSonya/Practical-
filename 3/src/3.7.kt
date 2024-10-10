fun main ()
{
    println ("Введите первое вещественное число: ")
    val firstNumber = readLine()?.toDoubleOrNull()
    println ("Введите второе вещественное число: ")
    val secondNumber = readLine()?.toDoubleOrNull()
    if (firstNumber != null && secondNumber != null) {
        if (firstNumber == secondNumber) {
            println ("Числа должны быть различными.")
        } else {
            if (firstNumber > secondNumber) {
                println ("Первое число ($firstNumber) больше второго числа ($secondNumber).")
                println ("Втоорое число ($secondNumber) меньше первого числа ($firstNumber).")
            } else {
                println ("Второе число ($secondNumber) больше первого числа ($firstNumber).")
                println ("Первое число ($firstNumber) меньше второго числа ($secondNumber).")
            }
        }
    }
}