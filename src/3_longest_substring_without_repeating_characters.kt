class Solution2 {
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = mutableSetOf<Char>()
        var left = 0
        var maxLength = 0

        for (right in s.indices) {
            while (charSet.contains(s[right])) {
                charSet.remove(s[left])
                left++
            }
            charSet.add(s[right])
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}

fun main() {
    val solution = Solution2()
    val s = "pwwkew"
    println(solution.lengthOfLongestSubstring(s))
}