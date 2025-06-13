// Solution 1. (11ms)
class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(2)

        for (num1 in nums1) {
            for (num2 in nums2) {
                if (num1 == num2) {
                    result[0]++
                    break
                }
            }
        }

        for (num2 in nums2) {
            for (num1 in nums1) {
                if (num1 == num2) {
                    result[1]++
                    break
                }
            }
        }

        return result
    }
}

// Solution 2. (15ms)
class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(2)

        for (num in nums1) {
            if (nums2.contains(num)) {
                result[0]++
            }
        }

        for (num2 in nums2) {
            if (nums1.contains(num2)) {
                result[1]++
            }
        }

        return result
    }
}
