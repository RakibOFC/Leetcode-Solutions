class Solution {
    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var count = 0

        for (num1 in nums1) {
            for (num2 in nums2) {
                if (num1 % (num2 * k) == 0) {
                    count++
                }
            }
        }

        return count
    }
}
