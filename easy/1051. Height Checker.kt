// Solution 2. (4ms)
class Solution {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.copyOf()
        expected.sort()

        var count = 0
        for (i in heights.indices) {
            if (heights[i] != expected[i]) {
                count++
            }
        }

        return count
    }
}

// Solution 1. (14ms)
class Solution {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.sorted()
        var count = 0

        for (i in expected.indices) {
            if (heights[i] != expected[i]) {
                count++
            }
        }
        
        return count
    }
}
