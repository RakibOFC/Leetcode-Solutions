class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        val smallestChar = letters[0]

        for (char in letters) {
            if (char > target)
                return char
        }

        return smallestChar
    }
}
