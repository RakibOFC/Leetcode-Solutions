class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        var numsSum = 0
        var digitsSum = 0

        for (num in nums) {
            var tempNum = num
            numsSum += num

            while (tempNum > 0) {
                digitsSum += tempNum % 10
                tempNum /= 10
            }
        }

        return numsSum - digitsSum
    }
}
