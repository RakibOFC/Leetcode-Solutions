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
