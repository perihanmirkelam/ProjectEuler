/**
 * P20-Factorial Digit Sum
 *
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
fun p20(){
    var fac = 1.toBigInteger()
    repeat(100){ fac *= (it+1).toBigInteger() }
    val sum : Int = fac.toString().toCharArray().map{Character.getNumericValue(it)}.reduce{sum, it -> sum + it}
    println("A20: $sum")
}
