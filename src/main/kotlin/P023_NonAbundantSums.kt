/**
 * P23-Non-Abundant Sums
 *
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 * which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n
 * and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 * By mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers.
 * However, this upper limit cannot be reduced any further by analysis
 * even though it is known that the greatest number that cannot be expressed as the sum of
 * two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
fun p23() {
    val upperLimit = 28123; val minAbundant = 12; var sumOfDivisors = 1
    val abundantList = mutableListOf<Int>()
    val nonAbundantSum = (1 until upperLimit).toMutableList()

    for (x in minAbundant until upperLimit) {
        for (j in 2 until x) if (x % j == 0) sumOfDivisors += j
        if (sumOfDivisors > x) abundantList.add(x)
        sumOfDivisors = 1
    }

    for (x in 1 until upperLimit)
        for (abundant in abundantList) {
            if (x - abundant >= minAbundant)
                if (abundantList.contains(x - abundant)) {
                    nonAbundantSum.remove(x)
                    break
                } else break
        }

    println("A23: ${nonAbundantSum.sum()}")
}