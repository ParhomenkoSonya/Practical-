fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    var sum = 0
    var product = 1
    for (element in array) {
        sum += element
        product *= element
    }
    println ("Сумма элементов массива: $sum")
    println ("Произведение элементов массива: $product")
}