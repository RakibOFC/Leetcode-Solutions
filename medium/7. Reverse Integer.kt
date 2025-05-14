// Solution 1.
class Solution {
    fun reverse(x: Int): Int {
        val isNegative = x < 0
        var num = if (isNegative) (-1 * x) else x
        var revNum = 0

        while (num > 0) {
            val reminder = num % 10
            num /= 10

            val tempRevNum: Long = revNum.toLong() * 10 + reminder

            revNum = revNum * 10 + reminder
            if (revNum.toLong() != tempRevNum) return 0
        }
        if (isNegative) revNum = (-1 * revNum)

        return revNum
    }
}
