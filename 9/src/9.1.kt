import kotlin.random.Random
fun main() {
    val randomNumbers = mutableListOf<Int>()
    for (i in 1..10) {
        val randomNumber = Random.nextInt(1,101)
        randomNumbers.add(randomNumber)
    }
    println ("Случайнфе числа: $randomNumbers")
}