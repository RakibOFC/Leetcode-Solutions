// Solution 2.
class Solution {
    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val roundedAmount = ((purchaseAmount + 5) / 10) * 10
        return 100 - roundedAmount
    }
}

// Solution 1.
class Solution {
    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        return (100 - floor(((purchaseAmount + 5) / 10).toDouble()) * 10).toInt()
    }
}
