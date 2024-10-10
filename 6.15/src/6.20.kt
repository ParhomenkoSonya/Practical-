fun main() {
    val firstTerm = 5
    val commonDifference = 3
    val numberOfTerms = 10
    val aritmeticProgression = IntArray (numberOfTerms)
    for (i in 0 until numberOfTerms) {
        val arithmeticProgression = null
        arithmeticProgression?.set(i, firstTerm + i * commonDifference)
    }
        println ("Арифметическая прогрессия: ${aritmeticProgression.joinToString(",")}")
}