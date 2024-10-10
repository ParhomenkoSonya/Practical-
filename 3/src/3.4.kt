fun main ()
{
    println ("Введите большее число: ")
    val greaterNumber = readLine()?.toIntOrNull()
    println ("Введите меньшее число: ")
    val lesserNumber = readLine()?.toIntOrNull()
    if (greaterNumber != null && lesserNumber != null && greaterNumber > lesserNumber) {
        if (greaterNumber % lesserNumber == 0) {
            println ("$greaterNumber кратно $lesserNumber")
        } else {
            val remainder = greaterNumber % lesserNumber
            println ("$greaterNumber не кратно $lesserNumber")
            println ("Остаток от деления: $remainder")
        }
    }
}