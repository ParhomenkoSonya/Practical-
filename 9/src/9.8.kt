import kotlin.random.Random
fun main() {
    val targetNumber = Random.nextInt(1, 101)
    var guess: Int?
    var attempts = 0
    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте угадать его!")
    do {
        println("Введите ваше предположение:")
        val input = readLine()
        guess = input?.toIntOrNull()
        if (guess == null) {
            println("Пожалуйста, введите корректное число.")
            continue
        }
        attempts++
        when {
            guess < targetNumber -> println("Загаданное число больше.")
            guess > targetNumber -> println("Загаданное число меньше.")
            else -> println("Поздравляю! Вы угадали число $targetNumber за $attempts попыток.")
        }
    } while (guess != targetNumber)
}