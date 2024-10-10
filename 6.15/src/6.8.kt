fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val target = 30
    val index = numbers.indexOf(target)
    if (index != -1) {
        println ("Элемент $target найден на индексе $index.")
    } else {
        println ("Элемент $target не найден в массиве.")
    }
}