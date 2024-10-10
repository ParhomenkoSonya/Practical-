fun main() {
    val array1 = intArrayOf(1, 3, 5, 7, 9)
    val array2 = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = mergeSortedArrays(array1, array2)
    println ("Слитый отсортированный массив: ${mergedArray.joinToString(",")}")
}
fun mergeSortedArrays (arr1: IntArray, arr2: IntArray): IntArray {
    val merged = IntArray (arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            merged[k++] = arr1[i++]
        } else {
            merged[k++] = arr2[j++]
        }
    }
    while (i < arr1.size) {
        merged[k++] = arr1[i++]
    }
    while (j < arr2.size) {
        merged [k++] = arr2[j++]
    }
    return merged
}