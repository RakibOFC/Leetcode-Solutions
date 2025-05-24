class Solution {
    fun maxProduct(n: Int): Int {
        var num = n
        val digits = mutableListOf<Int>()
        var maxProduct = 0

        while (num > 0) {
            val digit = num % 10
            digits.add(digit)
            num /= 10
        }

        for (i in digits.indices) {
            for (j in (i + 1)..<digits.size) {
                if ((digits[i] * digits[j]) > maxProduct) {
                    maxProduct = digits[i] * digits[j]
                }
            }
        }

        return maxProduct
    }
}
