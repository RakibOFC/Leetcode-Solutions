class Solution {
    fun removeTrailingZeros(num: String): String {
        val n = num.length
        var i = n - 1

        for (j in i downTo 0) {
            if (num[j] != '0') {
                i = j
                break
            }
        }

        return num.removeRange(i + 1, n)
    }
}
