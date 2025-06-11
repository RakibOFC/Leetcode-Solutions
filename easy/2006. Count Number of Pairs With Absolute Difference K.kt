// Solution 2. (7ms)
class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val diff = nums[i] - nums[j]
                if (diff == k || diff == -k) {
                    count++
                }
            }
        }

        return count
    }
}

// Solution 1. (10ms)
class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0

        for (i in nums.indices) {
            for (j in (i + 1)..<nums.size) {
                if (abs(nums[i] - nums[j]) == k) {
                    count++
                }
            }
        }

        return count
    }
}
