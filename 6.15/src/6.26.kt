fun calculateAverage (array:IntArray): Double {
    if (array.isEmpty()) {
        return 0.0
    }
    val sum = array.sum()
    return sum.toDouble()
    array.size
}
fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val average = calculateAverage(array)
    println ("Среднее арифметическое: $average")
}