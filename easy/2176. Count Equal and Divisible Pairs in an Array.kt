class Solution {
    fun countPairs(nums: IntArray, k: Int): Int {
        var count = 0

        for (i in nums.indices) {
            for (j in (i + 1)..<nums.size) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++
                }
            }
        }

        return count
    }
}
