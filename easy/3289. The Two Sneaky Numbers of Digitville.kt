// Solution 2. (8ms)
class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val n = nums.size

        for (i in nums.indices) {
            val num = nums[i] % n

            if (nums[num] >= n) {
                result.add(num)
                if (result.size == 2) break
            } else {
                nums[num] += n
            }
        }

        return result.toIntArray()
    }
}

// Solution 1. (10ms)
class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        var first = -1
        var second = -1
        val n = nums.size

        for (i in 0..<n) {
            for (j in 0..<n) {

                if (i != j && nums[i] == nums[j] && first != nums[i] && second != nums[i]) {
                    if (first == -1) {
                        first = nums[i]
                    } else if (second == -1)
                        second = nums[i]
                }
            }
        }

        return intArrayOf(first, second)
    }
}
