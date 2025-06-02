class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val sums = IntArray(nums.size)

        for (i in nums.indices) {
            var sum = 0
            for (j in 0..i){
                sum += nums[j]
            }
            sums[i] = sum
        }

        return sums
    }
}
