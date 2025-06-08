class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var smallest = 0

        for (num in nums) {
            if (num < k) {
                smallest++
            }
        }

        return smallest
    }
}
