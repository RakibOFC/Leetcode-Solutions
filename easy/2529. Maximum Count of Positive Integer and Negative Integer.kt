class Solution {
    fun maximumCount(nums: IntArray): Int {
        var positiveCount = 0
        var negativeCount = 0

        for(i in nums.indices) {
            if (nums[i] > 0)
                positiveCount++
            else if (nums[i] < 0)
                negativeCount++
        }

        return max(positiveCount, negativeCount)
    }
}
