class Solution {
    fun reverseWords(s: String): String {
        return s.trim()
            .split("\\s+".toRegex())
            .reversed()
            .joinToString(" ")
    }
}