fun  main() {
    println ("Таблица квадратов чисел от 1 до 20:")
    println ("Число\tКвадрат")
    for (i in 1..20) {
        val square = i * i
        println ("$i\t$square")
    }
}