fun main() {
    println ("Введите первую строку:")
    val firstString = readLine()?.trim() ?: ""
    println ("Введите вторую строку:")
    val secondString = readLine()?.trim() ?: ""
    if (areAnagrams(firstString, secondString)) {
        println ("Строки являются анаграммами.")
    } else {
        println ("Строки не являеются анаграммами.")
    }
}
fun areAnagrams(str1: String, str2: String) {
    val normalizedStr1 = str1.replace("\\s".toRegex(), "").lowercase()
    val normalizedStr2 = str2.replace("\\s".toRegex(), "").lowercase()
    return
    normalizedStr1.toCharArray().sorted() == normalizedStr2.toCharArray().sorted()
}