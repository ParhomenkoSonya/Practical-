fun main() {
    while (true) {
        println("Введите первую цифру (или 'стоп' для выхода):")
        val input1 = readLine()
        if (input1.equals("стоп", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }
        println("Введите вторую цифру (или 'стоп' для выхода):")
        val input2 = readLine()
        if (input2.equals("стоп", ignoreCase = true)) {
            println("Выход из программы.")
            break
        }
        val number1 = input1?.toDoubleOrNull()
        val number2 = input2?.toDoubleOrNull()
        if (number1 == null || number2 == null) {
            println("Пожалуйста, введите корректные цифры.")
            continue
        }
        println("Выберите операцию: 1 - Сложение, 2 - Умножение")
        val operation = readLine()
        when (operation) {
            "1" -> {
                val sum = number1 + number2
                println("Результат сложения: $sum")
            }
            "2" -> {
                val product = number1 * number2
                println("Результат умножения: $product")
            }
            else -> {
                println("Некорректный выбор операции. Пожалуйста, выберите 1 или 2.")
            }
        }
    }
}