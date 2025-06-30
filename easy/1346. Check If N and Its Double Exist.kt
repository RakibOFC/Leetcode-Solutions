// Solution 2. (2ms)
class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val seen = HashSet<Int>()

        for (num in arr) {
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true
            }
            seen.add(num)
        }

        return false
    }
}

// Solution 1. (6ms)
class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val n = arr.size

        for (i in 0..<n) {
            for (j in 0..<n) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true
                }
            }
        }

        return false
    }
}
