fun main() {
    print("Введите N: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}