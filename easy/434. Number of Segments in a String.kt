class Solution {
    fun countSegments(s: String): Int {
        if (s.isEmpty()) return 0
        var count = 0
        val n = s.length

        for (i in 0..<n) {
            if (s[i] != ' ' && i == (n - 1)) {
                count++
            } else if (i + 1 < n && s[i + 1] == ' ' && s[i] != ' ') {
                count++
            }
        }

        return count
    }
}
