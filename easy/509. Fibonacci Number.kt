class Solution {
    fun fib(n: Int): Int {
        if (n < 2) return n

        var f1 = 0
        var f2 = 1
        for (i in 2..n) {
            val sum = f1 + f2
            f1 = f2
            f2 = sum
        }
        return f2
    }
}
