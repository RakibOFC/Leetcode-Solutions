class Solution {
    fun sumBase(n: Int, k: Int): Int {
        var num = n
        var sum = 0

        while (num > 0) {
            sum += num % k
            num /= k
        }

        return sum
    }
}
