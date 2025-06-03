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
