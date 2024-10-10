fun main() {
    println ("Введите высоту лестницы (N):")
    val input = readLine()
    val height = input?.toIntOrNull()
    if (height == null || height <= 0) {
        println ("Пожалуйста, введите роложительное целое число.")
        return
    }
    for (i in 1..height) {
        print (" ".repeat(height - i))
        println ("#".repeat(i))
    }
}