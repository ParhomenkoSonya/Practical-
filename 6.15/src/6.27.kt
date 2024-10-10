fun findMaxSequence(array:IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        return Pair(0, 0)
    }
    var maxCount = 1
    var currentCount = 1
    var maxElement = array[0]
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentCount++
        } else {
            if (currentCount > maxCount)  {
                maxCount = currentCount
                maxElement = array[i -1]
            }
            currentCount = 1
        }
    }
    if (currentCount > maxCount) {
        maxCount = currentCount
        maxElement = array[array.size - 1]
    }
    return Pair(maxElement, maxCount)
}
fun main() {
    val array = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5)
    val (element, count) = findMaxSequence(array)
    println ("Максимальная последовательность: элемент $element встречается $count раз.")
}