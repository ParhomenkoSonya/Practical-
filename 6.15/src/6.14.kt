fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println ("Числа, делящиеся на 3:")
    for (number in numbers) {
        if (number % 3 == 0) {
            println (number)
        }
    }
}