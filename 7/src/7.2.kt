fun main() {
    println ("Введите слово:")
    val input = readLine()?.trim()?:""
    if (isPalindrome(input)) {
        println ("Слово \"$input\" является палиндромом.")
    } else {
        println ("Слово \"$input\" не является палиндромом.")
    }
}
fun isPalindrome (word: String): Boolean {
    val reversedWord = word.reversed()
    return word.equals(reversedWord, ignoreCase = true)
}