// Solution 1.
class Solution {
    fun isThree(n: Int): Boolean {
        val root = sqrt(n.toDouble()).toInt()

        if (root * root != n) return false

        return isPrime(root)
    }

    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}

// Solution 2.
class Solution {
    fun isThree(n: Int): Boolean {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) count++

            if (count > 3) {
                break
            } else {
                continue
            }
        }
        return count == 3
    }
}

// Solution 3.
class Solution {
    fun isThree(n: Int): Boolean {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) count++
        }
        return count == 3
    }
}
