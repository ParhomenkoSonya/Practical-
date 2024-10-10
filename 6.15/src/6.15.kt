fun main() {
    val array = arrayOf(1, 2, 3, 2, 1)
    if (isPalindrome(array)) {
        println ("Массив является палиндромом.")
    } else {
        println ("Массив не является палиндромом.")
    }
}
fun isPalindrome (array: Array<Int>):Boolean {
    val lenght = array.size
    for (i in 0 until lenght / 2) {
        if (array[i] != array[lenght - 1 - i]) {
            return false
        }
    }
    return true
}