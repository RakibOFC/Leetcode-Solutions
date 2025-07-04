class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (x == 1.0) return 1.0
        if (x == -1.0) return if (n % 2 == 0) 1.0 else -1.0
        if (n == 0) return 1.0

        var base = x
        var exp = n.toLong()
        if (exp < 0) {
            base = 1 / base
            exp = -exp
        }

        var result = 1.0
        while (exp > 0) {
            if (exp % 2 == 1L) result *= base
            base *= base
            exp /= 2
        }

        return result
    }
}
