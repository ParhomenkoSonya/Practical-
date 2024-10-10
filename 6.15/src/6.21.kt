fun removeElement(array: IntArray, elementToRemove: Int): IntArray {
    return array.filter { it != elementToRemove }.toIntArray()
}
fun main() {
    val originalArray =
        intArrayOf(1, 2, 3, 4, 5, 3, 6)
    val elementToRemove = 3
    val newArray = removeElement(originalArray, elementToRemove)
    println("Исходный массив: ${originalArray.joinToString(",")}")
    println("Новый массив после удаления элемента $elementToRemove:${newArray.joinToString(",")}")
}