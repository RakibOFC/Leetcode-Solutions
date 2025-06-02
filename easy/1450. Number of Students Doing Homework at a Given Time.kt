class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0

        for (i in startTime.indices) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                count++
        }

        return count
    }
}
