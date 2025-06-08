// Solution 1. (0ms)
class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val string1 = StringBuilder()
        val string2 = StringBuilder()

        for (word in word1) {
            string1.append(word)
        }

        for (word in word2) {
            string2.append(word)
        }

        return string1.toString() == string2.toString()
    }
}

// Solution 2. (16ms)
class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }
}
