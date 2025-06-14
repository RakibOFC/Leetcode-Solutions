class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        val n = nums.size
        var count = 0

        for (i in 0..<n) {
            for (j in i + 1..<n) {

                if (nums[i] + nums[j] < target) {
                    count++
                }
            }
        }

        return count
    }
}
