// Solution 1.
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var original = x
        var reversed = 0

        while (original > reversed) {
            reversed = reversed * 10 + original % 10
            original /= 10
        }

        return original == reversed || original == reversed / 10
    }
}

// Solution 2.
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        var original = x
        var reverse = 0

        while (original > 0) {
            val reminder = original % 10
            original /= 10
            reverse = reverse * 10 + reminder
        }
        return reverse == x
    }
}
