class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val numList = mutableListOf<Int>()

        for (num in left..right) {
            var crrNum = num
            var isSelfDividing = true

            while (crrNum > 0) {
                val digit = crrNum % 10

                if (digit == 0 || num % digit != 0) {
                    isSelfDividing = false
                    break
                }
                crrNum /= 10
            }
            if (isSelfDividing) numList.add(num)
        }
        return numList
    }
}
