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
