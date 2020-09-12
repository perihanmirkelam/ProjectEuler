/**
 * P5-Smallest Multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
fun p5() {
    var num = 10
    var isDivisible = false
    while (true) {
        num++
        repeat(20) {
            if (num % (it + 1) != 0) isDivisible = false
        }
        if (isDivisible) break
        isDivisible = true
    }
    println("A5: $num")
}