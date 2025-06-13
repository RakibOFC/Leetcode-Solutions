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
