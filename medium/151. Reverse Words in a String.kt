class Solution151 {
    fun reverseWords(s: String): String {
        return s.trim()
            .split("\\s+".toRegex())
            .reversed()
            .joinToString(" ")
    }
}

fun main() {
    val solution = Solution151()
    val sentence = "This   is a sample sentence"
    val words = solution.reverseWords(sentence)
    println(words)
}