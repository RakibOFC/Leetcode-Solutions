class Solution {
    fun numberOfMatches(n: Int): Int {
        var count = 0
        var num = n

        while (num > 1) {
            if (num % 2 == 0) {
                count += num / 2
                num /= 2
            } else {
                count += (num - 1) / 2
                num = (num - 1) / 2 + 1
            }
        }

        return count
    }
}
