// Solution 2. (4ms)
class Solution {
    fun generateTag(caption: String): String {
        val tag = StringBuilder("#")
        var isSpace = false
        var isFirst = true

        for (char in caption) {
            when {
                char == ' ' -> isSpace = true
                char.isLetter() -> {
                    if (tag.length >= 100) break

                    tag.append(
                        if (isSpace && !isFirst) char.uppercaseChar()
                        else char.lowercaseChar()
                    )
                    isSpace = false
                    isFirst = false
                }
            }
        }

        return tag.toString()
    }
}

// Solution 1. (4ms)
class Solution {
    fun generateTag(caption: String): String {
        val tag = StringBuilder("#")
        var i = 0
        var count = 0
        var isSpace = false

        while (i < caption.length && count < 99) {
            when {
                caption[i] == ' ' ->
                    isSpace = true

                isSpace && count == 0 -> {
                    tag.append(caption[i].lowercaseChar())
                    isSpace = false
                    count++
                }

                isSpace -> {
                    tag.append(caption[i].uppercaseChar())
                    isSpace = false
                    count++
                }

                else -> {
                    tag.append(caption[i].lowercaseChar())
                    isSpace = false
                    count++
                }
            }
            i++
        }

        return tag.toString()
    }
}
