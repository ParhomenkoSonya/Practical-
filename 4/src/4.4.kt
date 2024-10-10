import java.time.LocalTime
fun getTimeOfDay(): String {
    val currentTime = LocalTime.now()
    return when {
        currentTime.isBefore (LocalTime.NOON) -> "Утро"
        currentTime.isBefore (LocalTime.of(18, 0)) -> "День"
        currentTime.isBefore (LocalTime.of(22, 0)) -> "Вечер"
        else -> "Ночь"
    }
}
fun main () {
    val timeOfDay = getTimeOfDay()
    println ("Сейчас $timeOfDay.")
}