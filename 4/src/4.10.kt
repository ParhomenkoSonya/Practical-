fun main () {
    println ("Введите способ оплаты наличные, кредитная карта, PayPal):")
    val paymentMethod = readLine()?.toLowerCase()
    val message = when (paymentMethod) {
        "наличные" -> "Вы выбрали оплату наличными."
        "кредитная карта" -> "Вы выбрали оплату кредитной кратой."
        "paypal" -> "Вы выбрали оплату через PayPal."
        else -> "Неизвестный способ оплаты. Пожалуйста, выберите: наличные, кредитная карта или PayPal."
    }
    println (message)
}