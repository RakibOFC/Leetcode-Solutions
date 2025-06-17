class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        val n = nums.size

        for (i in 0..<n - 1) {
            if ((nums[i] % 2) == (nums[i + 1] % 2))
                return false
        }
        return true
    }
}
