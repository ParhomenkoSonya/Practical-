fun main() {
    println ("Ведите начальное число:")
    val start = readLine()?.toIntOrNull()
    println ("Введите шаг:")
    val step = readLine()?.toIntOrNull()
    if (start != null && step != null) {
        println ("Сгенерированная последовательность:")
        generateSequence(start, step)
    } else {
        println ("Ошибка: введите корректные числовые значения.")
    }
}
fun generateSequence(start: Int, step: Int) {
    for (i in 0 until 10) {
        println (start + i * step)
    }
}