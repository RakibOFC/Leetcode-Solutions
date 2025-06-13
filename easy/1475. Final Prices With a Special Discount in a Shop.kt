// Solution 2. (2ms)
class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val n = prices.size
        val result = IntArray(n)
        var i = 0
        var j = 1

        while (i < n) {

            if (j >= n) {
                result[i] = prices[i]
                i++
                j = i + 1

            } else if (i < j && prices[j] <= prices[i]) {
                result[i] = prices[i] - prices[j]
                i++
                j = i + 1

            } else {
                j++
            }
        }

        return result
    }
}

// Solution 1. (2ms)
class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val result = IntArray(prices.size)

        for (i in prices.indices) {
            var isDiscount = false
            for (j in i + 1..<prices.size) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j]
                    isDiscount = true
                    break
                }
            }
            if (!isDiscount) result[i] = prices[i]
        }

        return result
    }
}
