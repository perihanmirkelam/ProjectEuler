import kotlin.math.sqrt

/**
 * P10-Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
fun p10() {
    val num = 2_000_000
    var sum = 2L
    var isPrime = true
    for (i in 3 until num step 2) {
        for (j in 2..sqrt(i.toDouble()).toInt() + 1) if (i % j == 0) isPrime = false
        if (isPrime) sum += i
        isPrime = true
    }
    println("A10: $sum")
}