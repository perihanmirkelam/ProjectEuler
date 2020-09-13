/**
 * P19-Counting Sundays
 * You are given the following information, but you may prefer to do some research for yourself.
 *      1 Jan 1900 was a Monday.
 *      Thirty days has September,
 *      April, June and November.
 *      All the rest have thirty-one,
 *      Saving February alone,
 *      Which has twenty-eight, rain or shine.
 *      And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 *      It was the interview question that got me my first job 3 years ago :) Just converted to Kotlin \m/
 */
fun p19(){
    var day = 1
    var count = 0
    val daysInMonths = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    for (year in 1900..2000) {
        daysInMonths[1] = if (isLeapYear(year)) 29 else 28
        for (month in 0..11) {
            day += daysInMonths[month]
            if (day % 7 == 0 && year > 1900) count++
        }
    }
    println("A19: $count")
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
}