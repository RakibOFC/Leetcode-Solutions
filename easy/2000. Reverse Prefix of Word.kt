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
