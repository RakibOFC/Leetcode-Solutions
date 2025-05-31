// Solution 2. (Binary Search)
class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var low = 0
        var high = letters.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (letters[mid] <= target) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return letters[low % letters.size]
    }
}

// Solution 1. 
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
