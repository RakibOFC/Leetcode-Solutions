class Solution {
    fun missingNumber(nums: IntArray): Int {
        var sum = 0
        val size = nums.size

        for (num in nums) {
            sum += num
        }
        val expectedSum = (size * (size + 1)) / 2
        return expectedSum - sum
    }
}
