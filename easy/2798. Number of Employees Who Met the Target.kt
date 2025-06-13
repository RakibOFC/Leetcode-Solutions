// Solution 2.
class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        return hours.count { it >= target }
    }
}

// Solution 1.
class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var count = 0

        for (hour in hours) {
            if (target <= hour)
                count++
        }

        return count
    }
}
