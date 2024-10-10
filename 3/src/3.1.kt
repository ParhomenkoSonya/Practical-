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
        val maxNumber = maxOf(firstNumber, secondNumber, thirdNumber)
        println ("Максимальное число: $maxNumber")
    }
}