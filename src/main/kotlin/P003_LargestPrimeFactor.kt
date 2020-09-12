import kotlin.math.sqrt

/**
 * P3-Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
fun p3(num: Long = 600_851_475_143L) {
    var isPrime = true
    val primeFactors = mutableListOf<Long>()
    for (i in 2..sqrt(num.toDouble()).toInt() + 1) {
        if ((num % i) == 0L) {
            for (j in primeFactors) {
                if (i % j == 0L) isPrime = false
            }
            if (isPrime) primeFactors.add(i.toLong())
            isPrime = true
        }
    }
    println("A3: ${primeFactors.last()}")
}