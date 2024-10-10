fun main() {
val numbers = Array(100)
{ (0..100).random() }
val groups = MutableList(10)
{ mutableListOf<Int>() }
for (i in numbers.indices) {
    groups[i / 10].add(numbers[i])
}
    for ((index, group) in groups.withIndex()) {
        println ("Группа $index: ${group.joinToString(",")}")
    }
}


