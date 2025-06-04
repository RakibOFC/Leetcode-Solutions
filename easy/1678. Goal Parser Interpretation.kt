// Solution 2. (96ms)
class Solution {
    fun interpret(command: String): String {
        val result = StringBuilder()
        var i = 0
        while (i < command.length) {
            when {
                command[i] == 'G' -> {
                    result.append('G')
                    i++
                }
                command.startsWith("()", i) -> {
                    result.append('o')
                    i += 2
                }
                command.startsWith("(al)", i) -> {
                    result.append("al")
                    i += 4
                }
            }
        }
        return result.toString()
    }
}

// Solution 1. (104ms)
class Solution {
    fun interpret(command: String): String {
        return command.replace("()", "o").replace("(al)","al")
    }
}
