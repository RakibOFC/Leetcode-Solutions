class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var nonZeroIndex = 0

        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] == 0) {
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
            }
        }
    }
}