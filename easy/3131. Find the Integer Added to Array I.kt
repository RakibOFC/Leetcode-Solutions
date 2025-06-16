// Solution 2. (1ms)
class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var num1Min = Int.MAX_VALUE
        var num2Min = Int.MAX_VALUE

        for (i in nums1.indices) {
            if (num1Min > nums1[i])
                num1Min = nums1[i]

            if (num2Min > nums2[i])
                num2Min = nums2[i]
        }

        return num2Min - num1Min
    }
}

// Solution 1. (12ms)
class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        var num1Min = nums1.min()
        var num2Min = nums2.min()

        return num2Min - num1Min
    }
}
