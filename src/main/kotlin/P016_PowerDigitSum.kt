import java.math.BigInteger
import kotlin.math.pow

/**
 * P16 - Power digit sum
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
fun p16(){
    var sum = 0
    var n = 1.toBigInteger()
    repeat(1000){
        n *= 2.toBigInteger()
    }
    n.toString().toCharArray().forEach{sum += Character.getNumericValue(it)}
    println("A16: $sum")
}
