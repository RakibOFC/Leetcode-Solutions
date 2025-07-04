// Solution 3. (0ms)
class Solution {
    fun countSegments(s: String): Int {
        var count = 0
        for (i in s.indices) {
            if (s[i] != ' ' && (i == 0 || s[i - 1] == ' ')) {
                count++
            }
        }
        return count
    }
}

// Solution 1. (0ms)
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

// Solution 1. (13ms)
class Solution {
    fun countSegments(s: String): Int {
        return s.trim().split("\\s+".toRegex()).filter { it.isNotEmpty() }.size
    }
}
