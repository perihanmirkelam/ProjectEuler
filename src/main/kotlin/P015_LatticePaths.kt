import java.math.BigInteger

/**
 * P15 - Lattice Paths
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */
fun p15(){
    var i = 20.toBigInteger()
    var j = 20.toBigInteger()
    fun combination(x: BigInteger, y: BigInteger) : BigInteger {
        fun factorial(n: BigInteger) : BigInteger {
            return if(n == 1.toBigInteger()) n
            else if (n == 0.toBigInteger()) 1.toBigInteger()
            else n*factorial(n-1.toBigInteger())
        }
        return factorial(x) / (factorial(y)*factorial(x-y))
    }
    println("A15: ${combination(i+j, j)}")
}