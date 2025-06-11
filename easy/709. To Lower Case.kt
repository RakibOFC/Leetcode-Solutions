// Solution 2. (0ms)
class Solution {
    fun toLowerCase(s: String): String {
        val result = StringBuilder()

        for (char in s) {
            if (char in 'A'..'Z') {
                result.append((char.code + 32).toChar())
            } else {
                result.append(char)
            }
        }

        return result.toString()
    }
}

// Solution 1. (2ms)
class Solution {
    fun toLowerCase(s: String): String {
        var lowerCase = ""

        for(char in s) {
            lowerCase += if (char.code in 65..90) {
                (char + 32)
            } else {
                char
            }
        }

        return lowerCase
    }
}
