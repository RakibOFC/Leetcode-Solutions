fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0
        val prefLength = pref.length

        for (word in words) {
            if (word.length >= prefLength) {
                if (pref == word.substring(0, pref.length))
                    count++
            }
        }

        return count
    }
