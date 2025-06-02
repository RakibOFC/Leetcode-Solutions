// Solution 1. (1ms)
class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n * 2)

        for (i in ans.indices) {
            ans[i] = nums[i % n]
        }

        return ans
    }
}

// Solution 2. (7ms)
class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }
}
