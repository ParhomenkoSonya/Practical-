fun main ()
{
    val x = true
    val y = true
    val z = false
    println ("a) не X и Y: ${!x && y}")
    println ("b) X или не Y: ${x || !y}")
    println ("c) X или Y и Z: ${x || y && z}")
}