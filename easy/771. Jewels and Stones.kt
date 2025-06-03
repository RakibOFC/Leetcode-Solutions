// Solution 1. (1ms)
class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var stoneCount = 0

        for (jewel in jewels) {
            for (stone in stones) {
                if (jewel == stone) {
                    stoneCount++
                }
            }
        }

        return stoneCount
    }
}

// Solution 2. (7ms)
class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        return stones.count { it in jewels }
    }
}
