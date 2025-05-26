class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var num = n
        var digitsProduct = 1
        var digitsSum = 0

        while (num > 0) {
            val digit = num % 10
            digitsProduct *= digit
            digitsSum += digit
            num /= 10
        }

        return digitsProduct - digitsSum
    }
}
