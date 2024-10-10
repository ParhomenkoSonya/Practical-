fun main() {
    println("Консольный калькулятор")
    println("Введите первое число:")
    val firstNumber = readLine()?.toDoubleOrNull()
    if (firstNumber == null) {
        println("Некорректный ввод числа.")
        return
    }
    println("Введите оператор (+, -, *, /):")
    val operator = readLine()
    println("Введите второе число:")
    val secondNumber = readLine()?.toDoubleOrNull()
    if (secondNumber == null) {
        println("Некорректный ввод числа.")
        return
    }
    val result = when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else {
            println("Ошибка: деление на ноль.")
            return
        }

        else -> {
            println("Некорректный оператор.")
            return
        }
    }
    println("Результат: $result")
}