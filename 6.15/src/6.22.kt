fun findSecondMaxsimum(array:IntArray): Int? {
    if (array.size < 2) return null
    var max = Int.MIN_VALUE
    var secondMax = Int.MAX_VALUE
    for (num in array) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num < max) {
            secondMax =  num
        }
    }
    return if (secondMax == Int.MIN_VALUE) null else secondMax
}
fun main() {
    val array = intArrayOf(3, 5, 1, 4, 5, 2)
    val secondMax = findSecondMaxsimum(array)
    if (secondMax != null) {
        println ("Второй по величине элемент: $secondMax")
    } else {
        println ("Второго по  величине элемента нет.")
    }
}