fun main() {
 val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
 val groupSize = 5
 for (i in array.indices step groupSize) {
     val group = array.copyOfRange(i, minOf(i + groupSize, array.size))
     println (group.joinToString(","))
 }
}