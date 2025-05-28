class Solution {
    fun diagonalPrime(nums: Array<IntArray>): Int {
        var maxPrime = 0
        val size = nums.size

        for (i in 0..<size) {
            val num1 = nums[i][i]
            val num2 = nums[i][size - i - 1]

            if (isPrime(num1)) maxPrime = maxNum(num1, maxPrime)
            if (num1 != num2 && isPrime(num2)) maxPrime = maxNum(num2, maxPrime)

        }
        return maxPrime
    }

    private fun maxNum(n1: Int, n2: Int): Int {
        return if (n1 > n2) n1 else n2
    }

    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false

        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }

        return true
    }
}
