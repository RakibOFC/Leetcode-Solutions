// Solution 2. (1ms)
class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for (c in candies) {
            if (c > max) max = c
        }

        val result = ArrayList<Boolean>(candies.size)
        for (c in candies) {
            result.add(c + extraCandies >= max)
        }

        return result
    }
}

// Solution 1. (10ms)
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        val result = mutableListOf<Boolean>()

        for (i in candies.indices) {
            result.add((candies[i] + extraCandies) >= max)
        }
        return result
    }
