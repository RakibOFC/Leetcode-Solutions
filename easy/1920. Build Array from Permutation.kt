// Solution 2. (2ms) This is follow-up solution
class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val n = nums.size

        for (i in nums.indices) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n
        }

        for (i in nums.indices) {
            nums[i] = nums[i] / n
        }

        return nums
    }
}

// Solution 1. (1ms) This is not follow-up solution
class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)

        for (i in nums.indices) {
            ans[i] = nums[nums[i]]
        }

        return ans
    }
}
