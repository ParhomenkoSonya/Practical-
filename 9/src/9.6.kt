fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val strings = arrayOf("banana", "apple", "orange", "kiwi", "grape")
    println("Исходный массив строк:")
    println(strings.joinToString(", "))
    val sortedStrings = sortStrings(strings)
    println("Отсортированный массив строк:")
    println(sortedStrings.joinToString(", "))
}