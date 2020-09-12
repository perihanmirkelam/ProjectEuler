/**
 * P9-Special Pythagorean triplet
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
fun p9() {
    val sum = 1000
    var a: Int
    var b: Int
    var c: Int
    var bPlusC: Int
    for (i in sum / 3..sum - 2) { //triangle inequality
        a = i
        bPlusC = sum - i
        for (j in 1..bPlusC / 2) {
            b = j
            c = bPlusC - b
            if ((b * b) + (c * c) == (a * a)) println("A9: ${a * b * c}")
        }
    }
}