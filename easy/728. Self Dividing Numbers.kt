class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        var num = left
        val numList = mutableListOf<Int>()

        while (num <= right) {
            var crrNum = num
            var isSelfDividing = true

            while (crrNum > 0) {
                val digit = crrNum % 10
                crrNum /= 10
                if (digit != 0) {
                    if (num % digit != 0) {
                        isSelfDividing = false
                        break
                    }
                } else {
                    isSelfDividing = false
                    break
                }
            }
            if (isSelfDividing) numList.add(num)
            num++
        }
        return numList
    }
}
