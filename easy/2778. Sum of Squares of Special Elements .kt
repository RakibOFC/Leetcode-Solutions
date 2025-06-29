class Solution {
    fun sumOfSquares(nums: IntArray): Int {
        val n = nums.size
        var sum = 0

        for (i in 1..n) {
            if (n % i == 0) {
                sum += (nums[i-1]*nums[i-1])
            }
        }
        
        return sum
    }
}
