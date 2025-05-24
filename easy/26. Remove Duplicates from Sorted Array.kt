// Solution 1.
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var k = 1

        for (i in 1..<nums.size) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]
                k++
            }
        }

        return k
    }
}

// Solution 2.
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var prevNum = -101
        var counter = 0
        for (num in nums) {
            if (num != prevNum) {
                nums[counter] = num
                prevNum = num
                counter++
            }
        }

        return counter
    }
}
