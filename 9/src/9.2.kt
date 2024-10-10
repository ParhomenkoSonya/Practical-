fun main() {
    println ("Введите строку:")
    val input = readLine() ?: ""
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0
    for (char in input) {
        when {
            char.isLetter() -> {
                if (char in vowels) {
                    vowelCount++
                } else {
                    consonantCount++
                }
            }
        }
    }
    println ("Количество гласных: $vowelCount")
    println ("Количество согласных: $consonantCount")
}