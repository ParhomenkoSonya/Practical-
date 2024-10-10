fun main() {
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = originalArray.copyOf()
    println ("Оригинальный массив: ${originalArray.joinToString(",")}")
    println ("Скопированный массив: ${copiedArray.joinToString(",")}")
}