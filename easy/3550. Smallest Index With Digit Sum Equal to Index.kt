class Solution {
    fun smallestIndex(nums: IntArray): Int {
        for (i in nums.indices) {
            var sum = 0
            var num = nums[i]
            while (num != 0) {
                sum += num % 10
                num /= 10
            }
            if (sum == i) return i
        }
        return -1
    }
}
