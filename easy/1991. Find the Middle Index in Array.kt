class Solution {
    fun findMiddleIndex(nums: IntArray): Int {
        val n = nums.size
        val sumLeftArr = IntArray(n)
        val sumRightArr = IntArray(n)

        var sumLeft = 0
        var sumRight = 0
        for (i in 0..<n) {
            sumLeft += nums[i]
            sumRight += nums[n - i - 1]

            sumLeftArr[i] = sumLeft
            sumRightArr[n - i - 1] = sumRight
        }

        for (i in 0..<n) {
            if (sumLeftArr[i] == sumRightArr[i])
                return i
        }

        return -1
    }
}
