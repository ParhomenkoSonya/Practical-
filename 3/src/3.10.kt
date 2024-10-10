fun main ()
{
    val a = 3
    val b = 12
    if (a != 0) {
        if (b % a == 0) {
            println ("$a является делителем $b")
        } else {
            println ("$a не является делителем $b")
        }
    }
}