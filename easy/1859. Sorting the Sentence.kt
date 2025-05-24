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
