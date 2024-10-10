fun main () {
    println("Введите длину первой стороны: ")
    val sideA = readLine()?.toDoubleOrNull()
    println("Введите длину второй стороны: ")
    val sideB = readLine()?.toDoubleOrNull()
    println("Введите длину третьей стороны: ")
    val sideC = readLine()?.toDoubleOrNull()
    if (sideA != null && sideB != null && sideC != null && sideA > 0 && sideB > 0 && sideC > 0) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            println("Треугольник с такими сторонами может существовать.")
        } else {
            println("Треугольник с такими сторонами не может существовать.")
        }
    }
}