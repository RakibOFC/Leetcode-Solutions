// Solution 1.
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

// Solution 2.
class Solution {
    fun isThree(n: Int): Boolean {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) count++
        }
        return count == 3
    }
}
