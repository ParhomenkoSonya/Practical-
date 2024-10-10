fun main ()
{
    println ("Введите первое число: ")
    val firstNumber = readLine()?.toIntOrNull()
    println ("Введите второе число: ")
    val secondNumber = readLine()?.toIntOrNull()
    println ("Введите третье число: ")
    val thirdNumber = readLine()?.toIntOrNull()
    if (firstNumber != null && secondNumber != null && thirdNumber != null)
    {
        if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber)
        {
            println ("Ошибка")
        }
    }
}