class Solution {
    fun numberOfMatches(n: Int): Int {
        var count = 0
        var num = n

        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2
                count += num
            } else {
                val match = (num - 1) / 2
                num = (num - 1) / 2 + 1
                count += match
            }
        }

        return count
    }
}
