fun main () {
    println ("Таблица умножения от 1 до 10:")
    for (i in 1..10) {
        for (j in 1..10) {
            print ("${i * j}\t")
        }
        println()
    }
}