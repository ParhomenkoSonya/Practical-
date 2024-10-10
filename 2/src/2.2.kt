fun main ()
{
    val number = 473
    val units = number % 10
    val tens = (number / 10) % 10
    val hundreds = number / 100
    val sum = units + tens + hundreds
    val product = units * tens * hundreds
    println ("Число единиц: $units")
    println ("Число десятков: $tens")
    println ("Число сотен: $hundreds")
    println ("Сумма цифр: $sum")
    println ("Произведение цифр: $product")
}