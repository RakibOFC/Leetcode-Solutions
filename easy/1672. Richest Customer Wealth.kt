class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0

        for (customer in accounts) {
            var totalAmount = 0
            for (amount in customer) {
                totalAmount += amount
            }
            if (maxWealth < totalAmount) {
                maxWealth = totalAmount
            }
        }

        return maxWealth
    }
}
