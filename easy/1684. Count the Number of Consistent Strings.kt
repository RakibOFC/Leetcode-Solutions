// Solution 2. (213ms)
class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSet = allowed.toSet()
        var counter = 0

        for (word in words) {
            if (word.all { it in allowedSet }) {
                counter++
            }
        }

        return counter
    }
}

// Solution 1. (220ms)
class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var counter = 0

        for (word in words) {
            var isAllowed = true
            
            for (char in word) {
                if (!allowed.contains(char)) {
                    isAllowed = false
                    break
                }
            }
            if (isAllowed) counter++
        }
        return counter
    }
}
