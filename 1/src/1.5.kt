fun main ()
{
    println ("3654")
    val input = readLine()
    if (!input.isNullOrBlank() && input.toDoubleOrNull() != null)
    {
        println ("$input - 3654")
    }
    else
    {
        println ("Ошибка: не было введено корректное число.")
    }
}