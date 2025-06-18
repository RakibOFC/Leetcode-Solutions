// Solution 2. (2ms)
class Solution {
    fun countSeniors(details: Array<String>): Int {
        var count = 0

        for (detail in details) {
            var personAge = 0
            for (i in 11..<13) {
                personAge = personAge * 10 + detail[i].digitToInt()
            }
            if (personAge > 60)
                count++
        }

        return count
    }
}

// Solution 1. (4ms)
class Solution {
    fun countSeniors(details: Array<String>): Int {
        var count = 0

        for (detail in details) {
            var personAge = ""
            for (i in 11..<13) {
                personAge += detail[i]
            }
            if (personAge.toInt() > 60)
                count++
        }

        return count
    }
}
