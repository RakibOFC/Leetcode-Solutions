class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var sum = 0

        for (i in 1..< num) {
            val remainder = num % i
            if (remainder == 0) {
                sum += i
            }
        }
        return num == sum
    }
}
