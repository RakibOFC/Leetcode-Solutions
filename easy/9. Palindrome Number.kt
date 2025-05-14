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
