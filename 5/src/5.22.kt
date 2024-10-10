import kotlin.random.Random
fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guess: Int? = null
    var attempts = 0
    println("Угадайте число от 1 до 100!")
    while (guess != randomNumber) {
        println("Введите ваше предположение:")
        guess = readLine()?.toIntOrNull()
        if (guess == null) {
            println("Пожалуйста, введите корректное число.")
            continue
        }
        attempts++
        when {
            guess < randomNumber -> println("Слишком мало! Попробуйте снова.")
            guess > randomNumber -> println("Слишком много! Попробуйте снова.")
            else -> println("Поздравляю! Вы угадали число $randomNumber за $attempts попыток.")
        }
    }
}