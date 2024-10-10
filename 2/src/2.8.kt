fun main ()
{
    val a = true
    val b = false
    val c = false
    println ("a) не A и B: ${!a && b}")
    println ("b) A или не B: ${a || !b}")
    println ("c) A и B или C: ${a && b || c}")
}