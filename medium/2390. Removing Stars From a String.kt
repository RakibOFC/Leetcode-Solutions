class Solution {
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