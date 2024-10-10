fun areAnagrams(str1: String, str2: String): Boolean {
    val normalizedStr1 = str1.replace(" ", "").lowercase()
    val normalizedStr2 = str2.replace(" ", "").lowercase()
    return normalizedStr1.toCharArray().sorted() == normalizedStr2.toCharArray().sorted()
}
fun main() {
    println("Введите первую строку:")
    val input1 = readLine() ?: ""
    println("Введите вторую строку:")
    val input2 = readLine() ?: ""

    if (areAnagrams(input1, input2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}