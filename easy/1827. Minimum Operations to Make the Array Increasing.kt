// Solution 2. (172ms)
class Solution {
    fun minOperations(nums: IntArray): Int {
        var operations = 0
        var prevValue = nums[0]

        for (i in 1..<nums.size) {
            if (nums[i] <= prevValue) {
                val incrementNeeded = (prevValue - nums[i]) + 1
                operations += incrementNeeded
                prevValue += 1
            } else {
                prevValue = nums[i]
            }
        }

        return operations
    }
}

// Solution 1. (181ms)
class Solution {
    fun minOperations(nums: IntArray): Int {
        var operations = 0

        for (i in 1..<nums.size) {
            val currentNum = nums[i]
            val previousNum = nums[i - 1]

            if (currentNum <= previousNum) {
                val incNeeded = (previousNum - currentNum) + 1

                nums[i] += incNeeded
                operations += incNeeded
            }
        }

        return operations
    }
}
