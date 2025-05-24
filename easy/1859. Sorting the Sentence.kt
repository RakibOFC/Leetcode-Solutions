// Solution 1. (92 ms)
class Solution {
    fun sortSentence(s: String): String {
        val words = s.split(' ')
        val sorted = Array(words.size) { "" }

        for (i in words.indices) {
            val word = words[i]
            val len = word.length
            val idx = word[len - 1] - '1'
            sorted[idx] = word.substring(0, len - 1)
        }

        val lastIndex = sorted.size - 1
        val sb = StringBuilder(s.length)
        for (i in 0..<lastIndex) {
            sb.append(sorted[i]).append(' ')
        }
        sb.append(sorted[lastIndex])

        return sb.toString()
    }
}

// Solution 2. (103 ms)
class Solution {
    fun sortSentence(s: String): String {
        val map = mutableMapOf<Int, String>()
        var maxIndex = 0

        for (word in s.split(" ")) {
            val len = word.length
            val index = word[len - 1] - '0'
            map[index] = word.substring(0, len - 1)
            if (index > maxIndex) maxIndex = index
        }

        return (1..maxIndex).joinToString(" ") { map[it] ?: "" }
    }
}

// Solution 3. (124 ms)
class Solution {
    fun sortSentence(s: String): String {
        val newSentence: StringBuilder = StringBuilder()
        val words = s.split(" ")
        val regex = Regex("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")
        val wordMaps: MutableList<Map<String, String>> = mutableListOf()


        words.forEach { word ->
            val wordIdx = word.split(regex)
            val wordMap = mapOf(wordIdx[1] to wordIdx[0])
            wordMaps.add(wordMap)
        }

        wordMaps.sortBy { it.keys.first() }

        wordMaps.forEach {
            newSentence.append(it.values.first()).append(" ")
        }

        return newSentence.toString().trim()
    }
}
