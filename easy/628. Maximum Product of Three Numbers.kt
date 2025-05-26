// Solution 2.
class Solution {
    fun maximumProduct(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        for (num in nums) {

            if (num > max1) {
                max3 = max2
                max2 = max1
                max1 = num

            } else if (num > max2) {
                max3 = max2
                max2 = num

            } else if (num > max3) {
                max3 = num
            }

            if (num < min1) {
                min2 = min1
                min1 = num
            } else if (num < min2) {
                min2 = num
            }
        }
        
        val product1 = max1 * max2 * max3
        val product2 = min1 * min2 * max1

        return if (product1 > product2) product1 else product2
    }
}

// Solution 1.
class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()

        val n = nums.size
        val product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]
        val product2 = nums[0] * nums[1] * nums[n - 1]

        return if (product1 > product2) product1 else product2
    }
}
