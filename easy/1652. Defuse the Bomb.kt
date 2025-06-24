class Solution {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val n = code.size
        val decrypt = IntArray(n)

        if (k > 0) {
            for (i in 0 until n) {
                var sum = 0
                for (j in 1..k) {
                    sum += code[(i + j) % n]
                }
                decrypt[i] = sum
            }

        } else if (k < 0) {
            for (i in 0 until n) {
                var sum = 0
                for (j in 1..-k) {
                    sum += code[(i - j + n) % n]
                }
                decrypt[i] = sum
            }

        } else {
            for (i in 0 until n) {
                decrypt[i] = 0
            }
        }

        return decrypt
    }
}
