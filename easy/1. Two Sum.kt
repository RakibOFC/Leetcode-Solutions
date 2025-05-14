class Solution1 {
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

fun main() {
    val solution = Solution1()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = solution.twoSum(nums, target)
    println("Indices: ${result[0]}, ${result[1]}")
}