class Solution {
    fun findPermutationDifference(s: String, t: String): Int {
        val n = s.length
        var result = 0

        for (i in 0..<n) {
            for (j in 0..<n) {
                if (s[i] == t[j]) {
                    result += abs(i - j)
                    break
                }
            }
        }

        return result
    }
}
