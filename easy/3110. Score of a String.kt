class Solution {
    fun scoreOfString(s: String): Int {
        var sum = 0
        val n = s.length

        for (i in 1..<n) {
            sum += abs(s[i - 1].code - s[i].code)
        }

        return sum
    }
}
