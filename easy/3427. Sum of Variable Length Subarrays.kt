class Solution {
    fun subarraySum(nums: IntArray): Int {
        var totalSum = 0

        for (i in nums.indices) {
            val start = max(0, i - nums[i])
            var sum = 0

            for (j in start..i) {
                sum += nums[j]
            }
            totalSum += sum
        }

        return totalSum
    }
}
