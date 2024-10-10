fun main() {
    val intVar: Int = 42
    val longVar: Long = 100000L
    val doubleVar: Double = 3.14
    val floatVar: Float = 2.5F
    val stringVar: String = "Hello, Kotlin!"
    val booleanVar: Boolean = true
    val charVar: Char = 'K'
    println("===================================")
    println("           Типы данных в Kotlin    ")
    println("===================================")
    println("1. Целочисленные типы:")
    println("   - Int: $intVar (Размер: 4 байта)")
    println("   - Long: $longVar (Размер: 8 байт)")
    println("\n2. Вещественные типы:")
    println("   - Float: $floatVar (Размер: 4 байта)")
    println("   - Double: $doubleVar (Размер: 8 байт)")
    println("\n3. Строки:")
    println("   - String: \"$stringVar\" (Неизменяемая последовательность символов)")
    println("\n4. Логический тип:")
    println("   - Boolean: $booleanVar (Значения: true или false)")
    println("\n5. Символьный тип:")
    println("   - Char: '$charVar' (Единственный символ)")
    println("\n===================================")
}