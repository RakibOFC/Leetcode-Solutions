// Solution 2.
class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        val totalSum = n * (n + 1) / 2
        val count = n / m
        val num2 = m * count * (count + 1) / 2
        val num1 = totalSum - num2
        return num1 - num2
    }
}

// Solution 1.
class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        var num1 = 0
        var num2 = 0

        for (num in 1..n) {
            if (num % m == 0)
                num2 += num
            else
                num1 += num
        }
        return num1 - num2
    }
}
