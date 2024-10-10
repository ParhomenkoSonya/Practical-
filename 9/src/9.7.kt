fun toggleCase(input: String): String {
    return input.map {
        if (it.isUpperCase()) it.toLowerCase()
        else it.toUpperCase()
    }.joinToString("")
}
fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""
    val toggled = toggleCase(input)
    println("Строка с измененным регистром:")
    println(toggled)
}