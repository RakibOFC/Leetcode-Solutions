// Solution 1.
class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var sum = 0

        for (i in 1..< num) {
            val remainder = num % i
            if (remainder == 0) {
                sum += i
            }
        }
        return num == sum
    }
}


// Solution 2.
class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num <= 1) return false
        var sum = 1

        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                sum += i
                val other = num / i
                if (other != i) {
                    sum += other
                }
            }
        }
        return sum == num
    }
}
