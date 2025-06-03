// Solution 2. (1ms)
class Solution {
    fun transformArray(nums: IntArray): IntArray {
        var evenCount = 0
        val n = nums.size
        val arr = IntArray(n)

        for (i in nums.indices) {
            if (nums[i] % 2 == 0) evenCount++
        }

        for (i in evenCount..<n) {
            arr[i] = 1
        }

        return arr
    }
}

// Solution 1. (10ms)
class Solution {
    fun transformArray(nums: IntArray): IntArray {

        for (i in nums.indices) {
            when (nums[i] % 2) {
                0 -> nums[i] = 0
                else -> nums[i] = 1
            }
        }
        nums.sort()

        return nums
    }
}
