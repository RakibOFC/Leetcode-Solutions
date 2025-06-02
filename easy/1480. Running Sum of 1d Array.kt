// Solution 2. (0ms)
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val sums = IntArray(nums.size)
        sums[0] = nums[0]

        for (i in 1 until nums.size) {
            sums[i] = sums[i - 1] + nums[i]
        }

        return sums
    }
}

// Solution 1. (3-4ms)
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val sums = IntArray(nums.size)

        for (i in nums.indices) {
            var sum = 0
            for (j in 0..i){
                sum += nums[j]
            }
            sums[i] = sum
        }

        return sums
    }
}
