class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, value) in nums.withIndex()) {
            val complement = target - value
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, index)
            }
            map[value] = index
        }

        throw IllegalArgumentException("No two sum solution found")
    }
}