class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val size = grid.size
        val n = size * size
        val result = IntArray(2)
        var sum = 0
 
        for (num in 1..n) {
            var count = 0
 
            for (j in grid.indices) {
                for (k in grid[0].indices) {

                    // For the first time, calculate the sum of all numbers
                    if (num == 1) {
                        sum += grid[j][k]
                    }

                    // Counting number
                    if (num == grid[j][k]) {
                        count++
                    }
                }
            }
            
            // Check the counter to get a repeated number
            if (count >= 2) {
                result[0] = num
                sum -= num
                break
            }
        }
        val sumOfN = n * (n + 1) / 2
        result[1] = sumOfN - sum
        
        return result
    }
}
