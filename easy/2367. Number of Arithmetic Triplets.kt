class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val n = nums.size
        var count = 0

        for (i in 0..<n) {
            for (j in (i + 1)..<n) {
                for (k in (j + 1)..<n) {

                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++
                    }
                }
            }
        }

        return count
    }
}
