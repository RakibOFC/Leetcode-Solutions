// Solution 2. (4ms)
class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        val n = arr.size

        for (size in 1..n) {
            if (size % 2 != 0) {

                for (i in 0..<n) {
                    val limit = size + i - 1

                    if (limit < n) {

                        for (j in i..limit) {
                            sum += arr[j]
                        }
                    } else {
                        break
                    }
                }
            }
        }

        return sum
    }
}

// Solution 1. (13ms)
class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        val n = arr.size
        val sizes = (1..n).filter { it % 2 != 0 }

        for (size in sizes) {
            for (i in 0..<n) {
                val limit = size + i - 1
                if (limit < n) {
                    for (j in i..limit) {
                        sum += arr[j]
                    }
                } else {
                    break
                }
            }
        }

        return sum
    }
}
