import kotlin.random.Random
fun main() {
    println ("Случайные числа от 1 до 100:")
    for (i in 1..10) {
        val randomNumber = Random.nextInt(1,101)
        println (randomNumber)
    }
}