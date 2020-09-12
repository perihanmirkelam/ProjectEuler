import kotlin.math.sqrt

/**
 * P7-10001st prime
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
fun p7() {
    var primeCount = 2 // 2 and 3
    var isPrime = true
    var num = 3
    while (primeCount < 10001) {
        num += 2
        for (i in 3..sqrt(num.toDouble()).toInt() + 1) if (num % i == 0) isPrime = false
        if (isPrime) primeCount++
        isPrime = true
    }
    println("A7: $num")
}