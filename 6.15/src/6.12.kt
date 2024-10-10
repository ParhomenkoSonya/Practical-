fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val index1 = 1
    val index2 = 3
    println ("Массив до обмена: ${array.joinToString(",")}")
    swap (array, index1, index2)
    println ("Массив после обмена: ${array.joinToString(",")}")
}
fun swap (array: Array<Int>, index1: Int, index2: Int) {
    if (index1 < 0 || index1 >= array.size || index2 < 0 || index2 >= array.size) {
        throw IndexOutOfBoundsException ("Индексы должны быть в пределах массива.")
    }
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}