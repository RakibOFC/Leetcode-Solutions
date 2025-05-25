class Solution {
    fun isSameAfterReversals(num: Int): Boolean {
        var copyOfNum = num
        var reverse1 = 0
        var reverse2 = 0

        while(copyOfNum > 0) {
            reverse1 = reverse1 * 10 + copyOfNum % 10
            copyOfNum /= 10
        }

        while(reverse1 > 0) {
            reverse2 = reverse2 * 10 + reverse1 % 10
            reverse1 /= 10
        }
        
        return num == reverse2
    }
}
