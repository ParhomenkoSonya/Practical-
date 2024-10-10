import java.time.LocalDate
import java.time.YearMonth
fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print("Введите месяц (1-12): ")
    val month = readLine()!!.toInt()
    val yearMonth = YearMonth.of(year, month)
    val startDate = yearMonth.atDay(1)
    val endDate = yearMonth.atEndOfMonth()
    println("Даты в месяце:")
    for (date in startDate..endDate) {
        println(date)
    }
}