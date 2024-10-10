fun main ()
{
    val x = false
    val y = false
    val z = true
    val resultA = x || (y && !z)
    println ("Результат а: $resultA")
    val resultB = !x && !y
    println ("Результат б: $resultB")
    val resultC = !(x && z) || y
    println ("Результат в: $resultC")
    val resultD = (x && !y) || z
    println ("Результат г: $resultD")
    val resultE = x && (!y|| z)
    println ("Результат д: $resultE")
    val resultF = x || !(y || z)
    println ("Результат е: $resultF")
}