fun main() {
    val numbers = intArrayOf(34, 12, 56, 30, 63, 72, 18, 85, 52)
    for (i in numbers.indices) {
        for (j in 0 until numbers.size - 1 - i) {
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    println ("Отсортированный массив: ${numbers.joinToString(",")}")
}