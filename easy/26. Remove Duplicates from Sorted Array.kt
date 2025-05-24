class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var prevNum = -101
        var counter = 0
        for (num in nums) {
            if (num != prevNum) {
                nums[counter] = num
                prevNum = num
                counter++
            }
        }

        return counter
    }
}
