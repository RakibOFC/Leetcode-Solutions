class Solution {
    fun addDigits(num: Int): Int {
        if (num < 10) return num

        var n = num
        var digitSum = 0

        while (n > 0) {
            val digit = n % 10
            digitSum += digit
            n /= 10
        }

        return addDigits(digitSum)
    }
}
