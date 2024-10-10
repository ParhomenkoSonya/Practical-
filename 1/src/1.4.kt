fun main ()
{
    println ("Введите число:")
    val input = readlnOrNull()
    if (!input.isNullOrBlank() && input.toDoubleOrNull() != null)
    {
        println ("Вы ввели число: $input")
    }
    else
    {
        println ("Ошибка: не было введено число.")
    }
}