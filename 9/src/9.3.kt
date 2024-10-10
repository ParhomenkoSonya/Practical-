fun main() {
    val exchangeRates = mapOf(
        "USD_EUR" to 0.85,
        "EUR_USD" to 1.18
    )
    println("Введите сумму для конвертации:")
    val amount = readLine()?.toDoubleOrNull()
    if (amount == null || amount < 0) {
        println("Некорректная сумма.")
        return
    }
    println("Введите валюту (USD или EUR):")
    val currency = readLine()?.toUpperCase()
    when (currency) {
        "USD" -> {
            val convertedAmount = amount * exchangeRates["USD_EUR"]!!
            println("$amount USD = $convertedAmount EUR")
        }
        "EUR" -> {
            val convertedAmount = amount * exchangeRates["EUR_USD"]!!
            println("$amount EUR = $convertedAmount USD")
        }
        else -> {
            println("Некорректная валюта. Пожалуйста, используйте USD или EUR.")
        }
    }
}