fun main() {
    print("Введите количество чисел (N): ")
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    println("Введите $n чисел:")
    for (i in 1..n) {
        print("Число $i: ")
        val number = readLine()!!.toInt()
        numbers.add(number)
    }
    numbers.sort()
    println("Отсортированные числа:")
    for (number in numbers) {
        print("$number ")
    }
    println()
}