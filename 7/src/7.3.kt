fun main() {
    fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
        return wins * 3 + draws * 1 + losses * 0
    }
    fun findSmallestNumber(numbers: List<Int>): Int {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("Список не может быть пустым")
        }
        var smallest = numbers[0]
        for (number in numbers) {
            if (number < smallest) {
                smallest = number
            }
        }
        return smallest
    }
    fun areNumbersEqual(num1: Int, num2: Int): Boolean {
        return num1 == num2
    }
    println("Введите количество побед, ничьих и поражений команды:")
    val wins = readLine()!!.toInt()
    val draws = readLine()!!.toInt()
    val losses = readLine()!!.toInt()
    val points = calculatePoints(wins, draws, losses)
    println("Количество очков: $points")
    println("Введите список чисел, разделенных пробелом:")
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val smallest = findSmallestNumber(numbers)
    println("Самое маленькое число: $smallest")
    println("Введите два числа:")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val isEqual = areNumbersEqual(num1, num2)
    println("Числа равны: $isEqual")
}