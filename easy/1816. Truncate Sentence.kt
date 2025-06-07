// Solution 2. (0ms)
class Solution {
    fun truncateSentence(s: String, k: Int): String {
        var spaceCount = 0
        
        for (i in s.indices) {
            if (s[i] == ' ') {
                spaceCount++
                if (spaceCount == k) return s.substring(0, i)
            }
        }
        
        return s
    }
}

// Solution 1. (14ms)
class Solution {
    fun truncateSentence(s: String, k: Int): String {
        val sentence = StringBuilder()

        var n = 0
        for (word in s.split(" ")) {
            if (n < k) {
                sentence.append(word).append(" ")
                n++
            }
        }

        return sentence.toString().trim()
    }
}
