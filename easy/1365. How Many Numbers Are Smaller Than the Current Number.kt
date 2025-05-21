class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        for (i in nums.indices) {
            var smallerCount = 0
            for (num in nums) {
                if (nums[i] > num) {
                    smallerCount++
                }
            }
            result[i] = smallerCount
        }
        return result
    }
}
