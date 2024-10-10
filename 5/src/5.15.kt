fun main() {
    println ("Введите строку:")
    val input = readLine() ?: ""
    val cleanedInput = input.replace("\\s+".toRegex(),"").lowercase()
    val isPalindrome = cleanedInput == cleanedInput.reversed()
    if (isPalindrome) {
        println ("Строка является палиндромом.")
    } else {
        println ("Строка не является палиндромом.")
    }
}