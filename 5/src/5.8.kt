fun main() {
    println ("Введите первое число:")
    val firstNumber = readLine()?.toIntOrNull()
    println ("Введите второе число:")
    val secondNumber = readLine()?.toIntOrNull()
    if (firstNumber == null || secondNumber == null || firstNumber <= 0 || secondNumber <= 0) {
        println ("Пожалуйста, введите положительные целые числа.")
        return
    }
    val gcd = calculateGCD (firstNumber, secondNumber)
    println ("Наибольший общий делитель (НОД) чисел $firstNumber и $secondNumber: $gcd")
}
fun calculateGCD (a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        calculateGCD(b, a % b)
    }
}