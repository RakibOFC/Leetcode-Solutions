// Solution 1. (12ms)
class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        val result = ArrayList<Int>()

        for (num in nums) {
            if (num == 0) {
                result.add(0)
                continue
            }

            var divisor = 1
            while (num / divisor >= 10) {
                divisor *= 10
            }

            var temp = num
            while (divisor > 0) {
                result.add(temp / divisor)
                temp %= divisor
                divisor /= 10
            }
        }

        return result.toIntArray()
    }
}

// Solution 2. (16ms)
class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        val numList = mutableListOf<Int>()

        for (num in nums) {

            for (char in num.toString()) {
                numList.add(char.digitToInt())
            }
        }

        return numList.toIntArray()
    }
}
