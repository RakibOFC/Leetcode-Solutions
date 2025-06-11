class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0

        for (word in words) {
            if (word.length >= pref.length) {
                if (pref == word.substring(0, pref.length))
                    count++
            }
        }

        return count
    }
}
