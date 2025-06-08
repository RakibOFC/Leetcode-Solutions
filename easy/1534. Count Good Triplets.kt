class Solution {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        val n = arr.size
        var count = 0

        for (i in 0..<n) {
            for (j in (i + 1)..<n) {
                for (k in (j + 1)..<n) {
                    
                    if (abs(arr[i] - arr[j]) <= a &&
                        abs(arr[j] - arr[k]) <= b &&
                        abs(arr[i] - arr[k]) <= c
                    ) {
                        count++
                    }
                }
            }
        }

        return count
    }
}
