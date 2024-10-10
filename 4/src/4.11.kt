fun main () {
    println ("Введите группу крови (A, B, AB, O): ")
    val bloodType = readLine()?.toUpperCase()
    when (bloodType) {
        "A" -> println ("Можно переливать: A, AB")
        "B" -> println ("Можно переливать: B, AB")
        "AB" -> println ("Можно переливать: AB")
        "O" -> println ("Можно переливать: A, B, AB, O")
        else -> println ("Некорректная группа крови. Пожалуйста, введите A, B, AB, O.")
    }
}