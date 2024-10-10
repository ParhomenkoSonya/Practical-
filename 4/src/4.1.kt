fun getDayOfWeek (dayNumber: Int): String {
    val daysOfWeek = arrayOf (
        "Понедельник",
        "Вторник",
        "Среда",
        "Четверг",
        "Пятница",
        "Суббота",
        "Воскресенье",
    )
    return if (dayNumber in 1..7) {
        daysOfWeek [dayNumber - 1]
    } else {
        "Некорректный номер дня"
    }
}
fun main () {
    val dayNumber = 5
    println (getDayOfWeek(dayNumber))
}