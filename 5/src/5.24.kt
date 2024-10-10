fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println("Исходная матрица:")
    printMatrix(matrix)
    val transposedMatrix = transpose(matrix)
    println("Транспонированная матрица:")
    printMatrix(transposedMatrix)
}
fun transpose(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposed = Array(cols) { Array(rows) { 0 } }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}
fun printMatrix(matrix: Array<Array<Int>>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}