fun main () {
    println ("Ввелите код ошибки (100, 200, 300): ")
    val errorCode = readLine()?.trim()
    when (errorCode) {
        "100" -> println ("Ошибка сети")
        "200" -> println ("Ошибка сервера")
        "300" -> println ("Ошибка доступа")
        else -> println ("Неизвестный код ошибки")
    }
}