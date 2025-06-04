// Solution 2. (20ms)
class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        return sentences.map { it.split(" ").size }.maxOrNull() ?: 0
    }
}

// Solution 1. (19ms)
class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var maxCounter = 0
        var crrCounter = 0

        for (sentence in sentences) {
            crrCounter = 0

            for (word in sentence.split(" ")) {
                crrCounter++
            }
            if (crrCounter > maxCounter) {
                maxCounter = crrCounter
            }
        }

        return maxCounter
    }
}
