fun main () {
    val numbers = arrayOf (12, 3, 15, 20, 5, 13, 8, 2, 10, 19)
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()
    println ("Максимальное значение: $max")
    println ("Минимальное значение: $min")
}