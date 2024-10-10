fun main ()
{
    println ("Введите год: ")
    val year = readLine()?.toIntOrNull()
    if (year != null && year > 0) {
        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
        if (isLeapYear) {
            println ("$year год является високосным.")
            println ("Количество дней в году: 366")
        } else {
            println ("$year год не является високосным.")
            println ("Количество дней в году: 365")
        }
    }
}