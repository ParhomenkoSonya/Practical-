fun mergeArrays (vararg arrays:IntArray): IntArray {
    return arrays.reduce { acc, array -> acc + array }
}
fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5)
    val array3 = intArrayOf(6, 7, 8, 9)
    val mergeArray = mergeArrays (array1, array2, array3)
    println (mergeArray.joinToString(","))
}