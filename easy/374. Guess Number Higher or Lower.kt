/**
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

// Solution 1.
class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        if (guess(n) == 0) return n

        var start = 1
        var end = n
        var mid: Int = n / 2

        while (start < end) {
            val guess = guess(mid)

            if (guess == -1) {
                end = mid
            } else if (guess == 1) {
                start = mid
            } else return mid

            mid = ((start.toLong() + end.toLong()) / 2).toInt()
        }
        return mid
    }
}

// Solution 2.
class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var start = 1
        var end = n

        while (start <= end) {
            val mid = start + (end - start) / 2
            val result = guess(mid)

            when {
                result == 0 -> return mid
                result < 0 -> end = mid - 1
                else -> start = mid + 1
            }
        }

        return -1
    }
}
