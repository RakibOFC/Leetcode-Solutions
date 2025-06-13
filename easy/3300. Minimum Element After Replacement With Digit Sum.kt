// Solution 1. (2ms)
class Solution {
    fun minElement(nums: IntArray): Int {
        var min = Int.MAX_VALUE

        for (num in nums) {
            var n = num
            var newNum = 0

            while (n > 0) {
                newNum += n % 10
                n /= 10
            }

            if (newNum < min)
                min = newNum
        }

        return min
    }
}

// Solution 2. Based on Hint1 (12ms)
class Solution {
    fun minElement(nums: IntArray): Int {
        return nums.minOf { num -> 
            num.toString().sumOf { it - '0' }
        }
    }
}
