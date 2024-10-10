import kotlin.random.Random
fun main() {
    println("Введите длину пароля:")
    val lengthInput = readLine()
    val length = lengthInput?.toIntOrNull()
    if (length == null || length <= 0) {
        println("Пожалуйста, введите корректное положительное число.")
        return
    }
    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}
fun generatePassword(length: Int): String {
    val lowerCaseLetters = ('a'..'z').toList()
    val upperCaseLetters = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val specialCharacters = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+')
    val allCharacters = lowerCaseLetters + upperCaseLetters + digits + specialCharacters
    return (1..length)
        .map { allCharacters.random() }
        .joinToString("")
}