fun linearSearch (array: IntArray, target: Int): Boolean {
    for (element in array) {
        if (element == target) {
            return true
        }
    }
    return false
}
fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val target = 2
    val found = linearSearch(array, target)
    if (found) {
        println ("Элемент $target найден в массиве.")
    } else {
        println ("Элемент $target не найден в массиве.")
    }
}