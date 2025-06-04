// Solution 2. (1ms)
class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var sum = 0

        for (num in nums) {
            sum += num
        }

        return sum % k
    }
}

// Solution 1. (11ms)
class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.sum() % k
    }
}
