fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)
    val concatenatedArray = array1 + array2
    println ("Результат конкатенации: ${concatenatedArray.joinToString(",")}")
}