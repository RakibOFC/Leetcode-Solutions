// Solution 2. (1-2ms)
class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size
        val size = n * n
        val freq = IntArray(size + 1)
        var repeated = -1
        var missing = -1

        for (row in grid) {
            for (num in row) {
                freq[num]++
            }
        }

        for (i in 1..size) {
            when (freq[i]) {
                0 -> missing = i
                2 -> repeated = i
            }
        }

        return intArrayOf(repeated, missing)
    }
}

// Solution 1. (19-22ms)
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
