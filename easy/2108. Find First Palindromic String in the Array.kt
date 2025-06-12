// Solution 3. (5ms)
class Solution {
    fun firstPalindrome(words: Array<String>): String {
        for (word in words) {
            if (isPalindrome(word)) return word
        }
        return ""
    }

    private fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}

// Solution 2. (13ms)
class Solution {
    fun firstPalindrome(words: Array<String>): String {
        for (word in words) {
            if (word == word.reversed()) {
                return word
            }
        }
        return ""
    }
}

// Solution 1. (84ms)
class Solution {
    fun firstPalindrome(words: Array<String>): String {
        for (word in words) {
            var reverse = ""
            
            for (i in (word.length - 1) downTo 0) {
                reverse += word[i]
            }
            if (word == reverse) {
                return word
            }
        }

        return ""
    }
}
