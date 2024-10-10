fun main() {
    println ("Введите строку:")
    val input = readLine()
    if (input.isNullOrEmpty()) {
        println ("Вы не ввели строку.")
        return
    }
    for (char in input) {
        println (char)
    }
}