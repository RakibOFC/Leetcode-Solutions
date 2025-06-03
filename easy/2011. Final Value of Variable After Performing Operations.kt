// Solution 1.
class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0

        for (operation in operations) {
            when (operation) {
                "++X", "X++" -> x += 1

                "--X", "X--" -> x -= 1
            }
        }

        return x
    }
}

// Solution 2.
class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0

        for (op in operations) {
            if (op[1] == '+') x++
            else x--
        }

        return x
    }
}
