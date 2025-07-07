// Solution 1. (8ms)
class Solution {
    fun dayOfYear(date: String): Int {

        val year = date.substring(0, 4).toInt()
        val month = date.substring(5, 7).toInt()
        val days = date.substring(8, 10).toInt()
        val months = intArrayOf(31, if (isLeapYear(year)) 29 else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var totalDaysFromMonth = 0

        for (i in 0..<month - 1) {
            totalDaysFromMonth += months[i]
        }

        return totalDaysFromMonth + days
    }

    fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    }
}

// Solution 2. (10ms)
class Solution {
    fun dayOfYear(date: String): Int {
        val year = StringBuilder()
        val month = StringBuilder()
        val days = StringBuilder()

        for (i in date.indices) {
            when (i) {
                in 0..3 -> year.append(date[i])
                in 5..6 -> month.append(date[i])
                in 8..9 -> days.append(date[i])
            }
        }

        val months = intArrayOf(31, if (isLeapYear(year.toString().toInt())) 29 else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var total = 0

        for (i in 0..<month.toString().toInt() - 1) {
            total += months[i]
        }

        return total + days.toString().toInt()
    }

    fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    }
}
