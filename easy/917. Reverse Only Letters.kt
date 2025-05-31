class Solution {
    fun reverseOnlyLetters(s: String): String {
        var tempStr = ""
        var newStr = ""

        for (i in s.length - 1 downTo 0) {
            if (s[i].isLetter()) {
                tempStr += s[i]
            }
        }

        var tIdx = 0
        for (i in s.indices) {

            newStr += if (s[i].isLetter()) {
                tempStr[tIdx++]
            } else {
                s[i]
            }
        }

        return newStr
    }
}
