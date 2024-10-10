fun main() {
    println ("Введите числа через пробел:")
    val input = readLine()?:""
    val stringArray = input.split("")
    val intArray = stringArray.mapNotNull { it.toIntOrNull() }.toIntArray()

    println ("Вы ввели массив:")
    println(intArray.joinToString(","))
}