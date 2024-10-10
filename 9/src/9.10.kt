fun main() {
    val inputString = "Привет, мир! Как дела? Надеюсь, у тебя всё хорошо."
    val longestWord = findLongestWord(inputString)
    println("Самое длинное слово: $longestWord")
}
fun findLongestWord(input: String): String {
    val words = input
        .replace(Regex("[^\\w\\sа-яА-ЯёЁ]"), "") // Убираем все, кроме букв и пробелов
        .split("\\s+".toRegex())
    return words.maxByOrNull { it.length } ?: ""
}