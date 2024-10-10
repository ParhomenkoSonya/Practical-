fun main() {
    print("Введите целое число: ")
    val decimalNumber = readLine()!!.toInt()
    val binaryNumber = decimalNumber.toString(2)
    println("Двоичное представление: $binaryNumber")
}