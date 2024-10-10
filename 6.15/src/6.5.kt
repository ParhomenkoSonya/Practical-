fun main() {
    val numbers = arrayOf(1, 20, 4, 13, 9, 11, 15, 3, 18, 6)
    val sortedNumbers = mergeSort(numbers)
    println ("Отсортированный массив: ${sortedNumbers.joinToString(",")}")
}
fun mergeSort (arr: Array<Int>) : Array<Int> {
    if (arr.size <= 1) return arr
    val mid = arr.size / 2
    val left = mergeSort(arr.sliceArray(0 until mid))
    val right = mergeSort(arr.sliceArray(mid until arr.size))
    return merge (left, right)
}
fun merge (left: Array<Int>, right: Array<Int>) : Array<Int> {
    val result = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            result.add(left[i])
            i++
        } else {
            result.add(right[j])
            j++
        }
    }
    while (i < left.size) {
        result.add(left[i])
        i++
    }
    while (j < right.size) {
        result.add(right[j])
        j++
    }
    return result.toTypedArray()
}