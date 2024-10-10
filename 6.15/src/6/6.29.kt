fun main() {
    println ("Введите числа через пробел:")
    val input = readLine()?:""
    val stringArray = input.split("")
    val intArray = stringArray.mapNotNull { it.toIntOrNull() }.toIntArray()
    val median = findMedian(intArray)
    println ("Медиана: $median")
}
fun findMedian(arr: IntArray): Double {
    if (arr.isEmpty()) return 0.0
    val sortedArray = arr.sortedArray()
    val middle = sortedArray.size / 2
    return if (sortedArray.size % 2 == 0) {
        (sortedArray[middle - 1] + sortedArray[middle]) / 2.0
    } else {
        sortedArray[middle].toDouble()
    }
}

