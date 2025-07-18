// Solution 2. (28ms)
class Solution {
    fun countSymmetricIntegers(low: Int, high: Int): Int {
        var count = 0

        for (n in low..high) {
            var numLen = 0
            var num = n
            val digits = mutableListOf<Int>() // this is reverse digit list

            while (num > 0) {
                digits.add(num % 10)
                num /= 10
                numLen++
            }

            if (numLen % 2 == 0) {
                val lenHalf = numLen / 2
                var firstHalf = 0
                var secondHalf = 0

                for (i in 0..<lenHalf) {
                    firstHalf += digits[i + lenHalf]
                    secondHalf += digits[i]
                }
                if (firstHalf == secondHalf) {
                    count++
                }
            }
        }

        return count
    }
}

// Solution 1. (38ms)
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
