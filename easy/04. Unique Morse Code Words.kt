// Solution 2. (2ms)
class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseCode = arrayOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
        val result = HashSet<String>()

        for (word in words) {
            val stringBuilder = StringBuilder()
            for (char in word) {
                stringBuilder.append(morseCode[char - 'a'])
            }
            result.add(stringBuilder.toString())
        }

        return result.size
    }
}

// Solution 1. (16ms)
class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morseCode = arrayOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
        val transformations = Array(words.size) { "" }

        for (i in words.indices) {
            for (char in words[i]) {
                transformations[i] += morseCode[char - 'a']
            }
        }

        return transformations.toSet().size
    }
}
