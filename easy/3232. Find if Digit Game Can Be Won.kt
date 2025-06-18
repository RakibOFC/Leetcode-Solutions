class Solution {
    fun canAliceWin(nums: IntArray): Boolean {
        var singleDigitSum = 0
        var doubleDigitSum = 0

        for (num in nums) {
            if (num >= 10)
                doubleDigitSum += num
            else
                singleDigitSum += num
        }

        return singleDigitSum != doubleDigitSum
    }
}
