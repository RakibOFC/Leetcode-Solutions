// Solution 2. (19ms)
class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") { it.reversed() }
    }
}

// Solution 1. (22ms)
class Solution {
    fun reverseWords(s: String): String {
        val reverse = StringBuilder()

        for (word in s.split(" ")) {
            for (i in word.length - 1 downTo 0) {
                reverse.append(word[i])
            }
            reverse.append(" ")
        }

        return reverse.toString().trim()
    }
}
