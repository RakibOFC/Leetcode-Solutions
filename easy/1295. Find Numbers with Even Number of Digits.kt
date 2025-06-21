class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count = 0

        for (num in nums) {
            var n = num
            var digitCount = 0
            while (n > 0) {
                n /= 10
                digitCount++
            }

            if (digitCount % 2 == 0)
                count++
        }

        return count
    }
}
