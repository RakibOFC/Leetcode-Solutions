// Solution 2. (3ms)
class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val indeices = mutableListOf<Int>()

        for (i in words.indices) {
            for (char in words[i]) {
                if (char == x) {
                    indeices.add(i)
                    break
                }
            }
        }

        return indeices
    }
}

// Solution 1. (9ms)
class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val indeices = mutableListOf<Int>()

        for (i in words.indices) {
            if (words[i].contains(x)){
                indeices.add(i)
            }
        }

        return indeices
    }
}
