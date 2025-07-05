// Solution 1. (5-7ms)
class Solution {
    fun isPalindrome(s: String): Boolean {
        val result = StringBuilder()

        for (char in s) {
            if (char.isLetterOrDigit()) {
                result.append(char.lowercaseChar())
            }
        }

        var i = 0
        var j = result.length - 1

        while (i < j) {
            if (result[i] != result[j]) {
                return false
            }
            i++
            j--
        }

        return true
    }
}
