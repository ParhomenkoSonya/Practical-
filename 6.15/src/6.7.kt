fun main() {
    val numbers = arrayOf (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val reversedNumbers = numbers.reversedArray()
    println ("Исходный массив: ${numbers.joinToString(",")}")
    println ("Реверсированный массив: ${reversedNumbers.joinToString(",")}")
}