fun main ()
{
    val number = 1234
    if (number in 1000..9999) {
        val firstDigit = number / 1000
        val secondDigit = (number / 100) % 10
        val thirdDigit = (number / 10) % 10
        val fourtDigit = number % 10
        val sumFirstTwo = firstDigit + secondDigit
        val sumLastTwo = thirdDigit + fourtDigit
        val isSumEqual = sumFirstTwo == sumLastTwo
        println ("Сумма двух первых цифр равна сумме двух последних: $isSumEqual")
        val totalSum = firstDigit + secondDigit + thirdDigit + fourtDigit
        val isSumDivisibleByThree = totalSum % 3 == 0
        println ("Сумма цифр кратна трём: $isSumDivisibleByThree")
        val productOfDigits = firstDigit * secondDigit * thirdDigit * fourtDigit
        val isProductDivisibleByFour = productOfDigits % 4 == 0
        println ("Произведение цифр кратно четырём: $isProductDivisibleByFour")
        val a = 5
        val isProductDivisibleByA = productOfDigits % a == 0
        println ("Произведение цифр кратно $a: $isProductDivisibleByA")
    } else {
        println ("Введите четырёхзначное число.")
    }
}