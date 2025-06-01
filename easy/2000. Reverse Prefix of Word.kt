// Solution 2. (6ms)
class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        val idx = word.indexOf(ch)
        if (idx == -1) return word

        val arr = word.toCharArray()
        var i = 0
        var j = idx
        while (i < j) {
            val tmp = arr[i]
            arr[i] = arr[j]
            arr[j] = tmp
            i++
            j--
        }
        return String(arr)
    }
}

// Solution 1. (7ms)
class Solution {
        fun reversePrefix(word: String, ch: Char): String {
        var reversePrefix = word

        for (i in word.indices) {
            if (word[i] == ch) {
                reversePrefix = word.substring(0, i + 1).reversed()
                reversePrefix += word.substring(i + 1, word.length)
                break
            }
        }

        return reversePrefix
    }
}
