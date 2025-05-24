class Solution {
    fun countDigits(num: Int): Int {
        var count = 0
        var n = num

        while (n > 0) {
            val digit = n % 10
            if (digit != 0 && num % digit == 0) {
                count++
            }
            n /= 10
        }

        return count
    }
}
