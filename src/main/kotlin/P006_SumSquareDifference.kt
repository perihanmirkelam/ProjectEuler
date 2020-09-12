/**
 * P6-Sum square difference
 * The sum of the squares of the first ten natural numbers is 385
 * The square of the sum of the first ten natural numbers is 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
fun p6() {
    var num1 = 0
    var num2 = 0
    repeat(100) {
        num1 += (it + 1) * (it + 1)
        num2 += (it + 1)
    }
    num2 *= num2
    println("A6: ${num2 - num1}")
}