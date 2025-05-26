// Solution 2.
class Solution {
    fun largestOddNumber(num: String): String {

        for (i in num.length - 1 downTo 0) {
            if (num[i].digitToInt() % 2 != 0) {
                return num.substring(0, i + 1)
            }
        }
        return ""
    }
}

// Solution 1.
class Solution {
    fun largestOddNumber(num: String): String {

        for (i in num.indices) {
            val subStr = num.substring(0, num.length - i)
            val lastDigit = subStr[subStr.length - 1]

            if (lastDigit.digitToInt() % 2 != 0) {
                return subStr
            }
        }
        return ""
    }
}
