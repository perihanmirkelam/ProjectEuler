/**
 * P14-Longest Collatz sequence
 * The following iterative sequence is defined for the set of positive integers:
 *      n → n/2 (n is even)
 *      n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 *      13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
fun p14() {
    var term: Long
    var termCount: Int
    var greatestTermCount = 0
    var greatest = 0L
    repeat(1_000_000) {
        termCount = 1
        term = it.toLong()
        while (term > 1) {
            term = if (term % 2 == 0L) term / 2 else 3 * term + 1
            termCount++
        }
        if(termCount > greatestTermCount) {
            greatest = it.toLong()
            greatestTermCount = termCount
        }
    }
    println("A14: $greatest")
}