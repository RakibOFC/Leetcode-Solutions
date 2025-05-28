class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var operations = 0

        for (num in nums) {
            val remainder = num % 3
            
            if (remainder != 0) {
                operations += 1
            }
        }

        return operations
    }
}
