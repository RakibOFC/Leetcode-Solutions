class Solution2390 {
    fun removeStars(s: String): String {
        val result = StringBuilder()
        for (char in s) {
            if (char == '*') {
                if (result.isNotEmpty()) {
                    result.deleteCharAt(result.length - 1)
                }
            } else {
                result.append(char)
            }
        }
        return result.toString()
    }
}

fun main() {
    val solution = Solution2390()
    val sentence = "leet**cod*e"
    val s = solution.removeStars(sentence)
    println(s)
}