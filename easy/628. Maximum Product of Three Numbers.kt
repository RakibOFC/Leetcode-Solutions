class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()

        val n = nums.size
        val product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]
        val product2 = nums[0] * nums[1] * nums[n - 1]

        return if (product1 > product2) product1 else product2
    }
}
