// Solution 1. (0ms)
class Solution {
    fun pivotInteger(n: Int): Int {
        val sumOfN = sumOfN(n)
        val x = sqrt(sumOfN(n).toDouble()).toInt()
        return if (x * x == sumOfN) x else -1
    }

    fun sumOfN(n: Int) = n * (n + 1) / 2
}

// Solution 1. (2ms)
class Solution {
    fun pivotInteger(n: Int): Int {
        for (x in 1..n) {
            if (sumOfN(x) == sumFromXtoN(x, n)) {
                return x
            }
        }

        return -1
    }

    fun sumOfN(n: Int) = n * (n + 1) / 2

    fun sumFromXtoN(x: Int, n: Int) = sumOfN(n) - x * (x - 1) / 2
}
