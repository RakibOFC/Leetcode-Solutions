class Solution {
    fun tribonacci(n: Int): Int {
        var T_0 = 0
        var T_1 = 1
        var T_2 = 1
        var i = 0
        var sum = 0

        return if (n == 0) T_0
        else if (n == 1) T_1
        else if (n == 2) T_2
        else {
            while (n - 1 > i + 1) {
                sum = T_0 + T_1 + T_2
                T_0 = T_1
                T_1 = T_2
                T_2 = sum
                i++
            }
            sum
        }
    }
}
