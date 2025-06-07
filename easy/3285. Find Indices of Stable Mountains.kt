class Solution {
    fun stableMountains(heights: IntArray, threshold: Int): List<Int> {
        val mountains = mutableListOf<Int>()
        
        for (i in 1..<heights.size) {
            if (heights[i - 1] > threshold) {
                mountains.add(i)
            }
        }

        return mountains
    }
}
