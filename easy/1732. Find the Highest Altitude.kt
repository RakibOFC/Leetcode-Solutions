class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var largestAltitude = 0
        var currentAltitude = 0

        for (g in gain) {
            currentAltitude += g
            if (largestAltitude < currentAltitude)
                largestAltitude = currentAltitude
        }

        return largestAltitude
    }
}
