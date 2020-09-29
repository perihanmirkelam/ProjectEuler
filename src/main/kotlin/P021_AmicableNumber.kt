/**
 * P21 - Amicable Numbers
 *
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b,
 * then a and b are an amicable pair and each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */
fun p21() {
    val pairs: MutableList<Pair<Int, Int>> = mutableListOf((0 to 0))
    val boundary = 10000
    var n: Int; var dn: Int

    for (i in 1..boundary) {
        n = i
        dn = 0
        for (j in 1 until n) if (n % j == 0) dn += j
        pairs.add(n to dn)
    }

    fun d(x: Int): Int  = pairs[x].second

    var a: Int; var b: Int; var sum = 0
    for (i in pairs) {
        a = i.first
        b = i.second
        if (a < boundary && b < boundary && a != b && a == d(b) && b == d(a)) sum += a
    }
    println("A21: $sum")
}
