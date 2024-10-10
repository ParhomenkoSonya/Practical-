fun gradeFromScore(score: Int):
        String {
    return when {
        score >= 90 -> "Отлично"
        score in 75..89 -> "Хорошо"
        score in 60..74 -> "Удовлетворительно"
        score in 50..59 -> "Неудовлетворительно"
        score < 50 -> "Плохо"
        else -> "Некорректное значение"
    }
}
fun main () {
    val scores = listOf (95, 84, 67, 52, 45, 100)
    for (score in scores) {
        println ("Оценка для $score: ${gradeFromScore(score)}")
    }
}