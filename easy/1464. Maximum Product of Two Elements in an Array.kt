// Solution 2. (0ms)
class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE

        for (num in nums) {
            if (max1 < num) {
                max2 = max1
                max1 = num

            } else if (max2 < num) {
                max2 = num
            }
        }

        return (max1 - 1) * (max2 - 1)
    }
}

// Solution 1. (7ms)
class Solution {
    fun maxProduct(nums: IntArray): Int {
        val n = nums.size
        var maxProduct = 0

        for (i in 0..<n) {
            for (j in i + 1..<n) {
                val product = (nums[i] - 1) * (nums[j] - 1)
                if (product > maxProduct)
                    maxProduct = product
            }
        }

        return maxProduct
    }
}
