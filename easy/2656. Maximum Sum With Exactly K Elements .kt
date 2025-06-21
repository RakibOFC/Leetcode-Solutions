class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        var max = 0
        var sum = 0

        for (i in nums.indices) {
            if (max < nums[i])
                max = nums[i]
        }

        for (i in 1..k) {
            sum += max
            max += 1
        }

        return sum
    }
}
