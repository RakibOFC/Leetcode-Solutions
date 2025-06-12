// Solution 1. (3-6ms)
class Solution {
    fun checkIfPangram(sentence: String): Boolean {

        for (alphabet in 'a'..'z') {
            var isFound = false
            for (letter in sentence) {
                if (alphabet == letter)
                    isFound = true
            }
            if (!isFound)
                return false
        }

        return true
    }
}

// Solution 1. (16ms)
class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        return sentence.toSet().size == 26
    }
}
