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
