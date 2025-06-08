class Solution {
    fun countSymmetricIntegers(low: Int, high: Int): Int {
        var count = 0

        for (n in low..high) {
            val num = n.toString()
            val numLen = num.length

            if (numLen % 2 == 0) {
                val lenHalf = numLen / 2
                var firstHalf = 0
                var secondHalf = 0

                for (i in 0..<lenHalf) {
                    firstHalf += num[i].digitToInt()
                    secondHalf += num[i + lenHalf].digitToInt()
                }
                if (firstHalf == secondHalf) {
                    count++
                }
            }
        }

        return count
    }
}
