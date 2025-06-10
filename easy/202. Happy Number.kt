class Solution {
    fun isHappy(n: Int): Boolean {
        if (n == 1)
            return true
        else if (n == 4)
            return false

        var num = n
        var sum = 0

        while (num > 0) {
            val digit = num % 10
            sum += digit * digit
            num /= 10
        }

        return isHappy(sum)
    }
}
