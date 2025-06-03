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
