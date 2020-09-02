fun main(args: Array<String>) {
    q1()
    q2()
}

/**
 * Q1 - Multiple of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
fun q1(limit: Int = 1000){
    var sum = 0
    for(i in 1 until limit){
        if(i%3 == 0 || i%5 == 0) sum+=i
    }
    println("A1: $sum")
}

/**
 * Q2 - Even Fibonacci numbers
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
fun q2(limit: Int = 4_000_000){
    var f0 = 1
    var f1 = 2
    var f2: Int
    var sum = f1
    while(f0 + f1 < limit){
        f2 = f0 + f1
        if(f2 % 2 == 0) sum += f2
        f0 = f1
        f1 = f2
    }
    println("A2: $sum")
}
