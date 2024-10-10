fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvenNumbers = numbers.filter { it % 2 == 0 }.sum()
    println ("Сумма чётных чисел: $sumOfEvenNumbers")
}