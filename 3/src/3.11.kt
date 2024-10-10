fun main ()
{
    val number = 42
    val lastDigit = 2
    if (number % 2 == 0) {
        println ("$number является чётным числом.")
    } else {
        println ("$number является нечётным числом.")
    }
    if (number % 10 == lastDigit) {
        println ("$number оканчивается на цифру $lastDigit.")
    } else {
        println ("$number не оканчивается на цифру $lastDigit.")
    }
}