// Solution 2. (2ms)
class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)

        var sum = 0
        for (i in 0..<n) {
            result[i] = sum
            sum += nums[i]
        }

        sum = 0
        for (i in n - 1 downTo 0) {
            result[i] = abs(result[i] - sum)
            sum += nums[i]
        }

        return result
    }
}

// Solution 1. (2ms)
class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        val left = IntArray(n)
        val right = IntArray(n)
        var leftSum = 0
        var rightSum = 0

        for (i in 0..<n) {
            left[i] = leftSum
            right[n - i - 1] = rightSum
            leftSum += nums[i]
            rightSum += nums[n - i - 1]
        }

        for (i in result.indices) {
            result[i] = abs(left[i] - right[i])
        }

        return result
    }
}
