fun main() {
    val numbers = arrayOf (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    val evenArray = evenNumbers.toTypedArray()
    val oddArray = oddNumbers.toTypedArray()
    println ("Чётные числа: ${evenArray.joinToString(",")}")
    println ("Нечётные числа: ${oddArray.joinToString(",")}")
}