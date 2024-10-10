fun main() {
    val m = 10
    val n = 3
    if (n != 0) {
        if (m % n == 0) {
            val quotient = m / n
            println("Частное от деления $m на $n: $quotient")
        } else {
            println("$m на $n нацело не делится")
        }
    }
}