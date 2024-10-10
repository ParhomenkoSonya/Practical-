fun main() {
    print("Введите N: ")
    val n = readLine()!!.toInt()
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }
    println("Сумма четных чисел: $sumEven")
    println("Сумма нечетных чисел: $sumOdd")
}