/**
 * P4-Largest palindrome product
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

fun p4() {
    var product: Int
    var sup = 0
    var lb: Int
    var ub: Int
    for (f1 in 999 downTo 99) {
        f2@ for (f2 in 999 downTo 99) {
            product = f1 * f2
            ub = product.toString().length - 1
            lb = 0
            while (ub > lb) {
                if (product.toString()[lb] == product.toString()[ub]) {
                    ub--
                    lb++
                } else continue@f2
            }
            sup = if (product > sup) product else sup
        }
    }
    println("A4: $sup")
}